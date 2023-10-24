/**
 * Section 1: Java Fundamentals
 * Topic: Local Class
 */

abstract class AbstractClass{
    public abstract void doSomething();
}

interface Executable{
    void doSomething();
}
public class LocalClassExample2 {
    String name = "Doe";

    public static void main(String[] args) {
        String name = "Smith";

        class A extends AbstractClass{ //local class can extend any class including abstract
            public void doSomething() {
                System.out.println("name = " + name);
                //System.out.println("name = " + LocalClassExample2.this.name); //if we remove String name = "Smith"; static cannot refer to inner non-static

            }
        }
        class B implements Executable{ //local class can implement interfaces
            public void doSomething() {
                System.out.println("name = " + name);
            }
        }
        abstract class C extends AbstractClass{ //local abstract class

        }
        class D extends C{ //local class extending another local class
            public void doSomething(){
                System.out.println("name = " + name);
            }
        }
        //execute code on instances of local classes
        new A().doSomething();
        new B().doSomething();
        new D().doSomething();
    }
}
