import java.util.Queue;
import java.util.LinkedList;

public class QueueLibrary {
    public static void main(String[]args){
        Queue<String> queue=new LinkedList<>();
         
        queue.add("apple");
        queue.add("cherry");
        queue.add("kiwi");
        
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.offer("Lichi"); //add the element at the rear
        System.out.println(queue);
        queue.poll(); //it will remove the front element.
        System.out.println(queue);
        System.out.println( queue.peek()); // gives the front element.
        System.out.println( queue.element());  //same as peek

    }
}
