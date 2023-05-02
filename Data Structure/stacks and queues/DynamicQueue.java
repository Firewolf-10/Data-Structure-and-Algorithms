package stacks;

public class DynamicQueue extends CircularQueue{
    DynamicQueue(){
        super();
    }
    DynamicQueue(int size){
        super(size);
    }
    @Override
    public boolean insert(int item) throws Exception {
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i<data.length ; i++){
                temp[i] = data[i];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
