package git9;

import java.util.Objects;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}
