package it.unimi.di.sweng.lab01;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinkedList {
	Node head;
	Node tail;
	Node p;
	public LinkedList(){
		head=new Node(0.0,null,null);
		tail=new Node(0.0,head,null);
		head.succ=tail;
		p=head;
	}
	
	public LinkedList(String s) {
		head=new Node(0.0,null,null);
		tail=new Node(0.0,head,null);
		head.succ=tail;
		p=head;
		if(s!=""){
			StringTokenizer st=new StringTokenizer(s);
			while (st.hasMoreElements()) {
				String token = st.nextElement().toString();
				addLast(Double.parseDouble(token));
			}
		}
	}

	public LinkedList(InputStreamReader i) throws IOException {
		float data = i.read();
		while(data != ){
		    char theChar = (char) data;
		    data = i.read();
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

	public double mean() {
		if (head.succ==tail)
			return 0;
		else{
			double tot=0;
			int count=0;
			Node n=head.succ;
			do{
				tot+=n.cont;
				count++;
				n=n.succ;
			}while(n!=tail);
			return tot/count;
		}
	}

	public double next() {
		if(p.succ!=tail)	
			p=p.succ;
		return p.cont;
	}

	public double prev() {
		if(p.prec!=head)
			p=p.prec;
		return p.cont;
	}
	
	
}
