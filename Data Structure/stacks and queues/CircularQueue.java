package stacks;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int size;
    protected int front = 0;
    protected int end = 0;
    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Cann't add item Full Queue");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't remove from Empty Queue");
        }
        int val = data[front++];
        front = front % data.length;
        size--;
        return val;
    }
    public void display(){
        int i = front;
        do{
            System.out.print(data[i]+"<-");
            i++;
            i %= data.length;
        }while (i != end);
        System.out.println("END");
    }
}
