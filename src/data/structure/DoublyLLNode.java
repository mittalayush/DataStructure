package data.structure;

public class DoublyLLNode {

private int data;
private DoublyLLNode next;
private DoublyLLNode previous;


public DoublyLLNode(int data){
	this.data=data;
	next=null;
	previous=null;
}

public DoublyLLNode()
{
	next=null;
	previous=null;
}

public void setData(int num){
	data=num;
}

public int getData(){
	return data;
}


public DoublyLLNode getNext() {
	return next;
}

public void setNext(DoublyLLNode next) {
	this.next = next;
}

public DoublyLLNode getPrevious() {
	return previous;
}

public void setPrevious(DoublyLLNode previous) {
	this.previous = previous;
}

}