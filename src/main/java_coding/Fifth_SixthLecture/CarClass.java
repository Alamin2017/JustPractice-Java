package Fifth_SixthLecture;

public class CarClass {

    public String manufactureName;
    public String modelName;
    private String cardKeyValue;
    public int engineCC;
    private float fuelAmount;
    final private float amountOfFuelConsumedPerSecond=0.02f;
    public CarClass()
    {
     manufactureName=new String();
     modelName=new String();
     engineCC=1200;
     fuelAmount=0;
    }
    public CarClass(String carName)
    {
        manufactureName=new String(carName);
        modelName=new String();
        engineCC=0;
        fuelAmount=0;
    }
    public CarClass(String manu,String model,String key,Integer cc,float fuel)
    {
        manufactureName=manu;
        modelName=model;
        cardKeyValue=key;
        engineCC=cc;
        fuelAmount=fuel;
    }
    public float presentAmountOfFuel()
    {
        return fuelAmount;
    }
    public String getManufactureName()
    {
        return manufactureName;
    }
    public String getModelName()
    {
        return modelName;
    }
    public void addFuel(float fuelAmount)
    {
        this.fuelAmount+=fuelAmount;
    }
    public void runForSeconds(int timeInSecond)
    {
        float usedFuel=timeInSecond*amountOfFuelConsumedPerSecond;
        fuelAmount-=usedFuel;
    }
    public boolean matchPassword(String userInput)
    {
        return userInput.equals(cardKeyValue);
    }

}
