package stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr = -1;
    CustomStack(){
        this(DEFAULT_SIZE);
    }
    CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Cann't push item to Full stack");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cann't pop from Empty stack");
        }
        int ans = data[ptr];
        ptr--;
        return ans;
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
    public int peek() {
        return data[ptr];
    }

    public void display(){
        for (int i = 0; i<=ptr; i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("End");
    }
}
