package _01_algorithms._2_fibonacci;

public class fibonaci {
	public static void main (String[]args) {
		int sum = 0;
		int number1= 0;
		int number2= 1;
		for(int bob = 0; bob<10; bob++) {
			sum=number1+number2;
			System.out.println(sum);
			if(bob%2==1) {
				number1=sum;
			}else {
				number2=sum;
			}
		}
		
	}
}
