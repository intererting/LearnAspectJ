/**
 * author        yiliyang
 * date          2022-07-11
 * time          上午11:07
 * version       1.0
 * since         1.0
 */
public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.testInner();
    }
}

class Outer {
    public void testInner() {
        new Inner().test();
    }
}

class Inner {
    public String test() {
        System.out.println("test aspectJ");
        return "result";
    }
}
