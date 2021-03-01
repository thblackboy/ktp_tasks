public class Task7 {
	public static void addUpTo(int a){
		int i=1;
		int sum=0;
		while(i<a){
			sum+=i+a;
			i++;
			a--;
		}
		if(a==i)
			sum+=a;
		System.out.println(sum);
	}
	public static void main(String[] args){
		addUpTo(3);
		addUpTo(10);
		addUpTo(7);
		addUpTo(100000);
	}
}