package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_4_AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = new int[]{4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
        Arrays.stream(asteroidCollision(asteroids)).forEach(System.out::println);
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i : asteroids){
            if(i > 0) stack.push(i);
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(i)){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == Math.abs(i)){
                    stack.pop();
                } else if(stack.isEmpty() || stack.peek()<0) stack.push(i);
            }
        }
        int[] res = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.isEmpty() && i>=0){
            res[i--] = stack.pop();
        }

        return res;

    }
}
