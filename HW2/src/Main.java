public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        Triangle triangle = new Triangle(3.25);
        Circle circle = new Circle(2);
        Ellipse ellipse = new Ellipse(2,3);

        System.out.println(box.toString() + " and my area is equal to " + box.getArea());
        System.out.println(triangle.toString() + " and my area is equal to " + triangle.getArea());
        System.out.println(circle.toString() + " and my area is equal to " + circle.getArea());
        System.out.println(ellipse.toString() + " and my area is equal to " + ellipse.getArea());
    }
}
