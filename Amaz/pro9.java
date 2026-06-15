import java.util.*;

class Node{

    int a;
    Node b,c;

    Node(int a){
        this.a=a;
    }
}

public class Main {

    static int a=-1;

    static boolean b(Node c,int d){

        if(c==null)
            return true;

        if(c.b==null && c.c==null){

            if(a==-1){
                a=d;
                return true;
            }

            return a==d;
        }

        return b(c.b,d+1) &&
               b(c.c,d+1);
    }

    public static void main(String[] args){

        Node c=new Node(1);
        c.b=new Node(2);
        c.c=new Node(3);

        if(b(c,0))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
