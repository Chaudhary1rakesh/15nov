
	package first_java_programe;
	import java.util.Scanner;


	public class int_maximum1 {
		public static void print_greater(int a, float b,long c) {
				Scanner sc=new Scanner(System.in);
			System.out.println("Enter Three numbers:");
			 a=sc.nextInt();
			 b=sc.nextFloat();
			 c=sc.nextLong();
//			String result=(a>b&&a>c)?"a is greater":"c is greater";
//			System.out.println(result);
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
//			System.out.println("Greatest among Them-->:");
			print_greater( 12, 10.05f, 7);
			
		
		}

	}



