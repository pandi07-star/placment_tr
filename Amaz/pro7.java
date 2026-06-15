import java.util.*;

public class Main {

    static int k(int a[]) {

        int b=a[0];
        int c=a[0];

        for(int d=1;d<a.length;d++) {

            c=Math.max(a[d],c+a[d]);
            b=Math.max(b,c);
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);

        int b=a.nextInt();
        int c=a.nextInt();

        int d[][]=new int[b][c];

        for(int e=0;e<b;e++)
            for(int f=0;f<c;f++)
                d[e][f]=a.nextInt();

        int g=Integer.MIN_VALUE;

        for(int h=0;h<c;h++) {

            int i[]=new int[b];

            for(int j=h;j<c;j++) {

                for(int k=0;k<b;k++)
                    i[k]+=d[k][j];

                g=Math.max(g,k(i));
            }
        }

        System.out.println(g);
    }
}
