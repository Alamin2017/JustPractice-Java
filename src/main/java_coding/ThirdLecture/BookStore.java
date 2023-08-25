package ThirdLecture;

import java.util.Scanner;

public class BookStore {

    static Scanner myScanner=new Scanner(System.in);
    static String[] books={"Java","C","Python"};
    final double studentDiscount=0.3;
    final double teacherDiscount=04;
    final double alienDiscount=0.0;
    public static void main(String[] args) {
        prln("------WELCOME TO OUR BOOKSTORE------");
        pr("Which book do you want:");
        String userChoice=myScanner.nextLine();
        if(books[0].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("You Opted for "+books[0]);
        }
        else if(books[1].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("You Opted for "+books[1]);
        }
        else if(books[2].toLowerCase().equals(userChoice.toLowerCase()))
        {
            prln("You Opted for "+books[2]);
        }
        else {
            prln("Sorry Book not available for alien");
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
