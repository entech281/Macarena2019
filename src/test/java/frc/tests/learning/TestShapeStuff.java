package frc.tests.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import frc.shapes.Circle;
import frc.shapes.HasPerimeter;
import frc.shapes.Rectangle;
import frc.shapes.Shape;
import frc.shapes.Square;

public class TestShapeStuff {

    @Test
    public void testShapes() {
        HasPerimeter s = new Rectangle(1.0, 3.0);
        HasPerimeter s2 = new Circle(1.0);
        double total = addPerimeters(s2, s);
        assertEquals(14.28, total, 0.1);
    }

    @Test
    public void assertSquareWorks() {
        Shape s = new Square(2.0);
        assertEquals(8.0, s.getPerimeter(), 0.00000001);
    }

    public double addPerimeters(HasPerimeter... perimeters) {
        double the_total = 0.0;
        for (HasPerimeter hp : perimeters) {
            the_total += hp.getPerimeter();
        }
        return the_total;
    }

}
