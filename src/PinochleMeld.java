/**
 * Section 1 : Java Fundamentals
 * Topic : Enum Type
 */
public enum PinochleMeld {
    //----begin the enum constant list
    PINOCHLE(4) {
        @Override
        public void describe() { //overrides abstract methos describe()
            System.out.println(this + ": Jack of Diamonds, Queen of Spades");
        }
    },
    /*PINOCHLE(4) { //method should be created in enum body
        @Override
        public void describe() { //overrides abstract methos describe()
            System.out.println(this + ": Jack of Diamonds, Queen of Spades");
        }
        public void printSomeAdditionalInfo(){ //declaring a public method doesn't mean it will be accessible from the outside
            System.out.println("Two pinocles is rare and is 30 points");
        }
    },*/
    MARRIAGE(2){
        //this method declared in enum constant body block
        int adjustScore(){
            return 2;
        }

        @Override
        public void describe() {
            System.out.println(this + " King and Queen of single suit");
        }
    },
    NINE_OF_TRUMP(1) {
        @Override
        public void describe() {
            System.out.println(this + ": Nine of suit");
        }
    }; //; - end of constants

    //------------begin of enum body declaration
    protected int score;
    PinochleMeld(int score){ //enum constructor
        this.score = score;
    }
    int adjustScore(){ //an enum body can have concrete method which enum constant bodies can override
        return 0;
    }
    abstract public void describe(); // each constant would need to override this method
}
class PinochleGame{
    public static void main(String[] args) {
        int count = 0;

        PinochleMeld[] hand = { //declare an array of enum type
                PinochleMeld.PINOCHLE,
                PinochleMeld.MARRIAGE,
                PinochleMeld.NINE_OF_TRUMP};
        for (PinochleMeld points : hand){ //loop through player's hand , represented by array hand
            //System.out.println(points);
            points.describe();//call method on enum constants
            count += (points.score + points.adjustScore());
            //points.printSomeAdditionalInfo(); //method not created in enum body
        }
        System.out.println("Example meld score = " + count);
    }
}
