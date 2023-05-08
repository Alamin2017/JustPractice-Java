package Fifth_SixthLecture;

public class learningClass {

    private int aNumber=10;
    private int anotherNumber;
    static private CarClass ourCar=new CarClass();
    static private CarClass ourAnotherCar;

    public static void main(String[] args) {

        SubCarClass ourSubCar=new SubCarClass("BMW","7 Series","zzxcz",3000,25,10,"grey");

        System.out.println("Manufacturer: "+ourSubCar.manufactureName);
        System.out.println("Model Name: "+ourSubCar.modelName);
        System.out.println("Password Match: "+ourSubCar.matchPassword("qwerty"));

        System.out.println("1st car engineCC: "+ourSubCar.engineCC);
        System.out.println("Amount of Fuel:" +ourSubCar.presentAmountOfFuel());
        System.out.println("Charge in Battery: "+ourSubCar.getChargeInBattery());
        System.out.println("Color of Car:"+ourSubCar.getColorString());

        System.out.println(".................*********...............");

        ourAnotherCar=new CarClass("TOYOTA","Allion","qwerty",1500,30);
        System.out.println("Manufacturer: "+ourAnotherCar.manufactureName);
        System.out.println("Model Name: "+ourAnotherCar.modelName);
        System.out.println("Password Match: "+ourAnotherCar.matchPassword("qwerty"));

        System.out.println("1st car engineCC: "+ourCar.engineCC);
        System.out.println("2nd car engineCC: "+ourAnotherCar.engineCC);

        System.out.println("Amount of Fuel: "+ourAnotherCar.presentAmountOfFuel()+"L");
        ourAnotherCar.addFuel(2);

        System.out.println("Amount of Fuel after added: "+ourAnotherCar.presentAmountOfFuel()+"L");

        ourAnotherCar.runForSeconds(80);
        System.out.println("Amount of fuel after driving: "+ourAnotherCar.presentAmountOfFuel()+"L");



    }
}
