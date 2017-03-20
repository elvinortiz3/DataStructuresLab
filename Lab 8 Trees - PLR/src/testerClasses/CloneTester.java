package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;

public class CloneTester {
	
	public static void main(String args[]){
		
		// Testing LinkedTree...
		LinkedTree<Integer> lT = new LinkedTree<>();
		LinkedTree<Integer> clonedLT = null;
		try{ clonedLT = lT.clone(); }
		catch(Exception e){ e.printStackTrace(); }
		Utils.displayTree("The tree is: ", lT); 
		Utils.displayTree("The tree is: ", clonedLT); 
		lT = Utils.buildExampleTreeAsLinkedTree();
		try {
			clonedLT = lT.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Utils.displayTree("The tree is: ", lT); 
		Utils.displayTree("The tree is: ", clonedLT); 
		
		// Testing LinkedBinaryTree...\
		LinkedBinaryTree<Integer> lBT = new LinkedBinaryTree<>();
		LinkedBinaryTree<Integer> clonedLBT = null;
		try{ clonedLBT = lBT.clone(); }
		catch(Exception e){ e.printStackTrace(); }
		Utils.displayTree("The tree is: ", lBT); 
		Utils.displayTree("The tree is: ", clonedLBT); 
		lBT = Utils.buildExampleTreeAsLinkedBinaryTree();
		try {
			clonedLBT = lBT.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Utils.displayTree("The tree is: ", lBT); 
		Utils.displayTree("The tree is: ", clonedLBT); 
		
	}

}