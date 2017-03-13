package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public class BackwardIteratorMaker<E> implements IteratorMaker<E>{

	@Override
	public Iterator<E> makeIterator(PositionList<E> q) {
		return new PositionListElementsBackwardIterator<>(q);
	}

}
