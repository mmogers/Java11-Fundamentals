/**
 * Section : 1
 * Topic: Nested class, Extras
 */
public class TestInheritance extends OuterMost{
//public class TestInheritance extends OuterMost.PublicInner{ //instance of OuterMost should exist to enter an inner class
    public static void main(String[] args) {
        new TestInheritance().testInnerClassMembers();
        /*//if we comment out the previous line - static method - no instance of current class so cannot access the inner classes directly
        new ProtectedInner();
        new PublicInner();*/

    }
    private void testInnerClassMembers(){ //non-static method - instance of current class exists so inner classes are available through inheritance
        new ProtectedInner();
        new PublicInner(); //first level

        //alternative
        this.new ProtectedInner(); //enclosing class allows access to inner classes on the current instance
        this.new PublicInner();

        new PublicInner().new NestedInnerSecondLevel();//second level
        //new PublicInner().NestedInnerSecondLevel();//doesn't work access to the 2 level requires to instantiate the enclosing class first

        new KeepExtending(); //customized second level

        new KeepExtending(). new ExtendingFurther();



    }
    /*class KeepExtending extends PublicInner{ //this inner class extends the inner class that was inherited from the OuterMost class
    //class KeepExtending extends OuterMost.PublicInner{ //OK
        KeepExtending(){
            System.out.println("Extend the inner class as an inherited member");
        }
    }*/

    class KeepExtending extends OuterMost.PublicInner{ //this inner class extends the inner class that was inherited from the OuterMost class
        KeepExtending(){
            System.out.println("Extend the inner class as an inherited member");
        }
        class ExtendingFurther extends OuterMost.PublicInner.NestedInnerSecondLevel {
            ExtendingFurther(){
                System.out.println("Extending a deeper level of an inherited member");
            }
        }
    }
}
