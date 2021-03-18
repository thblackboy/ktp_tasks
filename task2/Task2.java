import java.util.Arrays;
public class Task2 {
	public static void differenceMaxMin(int... nums){
		Arrays.sort(nums);
		System.out.println(nums[nums.length-1]-nums[0]);
	}
	public static void main(String[] args){
		differenceMaxMin(10, 4, 1, 4, -10, -50, 32, 21);
		differenceMaxMin(44, 32, 86, 19);		
	}
}