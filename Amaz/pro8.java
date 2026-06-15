import java.util.*;

class Node {

    int a;
    Node b,c;

    Node(int a){
        this.a=a;
    }
}

public class Main {

    static Node a=null;
    static Node b=null;

    static void c(Node d){

        if(d==null)
            return;

        c(d.b);

        if(a==null)
            a=d;

        else{
            b.c=d;
            d.b=b;
        }

        b=d;

        c(d.c);
    }

    static void d(Node a){

        while(a!=null){
            System.out.print(a.a+" ");
            a=a.c;
        }
    }

    public static void main(String[] args){

        Node e=new Node(1);
        e.b=new Node(3);
        e.c=new Node(2);

        c(e);

        d(a);
    }
}
