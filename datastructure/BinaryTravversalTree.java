

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class BinaryTravversalTree {

	static BinaryTreeNode root;
	static Scanner sc = new Scanner(System.in);

	public static BinaryTreeNode createNode(int data) {
		BinaryTreeNode temp = new BinaryTreeNode();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	public static void createCompleteTree(BinaryTreeNode node) {
		BinaryTreeNode temp = root;
		boolean done = false;
		int pos = 0;
		if (temp == null) {
			root = node;
			return;
		}

		while (!done) {
			System.out.println("at node: " + temp.data);
			System.out.println("Enter left or right then enter 0 or other number resp");
			pos = sc.nextInt();
			if (pos == 0) {
				if (temp.left == null) {
					temp.left = node;
					done = true;
				} else {
					temp = temp.left;
				}

			} else {
				if (temp.right == null) {
					temp.right = node;
					done = true;
				} else {
					temp = temp.right;
				}
			}

		}
	}
    //the function of predorder traversal tree
	public static void preOrderTraversal(BinaryTreeNode temp) {
		if (temp != null) {
			System.out.print(temp.data);
			preOrderTraversal(temp.left);
			preOrderTraversal(temp.right);
		}
	}
    //the function of postorder traversal tree
    public static void postOrderTraversal(BinaryTreeNode temp){
    	if(temp!=null){
    		postOrderTraversal(temp.left);
    		postOrderTraversal(temp.right);
    		System.out.print(temp.data);
    	}
    }
    //the function of inorder traversal tree
    public static void inOrderTraversal(BinaryTreeNode temp){
    	if(temp!=null){
    		inOrderTraversal(temp.left);
    		System.out.print(temp.data);
    		inOrderTraversal(temp.right);
    	}
    }
	public static ArrayList<Integer> iterativePreOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null) return res;
		Stack<BinaryTreeNode> s=new Stack<>();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode temp=s.pop();
			res.add(temp.data);
			if(temp.right!=null)s.push(temp.right);
			if(temp.left!=null)s.push(temp.left);
		}
		return res;
	}

	public static ArrayList<Integer> iterativePostOrderTravversal(BinaryTreeNode root){
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null) return res;
		Stack<BinaryTreeNode> s=new Stack<>();
		s.push(root);
		BinaryTreeNode prev=null;
		while(!s.isEmpty()){
			BinaryTreeNode curr=s.peek();
			if(prev==null||prev.left==curr||prev.right==curr){
				if(curr.left!=null) s.push(curr.left);
				else if(curr.right!=null) s.push(curr.right);
			}else if(curr.left==prev){
				if(curr.right!=null) s.push(curr.right);
			}else{
				res.add(curr.data);
				s.pop();
			}
			prev=curr;
		}
		return res;
	}

	public static ArrayList<Integer> iterativeInOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> res=new ArrayList<>();
		Stack<BinaryTreeNode> s=new Stack<>();
		BinaryTreeNode currentNode=root;
		boolean done=false;

		while(!done){
			if(currentNode!=null){
				s.push(currentNode);
				currentNode=currentNode.left;
			}else{
				if(s.isEmpty()){
					done=true;
				}else{
					currentNode=s.pop();
					res.add(currentNode.data);
					currentNode=currentNode.right;
				}
			}
		}
		return res;
	}
    public static ArrayList<Integer> levelOrderTraversal(BinaryTreeNode root){
    	ArrayList<Integer> res=new ArrayList<>();
    	Queue<BinaryTreeNode> q=new LinkedList<>();
    	q.offer(root);
    	q.offer(null);
    	ArrayList<Integer> curr=new ArrayList<>();
    	while(!q.isEmpty()){
    		BinaryTreeNode temp=q.poll();
    		if(temp!=null){
    			curr.add(temp.data);
    			if(temp.left!=null) q.offer(temp.left);
    			if(temp.right!=null)q.offer(temp.right);
    		}else{
    			res.addAll(curr);
    			curr.clear();
    			if(!q.isEmpty()){
    				q.offer(null);
    			}
    		}
    	}
    	return res;
    }

    public static void findmax(BinaryTreeNode root){
    	ArrayList<Integer> res=levelOrderTraversal(root);
    	Collections.sort(res);
    	System.out.println(res.get(res.size()-1));
    }

    public static BinaryTreeNode kthsmallestBst(BinaryTreeNode root,int k,int[] count){

    	if(root==null){
    		return null;
    	}

    	BinaryTreeNode left=kthsmallestBst(root.left,k,count);
    	if(left!=null) return left;

    	if(++count[0]==k) return root;

    	return kthsmallestBst(root.right,k,count);
    }

    public static int findmaxRecurrsion(BinaryTreeNode root){
    	int max=Integer.MIN_VALUE;
    	if(root!=null){
    		int leftMax=findmaxRecurrsion(root.left);
    		int rightMax=findmaxRecurrsion(root.right);

    		if(leftMax<rightMax){
    			max=rightMax;
    		}else{
    			max=leftMax;
    		}
    		if(root.data > max) max=root.data;
    	}
    	return max;
    }

   //function modiication of levelorder
    public static int findIterativeMaximum(BinaryTreeNode root){
    	if(root==null) return Integer.MIN_VALUE;
    	Queue<BinaryTreeNode> q=new LinkedList<>();
    	q.offer(root);
        int max=Integer.MIN_VALUE;
    	while(!q.isEmpty()){
    		BinaryTreeNode temp=q.poll();
    		if(temp.data>max){
    			max=temp.data;
    		}
    		if(temp.left!=null) q.offer(temp.left);
    		if(temp.right!=null) q.offer(temp.right);
    	}
    	return max;
    }

     public static boolean findIterativeBt(BinaryTreeNode root,int data){
    	if(root==null) return false;
    	Queue<BinaryTreeNode> q=new LinkedList<>();
    	q.offer(root);
    	while(!q.isEmpty()){
    		BinaryTreeNode temp=q.poll();
    		if(temp.data==data){
    			return true;
    		}
    		if(temp.left!=null) q.offer(temp.left);
    		if(temp.right!=null) q.offer(temp.right);
    	}
    	//if the element is not found then return false
    	return false;
    }
    
  //choice 12
    public static BinaryTreeNode insertInBinaryTree(BinaryTreeNode root,int data){
    	if(root==null) return null;
    	Queue<BinaryTreeNode> q=new LinkedList<>();
    	q.offer(root);
    	while(!q.isEmpty()){
    		BinaryTreeNode temp=q.poll();
    		if(temp.left!=null) {
    			q.offer(temp.left);
    		}
    		else{
    			temp.left=createNode(data);
    			return root;
    		}
    		if(temp.right!=null){
    			q.offer(temp.right);
    		}else{
    			temp.right=createNode(data);
                return root;
    		}
    	}
    	return root;
    }

    public static int iterativeInOrderTraversalMax(BinaryTreeNode root){
		Stack<BinaryTreeNode> s=new Stack<>();
		BinaryTreeNode currentNode=root;
		boolean done=false;
        int max=Integer.MIN_VALUE;
		while(!done){
			if(currentNode!=null){
				s.push(currentNode);
				currentNode=currentNode.left;
			}else{
				if(s.isEmpty()){
					done=true;
				}else{
					currentNode=s.pop();
					if(max<currentNode.data) max=currentNode.data;
					currentNode=currentNode.right;
				}
			}
		}
		return max;
	}

	public static boolean  findInBt(BinaryTreeNode root,int data){
		if(root==null){
            return false;
		}
		if(root.data==data){
			return true;
		}
		return findInBt(root.left,data) || findInBt(root.right,data);
	}
	public static void main(String[] args) {
		int choice = 0;
		do {

			System.out.println(" 1.insert element\n 2.recursive preOrder\n"+
				" 3.iterative preorder\n 4.recurrsivepostorder \n 5.iterative postorder"+
				"\n 6.recurssiveinorder\n 7.itrative inorder");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter the data to be stored");
				int data = sc.nextInt();
				createCompleteTree(createNode(data));
				break;
			}
			case 2: {
				preOrderTraversal(root);
				break;
			}
			 case 3:{

            	Iterator itr=iterativePreOrderTraversal(root).iterator();
            	while(itr.hasNext()){
            		System.out.print(itr.next());
            	}
            	break;
            }
			case 4:{
				postOrderTraversal(root);
				break;
			}
			case 5:{
				Iterator itr=iterativePostOrderTravversal(root).iterator();
				while(itr.hasNext()){
					System.out.print(itr.next());
				}
				break;
			}
            case 6:{
            	inOrderTraversal(root);
            	break;
            }
            case 7:{
				Iterator itr=iterativeInOrderTraversal(root).iterator();
				while(itr.hasNext()){
					System.out.print(itr.next());
				}
				break;
			}
            case 8:{
				Iterator itr=levelOrderTraversal(root).iterator();
				while(itr.hasNext()){
					System.out.print(itr.next());
				}
				break;
			}
			case 9:{
				findmax(root);
				System.out.println(findmaxRecurrsion(root));
				System.out.print("the output of the iterative version is");
				System.out.println(iterativeInOrderTraversalMax(root));
				System.out.println(findIterativeMaximum(root));
				break;
			}
			case 11:{
                   System.out.println("Enter the data");
                   int data=sc.nextInt();
                   System.out.println(findInBt(root,data));
                   System.out.println(findIterativeBt(root,data));
                   break;
			}
			case 12:{
				System.out.println("Enter the data to be inserted");
				insertInBinaryTree(root,sc.nextInt());
				preOrderTraversal(root);
			}
			case 10:{
				root=null;
				break;
			}
			case 15:
               int[] count=new int[1];
			   System.out.println(kthsmallestBst(root,sc.nextInt(),count).data);
			}
			System.out.println("\nDo u want to repeat the process");
			choice = sc.nextInt();
		} while (choice != 0);

	}
}
