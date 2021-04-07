package lessonFour.Class;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        System.out.println("Конструирование объекта Box");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        vol = myBox.volume();
        System.out.println("Объём равен: " + vol);

        vol = myBox2.volume();
        System.out.println("Объём равен: " + vol);
    }

}
