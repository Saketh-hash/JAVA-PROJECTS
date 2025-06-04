import java.util.LinkedHashSet;

public class LinkedHashsetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("SAK");
        lhs.add("PRAV");
        lhs.add("VAM");
        lhs.add("SUN");
        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("SAK"));
        System.out.println(lhs.contains("SUN"));
        lhs.remove("SAK");
        System.out.println(lhs);
        // System.out.println(lhs);
    }
}
