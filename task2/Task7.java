public class Task7 {
	public static void isValid(String num){
		boolean res = true;
		if(num.length()==5){
			for(int i=0;i<5;i++)
				if(!(num.charAt(i)>='0' && num.charAt(i)<='9')){
					res=false;
					break;
				}
		}
		else
			res=false;
		System.out.println(res);
		
	}
	public static void main(String[] args){
		isValid("59001");
		isValid("400a7");
		isValid("113 32");
		isValid("19990");
		isValid("393939");
		
	}
}