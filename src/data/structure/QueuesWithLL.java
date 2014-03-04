package data.structure;

public class QueuesWithLL {

	private Node Front;
	private Node Rear;
	int length=0;
	
	
	QueuesWithLL(){
		this.Front= null;
		this.Rear=null;	
		length=0;
	}
	
	
	public boolean isEmpty()
	{
		if (Front==null){
			return true;
		}
		return false;
	}
	
	public void Enqueue(int data){
		Node NodeToInsert= new Node(data);
		if (Rear!=null){
			Rear.setNextNode(NodeToInsert);
			Rear=Rear.getNextNode();
			Rear.setNextNode(null);
			
		}
		else
		{	Front= NodeToInsert;
			Rear=NodeToInsert;
		}
		length++;
		}
	
	public void Dequeue (){
		
		if (isEmpty()){
			System.out.println("Queue Empty- No elements to Dequeue.");
		}
		else
		{
			int data= Front.getData();
			System.out.println("Deleted Element is "+ data);
			Front= Front.getNextNode();	
			if (Front==null)
			{
				Rear=null;
			}
			
			length--;
		}
	}
	
	
	public void PrintQueue(){
		Node Temp = Front;
		if (length==0)
			System.out.println("Queue is Empty");
		else{
			
			while(Temp!=Rear.getNextNode()){
				System.out.println(Temp.getData()+ "");
				Temp=Temp.getNextNode();
			}
		}
	}
}
