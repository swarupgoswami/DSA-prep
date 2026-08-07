import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSyntax {

    public static void main(String[] args) {

        // Vector<int> v;
        ArrayList<Integer> list = new ArrayList<>();

        // --------------------------
        // ADDING ELEMENTS
        // --------------------------

        list.add(10);                // Add at end
        list.add(20);
        list.add(30);

        list.add(1,100);             // Insert at index

        // --------------------------
        // ACCESS
        // --------------------------

        System.out.println(list.get(0));     // First element

        // --------------------------
        // UPDATE
        // --------------------------

        list.set(2,999);             // Replace element

        // --------------------------
        // REMOVE
        // --------------------------

        list.remove(1);              // Remove by index

        list.remove(Integer.valueOf(30));
        // Remove by value

        // --------------------------
        // SIZE
        // --------------------------

        System.out.println(list.size());

        // --------------------------
        // CHECK EMPTY
        // --------------------------

        System.out.println(list.isEmpty());

        // --------------------------
        // SEARCH
        // --------------------------

        System.out.println(list.contains(999));

        // --------------------------
        // INDEX OF
        // --------------------------

        System.out.println(list.indexOf(999));

        // --------------------------
        // LAST INDEX
        // --------------------------

        list.add(999);

        System.out.println(list.lastIndexOf(999));

        // --------------------------
        // SORT
        // --------------------------

        Collections.sort(list);

        // Descending
        Collections.sort(list, Collections.reverseOrder());

        // --------------------------
        // REVERSE
        // --------------------------

        Collections.reverse(list);

        // --------------------------
        // CLEAR
        // --------------------------

        // list.clear();

        // --------------------------
        // ITERATION
        // --------------------------

        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");

        System.out.println();

        for(int x:list)
            System.out.print(x+" ");

    }
}