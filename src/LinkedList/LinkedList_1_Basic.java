package LinkedList;

//java -cp out src/LinkedList/LinkedList_1_Basic.java
public class LinkedList_1_Basic {

    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 8;
        int len = arr.length;
        Node head = null;
        Node current = null;

        for(int i: arr){
            if(head==null){
                current = new Node(i);
                head = current;
            } else{
                current.next = new Node(i);
                current = current.next;
            }
        }
        current.next = head;

        Node temp = head;
        int i = (len-(k%len))-1;
        while(temp!=null && i>0){
            temp = temp.next;
            i--;
        }
        head = temp.next;
        temp.next = null;

        temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    
}
