package positionListLLDirect;

import positionInterfaces.Position;

public class NodePositionListTester {

	public static void main(String[] args) {
		
		NodePositionList<Integer> w = new NodePositionList<Integer> (); 
		NodePositionList <Integer> q = new NodePositionList<Integer> ();
		
		NodePositionListPart5 <Integer> a =  new NodePositionListPart5 <Integer>();
		NodePositionListPart5 <Integer> b =  new NodePositionListPart5 <Integer>(new BackwardIteratorMaker<>());
		
		a.addFirst(5);
		a.addFirst(9);
		a.addFirst(11);
		a.addLast(10);
		a.addLast(12);
		
		b.addFirst(5);
		b.addFirst(9);
		b.addFirst(11);
		b.addLast(10);
		b.addLast(12);
		
		q.addFirst(10); 
		q.addFirst(1001);
		w.addFirst(5); 
		w.addFirst(3); 
		
		w.addLast(10); 
		w.addLast(13); 
		try {
			Position<Integer> p = w.first();
			w.addAfter(p, 2); 
			p = w.next(p); 
			w.addAfter(p, 34); 
			w.addBefore(p, 40); 
			p = q.first(); 
			//w.addAfter(p, 89); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		showElements(q);
		
		
		System.out.println();
		showElementsBackward(w);
		System.out.println();
		showElements(a); 
		System.out.println();
		showElementsBackward(b);

	}

	private static <E> void showElementsBackward(NodePositionListPart5<E> b) {
		for(E i : b){
			System.out.println(i);
		}
		
	}

	private static <E> void showElements(NodePositionListPart5<E> a) {
		for(E i : a){
			System.out.println(i);
		}
		
	}

	private static <E> void showElements(NodePositionList<E> w) {
		for(E p : w) 
			System.out.println(p); 
	}
	
	private static <E> void showElementsBackward(NodePositionList<E> l){
		PositionListElementsBackwardIterator<E> iter = new PositionListElementsBackwardIterator<>(l);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
