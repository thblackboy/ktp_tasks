public class Task8 {
	public static void isStrangePair(String a,String b){
		if(b.length()>0 && a.length()>0)
			System.out.println(a.charAt(0)==b.charAt(b.length()-1)&&b.charAt(0)==a.charAt(a.length()-1));
		else
			System.out.println(true);
	
	}
	public static void main(String[] args){
		isStrangePair("ratio", "orator");
		isStrangePair("sparkling", "groups");
		isStrangePair("bush", "hubris");
		isStrangePair("", "");
		
	}
}