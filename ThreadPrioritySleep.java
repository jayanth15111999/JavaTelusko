class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
        {
        System.out.println("hi");
        try{
            Thread.sleep(10);
        }catch(Exception e){
            //e.printStackTrace();
        }
    }
}
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
        {
        System.out.println("hello");
        try{
            Thread.sleep(10);
        }catch(Exception e){
            //e.printStackTrace();
        }
        }
    }
}
public class ThreadPrioritySleep {
    public static void main(String s[]){
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try{
        Thread.sleep(10);
    }catch(Exception e){
        //e.printStackTrace();
    }
        obj2.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){
            //e.printStackTrace();
        }

    }
}
