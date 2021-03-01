public class Task1 {
	public static void remainder(int a, int b){
		double c = a/b;
		if(c>0)
			c=Math.floor(c);
		else
			c=Math.ceil(c);
		System.out.println((int)(a-c*b));
	}
	public static void main(String[] args){
		remainder(1,3);
		remainder(3,4);
		remainder(-9,45);
		remainder(5,5);
	}
}