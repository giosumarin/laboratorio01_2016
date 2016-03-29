package it.unimi.di.sweng.lab01;
import java.util.StringTokenizer;

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
		if(s!=""){
			StringTokenizer st=new StringTokenizer(s);
			while (st.hasMoreElements()) {
				String token = st.nextElement().toString();
				addLast(Double.parseDouble(token));
			}
		}
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

	public void addFirst(double d) {
		Node n=new Node(d,head,head.succ);
		(head.succ).prec=n;
		head.succ=n;
		
	}

	public boolean removeFirst() {
		if (head.succ==tail)
			return false;
		else{
			Node n=head.succ;
			head.succ=n.succ;
			(n.succ).prec=head;
			return true;
		}
	}

	public boolean removeLast() {
		if (tail.prec==head)
			return false;
		else{
			Node n=tail.prec;
			tail.prec=n.prec;
			(n.prec).succ=tail;
			return true;
		}
	}

	public boolean remove(double d) {
		Node n=head.succ;
		do{
			if(n.cont==d){
				(n.prec).succ=n.succ;
				(n.succ).prec=n.prec;
				return true;
			}
			n=n.succ;
		}while(n!=tail);
		return false;
	}

	
}
