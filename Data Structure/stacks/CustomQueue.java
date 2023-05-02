package stacks;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    CustomQueue(){
        this(DEFAULT_SIZE);
    }
     CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean isFull(){
        return end == data.length;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Cann't add item to Full Queue.");
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cann't remove from Empty Queue.");
        }
        int val = data[0];
        for (int i = 1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return val;
    }

    public void display(){
        for (int i = 0; i<end; i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("End");
    }

}
