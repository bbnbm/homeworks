package Practice;

public class Figure {
    private LocationOfFigure location;
    private String color;
    private boolean visible;

    public Figure(LocationOfFigure location, String color, boolean visible) {
        this.location = location;
        this.color = color;
        this.visible = visible;
    }
    public String speak(){
        return toString();
    }

    public LocationOfFigure getLocation() {
        return location;
    }

    public void setLocation(LocationOfFigure location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "location=" + location.getX() + " , " + location.getY() +
                ", color='" + color + '\'' +
                ", visible=" + visible+
                '}';
    }
}
