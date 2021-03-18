public class Task9 {
	public static void isPrefix(String a,String b){
		String c = b.substring(0,b.length()-1);
		System.out.println(a.indexOf(c)==0);
	
	}
	
	public static void isSuffix(String a,String b){
		String c = b.substring(1);
		System.out.println(a.indexOf(c)==(a.length()-c.length()));
	
	}
	public static void main(String[] args){
		isPrefix("automation", "auto-");
		isSuffix("arachnophobia", "-phobia");
		isPrefix("retrospect", "sub-");
		isSuffix("vocation", "-logy");
		
	}
}