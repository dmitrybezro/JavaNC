import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        Triangle triangle = new Triangle(3.25);
        Circle circle = new Circle(2);
        Ellipse ellipse = new Ellipse(2,3);

        System.out.println(box.getType() + " and my area is equal to " + box.getArea());
        System.out.println(triangle.getType() + " and my area is equal to " + triangle.getArea());
        System.out.println(circle.getType() + " and my area is equal to " + circle.getArea());
        System.out.println(ellipse.getType() + " and my area is equal to " + ellipse.getArea());
    }
}
