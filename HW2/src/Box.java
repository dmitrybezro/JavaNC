public class Box implements Shape{
   double SideLength;

   public Box(double SideLength) {
       if (SideLength > 0) {
           this.SideLength = SideLength;
       } else {
           this.SideLength = 0;
       }
   }

    @Override
    public double getArea() {
        return Math.pow(this.SideLength, 2);
    }

    @Override
    public String toString(){
        return "My name is Box";
    }
}
