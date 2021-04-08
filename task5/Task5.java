import java.util.Arrays;
import java.util.Collections;

public class Task5{
    public static void main(String[] args) {
        System.out.println("Task1");
        sameLetterPattern("ABAB", "CDCD");
        sameLetterPattern("ABCBA", "BCDCB");
        sameLetterPattern("FFGG", "CDCD");
        sameLetterPattern("FFFF", "ABCD");
        //
        System.out.println("Task2");

        //
        System.out.println("Task3");
        digitsCount(4666);
        digitsCount(544);
        digitsCount(121317);
        digitsCount(0);
        digitsCount(12345);
        digitsCount(1289396387328L);
        //
        System.out.println("Task4");
        totalPoints(new String []{"cat", "create", "sat"}, "caster");
        totalPoints(new String []{"trance", "recant"}, "recant");
        totalPoints(new String []{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed");
        //
        System.out.println("Task5");
        longestRun(1, 2, 3, 5, 6, 7, 8, 9);
        longestRun(1, 2, 3, 10, 11, 15);
        longestRun(5, 4, 2, 1);
        longestRun(3, 5, 7, 10, 15);
        //                
        System.out.println("Task6");
        takeDownAverage("95%", "83%", "90%", "87%", "88%", "93%");
        takeDownAverage("10%");
        takeDownAverage("53%", "79%");
        //
        System.out.println("Task7");
        rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.");
        rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!");
        rearrange("is2 Thi1s T4est 3a");
        rearrange("4of Fo1r pe6ople g3ood th5e the2");
        rearrange(" ");
        //
        System.out.println("Task8");
        maxPossible(523, 76);
        maxPossible(9132, 5564);
        maxPossible(8732, 91255);
        //
        System.out.println("Task9");



    }

    public static void sameLetterPattern(String str1, String str2) {
        char [] arr1=str1.toCharArray(), arr2=str2.toCharArray();
        boolean check=true;
        for(int i=0;i<arr1.length;i++)
        if(arr1[i]-arr1[0]!=arr2[i]-arr2[0]){
            check=false;
            break;
        }
        System.out.println(check);
    }

    public static void digitsCount(long a) {
        int res=0;
        do{
            a/=10;
            res++;
        }while(a!=0);
        System.out.println(res);
    }

    public static void totalPoints(String[] arr, String word) {
        int res = 0;
        for(String str:arr){
            if(chk_words(str,word))
            if(str.length()==3)
            res+=1;
            else if(str.length()==4)
            res+=2;
            else if(str.length()==5)
            res+=3;
            else if(str.length()==6)
            res+=54;
        }
        System.out.println(res);
    }

    public static boolean chk_words(String a, String b){
        char[] a1 =a.toCharArray();
        char[] b1=b.toCharArray();
        boolean chk=true;
        for(char ch:a1){
            chk=false;
            for(int i=0;i<b1.length;i++){
                if(ch==b1[i]){
                    b1[i]=' ';
                    chk=true;
                    break;
                }
            }
        }
        return chk;
    }

    public static void longestRun(int...nums) {
        int res,max=0,j=0;
        for(int i=0;i<nums.length-1;i++){
            res=1;
            for(j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==res){
                    res++;
                }
                else
                break;
                
            }
            if(res>max)
            max=res;
            i=j-1;
        }
        System.out.println(max);
    }

    public static void takeDownAverage(String...notes) {
        int res=0;
        for(String str:notes){
            str=str.replace("%", "");
            res+=Integer.parseInt(str);
        }
        res=Math.round((res/notes.length) - (notes.length+1)*5);
        System.out.println(res+"%");
    }

    public static void rearrange(String str) {
        String[] words = str.split(" ");
        int[] nums=new int [words.length];
        for(int i =0;i<words.length;i++){
            int k=0;
            while(!Character.isDigit(words[i].charAt(k)))
            k++;
            nums[words[i].charAt(k)-'0'-1]=i;
            words[i]=words[i].replace(words[i].charAt(k), '\u0000');
        }
        String str2="";
        for(int i=0;i<nums.length;i++){
            str2+=words[nums[i]]+" ";
        }
        System.out.println(str2);        
    }

    public static void maxPossible(int a, int b) {
        char[] num1 = Integer.toString(a).toCharArray();
        char[] num2 = Integer.toString(b).toCharArray();
        boolean chk;
        Arrays.sort(num2);
        for(int i=num2.length-1;i>=0;i--){
            chk=false;
            for(int j=0;j<num1.length;j++)
            if(num2[i]>num1[j]){
                chk=true;
                num1[j]=num2[i];
                break;
            }
        }
        System.out.println(num1);        
    }


    
}