/**
 *Section 1 : Java Fundamentals
 * Topic : Enum Type
 */

enum WeekDays{
    //the values in (...) are the values used in constructors
    SUNDAY("Sun", "Wonderful Weekend"),
    MONDAY("Mon","Long road ahead"),
    TUESDAY("Tues", "Long road ahead"),
    WEDNESDAY("Wed","Hump day"),
    THURSDAY("Thurs", "TGIG - 1"),
    FRIDAY("Fri"), //all constants need to execute same constructor
    SATURDAY("Sat", "Wonderful weekend"); //; required if enum consists of additional code or members

    //additional fields
    String abbreviation;
    String description = "TGIF";
    //can define 0 - many constructors on an enum
    WeekDays(String abbreviation){
        this.abbreviation = abbreviation;
    }
    WeekDays(String abbreviation, String description){
        this.abbreviation = abbreviation;
        this.description = description;
    }
    //method should be after constructor
    public String printType(){
        if(this == SATURDAY || this == SUNDAY){
            return "Weekend";
        }
        return "Workday";
    }
}
public class ComplexEnumExample { //each enum instance can be refereed as this
    public static void main(String[] args) {
        /*for (WeekDays day : WeekDays.values()){
            System.out.println(day.ordinal() + " is "
                    + day.abbreviation + " : "
                    + day.description);
        }*/
        for (WeekDays day : WeekDays.values()){ // can access enum attributes from enum value
            System.out.println(day.ordinal() + " is "
                    + day.abbreviation + " (" + day.printType() + "): "
                    + day.description);
        }
        //execute a method through reference to one of the constants
        System.out.println(WeekDays.SATURDAY + " is a " + WeekDays.SATURDAY.printType());
    }
}
