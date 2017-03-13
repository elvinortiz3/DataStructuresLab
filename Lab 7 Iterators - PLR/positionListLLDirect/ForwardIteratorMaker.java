package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public class ForwardIteratorMaker<E> implements IteratorMaker<E>{

	public Iterator<E> makeIterator(PositionList<E> q){
		return new PositionListElementsIterator<>(q);
	}
}
