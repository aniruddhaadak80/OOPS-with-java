// Pen class 
class Pen {
    String color;
    String size;
    String type;
    String name;

    public void Write() {
        System.out.println("Write Something");
    }

    public void PrintColor() {
        System.out.println("The color of " + this.name + " is: " + this.color);
    }
}

public class NewOops {
    public static void main(String[] args) {
        System.out.println(9);

        // Pen declearation
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        // for pen1 in Pen
        pen1.color = "Green";
        pen1.type = "Gel";
        pen1.size = "10cm";
        pen1.name = "pen1";
        pen1.Write();
        // for pen2
        pen2.color = "Red";
        pen2.type = "Ball";
        pen2.size = "11cm";
        pen2.name = "pen2";

        // color of pen1 and pen2
        pen1.PrintColor();
        pen2.PrintColor();

    }
}
