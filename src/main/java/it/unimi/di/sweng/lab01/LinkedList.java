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
	public void addLast(double d) {
		Node n=new Node(d,head,tail);
		head.succ=n;
		tail.prec=n;
	}

	
}
