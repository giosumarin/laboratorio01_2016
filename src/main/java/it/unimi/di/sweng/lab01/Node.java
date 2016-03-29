package it.unimi.di.sweng.lab01;

public class Node {
	public double cont;
	public Node prec;
	public Node succ;
	
	public Node (double v, Node p, Node s){
		cont=v;
		prec=p;
		succ=s;
	}
}
