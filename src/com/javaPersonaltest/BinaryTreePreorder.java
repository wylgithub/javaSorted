package com.javaPersonaltest;

public class BinaryTreePreorder {

	//实现二叉树的先根遍历
	/**
	 * 1．先（根）序遍历的递归算法定义：
		若二叉树非空，则依次执行如下操作：
		⑴ 访问根结点；
		⑵ 遍历左子树；
		⑶ 遍历右子树；
	 * @param root
	 */
	public static void preOrder(BinaryTree root){
		if(root != null){
			System.out.print(root.data+"--");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	
	//中根遍历
	/**
	 * 2．中（根）序遍历的递归算法定义：
		若二叉树非空，则依次执行如下操作：
		⑴遍历左子树；
		⑵访问根结点；
		⑶遍历右子树。
	 * @param root
	 */
	public static void inOrder(BinaryTree root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data+"--");
			inOrder(root.right);
		}
	}
	//后根遍历
	/**
	 * 3．后（根）序遍历得递归算法定义：
		若二叉树非空，则依次执行如下操作：
		⑴遍历左子树；
		⑵遍历右子树；
		⑶访问根结点。
	 * @param root
	 */
	public static void postOrder(BinaryTree root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+"--");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//测试二叉树的遍历
		int [] array = {12,76,35,22,16,48,90,46,9,40};
		BinaryTree root = new BinaryTree(array[0]);
		for(int i = 1; i < array.length;i++){
			root.insert(root, array[i]);
		}
		System.out.println("先根遍历:");
		preOrder(root);
		System.out.println();
		
		System.out.println("中根遍历:");
		inOrder(root);
		System.out.println();
		
		System.out.println("后根遍历:");
		postOrder(root);
		System.out.println();
	}
	
}