import java.util.*;

class Node {
    int a;
    Node b,c;

    Node(int a){
        this.a=a;
    }
}

public class Main {

    static boolean check(Node a,long b,long c){

        if(a==null)
            return true;

        if(a.a<=b || a.a>=c)
            return false;

        return check(a.b,b,a.a) &&
               check(a.c,a.a,c);
    }

    public static void main(String[] args){

        Node a=new Node(2);
        a.b=new Node(1);
        a.c=new Node(3);

        if(check(a,Long.MIN_VALUE,
                Long.MAX_VALUE))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
