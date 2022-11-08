package com.greatlearning;

import java.util.ArrayList;
import java.util.Scanner;


public class BSTSum {
	ArrayList<Integer> nodelist=new ArrayList<Integer>();
  public static Node newNode(int z)
  {
	  Node temp=new Node();
	  temp.left=null;
	  temp.right=null;
	  temp.data=z;
	  return temp;
  }
  
  public void insert(Node root,Node nn)
  {
	  if(nn.data<root.data)
	  {
		  if(root.left==null)
		  {
			  root.left=nn;
		  }
		  else
		  {
			  insert(root.left,nn);
		  }
	  }
	  else
	  {
		  if(root.right==null)
		  {
			  root.right=nn;
		  }
		  else
		  {
			  insert(root.right,nn);
		  } 
	  }
	  
	  
  }
	
  private void traverse(Node root)
  {
	  if(root!=null)
	  {
		  traverse(root.left);
		  traverse(root.right);
		  nodelist.add(root.data);
	  }
  }
  @SuppressWarnings("unused")
public static void main(String args[]) {
	  BSTSum bst=new BSTSum();
	  Node root=null;
	  Node nn = null;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number of nodes");
	  int k= sc.nextInt();
	  int i;
	  for(i=1;i<=k;i++)
	  {
		  System.out.println("Enter data for the node");
		  int n=sc.nextInt();
		  nn=newNode(n);
	  }
	  if(root==null) 
	  {
		  root=nn;
		  
	  }
	  else
	  {
		  bst.insert(root,nn);
	  }
	  bst.traverse(root);
	  System.out.println("Enter Number of nodes");
	  int n = sc.nextInt();
	  
	  int flag=0;
	  int sum=0;
	  
	  for (i=0;i<bst.nodelist.size();i++)
	  {
		  if(bst.nodelist.contains(sum-bst.nodelist.get(i)))
		  {
			  int a= bst.nodelist.get(i);
			  int b= sum-a;
			  System.out.println("Pair Found["+ a + b + "]");
			  flag=1;
			  break;
		  }
		  
	  }
	  if(flag==0)
	  {
		  System.out.println("Pair not found");
	  }
  }
}
