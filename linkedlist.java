import java.util.LinkedList;
public class linkedlist{
    public static void main(String []args){
        LinkedList<String> linklist = new LinkedList<>();
        //stack
        linklist.push("J");
        linklist.push("A");
        linklist.push("Y");
        linklist.push("A");
        linklist.pop();

        //queue
        linklist.offer("J");
        linklist.offer("A");
        linklist.offer("Y");
        linklist.offer("A");
        linklist.poll();

        linklist.addFirst("J");
        linklist.addLast("N");
        linklist.removeFirst();
        linklist.removeLast();

        linklist.peekFirst();
        linklist.peekLast();

        linklist.add(1, "A");
        linklist.remove("A");

        System.out.println(linklist.indexOf("Y"));                      
        System.out.println(linklist.get(0));

        System.out.println(linklist);
    }
}