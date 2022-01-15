import java.util.Queue;
import java.util.PriorityQueue;

class Main {

    public static void main(String[] args) {
        
        Queue<Integer> numbers = new PriorityQueue<>();

      
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);

     
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

       
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}