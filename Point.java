public class Point {

    static int X = 0;
    static int Y = 0;

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }

    static void setX(int zahl1) {
        X = zahl1;
    }

    static void  setY(int zahl2) {
        Y = zahl2;
    }

    static void getX() {
        int x = X;
    }

    static  void getY() {
        int y = Y;
    }


}
