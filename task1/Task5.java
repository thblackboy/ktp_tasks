public class Task5 {
	public static void operation(int n, int a, int b){
		if(a+b==n)
			System.out.println(a+","+b+" added");
		else if(a-b==n || b-a==n)
			System.out.println(a+","+b+" substracted");
		else if(a/b==n || b/a==n)
			System.out.println(a+","+b+" divide");
		else if(a*b==n || b*a==n)
			System.out.println(a+","+b+" multiply");
		else
			System.out.println(a+","+b+" none");
	}
	public static void main(String[] args){
		operation(24,15,9);
		operation(24,26,2);
		operation(15,11,11);
	}
}