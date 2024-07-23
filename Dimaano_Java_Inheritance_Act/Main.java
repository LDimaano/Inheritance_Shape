public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", "fuzzy", 17);
        System.out.println("\nCircle");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Texture: " + circle.getTexture() + "\n");

        Cylinder cylinder = new Cylinder("Yellow", "Soft", 10, 15);
        System.out.println("Cylinder");
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Texture: " + cylinder.getTexture() + "\n");

        Rectangle rectangle = new Rectangle("Green", "Smooth", 10, 12);
        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Texture: " + rectangle.getTexture() + "\n");

        Box box = new Box("Pink", "Jagged", 12, 11, 15);
        System.out.println("Box");
        System.out.println("Volume: " + box.getVolume());
        System.out.println("Color: " + box.getColor());
        System.out.println("Texture: " + box.getTexture() + "\n");

        Triangle triangle = new Triangle("Sky Blue", "Smooth", 6, 8);
        System.out.println("Triangle");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Texture: " + triangle.getTexture() + "\n");

        Pyramid pyramid = new Pyramid("Purple", "slick", 5, 8, 10);
        System.out.println("Pyramid");
        System.out.println("Volume: " + pyramid.getVolume());
        System.out.println("Color: " + pyramid.getColor());
        System.out.println("Texture: " + pyramid.getTexture() + "\n");

        Square square = new Square("Black", "Smooth", 4);
        System.out.println("Square");
        System.out.println("Area: " + square.getArea());
        System.out.println("Color: " + square.getColor());
        System.out.println("Texture: " + square.getTexture() + "\n");

        Cube cube = new Cube("White", "Hard", 6);
        System.out.println("Cube");
        System.out.println("Volume: " + cube.getVolume());
        System.out.println("Color: " + cube.getColor());
        System.out.println("Texture: " + cube.getTexture() + "\n");
    }
}
