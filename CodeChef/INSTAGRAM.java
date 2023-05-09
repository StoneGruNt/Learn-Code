import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		
		int T =scan.nextInt();
		while(T!=0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    method(x,y);
		T--;
		}
    }
    
    public static void  method(int x,int y){
        if(x>(10*y))System.out.println("YES");
        else System.out.println("NO");
        
    }
}
