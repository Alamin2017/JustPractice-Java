package ThirdLecture;

import java.util.Scanner;

public class ThirdLecture {

    static Scanner myScanner=new Scanner(System.in);

    public static void main(String[] args) {
        String myName;
        prln("Please write your name:");
        myName = myScanner.nextLine();
        prln("This is our new method");
        prln(myName);
        prln("The number of characters in your name is:"+myName.length());
        int a=3;
        int b=9;
        a+=(b++);
        prln("A: "+ a +" B: "+b);

        int[][] twoDArray=new int[2][4];
        twoDArray[0][0]=1;
        twoDArray[0][1]=2;
        twoDArray[0][2]=4;
        twoDArray[0][3]=5;

        twoDArray[1][0]=2;
        twoDArray[1][1]=4;
        twoDArray[1][2]=5;
        twoDArray[1][3]=9;

        twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);

        prln("at 2dArray[1][2]: "+twoDArray[1][2]);

        if(myName.length()>15)
        {
            prln("Your name is long");
        }
        else if(myName.length()<3)
        {
            prln("Your name is short");
        }
        else
        {
            switch (myName.length())
            {
                case 7:
                    prln("Your name is ok.");
                    break;
                case 10:
                    prln("Your name is also ok.");
                    break;
                default:
                    break;
            }
        }
    }
    static void prln(Object anyObject)
    {
        System.out.println(anyObject);
    }
    static void pr(Object anyObject)
    {
        System.out.print(anyObject);
    }
}
