package dataStructures;
import java.util.ArrayList;
import java.util.List;

// Here I am writing a code for a simple Queue implementation in Java 
//basic operations to perform is add a element and remove the first added element 
class MySimpleQueue {
	//name of the class
	
	private List<Integer> data;
	//to store the data
	
	private int startPoint;
	
	public MySimpleQueue(){
		data= new ArrayList<Integer>();
		startPoint=0;
		
	}
	public  boolean addInqueue(int x){
		data.add(x);
		return true;
	}
	public int firstElement(){
      return data.get(startPoint);
	}
	public  boolean removeFirstElement(){
		if(isEmpty()==true){
			System.out.println("queue is empty");
			return false;
		}
		startPoint++;
		return true;
	}
	public boolean isEmpty(){
		  return startPoint >= data.size();
	}
	
};

public class SimpleQueue {
    public static void main(String[] args) {
    	MySimpleQueue q = new MySimpleQueue();
        q.removeFirstElement();
        q.addInqueue(10);
        q.addInqueue(3);
        q.addInqueue(2);
        if (q.isEmpty() == false) {
            System.out.println(q.firstElement());
        }
        q.removeFirstElement();
        if (q.isEmpty() == false) {
            System.out.println(q.firstElement());
        }
        q.removeFirstElement();
        if (q.isEmpty() == false) {
            System.out.println(q.firstElement());
        }
    }
}