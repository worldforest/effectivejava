package com.serim.item02;

import java.util.Objects;

public class NyPizza extends Pizza{
	public enum Size { SMALL, MEDIUM, LARGE }
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder>{
		private final Size size;
		
		public Builder(Size size){
			this.size = Objects.requireNonNull(size);
		}
		//뭐를 override해준거지?
		@Override public NyPizza build(){
			return new NyPizza(this);
		}
		@Override protected Builder self(){ return this; }
	}
	
	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;//왜 이거 없으면 오류?
	}
	
}
