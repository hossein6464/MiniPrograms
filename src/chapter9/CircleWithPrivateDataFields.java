package chapter9;

public class CircleWithPrivateDataFields {
    /**
     * The number of the objects created
     */
    private static int numberOfObjects = 0;
    /**
     * The radius of the circle
     */
    private double radius = 1;

    /**
     * Construct a circle with radius 1
     */
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     */
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /**
     * Return the area of this circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
