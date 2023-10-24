/**
 * Section 1: Java Fundamentals
 * Topic: Inner classes, Extras
 */
public class OuterMost {
    private String OuterString = "Attribute of OuterMost class";
    public class PublicInner{ //public inner class member
        private String InnerString = "Attribute of PublicInner class";
        public PublicInner(){ //constructor
            System.out.println("PublicInner instantiayed , OuterString = " + OuterString);//references enclosing class field with simple name
            System.out.println("PublicInner instantiayed , OuterString = " + OuterMost.this.OuterString);//references enclosing class with class name and this
        }

        public class NestedInnerSecondLevel{ //inner class now is 2 levels deep
            public NestedInnerSecondLevel(){ //constructor
                System.out.println("NestedInnerSecondLevel instantiated, " + "OuterString = " + OuterString); //reference enclosing objects field with simple name
                System.out.println("NestedInnerSecondLevel instantiated, " + "OuterString = " + OuterMost.this.OuterString); //references enclosing class with class name and this
                System.out.println("NestedInnerSecondLevel instantiated, " + "innerString = " + InnerString);//reference enclosing objects field with simple name
                System.out.println("NestedInnerSecondLevel instantiated, " + "innerString = " + PublicInner.this.InnerString);//references enclosing class with class name and this
            }
        }
    }

    class PackageInner{ //package/private inner class member
        public PackageInner(){ //constructor
            System.out.println("PackageInner instantiated");
        }
    }

    protected class ProtectedInner{ //protected inner class member
        public ProtectedInner(){
            System.out.println("ProtectedInner instantiated");
        }
    }

    private class PrivateInner{ //private inner class member
        public PrivateInner(){ //constructor
            System.out.println("PrivateInner instantiated");
        }
    }
}

class InnerClassExtras{
    public static void main(String[] args) {
        //to access inner classes, an object reference from the enclosing class is required, using .new construct
        OuterMost outer = new OuterMost();
        OuterMost.PublicInner publicInner = outer.new PublicInner(); //create a local var using a public inner class
        OuterMost.PackageInner packageInner = outer.new PackageInner(); //create a local var using package inner class
        OuterMost.ProtectedInner protectedInner = outer.new ProtectedInner();//create a local var using protected inner class

        System.out.println("\n----Accessing a class 2 levels deep");
        OuterMost.PublicInner.NestedInnerSecondLevel nested = publicInner.new NestedInnerSecondLevel(); //creating a local var for the more nested inner class using previously created var publicInner

        OuterMost.PublicInner.NestedInnerSecondLevel alternate = //chain instantiations of outer to inner...
                new OuterMost()
                    .new PublicInner()
                    .new NestedInnerSecondLevel();
    }
}
