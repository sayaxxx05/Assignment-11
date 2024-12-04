# Assignment-11
3D Shapes and Polymorphism in Java
Project Description
This project demonstrates polymorphism in Java by creating an interface that defines the common behaviors for various 3D shapes. Specifically, the interface Shape3DInterface provides two methods for calculating the surface area and volume of different 3D shapes. The project includes three classes that implement this interface: Sphere, Cylinder, and Cube. Each class calculates the surface area and volume based on the specific formulas for that shape.

How Polymorphism Is Used
Polymorphism allows objects of different classes to be treated as objects of a common superclass or interface. In this project, the Shape3DInterface serves as the common type, and the classes Sphere, Cylinder, and Cube implement this interface. Even though these classes have different internal implementations for calculating surface area and volume, they all follow the same contract defined in the interface.

Using polymorphism, we can create an array or list of Shape3DInterface objects, each holding an instance of a different shape. When we call the surfaceArea() and volume() methods on each object, Java will use the appropriate method for the specific shape, demonstrating polymorphism in action.

Key Features:
Shape3DInterface: Interface with methods surfaceArea() and volume().
Sphere, Cylinder, Cube: Classes implementing the interface with shape-specific calculations.
Random Shape Generation: Generates 10 random objects of type Sphere, Cylinder, or Cube, and calculates their properties.
