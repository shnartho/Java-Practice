// Java program to demonstrate that enums can have
// constructor and concrete methods.

// An enum (Note enum keyword inplace of class keyword)
enum Color {
    RED,
    WHITE,
    GREEN,
    BLUE;

    // enum constructor called separately for each
    // constant
    private Color(){
        System.out.println("Constructor has been called for "+ this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class enumPractice {
    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.WHITE;
        System.out.println(c1);
        c1.colorInfo();
    }
}
