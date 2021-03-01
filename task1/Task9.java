public class Task9 {
	public static void sumOfCubes(int... a){
		int sum=0;
		for (int i:a)
		sum+=Math.pow(i,3);
		System.out.println(sum);
	}
	public static void main(String[] args){
		int[] arr={5,9,99};
		sumOfCubes(8,10);
		sumOfCubes(5,7);
		sumOfCubes(arr);
	}
}