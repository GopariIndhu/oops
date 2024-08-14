package FirstProgram;

public class polymorphism {
    class A {
        int a, b, c;

        public void add(int x, int y) {
            a = x;
            b = y;
            System.out.println("Addition of a+b is: " + (a + b));
        }

        public void add(int x, int y, int z) {
            a = x;
            b = y;
            c = z;
            System.out.println("Addition of a+b+c is: " + (a + b + c));
        }

        public void print() {
            System.out.println("Class A's method is running");
        }
    }

    class B extends A {
        public void print() {
            System.out.println("Class B's method is running");
        }
    }

    public static void main(String[] args) {
        polymorphism poly = new polymorphism(); // Creating an instance of the outer class

        A a1 = poly.new A(); // Creating an instance of the inner class A

        a1.add(6, 5);
        a1.add(1, 2, 3);

        B b1 = poly.new B(); // Creating an instance of the inner class B

        b1.print();
    }
}
