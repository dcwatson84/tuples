package org.thshsh.tuples;

public class Eightple<A,B,C,D,E,F,G,H> extends Tuple implements HasEightple<A, B, C, D, E, F, G, H> {

	public static int SIZE = 8;
	
	public Eightple() {
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
	
	@SuppressWarnings("unchecked")
	public H getEight() {
		return (H) get(7);
	}
	
	
}
