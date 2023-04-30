package stacks;

public class DynamicStack extends CustomStack{

    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if (this.isFull()){
            int[] temp = new int[this.data.length*2];
            for (int i = 0; i<this.data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
