package CreationalDP.FactoryDP;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Shape circle1 = new Circle();// interface yapiyoruz(Circle dan da olusturabilirdik) sol tarafi rahtca degistirebilmek icin
        circle1.draw();
        Shape square1 = new Square();
        square1.draw();
        Shape rectangle1 = new Rectangle();
        rectangle1.draw();

        System.out.println("*************************");
        System.out.println();
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("DAİRE");// domain objesini de bilmek istemiyorum
        Shape shape2 = shapeFactory.getShape("DİKDÖRTGEN");// gerek güvenlik , gerek dil bircok etmenden sebep sadece kullandigimi bilirim
        Shape shape3 = shapeFactory.getShape("KARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}















