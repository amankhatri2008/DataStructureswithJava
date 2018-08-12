package dataStructures;
// no loss of space in circualar queue as we maintain two pointers head and tail
class CircularQueue {
    
    private int[] data;
    private int head;
    private int tail;
    private int size;

    // initialize the circular queue with K elements , head and tail to -1 location and size k
    public CircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }
    
    //to add element in Queue
    public boolean addInQueue(int value) {
    	//check if it is full already?if full then return false ,else continue to add
    	if(isFull()==true){
    		return false;
    	}
    	if(isEmpty()==true){
    		head=0;
    	} 
    	
    	 tail = (tail + 1) % size;
         data[tail] = value;
         return true;
    }
    
    
    //to remove element in Queue
    public boolean deleteFromQueue() {
    	if(isEmpty()==true){
    		return false;
    	}
    	if(head==tail){
    		head=-1;
    		tail=-1;
    		return true;
    	}
    	head=(head+1)%size;
    	return true;
    }
    
    
   
    public int Front() {
    	 if (isEmpty() == true) {
             return -1;
         }
         return data[head];
    }
    
    
    public int Rear() {
    	 if (isEmpty() == true) {
             return -1;
         }
         return data[tail];
    }
    
  
    public boolean isEmpty() {
    	if(head==-1){
    		return true;
    	}
    	return false;
    }
    
    
    public boolean isFull() {
    	return (((tail+1)%size)==head);
    }
}