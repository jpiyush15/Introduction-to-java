import java.io.PrintStream;
import java.util.Scanner;
public class lecture2simpleinterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str);

        //Input from the user

          int p = s.nextInt();
          int r = s.nextInt();
          int t = s.nextInt();
          int Si= (p*r*t)/100;
          System.out.println(Si);

        // giving input

//        int p = 1000;
//        int r = 20;
//        int t = 5;
//        int Si= (p*r*t)/100;
//        System.out.println(Si);
    }
}
