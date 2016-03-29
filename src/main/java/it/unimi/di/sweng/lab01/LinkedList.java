package it.unimi.di.sweng.lab01;

public class LinkedList {
	Node head;
	Node tail;
	
	public LinkedList(){
		head=new Node(0.0,null,null);
		tail=new Node(0.0,head,null);
		head.succ=tail;	
	}
	
	public LinkedList(String s) {
		head=new Node(0.0,null,null);
		tail=new Node(0.0,head,null);
		head.succ=tail;
		if(s!="")
			addLast(Double.parseDouble(s));
	}

	public String toString(){
		if (tail.prec==head)
			return "[]";
		else
		{
			String s="[";
			Node n=head.succ;
			s+=Double.toString(n.cont);
			while(n.succ!=tail){
				n=n.succ;
				s+=" "+Double.toString(n.cont);
			}
			return s+"]";
		}
		
	}
	public void addLast(double d) {
		Node n=new Node(d,tail.prec,tail);
		(tail.prec).succ=n;
		tail.prec=n;
	}

	
}
