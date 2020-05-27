//Program to perform Binary Addition Of String and Print it.
import java.util.*;
public class AddTwoBinaryNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			long n1=decToBin(num1);
			long n2=decToBin(num2);
			long sum=0;
			int carry=0;
			long i=1;
			//until the n1 and n2 both become null
			while (n1!=0 || n2!=0){
				sum+=i*((n1%10+n2%10+carry)%2);
				//it gives us carry
				carry=(int)(n1%10+n2%10+carry)/2;
				n1/=10;
				n2/=10;
				i*=10;
			}
			//if at end carry is not 0
			if (carry!=0)
				sum+=i*carry;
			System.out.println(sum);
		}
	}
	//convert decimal to Binary
	static long decToBin(int n){
		long res=0;
		long i=1;
		while (n>0){
			long rem=n%2;
			res+=i*rem;
			n/=2;
			i*=10;
		}
		return res;
	}
}