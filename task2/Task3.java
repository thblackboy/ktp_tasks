public class Task3 {
	public static void isAvgWhole(int... nums){
		int sum=0;
		for(int i:nums)
			sum+=i;
		System.out.println(sum%nums.length==0);
	}
	public static void main(String[] args){
		isAvgWhole(1,2,3);
		isAvgWhole(1,2,3,4);
		isAvgWhole(1,5,6);
		isAvgWhole(1,1,1);
		isAvgWhole(9,2,2,5);
		
	}
}