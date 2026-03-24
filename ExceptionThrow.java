public class ExceptionThrow {
    public static void main(String s[]){
        int i=21;
        int j =0;
        String a = null;
        int arr[] = new int[5];
        try
        {
        j = 20/i;
        if(j==0){
            throw new ArithmeticException("j is zero");
        }
        System.out.println(arr[4]);
        System.out.println(a.length());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("check the error :"+e);
        }
        System.out.println(j);
    }
}
