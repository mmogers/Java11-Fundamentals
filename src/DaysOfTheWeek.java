import org.w3c.dom.ls.LSOutput;

/**
 * Section 1 : Java Fundamentals
 * Topic: Enum Type
 */
public enum DaysOfTheWeek { //enum with 7 constants
    sunday, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY //can be not uppercase
}

class TestDaysOfTheWeek{ //package private class
    public static void main(String[] args) {
        /*for (DaysOfTheWeek day : DaysOfTheWeek.values()) { //retrieve the list of enum constants from DaysOfTheWeek.values() static method
            System.out.println(day.ordinal() + " is " + day);
        }*/

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) { //retrieve the list of enum constants from DaysOfTheWeek.values() static method
            System.out.println(day.ordinal() + " is " + day);
            switch (day){
                case MONDAY:
                case TUESDAY:
                    System.out.println("Long road ahead!");
                    break;
                case WEDNESDAY:
                    System.out.println("Hump day!");
                    break;
                case THURSDAY:
                    System.out.println("TGIF - 1");
                    break;
                case FRIDAY:
                    System.out.println("TGIF");
                    break;
                case SATURDAY:
                case sunday:
                    System.out.println("Wonderful weekend");


            }

        }
        System.out.println(DaysOfTheWeek.valueOf("WEDNESDAY")); //example of using valueOf() static method

    }
}
