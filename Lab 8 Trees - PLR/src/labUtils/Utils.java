package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4); // that's the root according to the image...
		// Adding the root's children...
		Position<Integer> c1 = t.addChild(t.root(), 9);
		Position<Integer> c2 = t.addChild(t.root(), 20);
		// Adding c1 children... They don't have children...
		t.addChild(c1, 7);
		t.addChild(c1, 10);
		// Adding c2 children...
		Position<Integer> d1 = t.addChild(c2, 15);
		Position<Integer> d2 = t.addChild(c2, 21);
		// Adding d1 children...
		t.addChild(d1, 12);
		Position<Integer> e1 = t.addChild(d1, 17);
		// Adding e1 children... only 1
		t.addChild(e1, 19);
		// Adding d2 children... only 1
		Position<Integer> f1 = t.addChild(d2, 40);
		// Adding f1 children...
		t.addChild(f1, 30);
		t.addChild(f1, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		// Adding the children of the root...
		Position<Integer> c1 = t.addLeft(t.root(), 9);
		Position<Integer> c2 = t.addRight(t.root(), 20);
		//Adding c1 children... (left)
		t.addLeft(c1, 7);
		t.addRight(c1, 10);
		// Adding c2 children... (right)
		Position<Integer> d1 = t.addLeft(c2, 15);
		Position<Integer> d2 = t.addRight(c2, 21);
		// Adding d1 children... (left)
		t.addLeft(d1, 12);
		Position<Integer> e1 = t.addRight(d1, 17);
		// Adding e1 children... (left) only 1
		t.addLeft(e1, 19);
		// Adding d2 children... (right) only 1
		Position<Integer> f1 = t.addRight(d2, 40);
		// Adding f1 children...
		t.addLeft(f1, 30);
		t.addRight(f1, 45);
		
		return t; 
	}


}
