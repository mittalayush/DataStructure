package data.structure;

public class TestMain {
	 public static void main(String[] args) {
	 Linkedlist list= new Linkedlist();
	 DoublyLinkedlist dlist= new DoublyLinkedlist();
	 
	 dlist.insert(0,0);
	 dlist.insert(10,1);
	 dlist.insert(20,2);
	 dlist.insert(30,3);
	 dlist.insert(40,4);
	 dlist.delete(3);
	 dlist.PrintLinkedList();
	 
	 System.out.println("----------");
	 list.AddNodeAtFront(10);
	 list.AddNodeAtEnd(20);
	 list.AddNodeAtEnd(30);
	 list.AddNodeAtEnd(40);
	 list.AddNodeAtPos(25, 2);
	 //list.DeleteAtFront();
	 //list.DeleteAtEnd();
	 //list.DeleteNodeAtPos(1);
	 list.PrintLinkedList();
	 
	 System.out.println("----------");
	 list.reverse();
	 list.PrintLinkedList();
}
}