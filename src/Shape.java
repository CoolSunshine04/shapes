public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public static Shape findMaxAreaShape ( Shape[] shapes ) {
        int MAX = 0;

        for ( int i = 0 ; i < shapes.length ; i++ ) {
            if ( shapes[i].getArea()>shapes[MAX].getArea() ) {
                MAX = i;
            }
        }
        return shapes[MAX];
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Double.NaN;
    }


    @Override
    public String toString() {
        return String.format("Shape {color: %s}", color);
    }
}
