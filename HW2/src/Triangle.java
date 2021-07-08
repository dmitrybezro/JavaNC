public class Triangle implements Shape{
   //  С допущением, что он равносторонний
    double SideLength;
    Triangle(double SideLength){
        if(SideLength > 0){
            this.SideLength = SideLength;
        } else {
            this.SideLength = 0;
        }
    }

    @Override
    public double getArea() {
        return (Math.pow(SideLength, 2)*Math.sqrt(3))/4;
    }

    @Override
    public String getType() {
        return "My name is Triangle";
    }

}
