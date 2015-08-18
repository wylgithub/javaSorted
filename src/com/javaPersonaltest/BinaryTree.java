package com.javaPersonaltest;

/**
 * 今天突然想用java实现二叉树的遍历
 * 首先科普一下关于二叉树的基本知识(其实也是在维基百科上查询的知识，个人整理):
 * 在计算机里树的遍历也称之为树的搜索，
 * 是graph traversal的一种，指的是按照某种规则，不重复地访问某种tree data structure的所有节点的过程。具体的访问操作可能是检查节点的值、更新节点的值等。不同的遍历方式，其访问节点的顺序是不一样的。以下虽然描述
 * 的是二叉树的遍历算法，但它们也适用于其他树形结构。
 * 从二叉树的递归定义可知，一棵非空的二叉树由根结点及左、右子树这三个基本部分组成。因此，在任一给定结点上，可以按某种次序执行三个操作：
⑴访问结点本身（N），
⑵遍历该结点的左子树（L），
⑶遍历该结点的右子树（R）。
以上三种操作有六种执行次序：
NLR、LNR、LRN、NRL、RNL、RLN。
注意：
前三种次序与后三种次序对称，故只讨论先左后右的前三种次序。
遍历命名

根据访问结点操作发生位置命名：
① NLR：前序遍历(PreorderTraversal亦称（先序遍历））
——访问根结点的操作发生在遍历其左右子树之前。
② LNR：中序遍历(InorderTraversal)
——访问根结点的操作发生在遍历其左右子树之中（间）。
③ LRN：后序遍历(PostorderTraversal)
——访问根结点的操作发生在遍历其左右子树之后。
注意：
由于被访问的结点必是某子树的根，所以N(Node）、L(Left subtree）和R(Right subtree）又可解释为根、根的左子树和根的右子树。NLR、LNR和LRN分别又称为先根遍历、中根遍历和后根遍历。
遍历算法

1．先（根）序遍历的递归算法定义：
若二叉树非空，则依次执行如下操作：
⑴ 访问根结点；
⑵ 遍历左子树；
⑶ 遍历右子树。
2．中（根）序遍历的递归算法定义：
若二叉树非空，则依次执行如下操作：
⑴遍历左子树；
⑵访问根结点；
⑶遍历右子树。
3．后（根）序遍历得递归算法定义：
若二叉树非空，则依次执行如下操作：
⑴遍历左子树；
⑵遍历右子树；
⑶访问根结点。
 * @author WYL
 *
 */
public class BinaryTree {

	int data;//根节点
	BinaryTree left;//左子树
	BinaryTree right;//右子树
	
	//实例化二叉树类
	public BinaryTree(int data){
		//根节点不可以为空
		this.data = data;
		//左右子树为空
		this.left = null;
		this.right = null;
	}
	//向二叉树中插入子节点
	public void insert(BinaryTree root,int data){
		//二叉树的左节点都比根节点小
		if(data > root.data){
			if(root.right == null){
				root.right = new BinaryTree(data);
			}else{
				this.insert(root.right, data);
			}
		}else{
			//二叉树的右结点都比根节点大
			if(root.left == null){
				root.left = new BinaryTree(data);
			}else{
				this.insert(root.left, data);
			}
			//到此为止就建立好了二叉树之后就可以实现二叉树的
			//先根遍历，中根遍历，后根遍历了
		}
	}
}