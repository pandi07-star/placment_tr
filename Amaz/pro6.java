import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int b = a.nextInt();

        int c[] = new int[b];
        int d[] = new int[b];

        for(int e=0;e<b;e++)
            c[e]=a.nextInt();

        for(int e=0;e<b;e++)
            d[e]=a.nextInt();

        int f=0;
        int g=0;
        int h=0;

        for(int e=0;e<b;e++) {

            int i=c[e]-d[e];

            f+=i;
            g+=i;

            if(g<0) {
                h=e+1;
                g=0;
            }
        }

        if(f>=0)
            System.out.println(h);
        else
            System.out.println(-1);
    }
}
