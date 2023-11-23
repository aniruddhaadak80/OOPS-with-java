// *********************  The name of the java file must match the class name. *******************
//!Date :- 22/11/23
public class Rev1 {
    public static void main(String[] args) {
        System.out.println("Hii java I came back to you .");
        System.out.println("I am revising it on 22.11.2023");

        // final keyword for make constant variable //* fianl ---> constant
        final int age = 18;
        System.out.println("My age is : " + age);
        final String nme = "Aniruddha Adak";
        System.out.println("My name is : " + nme);
        // ? you can continue it with boolean,float,char keyword

        // ternary operatoer or simply short-hand if-else operator
        int age_of_driver = 23;
        String drive = (age_of_driver >= 18) ? "You can Drive." : " You can\'t Drive.";
        System.out.println(drive);

        // int time = 20;
        // String result = (time < 18) ? "Good day." : "Good evening.";
        // System.out.println(result);

    }

}
