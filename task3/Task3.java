import java.util.Arrays;
import java.util.HashMap;

public class Task3{
    public static void main(String [] args){
        //
        System.out.println("Task1");
        HashMap<String,Integer> item1 = new HashMap<>();
        item1.put("Nice", 942208);
        item1.put("Abu Dhabi", 1482816);
        item1.put("Naples", 2186853);
        item1.put("Vatican City", 572);
        millionsRounding(item1);
        //
        System.out.println("Task2");
        otherSides(1);
        otherSides(12);
        otherSides(2);
        otherSides(3);
        //
        System.out.println("Task3");
        rps("rock", "paper");
        rps("paper", "rock");
        rps("paper", "scissors");
        rps("scissors", "scissors");
        rps("scissors", "paper");
        //
        System.out.println("Task4");
        warOfNumbers(2, 8, 7, 5);
        warOfNumbers(12, 90, 75);
        warOfNumbers(5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243);
        //
        System.out.println("Task5");
        reverseCase("Happy Birthday");
        reverseCase("MANY THANKS");
        reverseCase("sPoNtAnEoUs");
        //
        System.out.println("Task6");
        inatorInator("Shrink");
        inatorInator("Doom");
        inatorInator("EvilClone");
        //
        System.out.println("Task7");
        doesBrickFit(1, 1, 1, 1, 1);
        doesBrickFit(1, 2, 1, 1, 1);
        doesBrickFit(1, 2, 2, 1, 1);
        //
        System.out.println("Task8");
        totalDistance(70.0, 7.0, 0, false);
        totalDistance(36.1, 8.6, 3, true);
        totalDistance(55.5, 5.5, 5, false);
        //
        System.out.println("Task9");
        mean(1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3);
        mean(2, 3, 2, 3);
        mean(3, 3, 3, 3, 3);
        //
        System.out.println("Task10");
        parityAnalysis(243);
        parityAnalysis(12);
        parityAnalysis(3);
    }

    public static void millionsRounding(HashMap <String, Integer> towns){
        for (String key : towns.keySet()) {       
            towns.put(key,(int)Math.round((double)towns.get(key)/1000000)*1000000);
         }
         System.out.println(towns);
    }

    public static void otherSides(double a){
        double b=(a/Math.tan(Math.toRadians(30)));
        double c=2*a;
        System.out.printf("%.2f , %.2f \n",c,b);
    }

    public static void rps(String pl1, String pl2){
        if (pl1.equals(pl2))
        System.out.println("Ничья");
        else {
            if((pl1.equals("rock") && pl2.equals("scissors"))|| (pl1.equals("scissors")&& pl2.equals("paper"))||(pl1.equals("paper")&&pl2.equals("rock")))
            System.out.println("Player 1 WIN");
            else
            System.out.println("Player 2 WIN");
        }
    }

    public static void warOfNumbers(int... a){
        int res=0;
        for(int i:a)
        if(i%2==0)
        res+=i;
        else
        res-=i;
        System.out.println(Math.abs(res));
    }

    public static void reverseCase(String word){
        char[] carr= word.toCharArray();
        for(int i=0;i<carr.length;i++){
            if (Character.isUpperCase(carr[i]))
            carr[i]=Character.toLowerCase(carr[i]);
            else
            carr[i]=Character.toUpperCase(carr[i]);
        }
        System.out.println(carr);
    }

    public static void inatorInator(String word){
        String glas="eyuioa";
        int n=word.length();
        if (glas.indexOf(word.charAt(n-1))==-1)
        System.out.println(word+"inator "+ n+"000");
        else
        System.out.println(word+"-inator "+ n+"000");
    }

    public static void doesBrickFit(int a, int b, int c, int w,int h){
        int [] arr1={a,b,c};
        int [] arr2={w,h};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1[0]<=arr2[0]&&arr1[1]<=arr2[1]);
    }

    public static void totalDistance(double volume, double rashod, int pass, boolean cond){
        rashod+=pass*0.05*rashod;
        if(cond)
        volume-=volume*0.1;
        System.out.println(100*volume/rashod);
    }

    public static void mean(int...a){
        double sum=0;
        for(int i:a)
        sum+=i;
        System.out.println(sum/a.length);
    }

    public static void parityAnalysis(int n){
        String num =Integer.toString(n);
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum+=num.charAt(i)-'0';
        }
        System.out.println(sum%2==n%2);
    }

}