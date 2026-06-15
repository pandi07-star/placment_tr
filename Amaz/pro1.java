import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter string:");
        String b = a.nextLine();

        String c = "";

        for(int d=0; d<b.length(); d++) {
            int e = 1;

            while(d < b.length()-1 &&
                  b.charAt(d)==b.charAt(d+1)) {
                e++;
                d++;
            }

            c += b.charAt(d);

            if(e > 1)
                c += e;
        }

        System.out.println("Compressed: " + c);

        String f = "";

        for(int d=0; d<c.length(); d++) {
            char g = c.charAt(d);

            if(d+1 < c.length() &&
               Character.isDigit(c.charAt(d+1))) {

                int h = c.charAt(d+1)-'0';

                for(int i=0;i<h;i++)
                    f += g;

                d++;
            }
            else {
                f += g;
            }
        }

        System.out.println("Decompressed: " + f);
    }
}
