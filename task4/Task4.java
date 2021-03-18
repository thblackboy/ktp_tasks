import java.util.Arrays;

public class Task4{
    public static void main(String[] args) {
        //
        System.out.println("Task1");
        sevenBoom(1, 2, 3, 4, 5, 6, 7);
        sevenBoom(8, 6, 33, 100);
        sevenBoom(2, 55, 60, 97, 86);
        //
        System.out.println("Task2");
        cons(5, 1, 4, 3, 2);
        cons(5, 1, 4, 3, 2, 8);
        cons(5, 6, 7, 8, 9, 9);
        //
        System.out.println("Task3");
        unmix("123456");
        unmix("hTsii  s aimex dpus rtni.g");
        unmix("badce");
        //
        System.out.println("Task4");
        noYelling("What went wrong???????");
        noYelling("Oh my goodness!!!");
        noYelling("I just!!! can!!! not!!! believe!!! it!!!");
        //
        System.out.println("Task5");
        xPronounce("Inside the box was a xylophone");
        xPronounce("The x ray is excellent");
        xPronounce("OMG x box unboxing video x D");
        //
        System.out.println("Task6");
        arrdist(9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5);
        //
        System.out.println("Task7");
        obrcode(832);
        obrcode(51);
        obrcode(7977);
        obrcode(1);
        obrcode(665);
        obrcode(149);

        //
        System.out.println("Task8");
        commonLastVowel("Hello World!");
        commonLastVowel("Watch the characters dance!");
        commonLastVowel("OOI UUI EEI AAI");
        //
        System.out.println("Task9");
        memeSum(26, 39);
        memeSum(122, 81);
        memeSum(1222, 30277);
        //
        System.out.println("Task10");
        unrepeated("teshahset");
        unrepeated("hello");
        unrepeated("aaaaa");
        unrepeated("WWE!!!");
        unrepeated("call 911");
        //

    }

    public static void sevenBoom(int...a){
        boolean check=false;
        String chk;
        for(int i:a){
            chk=Integer.toString(i);
            if(chk.contains("7")){
                check=true;
                break;
            }
        }
        if(check)
        System.out.println("BOOM");
        else
        System.out.println("there is no 7 in the array");
    }

    public static void cons(int...a){
        Arrays.sort(a);
        boolean res=true;
        for(int i=1;i<a.length;i++){
            if(a[i]-a[i-1]!=1){
                res=false;
                break;
            }
        }
        System.out.println(res);
    }

    public static void unmix(String str){
        char[] arr=str.toCharArray();
        char tmp;
        for(int i=0;i<arr.length-1;i+=2){
            tmp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }
        System.out.println(arr);
    }

    public static void noYelling(String str){
        char[] arr=str.toCharArray();
        int i=arr.length-1;
        char a=arr[i];
        if(a=='!' || a=='?'){

            while (str.charAt(i)==a && i!=0){
                arr[i]='\u0000';
                i--;
            }
            arr[i+2]=a;
        }
        System.out.println(arr);
    }

    public static void xPronounce(String str){
        String res="";
        char[] arr =str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if (arr[i]=='x'){
                if(arr[i-1]==' ' && arr[i+1]==' ')
                res+="ecks";
                else if (arr[i-1]==' ')
                res+="z";
                else
                res+="cks";

            }
            else 
            res+=arr[i];
            
        }
        System.out.println(res);

    }

    public static void arrdist(int...a){
        Arrays.sort(a);
        int max=0;
        for(int i=0;i<a.length-1;i++)
        if(a[i+1]-a[i]>max)
        max=a[i+1]-a[i];
        System.out.println(max);

    }

    public static void obrcode(int n){
        char[] num=Integer.toString(n).toCharArray();
        String res ="";
        Arrays.sort(num);
        for(char i:num)
        res+=i;;
        System.out.println(n-Integer.parseInt(res));
    }

    public static void commonLastVowel(String str){
        String glas="eyuioa";
        str=str.toLowerCase();
        str=str.replace('.', ' ');
        str=str.replace(',', ' ');
        str=str.replace('!', ' ');
        str=str.replace('?', ' ');
        str=str.replaceAll("  ", " ");
        String [] words = str.split(" ");
        int [] arr = new int [6];
        int k,kmax=0,max=0;
        for(String w:words){
            k=glas.indexOf(w.charAt(w.length()-1));
            if(k!=-1){
                arr[k]+=1;
                if (arr[k]>max){
                    max=arr[k];
                    kmax=k;
                }
                    
            }
        }
        if(max!=0)
        System.out.println(glas.charAt(kmax));
    }

    public static void memeSum(int a , int b){
        int c;
        String str="";
        while(a!=0 || b!=0){
            c=a%10 + b%10;
            str=c+str;
            a/=10;
            b/=10;
        }
        System.out.println(str);
    }

    public static void unrepeated(String str){
        String chars="";
        char a;
        for(int i=0;i<str.length();i++){
            a=str.charAt(i);
            if(a==' '|| chars.indexOf(a)==-1){
                chars+=a;
            }
        }
        System.out.println(chars);
    }

    
}