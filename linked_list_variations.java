public class linked_list_variations {

    public static void main(String[] args) {
        System.out.println("========MyList=========");
        MyList list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40, 2);
        list.show(1);
        list.show();
        list.delete();
        list.delete(2);

        System.out.println("========MyQueue=========");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.show();
        int deletedElement = queue.delete();
        System.out.println(deletedElement);
        queue.show();

        System.out.println("========MyStack=========");
        MyStack<Integer> stack = new MyStack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.show();
        int topElement = stack.delete();
        System.out.println(topElement);
        stack.show();
    }
}
