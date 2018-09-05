package org.thshsh.tuples;

public class Oneple<A> extends Tuple implements HasOneple<A> {

	public static int SIZE = 1;
	
	public Oneple() {
		super(SIZE);
	}
	
	@SuppressWarnings("unchecked")
	public A getOne() {
		return (A) get(0);
	}

}
