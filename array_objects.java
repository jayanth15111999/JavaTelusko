class Student{
    int roll_no;
    String name;
    int marks;
}

public class array_objects {
    public static void main(String a[]){

        Student obj = new Student();
        obj.roll_no = 23;
        obj.name = "jay";
        obj.marks =90;

        Student obj2 = new Student();
        obj2.roll_no = 26;
        obj2.name = "jayanth";
        obj2.marks =99;

        Student obj3 = new Student();
        obj3.roll_no = 20;
        obj3.name = "reddy";
        obj3.marks =22;

        Student arr[] = new Student[3];
        arr[0] = obj;
        arr[1] = obj2;
        arr[2] = obj3;

        for(int i =0; i<3;i++){
            System.out.println(arr[i].roll_no + " "+ arr[i].name+" "+ arr[i].marks);
        }


    }
}
