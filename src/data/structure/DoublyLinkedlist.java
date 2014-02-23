package data.structure;

public class DoublyLinkedlist {
private DoublyLLNode Headnode;

public DoublyLinkedlist()
{
Headnode=null;
}

public int getLength(DoublyLLNode Headnode)
{
	int length=1;
	DoublyLLNode current= Headnode;
	while(current!=null){
		length++;
		current= current.getNext();
	}
		return length;
	
}//end method- getLength

public void insert(int data, int position){
	
DoublyLLNode nodeToInsert = new DoublyLLNode(data);
	//assuming that the linked list starts at position 0
	int size=0;
	if (Headnode==null){
	size=0;
	}
	else{
	size= getLength(Headnode);
	}

	if (size==0){
		Headnode= nodeToInsert;
	}
	else if (size>0 && position ==0){
		
		nodeToInsert.setNext(Headnode);
		Headnode.setPrevious(nodeToInsert);
		Headnode= nodeToInsert;
	}
	else if (position <= 0 || position >= size){
		System.out.println("Invalid Position");
	}
	
	else if (size>0 && position >0){
		
	DoublyLLNode positionNode= Headnode;
	int count=0;
	while(count<position-1){
		positionNode= positionNode.getNext();
		count++;
	}
	
	nodeToInsert.setNext(positionNode.getNext());
		if (positionNode.getNext()!=null){
			positionNode.getNext().setPrevious(nodeToInsert);
		}// checking if the insert node is not at the end
		nodeToInsert.setPrevious(positionNode);
		positionNode.setNext(nodeToInsert);		
		
	}
	

}// end Insert function

public void delete(int position){
	
	//assuming that the linked list starts at position 0
	int size=0;
	if (Headnode==null){
		size=0;
	}
	else{
	size= getLength(Headnode);
	
	}
	if (position < 0 || position >= size){
		System.out.println("No node to delete !");
	}
	else if (position==0){
		
	DoublyLLNode tmp= Headnode.getNext();
	Headnode=null;
	Headnode= tmp;		
	} 
	else if(position > 0){
	
		DoublyLLNode positionNode= Headnode;
		
		int count=0;
		while(count<position-1){
			positionNode= positionNode.getNext();
			count++;
		}
		
		DoublyLLNode DelNode=positionNode.getNext();
		positionNode.setNext(DelNode.getNext());
		
		if (DelNode.getNext()!=null)
		{
			DelNode.getNext().setPrevious(positionNode);
		}
		
		DelNode=null;
	}
	
	
	
}// end Delete function

public void PrintLinkedList(){
	if (Headnode.equals(null))
		System.out.println("List is Empty");
	else{
		DoublyLLNode Temp= Headnode;
		
		while(Temp!=null){
			System.out.println(Temp.getData()+ "");
			Temp=Temp.getNext();
		}
	}

}
}