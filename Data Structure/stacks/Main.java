package stacks;

public class Main {
    public static void main(String[] args) throws Exception{
        DynamicQueue cs = new DynamicQueue(5);
        cs.insert(1);
        cs.insert(2);
        cs.insert(3);
        cs.insert(4);
        cs.insert(5);
        cs.insert(6);
        cs.insert(7);
        cs.insert(8);
        cs.insert(9);
        cs.insert(10);
        cs.insert(11);
        cs.display();

        cs.remove();
        cs.display();
        cs.remove();
        cs.display();
        cs.insert(1);
        cs.insert(2);
        cs.remove();
        cs.display();
        cs.remove();
        cs.display();
        cs.remove();
        cs.remove();
        cs.remove();
//        cs.remove();
        cs.display();
        cs.insert(3);
        cs.insert(4);
        cs.insert(5);
        cs.display();

    }
}
