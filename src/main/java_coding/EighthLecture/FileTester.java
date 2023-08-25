package EighthLecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTester {

    public static void main(String[] args) {

        File inpFile=new File("C:\\Users\\hp\\IdeaProjects\\JustPractice\\src\\main\\java_coding\\EighthLecture\\test");

        try {
            Scanner scanner=new Scanner(inpFile);
            while (scanner.hasNext()){
                String tempString=scanner.nextLine();
                System.out.println(tempString+"\n");
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
