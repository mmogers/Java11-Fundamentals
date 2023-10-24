/**
 * Section : 1
 * Topic: Enum implementing interface
 */

interface DoItInterface{
    public void doIt();
}

enum SecondaryColors implements DoItInterface{
    ORANGE,
    PURPLE{
        @Override
        public void doIt() { // can implement interface in enum constant body
            System.out.println(this + " wants to be different");
        }
    },
    GREEN;

    @Override
    public void doIt() { //can implement interface in enum body
        System.out.println(this + " is implementing an interface's method");
    }
}
public class TestEnumInterface {
    public void printData(DoItInterface o){ //method accepts an interface typed parameter and executes doIt method
        o.doIt();
    }

    public static void main(String[] args) { //we can pass enum constants to a method that takes the interface typed param
        TestEnumInterface e = new TestEnumInterface();
        e.printData(SecondaryColors.ORANGE);
        e.printData(SecondaryColors.PURPLE);

    }
}
