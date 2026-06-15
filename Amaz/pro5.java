import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner a=new Scanner(System.in);

        int b=a.nextInt();

        int c[]=new int[b];

        for(int d=0;d<b;d++)
            c[d]=a.nextInt();

        int e=a.nextInt();

        int f=0;
        int g=b-1;

        while(f<=g){

            int h=(f+g)/2;

            if(c[h]==e){
                System.out.println(h);
                return;
            }

            if(c[f]<=c[h]){

                if(e>=c[f] && e<c[h])
                    g=h-1;
                else
                    f=h+1;
            }
            else{

                if(e>c[h] && e<=c[g])
                    f=h+1;
                else
                    g=h-1;
            }
        }

        System.out.println(-1);
    }
}
