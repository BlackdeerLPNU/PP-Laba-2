package task1;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();

        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);
        list.push(10);
        list.push(11);
          int size = list.size();

        for (int i = 0; i < size; i++) {
            System.out.println(list.pop());
        }

    }
}
