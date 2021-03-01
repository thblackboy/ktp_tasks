public class Task3 {
	public static void animals(int chickens, int cows, int pigs){
		System.out.println(chickens*2+cows*4+pigs*4);
	}
	public static void main(String[] args){
		animals(2,3,5);
		animals(1,2,3);
		animals(5,2,8);
	}
}