abstract class Birds {
    abstract void Flying(); 
    public void eat() {
        System.out.println("Each birds have mouth to eat");
    }
}

class Chicken extends Birds {
    public void Flying() {
        System.out.println("Chicken can not fly.");
    }
}

class Parrot extends Birds {
    public void Flying() {
        System.out.println("Parrot can fly more height than Chicken");
    }
}

public class Abstruct {
    public static void main(String[] args) {

       
        // For chicken
        Chicken c1 = new Chicken();
        c1.Flying();

        // For Parrot
        Parrot p1 = new Parrot();
        p1.Flying();
        p1.eat();

    }
}
