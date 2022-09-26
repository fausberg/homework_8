package git9;

public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];{
                shapes[0] = new Circle("Красный", 2, 5);
                shapes[1] = new Circle("Белый",3, 4);
                shapes[2] = new Circle("Чёрный", 7, 1);
                shapes[3] = new Rectangle("Коричневый",3,2);
                shapes[4] = new Rectangle("Оранжевый",1,5);
        }
        for (Shape it:shapes) {
            it.draw();
        }

    }
}
