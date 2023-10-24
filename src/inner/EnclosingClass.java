package inner;

public class EnclosingClass {

    EnclosingClass(String name){ //constructor
        this.outerName = name;
    }
    public String outerName = "outer"; //instance field

    public InnerMemberClass innerMemberClass = new InnerMemberClass(); //instance field of the type InnerMemberClass
    public void doSomethingOnInstance(){
        System.out.println("doSomethingOnInstance() invoked: "); //instance method on enclosing class
        System.out.println(new InnerMemberClass().getInstanceName()); // invoke nested class's methods via class reference

    }

    public class InnerMemberClass{
        public String instanceName = "InnerMemberClass.instanceName"; //instance field
        public String getInstanceName(){ //instance method
            return "getInstanceName() = " + this.instanceName;
        }
        /*public String getOuterName(){
            return  "InnerMemberClass.getOuterName() = " + outerName;
        }*/
        /*public String getOuterName() {
            return "InnerMemberClass.getOuterName() = " + EnclosingClass.this.outerName; //eliminates the shadowing
        }*/

        public String getOuterName() {
            String outerName = "local_outerName";

            return outerName + " : " + this.outerName + " : " + EnclosingClass.this.outerName;
        }

        //public static String staticName = "staticName"; //static field
        public static final String staticName = "staticName";

        /*public static String getStaticName(){ //static method
            return "getStaticName() = " + staticName;
        }*/
        /*public enum Colors{ //implicitly static, cannot be declared on a inner class
            RED, BLUE, YELLOW
        }*/
        /*public interface NestedInterface{//implicitly static, cannot be declared on a inner class

        }*/
        //variable shadowing
        public String outerName = "outer"; //also defined in enclosing class


    } //---- end of Inner class



}
class TestEnclosingClass {
    public static void main(String[] args) {
        EnclosingClass e = new EnclosingClass("e's instance");
        e.doSomethingOnInstance();

        EnclosingClass.InnerMemberClass i ; //declare a local variable of inner class
        //i = new EnclosingClass.InnerMemberClass(); //instantiating is not working like that
        //i = new e.InnerMemberClass();
        i = e.new InnerMemberClass(); // must use instance new operator like a method ??????

        System.out.println("Invoking i.getOuterName: " + i.getOuterName()); //use local var referencing the inner class to access method on the inner class

        EnclosingClass f = new EnclosingClass("f's instance"); //instance of enclosing class
        EnclosingClass.InnerMemberClass j = f.new InnerMemberClass(); //declare and assign a var to the inner member class of new instance in a single statement
        System.out.println("Invoking j.getOuterName: " + j.getOuterName());

        //e.InnerMemberClass.instanceName = "Testing"; //inner member class is a member of the enclosing class however we cannot refer to it like to the field of that class
                                                       //instead we must access in instance of it in a reference (EnclosingClass.InnerMemberClass j = f.new InnerMemberClass();) or from enclosing class itself.
        //System.out.println(e.InnerMemberClass.getInstanceName());

        e.innerMemberClass.instanceName = "Testing"; //using the instance field and not the InnerClass directly
        System.out.println(e.innerMemberClass.getInstanceName());

    }
}
