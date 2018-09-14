package org.thshsh.tuples;

public class Twople<A,B> extends Tuple implements HasTwople<A, B> {
	
	public static int SIZE = 2;
	
	public Twople() {
		super(SIZE);
	}
	
	public Twople(A a,B b) {
		this();
		this.set(a,b);
	}
	
	@SuppressWarnings("unchecked")
	public A getOne() {
		return (A) get(0);
	}

	@SuppressWarnings("unchecked")
	public B getTwo() {
		return (B) get(1);
	}
	
	
}
