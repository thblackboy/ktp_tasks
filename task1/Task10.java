public class Task10 {
	public static void abcmath(int a, int b, int c){
		for(int i=0;i<b;i++)
			a*=2;
		System.out.println(a%c==0);
	}
	public static void main(String[] args){
		abcmath(42,5,10);
		abcmath(5,2,1);
		abcmath(1,2,3);
	}
}