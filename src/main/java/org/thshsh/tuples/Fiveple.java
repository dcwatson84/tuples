package org.thshsh.tuples;

public class Fiveple <A,B,C,D,E> extends Tuple implements HasFiveple<A, B, C, D, E>{

	public static int SIZE = 5;
	
	public Fiveple() {
		super(SIZE);
	}
	
	public Fiveple(A a,B b,C c,D d,E e) {
		this();
		this.set(a,b,c,d,e);
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
	
}
