/**
  Represent a merge operation for sorted lists,
  as described in README.md
 */
import java.util.ArrayList;

public class Merger {

    private ArrayList<String> usersData;

    /**
      Construct an instance from a list of data
      part of which is to be merged. See README
     */
    public Merger( ArrayList<String> list) {
        usersData = list;
    }

    public int size() {return usersData.size();}

    /**
      Merge the sorted sub-lists.
     */
public void merge(
    // indexes of sub-list boundaries; see README
    int start0 // index of first item in list0
    , int start1 // index of first item in list1
    // = just past end of list0
    , int end1 // index past end of list1
) {
    ArrayList < String > list = new ArrayList< String>(usersData);
    int nextIndex0 = start0;
    int nextIndex1 = start1;
    int nextToPlace = start0;
    while (nextIndex0 < start1 && nextIndex1 < end1) {
        System.out.println( "nextIndex0: " + nextIndex0 + " ;; nextIndex1: " + nextIndex1);
        System.out.println( "@nextIndex0: " + usersData.get(nextIndex0) + " ;; @nextIndex1: " + usersData.get(nextIndex1));
        System.out.println( "nextToPlace: " + nextToPlace);
        if (usersData.get(nextIndex0).compareTo(usersData.get(nextIndex1)) < 0) {
            list.set(nextToPlace, usersData.get(nextIndex0));
            nextIndex0++;
        } else {
            list.set(nextToPlace, usersData.get(nextIndex1));
            nextIndex1++;
        }
        nextToPlace++;
        System.out.println( "list: " + list.toString());
    }

        while (nextIndex1 < end1) {
            list.set(nextToPlace, usersData.get(nextIndex1));
            nextToPlace++;
            nextIndex1++;
        }

        while (nextIndex0 < start1) {
            list.set(nextToPlace, usersData.get(nextIndex0));
            nextToPlace++;
            nextIndex0++;
        }

    usersData = list;
}


    /**
      @return a string representation of the user's data
     */
    public String toString() {
        return "" + usersData;
    }


    /**
      @return the boolean value of the statement
         "the data in the range are in ascending order"
     */
    public boolean isSorted( int startAt, int endBefore) {
        for( int i = startAt
           ; i < endBefore -1 // stop early, because comparing to next
           ; i++
           )
            if( usersData.get(i).compareTo( usersData.get(i+1)) > 0) {
                System.out.println( "trouble between position " + i
                                  + ", which holds " + usersData.get(i)
                                  + ", and position " + (i +1)
                                  + ", which holds " + usersData.get(i +1)
                                  );
                return false;
            }
        return true;
    }
}
