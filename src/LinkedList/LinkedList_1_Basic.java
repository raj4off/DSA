package LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}

public class LinkedList_1_Basic {

   private static Node convertArrayToLinkedList(int[] arr){
       Node head = null;
       Node cur = null;
       for(int i : arr){
           if(head==null){
               head = new Node(i);
               cur = head;
           } else {
               Node temp = new Node(i);
               cur.next = temp;
               cur = temp;
           }
       }
       return head;
   }

   private static void traverseLinkedList(Node head){
       Node cur = head;
       while(cur != null){
           System.out.print(cur.val+" ");
           cur = cur.next;
       }
       System.out.println();
   }

   private static int findLengthOfLinkedList(Node head){
       int len = 0;
       Node cur = head;
       while(cur!=null){
           len++;
           cur=cur.next;
       }
       return len;
   }

   private static Node removeHead(Node head){
       if(head == null) return null;
       return head.next;
   }

   private static Node removeTail(Node head){
       if(head == null || head.next == null) return null;
       Node cur = head;

       while(cur.next.next != null){
           cur = cur.next;
       }
       cur.next = null;
       return head;
   }

   private static Node removeKthElement(Node head, int k){
       Node cur = head;
       Node prev = cur;
       if(k == 1) return head.next;
       while(cur != null){
           k--;
           if(k==0){
               prev.next = cur.next;
           }
           prev = cur;
           cur = cur.next;
       }
       return head;
   }

   private static Node insertElementAtK(Node head, int k, int val){
       Node cur = head;
       if(k == 1) return new Node(val, head);
       Node node = new Node(val);
       while(cur != null){
           k--;
           if(k==1){
               node.next = cur.next;
               cur.next = node;
               break;
           }
           cur = cur.next;
       }
       return head;
   }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        Node head = convertArrayToLinkedList(arr);

        traverseLinkedList(head);
        System.out.println("Length of Linked list: "+findLengthOfLinkedList(head));

        head = removeHead(head);
        traverseLinkedList(head);

        head = removeTail(head);
        traverseLinkedList(head);

        head = removeKthElement(head, 5);
        traverseLinkedList(head);

        head = insertElementAtK(head, 5, 11);
        traverseLinkedList(head);
    }
}
