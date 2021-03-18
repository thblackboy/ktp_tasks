public class Task6 {
	public static void Fibonacci(int num){
		int c=0;
		if(num==0)
			System.out.println(0);
		else{
			int a=0, b = 1;
			for(int i=2;i<=num+1;i++){
				c=b+a;
				a=b;
				b=c;
			}
			System.out.println(b);
		}		
	}
	public static void main(String[] args){
		Fibonacci(3);
		Fibonacci(7);
		Fibonacci(12);
	}
}