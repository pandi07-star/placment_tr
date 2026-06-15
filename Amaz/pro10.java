import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);

        String b=a.nextLine();
        String c=a.nextLine();

        int d=b.length();
        int e=c.length();

        int f[][]=new int[d+1][e+1];

        for(int g=0;g<=d;g++)
            f[g][0]=g;

        for(int g=0;g<=e;g++)
            f[0][g]=g;

        for(int g=1;g<=d;g++) {

            for(int h=1;h<=e;h++) {

                if(b.charAt(g-1)==c.charAt(h-1))
                    f[g][h]=f[g-1][h-1];

                else {

                    f[g][h]=1+
                    Math.min(
                    f[g-1][h-1],
                    Math.min(
                    f[g-1][h],
                    f[g][h-1]
                    ));
                }
            }
        }

        System.out.println(f[d][e]);
    }
}
