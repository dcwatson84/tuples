package org.tuples;

public class Sevenple <A,B,C,D,E,F,G> extends Tuple implements HasSevenple<A, B, C, D, E, F, G>{

	public static int SIZE = 7;
	
	public Sevenple() {
		super(SIZE);
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
	
	@SuppressWarnings("unchecked")
	public G getSeven() {
		return (G) get(6);
	}
	
}
