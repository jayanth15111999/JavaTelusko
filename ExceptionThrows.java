class Demo{
    public void show() throws ClassNotFoundException{
        Class.forName("ExceptionThr");
    }
}
public class ExceptionThrows {
    public static void main(String s[]){
        Demo obj = new Demo();
        try{
        obj.show();}
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
}
}
