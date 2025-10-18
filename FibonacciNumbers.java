package preparation;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int N=10;
		int a=0;
		int b=1;
		int c=1;
		for(int i=0;i<=N;i++) {
			System.out.print(+ a + " ");
			a=b;
			b=c;
			c=a+b;
			
		}

	}

}
