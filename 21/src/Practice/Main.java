package Practice;

import com.company.Counter;
import com.company.Dog;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LocationOfFigure locationOfFigure = new LocationOfFigure(2.4,3.4);
        LocationOfFigure locationOfFigure2 = new LocationOfFigure(2.4,3.4);

        Figure figure = new Figure(locationOfFigure,"black",true);
        System.out.println(figure.speak());

        Rectangle rectangle = new Rectangle(locationOfFigure2,"black",true,25,25);
        System.out.println(rectangle.speak());
    }
}
