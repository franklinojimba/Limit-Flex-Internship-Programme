package files.UdemyLessons.InterfacesLesson;

public class Main {
    // One interface can extend another.
    interface A {
        @SuppressWarnings("unused")
        void meth1();
        @SuppressWarnings("unused")
        void meth2();
    }

    // B now includes meth1() and meth2() – it adds meth3().
    interface B extends A {
        @SuppressWarnings("unused")

        void meth3();
    }

    // This class must implement all of A and B
    static class MyClass implements B {
        public void meth1() {
            System.out.println("Implement meth1().");
        }

        public void meth2() {
            System.out.println("Implement meth2().");
        }

        public void meth3() {
            System.out.println("Implement meth3().");
        }
    }

    public static void main(String[] ignoredArgs) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
