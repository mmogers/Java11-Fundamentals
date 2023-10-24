/**
 * Section 1: Java Fundamentals
 * Topic: Local Classes
 */
public class LocalClassExample {

    private String defaultName = "Jane";
    private String lastName = "Doe";

    private void methodWithLocalClass(){ //non-static method that declares a local class

        String defaultName = "Ralph";//local class wil use local variable of the local class instead of enclosing class
        /*if (this.defaultName != null){
            defaultName = this.defaultName; //default name accessed from inner class should be final or effectively final
        }*/
        class LocalClass{ //local class have the scope only within this method , can extend other classes and implement interfaces, cannot have static members
            private String name;//local class can have all the members but non-static
            private LocalClass(String name){ //constructor,
                if(name == null){
                    this.name = defaultName;
                }else{
                this.name = name;
                }
                //this.name += " " + lastName; //local class has access to enclosing class attributes
                //this.name += " " + this.lastName; //constructor refers to the local class only
                this.name += " " + LocalClassExample.this.lastName; //ok
            }
            private void performSomeAction(){
                System.out.println("LocalClass.name = " +  name);
            }
            /*static class nestedClass{ //inner class cannot have static declarations

            }

            static final void main(String[] args) {

            }
            static Object myStaticObject;*/
            /*enum Values{  // the same for enums and interfaces
                ONE,TWO
            }
            interface doAble{
                do();
            }*/

        }
        //create instances of local class within the enclosing class scope
        LocalClass jeff = new LocalClass("Jeff");
        LocalClass martha = new LocalClass(("Martha"));
        LocalClass bob = new LocalClass("Bob");
        //execute methods on instances of the local class
        jeff.performSomeAction();
        martha.performSomeAction();
        bob.performSomeAction();
        //access fields directly from instance of local class
        System.out.println("Bob's name is " + bob.name);

        new LocalClass(null).performSomeAction();

    }

    public static void main(String[] args) {
        new LocalClassExample().methodWithLocalClass();
    }
}
