public class Task10 {
	public static void boxSeq(int n){
		int res=0;
		for (int i=1;i<=n;i++)
			if(i%2==0)
				res--;
			else
				res+=3;
			
		System.out.println(res);
	
	}
	
	
	public static void main(String[] args){
		boxSeq(0);
		boxSeq(1);
		boxSeq(2);
		
		
	}
}