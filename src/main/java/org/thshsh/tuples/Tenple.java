package org.thshsh.tuples;

public class Tenple<A,B,C,D,E,F,G,H,I,J> extends Tuple implements HasTenple<A, B, C, D, E, F, G, H, I, J> {
	
	public static int SIZE = 10;
	
	public Tenple() {
		super(SIZE);
	}
	
	public Tenple(A a,B b,C c,D d,E e, F f,G g, H h,I i,J j) {
		this();
		this.set(a,b,c,d,e,f,g,h,i,j);
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
	
	@SuppressWarnings("unchecked")
	public I getNine() {
		return (I) get(8);
	}
	
	@SuppressWarnings("unchecked")
	public J getTen() {
		return (J) get(9);
	}

}
