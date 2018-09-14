package org.thshsh.tuples;

public class Threeple<A,B,C> extends Tuple implements HasThreeple<A, B, C>{

	public static int SIZE = 3;
	
	public Threeple() {
		super(SIZE);
	}
	
	public Threeple(A a,B b,C c) {
		this();
		this.set(a,b,c);
	}
	
	@SuppressWarnings("unchecked")
	public A getOne() {
		return (A) get(0);
	}

	@SuppressWarnings("unchecked")
	public B getTwo() {
		return (B) get(1);
	}
	
	@SuppressWarnings("unchecked")
	public C getThree() {
		return (C) get(2);
	}

}
