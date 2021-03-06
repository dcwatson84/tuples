package org.thshsh.tuples;

public class Nineple<A,B,C,D,E,F,G,H,I> extends Tuple implements HasNineple<A, B, C, D, E, F, G, H, I>{
	
	public static int SIZE = 9;
	
	public Nineple() {
		super(SIZE);
	}
	
	public Nineple(A a,B b,C c,D d,E e, F f,G g, H h,I i) {
		this();
		this.set(a,b,c,d,e,f,g,h,i);
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
	

}
