class A{
    int count;
    public synchronized void increment(){
        count++;
        
    }
}
public class RaceJoinSync{
    public static void main(String s[]) throws InterruptedException{
        A obj= new A();
        Runnable obj1 = () ->
        {
            for(int i=0; i<1000; i++){
                obj.increment();
            }
        };
        Runnable obj2 = () -> 
        {
            for(int i=0; i<1000; i++){
                obj.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);
    }
}