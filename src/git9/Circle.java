package git9;

public class Circle extends Shape {
    int x;
    int y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисует кргу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        return y == circle.y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
