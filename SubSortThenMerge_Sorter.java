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
        //if( exclusiveEnd - inclusiveStart == 1) instructions for base case: do nothing //decision between base case and recursive case
        if( exclusiveEnd - inclusiveStart != 1) {
          //instructions for recursive case
          //additional processing: calculate the midway index
          int midway = (exclusiveEnd + inclusiveStart + 1) / 2;
          //invocation of recursive abstractionL when I am asked to sort a sublist indexed i to j, I can sort half of that sublist.
          sortRecursive( inclusiveStart, midway);
          sortRecursive( midway, exclusiveEnd);
          //combine: merge the two sorted sublists
          sortThis.merge( inclusiveStart, midway, exclusiveEnd);
        }
    }
    public String toString() {
      return sortThis.toString();
    }
}
