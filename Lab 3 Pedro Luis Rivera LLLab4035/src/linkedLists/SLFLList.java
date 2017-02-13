package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import linkedLists.LinkedList;

public class SLFLList<E> 
implements LinkedList<E>
{

	private SNode<E> first, last; 
	int length = 0; 

	public SLFLList() { 
		first = last = null; 
	}


	public void addFirstNode(Node<E> nuevo) {
		SNode<E> newNode = (SNode<E>)nuevo;

		newNode.setNext(first);
		first = newNode;
		if(this.length == 0){
			last = newNode;
		}
		//		if(this.length == 0){
		//			first = last = newNode;
		//		}
		//		else{
		//			newNode.setNext(first);
		//			first = newNode;
		//		}
		length++;
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		SNode<E> targetNode = (SNode<E>) target;
		SNode<E> newNode = (SNode<E>) nuevo;
		newNode.setNext(targetNode.getNext());
		targetNode.setNext(newNode);
		if(targetNode == last){ last = newNode; }
		length++;
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		SNode<E> targetNode = (SNode<E>) target;
		SNode<E> newNode = (SNode<E>) nuevo;
		newNode.setNext(targetNode);
		((SNode<E>)(this.getNodeBefore(targetNode))).setNext(newNode);
		if(targetNode == first){ first = newNode; }
		length++;
	}

	public Node<E> getFirstNode() throws NodeOutOfBoundsException { 
		if(length == 0){ throw new NodeOutOfBoundsException("getFirstNode: The list is empty."); }
		return this.first; 
	}

	public Node<E> getLastNode() throws NodeOutOfBoundsException { 
		if(length == 0){ throw new NodeOutOfBoundsException("getLastNode: The list is empty."); }
		return this.last; 
	}

	public Node<E> getNodeAfter(Node<E> target) throws NodeOutOfBoundsException {
		if(target == last){ throw new NodeOutOfBoundsException("getNodeAfter: target = last."); }
		return ((SNode<E>)target).getNext();
	}

	public Node<E> getNodeBefore(Node<E> target) throws NodeOutOfBoundsException {
		if(target == first) { return null; }
		SNode<E> nodeToCompare = first;
		while(nodeToCompare.getNext() != target){ nodeToCompare = nodeToCompare.getNext(); }
		return nodeToCompare;
	}

	public int length() { return this.length; }

	public void removeNode(Node<E> target) {
		if(length == 0){ return; }
		if(target == first){ first = first.getNext(); }
		else if(target == last){ last = (SNode<E>)(this.getNodeBefore(last)); }
		else {
			SNode<E> specialNode = (SNode<E>) (this.getNodeBefore(target));
			specialNode.setNext(((SNode<E>)target).getNext());
		}
		length--;
		((SNode<E>) target).setNext(null);
		((SNode<E>) target).setElement(null);
		target = null;
	}

	public Node<E> createNewNode() {
		return new SNode<E>();
	}


	///////////////////////////////////////////////////
	// private and static inner class that defines the 
	// type of node that this list implementation uses
	private static class SNode<T> implements Node<T> {
		private T element; 
		private SNode<T> next; 
		public SNode() { 
			element = null; 
			next = null; 
		}
		public SNode(T data, SNode<T> next) { 
			this.element = data; 
			this.next = next; 
		}
		public SNode(T data)  { 
			this.element = data; 
			next = null; 
		}
		public T getElement() {
			return element;
		}
		public void setElement(T data) {
			this.element = data;
		}
		public SNode<T> getNext() {
			return next;
		}
		public void setNext(SNode<T> next) {
			this.next = next;
		}
	}

}
