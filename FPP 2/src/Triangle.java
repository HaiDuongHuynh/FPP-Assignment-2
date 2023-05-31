final public class Triangle {
    final private double height;
    final private double base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public double getHeight(){return height;}
    public double getBase(){return base;}
    public double computeArea(){
        return 0.5*height*base;
    }
}
