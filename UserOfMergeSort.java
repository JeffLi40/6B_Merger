import java.util.ArrayList;
import java.util.Arrays;
public class UserOfMergeSort {
    public static void main( String[] args) {
        ArrayList<String> letters = new ArrayList<String> (
            Arrays.asList(
              "A" , "B" , "D" , "C" , "A" , "A" , "E", "A" , "C" , "E" , "D"
            )
        );
        System.out.println( "Unsorted: " + letters);
        SubSortThenMerge_Sorter s = new SubSortThenMerge_Sorter( letters);
        s.sort();
        System.out.println( "New: " + s);

    }
}
