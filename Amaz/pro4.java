import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner a=new Scanner(System.in);

        String b=a.nextLine();

        int c[]=new int[256];

        Arrays.fill(c,-1);

        int d=0;
        int e=0;

        for(int f=0;f<b.length();f++){

            if(c[b.charAt(f)]>=d)
                d=c[b.charAt(f)]+1;

            c[b.charAt(f)]=f;

            e=Math.max(e,f-d+1);
        }

        System.out.println(e);
    }
}
