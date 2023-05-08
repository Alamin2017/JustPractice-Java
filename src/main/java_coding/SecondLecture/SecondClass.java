package SecondLecture;

public class SecondClass {

    public static void main(String[] args) {
        int firstShortNumber;
        int secondIntNumber;
        char[] cards={'4','2','3','7','B','K'};
        firstShortNumber=11;
        secondIntNumber=2;
        float myFloatNumber=10;
        secondIntNumber/=2;
        secondIntNumber++;
        int result=firstShortNumber%secondIntNumber;
        char myCharacter='A';
        boolean statement=prokriya(firstShortNumber,secondIntNumber);
        System.out.println(firstShortNumber);
        System.out.println(secondIntNumber);
        System.out.println(cards[4]);
        System.out.println(statement);
        System.out.println(result);
        System.out.println(myCharacter);
    }
    public static boolean prokriya(int firstValue, int secondValue)
    {
        boolean answer=firstValue>secondValue;
        return answer;
    }
}
