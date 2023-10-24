/**
 * Section : 1
 * Topic : Enum Extras
 */

enum PrimaryColor{
    RED(1){
        {
            System.out.println(this + " initialized");
        }
    },
    BLUE(2){
        {
            System.out.println(this + " initialized");
        }
    },
    YELLOW(3){
        {
            System.out.println(this + " initialized");
        }
    };
    int rating = 0;
    static{
        System.out.println("Enum class Initialization "); //static initializer for the PrimaryColor class (enum)
    }
    {
        System.out.println("Enum body Initialization for " +  this); //initializer for all the anonymous class constants
    }

    PrimaryColor(int rating){
        System.out.println("Primary Color constructor for " + this);
        this.rating = rating;
    }

}
public class EnumExtras {
    public static void main(String[] args) {
        /*for (PrimaryColor color : PrimaryColor.values()){
            System.out.println(color);
        }*/
        //local class, constructor, const body, static, main
        System.out.println(PrimaryColor.RED);
        System.out.println(PrimaryColor.BLUE);
        System.out.println(PrimaryColor.YELLOW);
    }
}
