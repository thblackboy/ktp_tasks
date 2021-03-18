public class Task5 {
	public static void getDecimalPlaces(String num){
		int k=num.indexOf('.');
		if(k!=-1)
			System.out.println(num.length()-k-1);
		else
			System.out.println(0);
		
	}
	public static void main(String[] args){
		getDecimalPlaces("43.20");
		getDecimalPlaces("400");
		getDecimalPlaces("1.125");
		getDecimalPlaces("0");
		getDecimalPlaces("333");
		
	}
}