class Circle {
    private double radius;

    public Circle() {
        this(12);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) throws MyException {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new MyException("Negative number or equal to zero");
        }

    }

    public double getCircleArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCirclePerimeter() {
        return 2 * this.radius * Math.PI;
    }

    public void showCirclePerimeterAndArea() {
        System.out.printf("Circle perimeter = %.2f\n", getCirclePerimeter());
        System.out.printf("Circle area = %.2f\n", getCircleArea());
    }
}