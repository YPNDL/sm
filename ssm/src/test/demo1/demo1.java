package demo1;

public class demo1 {









    class A {
        public void show() {
            show2();
        }

        public void show2() {
            System.out.println("A");
        }
    }

    class B extends A {
        public void show2() {
            System.out.println("B");
        }
    }

    class C extends B {
        public void show() {
            super.show();
        }

        public void show2() {
            System.out.println("C");
        }
    }

}