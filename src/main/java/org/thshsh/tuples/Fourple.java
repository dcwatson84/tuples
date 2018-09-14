package org.thshsh.tuples;

public class Fourple <A,B,C,D> extends Tuple implements HasFourple<A, B, C, D> {

	public static int SIZE = 4;
	
	public Fourple() {
		super(SIZE);
	}
	
	public Fourple(A a,B b,C c,D d) {
		this();
		this.set(a,b,c,d);
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
	
	@SuppressWarnings("unchecked")
	public D getFour() {
		return (D) get(3);
	}

}
