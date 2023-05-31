final public class Rectangle {
    final private double width;
    final private double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){return width;}
    public double getLength(){return length;}
    public double computeArea(){
        return width*length;
    }
}
