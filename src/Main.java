import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"a", "a", "b", "b", "b", "c", "c"};
        Set<String> set = new HashSet<String>(Arrays.asList(strings));
        String[] resoult = set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(resoult));
    }
}

