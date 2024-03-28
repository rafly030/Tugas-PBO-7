import java.util.ArrayList;

public class Lists {
    public static void list() {
        System.out.println("List");
        
        java.util.List<String> names = new ArrayList<>();
        names.add("Sarimin");
        names.add("Borutod");
        names.add("Levi");
        
        names.set(1, "BangToyib");
        
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
    }
}