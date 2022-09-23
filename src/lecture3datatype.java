
public class lecture3datatype {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println('a' + 3);
        int i = c + 10;
        System.out.println(i);
        i = c;
//		char abc = i;

        long l = i;
        //i = l;short memory can store in long memory but long one not store in short one

        double d = i;
        //i = d; same as above

        float f = 1.23f;
        //f = d; in this case float first store in temoprary memory i.e. double then copy to float (see copy)
        d = f;

        int j = 100;
    }
}
