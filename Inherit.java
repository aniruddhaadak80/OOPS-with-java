class Shape {

    public void area() {

    }
}

//************************** simple inheritence ******************************************************/
// for area of a triangle **************************/
class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println("Area of a triangle is :" + 0.5 * b * h);
    };
}

// Area of a circle
class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of a circle is : " + 3.14 * r * r);
    }
}

public class Inherit {
    public static void main(String[] args) {
        // For triangle Area
        Triangle triangle = new Triangle();
        triangle.area(2, 2);

        // For the area of a circle
        Circle c1 = new Circle();
        c1.area(1);

    }
}
