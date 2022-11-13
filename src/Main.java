import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solve the problem of counting duplicate elements in a list with HashMap
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);

        Integer value = 1;
        Map<Integer, Integer> m = new HashMap<>();
        for (Integer integer :
                list) {
            if (m.containsKey(integer)) {
                m.put(integer, m.get(integer) + 1);
            } else m.put(integer, value);
        }
        System.out.println(m);
    }
}