package EighthLecture;

public class CustomRunnableObject implements Runnable{

    private String name;
    private int counter;

    public CustomRunnableObject(String name, int counter) {
        super();
        this.name = name;
        this.counter = counter;
    }
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted())
        {
            counter++;

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


}
