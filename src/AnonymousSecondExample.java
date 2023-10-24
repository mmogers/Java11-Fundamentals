/**
 * Section 1: Jva Fundamentals
 * Topic: Anonymous Calss
 */
public class AnonymousSecondExample {
    private interface Summable{ //defineprivate interface in our class
        double getTotal(float[] data);
    }

    public static void invokeSummable(Summable summable, float[] data){ //pass through method to invoke getTotal method on an object that implements Summable interface
        System.out.println("Total = " + String.format("%.2f", summable.getTotal(data)));
    }

    public static void main(String[] args) {
        invokeSummable( //passing anonymous class expression parameter to the invokeSummable method
                new Summable() { //begin of anonymous class expression
                    @Override
                    public double getTotal(float[] values) {//implements Summable getTotalmethod
                        double total = 0.0;
                        for(float value: values) total += value;
                        return total;
                    }//end of getTotal method
                } //end of anonymous class expression
                ,new float[]{12.4f, 13.4f, 5f, 12.0f, 11f, 7.5f}
        );//end of method invocation
    }
}
