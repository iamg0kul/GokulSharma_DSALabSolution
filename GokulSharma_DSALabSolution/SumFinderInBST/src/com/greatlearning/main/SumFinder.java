package com.greatlearning.main;

public class SumFinder {
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		/*
				  40
				/	 \
			  20	  60
			 /  \	 /  \
			10   30 50   70 */
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);

		tree.isPairPresent(tree.root, 130);
	}

}
