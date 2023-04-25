class MyList<T> {
    private ListNode head;
    private int size;

    public MyList() {
        head = null;
        size = 0;
    }

    public void add(T e) {
        ListNode newNode = new ListNode(e);
        if (head == null) {
            head = newNode;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
        System.out.println("added " + e);
    }

    public void add(T e, int i) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        ListNode newNode = new ListNode(e);
        if (i == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode curr = head;
            for (int j = 0; j < i-1; j++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        size++;
        System.out.println("added " + e + " at index " + i);
    }

    public T delete(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        T result;
        if (i == 0) {
            result = (T) head.value;
            head = head.next;
        } else {
            ListNode curr = head;
            for (int j = 0; j < i-1; j++) {
                curr = curr.next;
            }
            result = (T) curr.next.value;
            curr.next = curr.next.next;
        }
        size--;
        System.out.println("value " + result + " at index " + i);
        return result;
    }

    public T delete() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        T result;
        if (head.next == null) {
            result = (T) head.value;
            head = null;
        } else {
            ListNode curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            result = (T) curr.value;
            curr.next = null;
        }
        size--;
        System.out.println("last value " + result);
        return result;
    }

    public T show(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListNode curr = head;
        for (int j = 0; j < i; j++) {
            curr = curr.next;
        }
        System.out.println("at index " + i + " value is " + (T) curr.value);
        return (T) curr.value;
    }

    public void show() {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    private static class ListNode<T> {
        T value;
        ListNode next;

        ListNode(T value) {
            this.value = value;
            this.next = null;
        }
    }
}


class MyQueue<T> {
    private ListNode<T> head;
    private ListNode<T> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void add(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T delete() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        T value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public void show() {
        ListNode<T> current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static class ListNode<T> {
        T value;
        ListNode<T> next;

        ListNode(T value) {
            this.value = value;
            this.next = null;
        }
    }
}


class MyStack<T> {
    private ListNode<T> head;
    private int size;

    public MyStack() {
        head = null;
        size = 0;
    }

    public void add(T e) {
        ListNode<T> newNode = new ListNode<>(e);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T delete() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        T deletedValue = head.value;
        head = head.next;
        size--;
        return deletedValue;
    }

    public void show() {
        ListNode<T> current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static class ListNode<T> {
        T value;
        ListNode<T> next;

        ListNode(T value) {
            this.value = value;
            this.next = null;
        }
    }
}


public class Main {

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
