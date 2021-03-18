import java.util.Arrays;
public class Task4 {
	public static void cumulativeSum(int... nums){
		int sum=0;
		int[] arr=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			arr[i]+=sum;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args){
		cumulativeSum(1,2,3);
		cumulativeSum(1,2,3,4);
		cumulativeSum(1,5,6);
		cumulativeSum(1,1,1);
		cumulativeSum(9,2,2,5);
		
	}
}