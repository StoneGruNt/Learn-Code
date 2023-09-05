import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List1{
    public static void main(String[]args){
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(5);
        System.out.println("ArrayList A is: "+A.toString());

        List <Integer> B = new LinkedList<Integer>();
        System.out.println("LinkedList size is "+B.size());
        B.add(1);
        System.out.println("LinkedList B is: "+B.toString());

        List<Integer> C = new Stack<Integer>(){{
             add(5);
             add(10);
        }};
        System.out.println("Stack size is "+C.size());
        C.add(1);
        C.add(4);
        System.out.println("Stack c :"+C.toString());

        List<Integer> D = new Vector<Integer>();
         System.out.println("Vector size is "+D.size());
        D.add(8);
        D.add(7);
        System.out.println("Vector D :"+D.toString());

    }
}