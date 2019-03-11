class Rectangle {

    private int side1;
    private int side2;

    public Rectangle(int side1, int otherSide) {
        side1 = side1;
        side2 = otherSide;
    }

    public String toString() {
        return "" + side1 + " by " + side2;
    }

}

public class Square1 extends Rectangle {

    private int area;

    public Square1(int side) {
        area = side * side;
    }

    @Override
    public String toString() {
        return toString() + '(' + area + ')';
    }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println(rectangle);
        Square1 square = new Square1(4);
        System.out.println(square);
    }

}
