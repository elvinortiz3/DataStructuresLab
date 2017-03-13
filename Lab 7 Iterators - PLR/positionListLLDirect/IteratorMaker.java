package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public interface IteratorMaker<E> {
	public Iterator<E> makeIterator(PositionList<E> q);
}
