package EighthLecture;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        CustomRunnableObject firstObject=new CustomRunnableObject("FIRST",0);
        CustomRunnableObject secondObject=new CustomRunnableObject("SECOND",0);
        CustomRunnableObject thirdObject=new CustomRunnableObject("THIRD",0);
        CustomRunnableObject fourthObject=new CustomRunnableObject("FOURTH",0);

        Thread firstThread=new Thread(firstObject);
        Thread secondThread=new Thread(firstObject);
        Thread thirdThread=new Thread(firstObject);
        Thread fourthThread=new Thread(firstObject);


        System.out.println(firstThread);
        System.out.println(secondThread);
        System.out.println(thirdThread);
        System.out.println(fourthThread);


    }
}
