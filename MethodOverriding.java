class Cal {
    public int show(int a, int b) {
        return a + b;
    }

}

class AdvCal extends Cal {
    public int show(int a, int b) {
        return a + b + 1;
    }
}

public class MethodOverriding {
    public static void main(String s[]) {
        Cal obj = new AdvCal();
        int r = obj.show(3, 4);
        System.out.println(r);
    }
}
