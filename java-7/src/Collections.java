import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
    static Collection<String> names = new ArrayList<>();

    public static void addCollection() {
        System.out.println("Add Collection");
        names.add("Kuzan");
        names.addAll(Arrays.asList("Naruto", "Sasuke"));
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public static void removeCollection() {
        System.out.println("Remove Collection");
        names.add("Ahmed,S.S");
        names.add("Ahmad");
        names.addAll(Arrays.asList("Usman", "Adul"));
        names.remove("Abdul");
        names.removeAll(Arrays.asList("Usman", "Adul"));
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public static void checkCollection() {
        System.out.println("Check Collection");
        names.add("Eman");
        names.add("Kusuma");
        names.addAll(Arrays.asList("Adudu", "BangToel"));
        System.out.println(names.contains("Eman"));
        System.out.println(names.containsAll(Arrays.asList("Adudu", "BangToel")));
        names.remove("Eman");
        names.removeAll(Arrays.asList("Adudu", "BangToel"));
        System.out.println(names.contains("Eman"));
        System.out.println(names.containsAll(Arrays.asList("Adudu", "BangToel")));
        System.out.println();
    }
}