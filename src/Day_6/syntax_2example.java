package Day_6;

public class syntax_2example {
    public static void Animal(){
        pet();
        System.out.println("camel");
    }
    public static void main(String[] args) {
        Bird();
    }
    public static void Insects(){
        System.out.println("Butterfly");
    }
    public static void Bird(){
        Insects();
        System.out.println("Parrot");
        Animal();
    }
    public static void pet(){
        System.out.println("cat");
    }
}
