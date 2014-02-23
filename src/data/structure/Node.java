package data.structure;

public class Node {
	
int data;
Node next;

Node()
{
	this.next=null;
}

Node(int inputData){
	data=inputData;
}

public void setData(int num){
	data=num;
}
public int getData(){
	return data;
}
public void setNextNode(Node n){
	next=n;
}

public Node getNextNode(){
	return next;
}

}// end class