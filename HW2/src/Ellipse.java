public class Ellipse implements Shape{
    double SmallRadius;
    double BigRadius;

    Ellipse(double SmallRadius, double BigRadius){
        if(SmallRadius > 0){
            this.SmallRadius = SmallRadius;
        } else {
            this.SmallRadius = 0;
        }
        if(BigRadius > 0){
            this.BigRadius= BigRadius;
        } else {
            this.BigRadius = 0;
        }
    }

    @Override
    public double getArea() {
        return Math.PI*this.SmallRadius*this.BigRadius;
    }

    @Override
    public String toString(){
        return "My name is Ellipse";
    }
}
