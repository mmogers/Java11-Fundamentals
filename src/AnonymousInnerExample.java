/**
 * Section 1 : Java Fundamentals
 * Topic: Anonymous classes
 */

abstract class AnAbstractClass{
    int i;
    protected abstract void doSomething();
}

interface Doable{
    void doSomething();
}
public class AnonymousInnerExample {
    String name = "Default";
    public void testAnonymous(){
        AnAbstractClass a = new AnAbstractClass() { //declare a var of type AnAbstractClass and immediately define the class body
            public void doSomething() { //implementing abstract method
                System.out.println("Anonymous AnAbstractClass " + "will do something with " + i);
            }
        }; //declaration occurs in the expression and must end with ;
        a.doSomething(); //doSomething() method should be declared in abstract class if we use it outside the anonymous class

        Object b = new Object(){// anonymous class can extend any class (ie Object)
            public String toString(){
                return "Anonymous object ";
            }
        };
        System.out.println(b);

        new Doable(){ //instantiating and declaring anonymous class using interface and executing doSomething method on instantiated object
            public void doSomething(){
                System.out.println("Anonymous Doable " + " will doSomething with " + b);
            }
        }.doSomething();

        abstract class ConcreteClass extends AnAbstractClass{ //if you want to pass parameters to anonymous class you can extend abstract class using a local class
            ConcreteClass(int i){ //constructor for local abstract class
                this.i = i;
            }
        }

        AnAbstractClass c = new ConcreteClass(5) { //anonymous class created with an instance initializer and passing a value to the constructor
            {
                i = 2 * this.i; // instance initializer
            }
            @Override
            public void doSomething() {
                System.out.println("Anonymous AnAbstractClass " + "will doSomething with " + i);
            }
        };
        c.doSomething();

    }

    public static void main(String[] args) {
        new AnonymousInnerExample().testAnonymous();
    }

}

