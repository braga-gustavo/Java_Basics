import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import TitleExample.Title;

public class Ordering {

    public static void main(String[] args) {

        // Ordering Integers
        System.out.println("============ Comparing without comparing interfaces ============ ");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(24);
        integerList.add(18);
        integerList.add(8);
        integerList.add(16);

        Collections.sort(integerList);
        System.out.println("Ordered list: ".concat(String.valueOf(integerList)));

        // Ordering Titles
        System.out.println("============ Comparing with 'Comparable' ============ ");
        List<Title> titleList = new ArrayList<>();
        Title music1 = new Title("Swing Swing", "All the American Rejects");
        Title music2 = new Title("DirtyLittleSecrets", "All the American Rejects");
        Title music3 = new Title("Dear Maria Count me In", "All Time Low");
        Title music4 = new Title("Dear God", "Avegend Sevenfold");

        titleList.add(music1);
        titleList.add(music2);
        titleList.add(music3);
        titleList.add(music4);

        Collections.sort(titleList);
        for (Title title : titleList) {
            System.out.println("Ordered tile list: " .concat(String.valueOf(title)));
        }

        System.out.println("============ Polimorfing lists ============ ");
        
        List<String> polimorficList;
        
        polimorficList = new ArrayList<>();
        polimorficList.add("item 1");
        polimorficList.add("item 2");
        polimorficList.add("item 3");
        System.out.println("ArrayList: " .concat(String.valueOf(polimorficList)));

        polimorficList = new LinkedList<>();
        polimorficList.add("item 1");
        polimorficList.add("item 2");
        polimorficList.add("item 3");
        System.out.println("LinkedList: " .concat(String.valueOf(polimorficList)));
    }
}
