package Command;

public class AirConditioner {
    private boolean currentStatus;
    private int currentTemp;
    private int maxTemp;
    private int minTemp;
    private int idealTemp;
    public AirConditioner(int minTemp, int maxTemp, int idealTemp){
        this.currentStatus = false;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.idealTemp = idealTemp;
    }

    public void turnOn(){
        if(!this.currentStatus){
            this.currentStatus = true;
            this.currentTemp = idealTemp;
            System.out.println("AC is on");
            System.out.println("Temp: " + this.currentTemp);
        } else {
            System.out.println("AC is already on");
        }

    }

    public void turnOff(){
        if(this.currentStatus){
            this.currentStatus = false;
            System.out.println("AC is off");
        }
    }

    public void reduceTemp(){
        if(this.currentStatus && this.currentTemp > this.minTemp){
            --this.currentTemp;
            System.out.println("Temp: " + this.currentTemp);
        }
    }

    public void increaseTemp(){
        if(this.currentStatus && this.currentTemp < this.maxTemp){
            ++this.currentTemp;
            System.out.println("Temp: " + this.currentTemp);
        }
    }
}
