package Hierarchy;

//Реализуйте иерархию классов:

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylyinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylyinder)); // ok
        System.out.println(box.add(pyramid)); // failed

        // Sorting:
        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes); // sorted by Volume!
    }
}

interface Shape extends Comparable<Shape>{
    double getVolume();

    @Override
    default int compareTo(Shape o) {
        return Double.compare(getVolume(), o.getVolume());
    }
}

class Pyramid implements Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s*h*4/3;
    }
}

abstract class SolidOfRevolution implements Shape {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI*4/3*height*radius*radius;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI*4/3*Math.pow(radius, 3);
    }
}

class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box(double available) {
        this.available = available;
        this.volume = available;
    }

    boolean add(Shape s) {
        if (available >= s.getVolume()) {
            shapes.add(s);
            available -= s.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}