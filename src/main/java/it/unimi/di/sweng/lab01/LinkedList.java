package it.unimi.di.sweng.lab01;

public class LinkedList {
	Node head;
	Node tail;
	
	public LinkedList(){
		head=new Node(0.0,null,null);
		tail=new Node(0.0,head,null);
		head.succ=tail;	
	}
	
	public String toString(){
		if (tail.prec==head)
			return "[]";
		else
			return "["+Double.toString((head.succ).cont)+"]";
		
		
	}
	public void addLast(int i) {
		Node n=new Node((float)i,head,tail);
		head.succ=n;
		tail.prec=n;
	}

	
}
