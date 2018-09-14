package org.thshsh.tuples;

public class Sixple<A,B,C,D,E,F> extends Tuple implements HasSixple<A, B, C, D, E, F> {

	public static int SIZE = 6;
	
	public Sixple() {
		super(SIZE);
	}
	
	public Sixple(A a,B b,C c,D d,E e, F f) {
		this();
		this.set(a,b,c,d,e,f);
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
	
	@SuppressWarnings("unchecked")
	public E getFive() {
		return (E) get(4);
	}
	
	@SuppressWarnings("unchecked")
	public F getSix() {
		return (F) get(5);
	}

}
