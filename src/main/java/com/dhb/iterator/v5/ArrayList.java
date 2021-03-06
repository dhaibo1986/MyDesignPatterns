package com.dhb.iterator.v5;

public class ArrayList implements Collection_ {

	Object[] objects =  new Object[10];

	private int index = 0;


	@Override
	public Iterator_ iterator() {
		return new ArrayListIterator();
	}

	@Override
	public void add(Object o) {
		if(index == objects.length -1) {
			Object[] newObjects = new Object[objects.length*2];
			System.arraycopy(objects,0,newObjects,0,objects.length);
			objects = newObjects;
		}
		objects[index] = o;
		index ++;
	}

	@Override
	public int size() {
		return index;
	}

	private class ArrayListIterator implements Iterator_ {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if(currentIndex >= index) {
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			Object o = objects[currentIndex];
			currentIndex ++ ;
			return o;
		}
	}
}
