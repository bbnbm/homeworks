package Practice;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(LocationOfFigure location, String color, boolean visible, int height, int width) {
        super(location, color, visible);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String speak(){
        return toString();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                 ", X = " + getLocation().getX() + ", Y = " + getLocation().getY() + '}';
    }
}
