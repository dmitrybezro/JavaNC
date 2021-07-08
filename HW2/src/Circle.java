public class Circle implements Shape{
    double radius;
    Circle(double radius){
        if(radius > 0){
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2)/2;
    }

    @Override
    public String getType() {
        return "My name is Circle";
    }

}
