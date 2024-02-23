class FactoryPatternDemoe{
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        // get an object of Circle and call its draw method.
        Shape shape=shapeFactory.getShape("Circle");
        // call draw method of circle
        shape.draw();
        Shape shape2=shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("Square");
        shape3.draw();




    }
}