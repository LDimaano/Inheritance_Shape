public abstract class Shape {
    protected String color;
    protected String texture;

    public Shape(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
