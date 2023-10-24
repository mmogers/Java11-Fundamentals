/**
 * Section: 1 Java Fundamentals
 * Topic: Nested class, local class, effectively final review
 * var accessed from within inner class should be final or effectively finlal
 */
public class EffectivelyFinal { //class demonstrating a local class in a method
    public static void main(String[] args) {
        int efinal = 1; //local var and assign a value to it
        //final int efinal = 1; //runs
        //efinal ++; //changes , effectively final will not change , shouldn't change in the enclosing code

        class LocalClass{ //local class with a method that uses efinal local var just created
            public void printValue(){
                System.out.println("efinal = " + efinal);
                //System.out.println("efinal = " + efinal++); // not here as well
            }
        }

        new LocalClass().printValue(); //execute method on local class
    }
}
