package data.structure;

public class Linkedlist {
private Node Headnode;

	public Linkedlist()
{
	Headnode=null;
}

	public int getLength(Node Headnode)
{
	int length=1;
	Node current= Headnode;
	while(current!=null){
		length++;
		current= current.getNextNode();
	}
		return length;
	
}// end method- getLength

	public void AddNodeAtFront(int data){

	Node NodeToInsert = new Node(data);
	
	if (Headnode==null){
		Headnode=NodeToInsert;
		NodeToInsert.setNextNode(null);
	}	else
	{
		Node oldHeadnode= Headnode;
		NodeToInsert.setNextNode(oldHeadnode);
		Headnode=NodeToInsert;
		
	}
}	

	public void AddNodeAtEnd(int data){
	Node NodeToInsert = new Node(data);
		
	if (Headnode==null){
			System.out.println("Kindly add atleast one node");
	}	else
	{	
		Node tmp= Headnode;
		while(tmp.getNextNode()!=null){
			tmp = tmp.getNextNode();
			}
		tmp.setNextNode(NodeToInsert);
			NodeToInsert.setNextNode(null);		
		}
	}
	
	public void AddNodeAtPos(int data, int position){

		Node NodeToInsert = new Node(data);
			
		// assuming that the linked list starts at position 0
		int size=0;
		if (Headnode==null){
			size=0;
		}
		else{
		size= getLength(Headnode);
		}
		if (position <= 0 || position >= size){
			System.out.println("Invalid Position");
		}
		else
		{
				
			Node positionNode= Headnode;
			int count=0;
			while (count< position-1){
					positionNode= positionNode.getNextNode();
					count++;
			}
			NodeToInsert.setNextNode(positionNode.getNextNode());
			positionNode.setNextNode(NodeToInsert);
		}
			
}	

	public void DeleteAtFront(){

		
		if (Headnode==null){
			System.out.println("No Node to Delete !");
		}	else
		{
			Node tmp = Headnode.getNextNode();
			Headnode= null;
			Headnode= tmp;
			
		}
	}
	
	public void DeleteAtEnd(){
		
		Node tmp= Headnode;
		
		if (Headnode==null){
			System.out.println("No Node to Delete !");
		}	
		else
		{	
			while(tmp.getNextNode().getNextNode()!=null){
			tmp = tmp.getNextNode();
			}
		tmp.setNextNode(null);
		}
	}
	public void DeleteNodeAtPos(int position){
			
		// assuming that the linked list starts at position 0
		int size=0;
		if (Headnode==null){
			size=0;
			System.out.println("No node to delete!");
		}
		else{
		size= getLength(Headnode);
		}
		
		if (position <= 0 || position >= size){
			System.out.println("Invalid Position");
		}
		else
		{
				
			Node positionNode= Headnode;
			Node DeleteNode;
			int count=0;
			while (count< position-1){
					positionNode= positionNode.getNextNode();
					count++;
			}
			DeleteNode= positionNode.getNextNode();
			positionNode.setNextNode(positionNode.getNextNode().getNextNode());
			DeleteNode=null;
			
		}
			
}	
	
	
public void reverse(){
	Node Second= Headnode.getNextNode();
	Node Third= Second.getNextNode();
	
	
	Second.next= Headnode;
	Headnode.next=null;
	
	Node Previous= Second;
	Node Current= Third;

	while(Current!=null){
		Node Next= Current.getNextNode();
		Current.next= Previous;
		
		Previous= Current;	
		Current=Next;
		
	}
	
	Headnode= Previous;
	
}


public void reverseWithRecursion(Node currentnode){
	
	if (currentnode.getNextNode() == null ){
		Headnode= currentnode;
		return;
	}
	
	reverseWithRecursion(currentnode.getNextNode());
	
	currentnode.next.next=currentnode.next;
	currentnode.next=null;
	
}


public void PrintLinkedList(){
	if (Headnode== null)
		System.out.println("List is Empty");
	else{
		Node Temp= Headnode;
		
		while(Temp!=null){
			System.out.println(Temp.getData()+ "");
			Temp=Temp.getNextNode();
		}
	}
}
}// end class
