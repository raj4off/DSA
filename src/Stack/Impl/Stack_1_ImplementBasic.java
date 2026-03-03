package Stack.Impl;

public class Stack_1_ImplementBasic {
    static class  MinStack {
        private static class Node {
            int data;
            int minSoFar;
            Node next;

            Node(int data, int minSoFar) {
                this.data = data;
                this.minSoFar = minSoFar;
                this.next = null;
            }
        }

        private Node head;

        public MinStack() {
            head = null;
        }

        public void push(int val) {
            if (head == null) {
                head = new Node(val, val);
            } else {
                int newMin = Math.min(val, head.minSoFar);
                Node newNode = new Node(val, newMin);
                newNode.next = head;
                head = newNode;
            }
        }

        public void pop() {
            if (head == null) {
                System.err.println("Stack is empty");
                return;
            }
            head = head.next;
        }

        public int top() {
            if (head == null) {
                System.err.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public int getMin() {
            if (head == null) {
                throw new RuntimeException("Stack is empty");
            }
            return head.minSoFar;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {

        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        stack.pop();
        stack.pop();

        System.out.println("Min: " + stack.getMin());    // 2
    }
}
