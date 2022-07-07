import java.util.*;
public class assignment2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ente num1");
		double a=sc.nextDouble();
		System.out.println("ente num2");
		double b=sc.nextDouble();
		
		if(a>0 && a<1 && b>0 && b<1){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
	}
}