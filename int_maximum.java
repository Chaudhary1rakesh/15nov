package first_java_programe;
import java.util.Scanner;


public class int_maximum {
	public static void print_greater(int a, int b,int c) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three numbers:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
//		String result=(a>b&&a>c)?"a is greater":"c is greater";
//		System.out.println(result);
		if(a>b&&a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
	public static void main(String[] args) {
//		System.out.println("Greatest among Them-->:");
		print_greater(12,10,7);
		
	
	}

}
