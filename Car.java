public class Car extends Vehicle {
    private String typeEngine;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setCarInfo(int s, String t, String y) {
        setFuel(s);
        setTopSpeed(t);
        typeEngine = y;
    }

    public void setTypeEngine(String t) {
        typeEngine = t;
    }

    public void move() {
        if (this.getFuel() >= 50) {
            System.out.println("Move.");
            setFuel(-50);
        }
        else {
            System.out.println("Please add fuel.");
        }
    }

    public void showCarInfo() {
        System.out.println("Car engine is " + getTypeEngine() + ".");
        System.out.println("Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
}
