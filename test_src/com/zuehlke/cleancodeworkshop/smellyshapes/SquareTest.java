package com.zuehlke.cleancodeworkshop.smellyshapes;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@DisplayName("A square")
public class SquareTest {

    @Test
    @DisplayName("calculates its area according to edge length")
    public void calculateArea() {
        Square square = new Square(0, 0, 2);
        assertEquals(4, square.calculate());
    }

    @Test
    @DisplayName("prints its contents")
    public void toString_() {
        Square square = new Square(0, 0, 1, new Color("Red"));
        assertEquals("Square: (0,0) edgeLength=1 color=#FF0000", square.toString());
    }

    @Test
    @DisplayName("can be converted to xml")
    public void toXml() {
        Square square = new Square(0, 1, 2);
        String xml = square.toXml();
        assertEquals("<square x=\"0\" y=\"1\" edgeLength=\"2\" />\n", xml);
    }

    @Test
    @DisplayName("can determine if it contains points")
    public void containsPoints() {
        Square square = new Square(0, 0, 1);

        assertTrue(square.containsPoint(0, 0));
        assertTrue(square.containsPoint(0, 1));
        assertTrue(square.containsPoint(1, 1));
        assertTrue(square.containsPoint(1, 0));

        assertFalse(square.containsPoint(-1, -1));
        assertFalse(square.containsPoint(-1, 0));
        assertFalse(square.containsPoint(0, -1));
        assertFalse(square.containsPoint(1, 2));
        assertFalse(square.containsPoint(2, 1));
    }

    @DisplayName("throws an exception when getHeight() is called")
    @Test(expected = RuntimeException.class)
    public void getHeigth() {
        new Square(0, 0, 0).getHeight();
    }
}
