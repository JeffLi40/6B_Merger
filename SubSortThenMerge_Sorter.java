import java.util.ArrayList;
public class SubSortThenMerge_Sorter {
    private Merger sortThis;
    public SubSortThenMerge_Sorter( ArrayList<String> usersData) {
        sortThis = new Merger( usersData);
    }
    public void sort() {
        sortRecursive( 0, sortThis.size());
    }
    private void sortRecursive( int inclusiveStart, int exclusiveEnd) {
        //if( exclusiveEnd - inclusiveStart == 1) do nothing //decision between base case and recursive case
        if( exclusiveEnd - inclusiveStart != 1) {
          int midway = (exclusiveEnd + inclusiveStart + 1) / 2;
          sortRecursive( inclusiveStart, midway);
          sortRecursive( midway, exclusiveEnd);
          sortThis.merge( inclusiveStart, midway, exclusiveEnd);
        }
    }
    public String toString() {
      return sortThis.toString();
    }
}
