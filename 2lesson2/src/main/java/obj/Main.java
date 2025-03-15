package obj;

public class Main {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.add(10);
        list.add(15);
        list.add(1);
        //решить проблему с remove
        list.add(3,11);
        list.pop();
        System.out.println(list);
    }
}
