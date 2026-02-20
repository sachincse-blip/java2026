abstract class tv {
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends tv {
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class Main {
    public static void main(String[] args) {
        tv remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}
