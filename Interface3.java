interface A {
    void show();
}

interface B {
    void config();
}

interface C extends B {
    void run();
}

class X implements A, C {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }

}

public class Interface3 {
    public static void main(String s[]) {
        X obj = new X();
        obj.show();
        obj.config();
        obj.run();
    }

}
