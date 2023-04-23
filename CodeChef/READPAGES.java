import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner(System.in);
		int T = scan.nextInt();
		String output="";
		for(int i=0;i<T;i++){
		    int N=scan.nextInt();
		    int X=scan.nextInt();
		    int Y=scan.nextInt();
		    if(i==T-1)output+=check(N,X,Y);
		    else output+=check(N,X,Y)+"\n";
		}
		System.out.println(output);
	}
	
	public static String check(int N,int X,int Y){
	    if(X*Y>=N) return "YES";
	    return "NO";
	}
}
