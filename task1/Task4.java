public class Task4 {
	public static void profitableGamble(double prob, double prize, double pay){
		System.out.println(prob*prize>pay);
	}
	public static void main(String[] args){
		profitableGamble(0.2,50,9);
		profitableGamble(0.9,1,2);
	}
}