package assignment9;

public class Fan {
    final private static int SLOW = 1;
    final private static int MEDIUM = 2;
    final private static int FAST = 3;
    private static int numberOfObjects = 0;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    public String color = "blue";

    public Fan() {
        numberOfObjects++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String modifiedToString() {
        String speedState;
        String fanState;
        if (speed == 1) {
            speedState = "Slow";
        } else if (speed == 2 ) {
            speedState = "Medium";
        } else {
            speedState = "Fast";
        }
        if (on) {
            fanState = "and the Fan is on";
        } else {
            fanState = "but the fan is off";
        }
        return "Fan " + numberOfObjects + " " +
                "speed is on " + speedState +
                ", " + fanState +
                ". It's radius is " + radius +
                " and the color is '" + color + '\'' ;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
