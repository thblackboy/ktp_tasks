public class Task1 {
	public static void repeat(String word, int times){
		String result="";
		for(int i=0;i<word.length();i++)
			for(int j=0;j<times;j++)
				result+=word.charAt(i);
		System.out.println(result);
	}
	public static void main(String[] args){
		repeat("mice",5);
		repeat("hello",3);
		repeat("stop",1);
	}
}