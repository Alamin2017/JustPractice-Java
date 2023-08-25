package SeventhLecture;

public class OurThread extends Thread {

    private String threadName;
    private int startingPoint;
    private int counter;
    private int adder;
    private int timeDifference;

    private boolean threadAliveFlag;

    public OurThread(String threadName, int startingPoint, int adder, int timeDifference,
                     boolean threadAliveFlag) {
        super();
        this.threadName = threadName;
        this.startingPoint = startingPoint;
        //this.counter = counter;
        this.adder = adder;
        this.timeDifference = timeDifference;
        this.threadAliveFlag = threadAliveFlag;

    }
    @Override
    public void run() {

        counter=startingPoint;
        while (threadAliveFlag) {
            counter+=adder;
            try {
                sleep(timeDifference);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void stopThread()
    {
        threadAliveFlag=false;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTimeDifference() {
        return timeDifference;
    }

    public void setTimeDifference(int timeDifference) {
        this.timeDifference = timeDifference;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }



}
