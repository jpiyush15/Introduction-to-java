import java.util.Scanner;
public class lecture2relational {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        boolean iseq = (i==j);
        System.out.println(iseq);
        boolean neq = (i!=j);
        boolean isgr = (i>j);
        boolean isgreq = (i>=j);
        boolean isless = (i<j);
        boolean  islesseq = (i<=j);
        System.out.println( neq);
        System.out.println(isgr);
        System.out.println(isgreq);
        System.out.println(isless);
        System.out.println(islesseq);



    }
}
