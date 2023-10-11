import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class HashMapTest {
    @Test
    @DisplayName("자바 Default HashMap 의 경우 Capacity = 16, LoadFactor = 0.75f")
    void default_hashmap_test() {
        HashMap<String, String> testHashMap = new HashMap<>();
        testHashMap.put("1", "test");
        testHashMap.put("2", "test");
        testHashMap.put("3", "test");
        testHashMap.put("4", "test");
        testHashMap.put("11", "test");

        //break point
        System.out.println("HashMap LoadFactor:" + testHashMap);

        testHashMap.forEach((k, v) -> System.out.println("HashCode:" + k.hashCode() + ", Key:" + k + ", Value:" + v));
    }

    @Test
    @DisplayName("자바 Capacity = 3, LoadFactor = 0.75f 인 HashMap 의 경우")
    void capacity_3_hashmap_test() {
        HashMap<String, String> testHashMap = new HashMap<>(3, 0.75f);
        testHashMap.put("1", "test");
        testHashMap.put("2", "test");
        testHashMap.put("3", "test");
        testHashMap.put("4", "test");
        testHashMap.put("11", "test");

        //break point
        System.out.println("HashMap LoadFactor:" + testHashMap);

        testHashMap.forEach((k, v) -> System.out.println("HashCode:" + k.hashCode() + ", Key:" + k + ", Value:" + v));
    }
}
