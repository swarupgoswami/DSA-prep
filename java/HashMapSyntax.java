import java.util.HashMap;

public class HashMapSyntax {

    public static void main(String[] args) {

        // unordered_map<char,int>
        HashMap<Character,Integer> map = new HashMap<>();

        // --------------------------
        // INSERT
        // --------------------------

        map.put('a',1);

        map.put('b',2);

        // update if exists

        map.put('a',5);

        // --------------------------
        // GET VALUE
        // --------------------------

        System.out.println(map.get('a'));

        // --------------------------
        // DEFAULT VALUE
        // --------------------------

        System.out.println(
            map.getOrDefault('x',0)
        );

        // --------------------------
        // CHECK KEY
        // --------------------------

        map.containsKey('a');

        // --------------------------
        // CHECK VALUE
        // --------------------------

        map.containsValue(2);

        // --------------------------
        // REMOVE
        // --------------------------

        map.remove('a');

        // --------------------------
        // SIZE
        // --------------------------

        map.size();

        // --------------------------
        // EMPTY
        // --------------------------

        map.isEmpty();

        // --------------------------
        // ITERATE KEYS
        // --------------------------

        for(Character key: map.keySet())
            System.out.println(key);

        // --------------------------
        // ITERATE VALUES
        // --------------------------

        for(Integer val: map.values())
            System.out.println(val);

        // --------------------------
        // ITERATE BOTH
        // --------------------------

        for(var entry: map.entrySet())
        {
            System.out.println(
                entry.getKey()+" "+entry.getValue()
            );
        }

        // --------------------------
        // CLEAR
        // --------------------------

        map.clear();

    }
}