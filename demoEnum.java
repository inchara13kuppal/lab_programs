package week12;

enum Signal {
    RED,
    YELLOW,
    GREEN
}

class checkSignal {
    Signal currentSignal;

    public checkSignal(Signal cs) {
        this.currentSignal = cs;
    }

    public void makeRide() {
        switch (currentSignal) {
            case RED:
                System.out.println("the signal is RED.\n kindly wait until it turns to GREEN.");
                break;
            case YELLOW:
                System.out.println("the signal is YELLOW.\n kindly wait look around and make safe move.");
                break;
            case GREEN:
                System.out.println("the signal is GREEN.\n Have a safe ride.");
                break;
        }
    }
}

public class demoEnum {
    public static void main(String[] args) {
        checkSignal myDrive = new checkSignal(Signal.GREEN);
        myDrive.makeRide();
    }
}

