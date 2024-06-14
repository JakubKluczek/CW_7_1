public class Parallelogram implements Figure{
    private double Baseside;
    private double side;
    private double height;

    public Parallelogram(double baseside, double side, double height) {
        this.Baseside = baseside;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*side + 2*Baseside;
    }

    @Override
    public double getArea() {
        return Baseside*height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}
