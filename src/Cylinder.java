public class Cylinder extends Circle{
    private double heigh;

    public Cylinder() {
    }

    public Cylinder(double heigh) {
        this.heigh = heigh;
    }

    public Cylinder(double radius, String color, double heigh) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getVolume() {
        return super.getArea() * heigh;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigh=" + heigh +", Volume= "+getVolume()+
                '}';
    }
}
