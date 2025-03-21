public class Main {

    public static void main(String[] args) {


        Point p1 = new Point();
        System.out.println(p1.x_coord);
        System.out.println(p1.y_coord);


        Point p2 = new Point(3,4);
        System.out.println(p2.x_coord);
        System.out.println(p2.y_coord);


        Point p3 =new Point(5);
        System.out.println(p3.x_coord);
        System.out.println(p3.y_coord);

        Rectangle r1 = new Rectangle(
          p3,
          4,
                5);

        System.out.println(r1.getSide_a());
        System.out.println(r1.getSide_b());
        System.out.println(r1.getTopleft().x_coord);
        System.out.println(r1.getTopleft().y_coord);

        System.out.println(r1.perimeter());
        System.out.println(r1.area());
    }

}