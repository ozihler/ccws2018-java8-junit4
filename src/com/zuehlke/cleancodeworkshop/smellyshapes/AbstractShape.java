package com.zuehlke.cleancodeworkshop.smellyshapes;

import java.util.stream.IntStream;

public abstract class AbstractShape implements Shape {

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        if (this instanceof Circle) {
            Circle circle = (Circle) this;
            builder.append("<circle");
            builder.append(" x=\"" + circle.getX() + "\"");
            builder.append(" y=\"" + circle.getY() + "\"");
            builder.append(" radius=\"" + circle.getRadius() + "\"");
            builder.append(" />\n");
        } else if (this instanceof Square) {
            Square square = (Square) this;
            builder.append("<square");
            builder.append(" x=\"" + square.getX() + "\"");
            builder.append(" y=\"" + square.getY() + "\"");
            builder.append(" edgeLength=\"" + square.getWidth() + "\"");
            builder.append(" />\n");
        } else if (this instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) this;
            builder.append("<rectangle");
            builder.append(" x=\"" + rectangle.getX() + "\"");
            builder.append(" y=\"" + rectangle.getY() + "\"");
            builder.append(" width=\"" + rectangle.getWidth() + "\"");
            builder.append(" height=\"" + rectangle.getHeight() + "\"");
            builder.append(" />\n");
        } else if (this instanceof ShapeGroup) {
            ShapeGroup group = (ShapeGroup) this;
            builder.append("<shapegroup>\n");
            IntStream.range(0, group.size).mapToObj(i -> group.shapes[i].toXml()).forEach(builder::append);
            builder.append("</shapegroup>\n");
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + this.getClass());
        }
        return builder.toString();
    }
}
