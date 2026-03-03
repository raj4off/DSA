package JavaCollections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

    }

    private static void listDemo(){

        // resize automatically
        // get, add - O(1), remove, add(index) -> O(n)
        // Slower on frequent insert on middle
        // Not synchronized
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");

        list.remove("a");


        //Slower random access
        //More memory (stores prev + next pointer)
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(1);
        linkedList.remove(10);




    }


    private static void queueDemo(){
        //Not FIFO, sort asc by default
        //We can give priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(20);
        pq.add(10);
        pq.add(30);


        //ArrayDeque
        // all operations -> O(1)
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);

    }


    private static void setDemo(){
        // HashSet
        // No order guaranteed
        // removes duplicate
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");


        // LinkedHashSet
        // Maintains insertion order
        // uses doubly linked list, slower than hashset,
        Set<String> linkedSet = new LinkedHashSet<>();
        set.add("A");
        set.add("B");

        // TreeSet
        // sorted

    }

    private static void mapDemo(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        map.getOrDefault("Z", 2);

        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        map.put("A", 2);
        map.put("B", 1);

        //sort by key
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30, "C");
        treeMap.put(10, "A");
        treeMap.put(29, "C");
    }


}




/*
List:
ArrayList
LinkedList

Queue:
PriorityQueue
ArrayDequeue
ArrayBlockingQueue
LinkedBlockingQueue

Set:
HashSet
LinkedHashSet
TreeSet

Map:
HashMap
LinkedHashMap
TreeMap

 */