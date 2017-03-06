package classes;

import interfaces.Stack;

public class LLStack<E> implements Stack<E>
{
	private SNode<E> top; 
	private int size; 
	
	public LLStack() {
		top = null; 
		size = 0; 
	}
	
	public E pop() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("pop: Stack is empty.");
		SNode<E> ntr = top;
		E etr = ntr.getElement(); 
		top = top.getNext();
		ntr.clean();
		size--;
		return etr;
	}

	public void push(E e) {
		SNode<E> nta = new SNode<>(e, top);
		top = nta;
		size++; 
	}

	public E top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("top: Stack is empty."); 
		return top.getElement();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}


	// just for testing and grading....
    public void showReverse() { 
	    if (size == 0)
		   System.out.println("Stack is empty."); 
		else
		   recSR(top);
    } 
    private void recSR(SNode<E> f) { 
		if (f != null) { 
		   recSR(f.getNext()); 
		   System.out.println(f.getElement()); 
	     } 
    } 
 
}
