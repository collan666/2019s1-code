class Rectangle {

    private int side1;
    private int side2;

    public Rectangle(int side1, int otherSide) {
        this.side1 = side1;
        side2 = otherSide;
    }

    public String toString() {
        return "" + side1 + " by " + side2;
    }

}

public class Square4 extends Rectangle {

    private int area;

    public Square4(int side) {
        super(side, side);
        area = side * side;
    }

    @Override
    public String toString() {
        return toString() + '(' + area + ')';
    }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println(rectangle);
        Square4 square = new Square4(4);
        System.out.println(square);
    }

}
