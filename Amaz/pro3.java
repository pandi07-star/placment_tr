import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner a=new Scanner(System.in);

        int b=a.nextInt();
        int c=a.nextInt();

        int d[][]=new int[b][c];

        for(int e=0;e<b;e++)
            for(int f=0;f<c;f++)
                d[e][f]=a.nextInt();

        int g=a.nextInt();

        int h=0;
        int i=c-1;

        boolean j=false;

        while(h<b && i>=0){

            if(d[h][i]==g){
                j=true;
                break;
            }

            else if(d[h][i]>g)
                i--;

            else
                h++;
        }

        System.out.println(j?1:0);
    }
}
