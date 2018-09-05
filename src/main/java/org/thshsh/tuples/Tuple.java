package org.thshsh.tuples;

import java.util.Arrays;

public abstract class Tuple {
	
	Object[] objects;
	
	public Tuple(int length) {
		objects = new Object[length];
	}
	
	public <A extends Tuple> A toTuple(Class<A> clazz) {
		A tuple;
		try {
			tuple = clazz.newInstance();
		} 
		catch (InstantiationException e) {throw new IllegalArgumentException(e);} 
		catch (IllegalAccessException e) {throw new IllegalArgumentException(e);}
		
		return tuple;
	}
	
	public void set(Object... setObjects) {
		for(int i=0;i<setObjects.length && i<this.objects.length;i++) {
			this.objects[i] = setObjects[i];
		}
	}
	
	public Object get(int i) {
		return objects[i];
	}
	
	public void set(int i,Object o) {
		this.objects[i] = o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(objects);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple other = (Tuple) obj;
		if (!Arrays.equals(objects, other.objects))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " [objects=" + Arrays.toString(objects) + "]";
	}

}
