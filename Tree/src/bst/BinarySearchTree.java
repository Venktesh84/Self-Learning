package bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	
	static BSTreeNode root;
	
	// insert function to add new node to the tree
	private static void insert(int data) {
		BSTreeNode nnode = new BSTreeNode(data);
		BSTreeNode curnode=null;
		if(root==null) {
			root=nnode;
		}else {
			BSTreeNode prev =null;
			curnode=root;
			while(curnode!=null) {
				if(data==curnode.data) {
					return;
				}else if(data<curnode.data) {
					prev = curnode;
					curnode=curnode.left;
				}else {
					prev=curnode;
					curnode=curnode.right;
				}
			}
			
			if(data<prev.data) {
				prev.left=nnode;
			}else {
				prev.right=nnode;
			}
		}
	}
	
	
	// to print level-order traversal of the tree which takes root node as parameter
	private static void levelordertraversal(BSTreeNode root) {
		if(root==null) {
			System.out.println("Empty");
		}
		Queue<BSTreeNode> qt = new LinkedList<BSTreeNode>();
		qt.offer(root);
		while(!qt.isEmpty()) {
			BSTreeNode curnode = qt.poll();
			System.out.print(curnode.data+" ");
			if(curnode.left!=null) {
				qt.offer(curnode.left);
			}
			if(curnode.right!=null){
				qt.offer(curnode.right);
			}
		}
	}
	
	
	// function to search value within a binary tree which takes parameter root node and
	// value to be searched within the tree
	private static boolean search(BSTreeNode root, int i) {
		if(root==null) {
			return false;
		}
		BSTreeNode curnode = root;
		while(curnode!=null) {
			if(i==curnode.data) {
				return true;
			}
			else if(i<curnode.data) {
				curnode=curnode.left;
			}
			else {
				curnode=curnode.right;
			}
		}
		return false;
	}
	
	// Preorder traversal of tree by iterative process
	private static void preorderIterative(BSTreeNode root) {
		Stack<BSTreeNode> st = new Stack<BSTreeNode>();
		st.push(root);
		while(!st.isEmpty()) {
			BSTreeNode node = st.pop();
			System.out.print(node.data+" ");
			
			if(node.right!=null) {
				st.push(node.right);
			}
			if(node.left!=null) {
				st.push(node.left);
			}
		}
	}
	
	// Preorder traversal of tree by recursion process
	private static void preorderRecursion(BSTreeNode root) {
		if(root==null) {
			return;
		}else {
			System.out.print(root.data +" ");
			preorderRecursion(root.left);
			preorderRecursion(root.right);
		}
		
	}

	// Inorder traversal of tree by iterative process
	private static void inorderIterative(BSTreeNode root) {
		if(root==null) {
			return;
		}
		Stack<BSTreeNode> st = new Stack<BSTreeNode>();
		BSTreeNode curnode = root;
		boolean done = false;
		while(!done) {
			if(curnode!=null) {
				st.push(curnode);
				curnode=curnode.left;
			}else {
				if(st.isEmpty()) {
					done=true;
				}else {
					curnode = st.pop();
					System.out.print(curnode.data+" ");
					curnode=curnode.right;
				}
			}
		}
	}
	
	// Inorder traversal of tree by recursion process
	private static void inorderRecursion(BSTreeNode root) {
		if(root==null) {
			return;
		}else {
			inorderRecursion(root.left);
			System.out.print(root.data +" ");
			inorderRecursion(root.right);
		}	
	}

	// Postorder traversal of tree by recursion process
	private static void postorderIterative(BSTreeNode root) {
		if(root==null) {
			return;
		}
		Stack<BSTreeNode> st = new Stack<BSTreeNode>();
		st.push(root);
		BSTreeNode prevnode = null;
		while(!st.isEmpty()) {
			BSTreeNode curnode = st.peek();
			if(prevnode==null || prevnode.left==curnode || prevnode.right==curnode) {
				if(curnode.left!=null) {
					st.push(curnode.left);
				}
				else if(curnode.right!=null) {
					st.push(curnode.right);
				}
			}
			else if(curnode.left==prevnode) {
				if(curnode.right!=null) {
					st.push(curnode.right);
				}
			}
			else {
				System.out.print(curnode.data+" ");
				st.pop();
			}
			prevnode = curnode;
		}
		
	}
	
	// Postorder traversal of tree by recursion process
	private static void postorderRecursion(BSTreeNode root) {
		if(root==null) {
			return;
		}else {
			postorderRecursion(root.left);
			postorderRecursion(root.right);
			System.out.print(root.data +" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InsertBST ins = new InsertBST();
		
		int[] ins = {5,7,2,9,8,1,6,3,4,0};
		int insnum = 0;
		for(int i=0; i<ins.length; i++) {
			insnum = ins[i];
			insert(insnum);
		}
		
		System.out.print("PreOrder Traversal by Iterative process:");
		preorderIterative(root);
		System.out.print("\nPreOrder Traversal by Recursion process:");
		preorderRecursion(root);
		
		System.out.print("\n\nInOrder Traversal by Iterative process:");
		inorderIterative(root);
		System.out.print("\nInOrder Traversal by Recursion process:");
		inorderRecursion(root);
		
		System.out.print("\n\nPostOrder Traversal by Iterative process:");
		postorderIterative(root);
		System.out.print("\nPostOrder Traversal by Recursion process:");
		postorderRecursion(root);
		
		System.out.print("\n\nLevelOrder Traversal:");
		levelordertraversal(root);
		
		boolean res = search(root, 4);
		System.out.println("\nFound:"+res);
		
	}

}
