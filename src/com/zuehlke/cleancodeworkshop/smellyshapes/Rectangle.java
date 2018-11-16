package com.zuehlke.cleancodeworkshop.smellyshapes;


public class Rectangle extends Shape {

    protected Color c = new Color("Blue");
    private Point point;
    int width;
    int height;

    public Rectangle(Point point, int width, int height) {
        this.point = point;

        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(Point point) {
        return this.point.getX() <= point.getX() && point.getX() <= this.point.getX() + width && this.point.getY() <= point.getY() && point.getY() <= this.point.getY() + height;
    }

    public int calculate() {
        return width * height;
    }

    public int getX() {
        return point.getX();
    }

    public int getY() {
        return this.point.getY();
    }

    public String toString() {
        return String.format("Rectangle: (%d,%d) width=%d height=%d color=%s", point.getX(), this.point.getY(), width, height,
                c.getColorAsHex());
    }

    @Override
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<rectangle");
        builder.append(" x=\"" + this.getX() + "\"");
        builder.append(" y=\"" + this.getY() + "\"");
        builder.append(" width=\"" + this.getWidth() + "\"");
        builder.append(" height=\"" + this.getHeight() + "\"");
        builder.append(" />\n");
        return builder.toString();
    }
}
