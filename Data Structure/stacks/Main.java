package stacks;

public class Main {
    public static void main(String[] args) throws Exception{
        DynamicStack cs = new DynamicStack(5);
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        System.out.println(cs.peek());
        cs.push(6);
        cs.push(7);
        cs.push(8);
        cs.push(9);
        cs.push(10);
        cs.push(11);
        cs.display();

        cs.pop();
        cs.pop();
        cs.pop();
        cs.pop();
        cs.pop();
//        cs.pop();
        cs.display();

    }
}
