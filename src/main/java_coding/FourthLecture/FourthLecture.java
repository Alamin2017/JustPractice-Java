package FourthLecture;

import java.util.Scanner;

public class FourthLecture {

    public static void main(String[] args) {

        Scanner myScanner=new Scanner(System.in);

        int a,b;
        a=10;
        b=20;
//        b=calculateNumber(a,b);
//        prln(calculateNumber(a,b));
//        prln(a);
//        prln(a<b?a:b);
//        prln(compare(a,b));


//        int[] numberArray=new int[100];
//        int i=100;
//        while (i>0)
//        {
//            numberArray[i-1]=i-1;
//            i--;
//        }
//        while (i<100)
//        {
//            prln("Array["+i+"]:"+numberArray[i]);
//            i++;
//        }


//        for(int j=2;j<100;j*=2)
//        {
//            prln(j);
//        }

        try
        {
            pr("Please give a number:");
            int userInput=myScanner.nextInt();
            prln(100/userInput);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            prln("came out of try-catch block");
        }
    }
    static String compare(int a,int b)
    {
        if(a<b)
        {
            return "A is less than B";
        }
        else
        {
            return "B is less than A";
        }
    }

    static int calculateNumber(int number1,int number2)
    {
        number1+=number2;
        return number1;
    }

    static void prln(Object anyObject)
    {
        System.out.println(anyObject);
    }
    static void pr(Object anyObject)
    {
        System.out.println(anyObject);
    }
}
