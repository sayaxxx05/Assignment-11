
import java.util.Random;

// Interface for 3D shapes
interface Shape3DInterface {
    double surfaceArea();
    double volume();
}

// Sphere class
class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere (radius = " + radius + ")";
    }
}

// Cylinder class
class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder (radius = " + radius + ", height = " + height + ")";
    }
}

// Cube class
class Cube implements Shape3DInterface {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube (side = " + side + ")";
    }
}

// Main class
public class Shape3DProject {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3); // 0: Sphere, 1: Cylinder, 2: Cube

            switch (shapeType) {
                case 0:
                    double radius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    shapes[i] = new Sphere(radius);
                    break;
                case 1:
                    radius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
                    double height = 5 + random.nextDouble() * 15; // Height between 5 and 20
                    shapes[i] = new Cylinder(radius, height);
                    break;
                case 2:
                    double side = 1 + random.nextDouble() * 9; // Side between 1 and 10
                    shapes[i] = new Cube(side);
                    break;
            }
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}
