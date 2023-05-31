final public class Circle {
    final private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){return radius;}

    public double computeArea(){
        return Math.PI*radius*radius;
    }
}
