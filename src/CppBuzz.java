public class CppBuzz {
    public static void main(String[] args){
        int x = 5; int y = 7;
        int z = x++ ; //5 x= 6
        System.out.println(z);
        z = z + ++y ; //13 5 + 8 //y = 8
        System.out.println(z);
        z = z - --x ; //13 - 5 //x= 5
        System.out.println(z);
        z= z + y--; //8+8 //y = 7
        System.out.println(z);
        System.out.println(x +" "+ y + " "+ z);
    }
}
