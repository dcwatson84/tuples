package org.thshsh.tuples;

public class Oneple<A> extends Tuple implements HasOneple<A> {

	public static int SIZE = 1;
	
	public Oneple() {
		super(SIZE);
	}
	
	public Oneple(A a) {
		this();
		this.set(a);
	}
	
	@SuppressWarnings("unchecked")
	public A getOne() {
		return (A) get(0);
	}

}
