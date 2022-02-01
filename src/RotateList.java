import java.util.ArrayList;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {

        /**
         * My approach -
         * start a for loop and run it "n" number of times, where n = rotation
         * in each run remove the first/front element and add it to the end
         *
         * Rotation rules -
         *  in this method if rotation value is higher than the size of the given list
         *      *  then, rotation will happen as follows:
         *      *  ( (rotation value) - (size of the list) )
         *      *  Example. if list size is 7 and rotation is 8, then actual rotation is (8-7) i.e 1
         */

        // create an ArrayList and add some values
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }

        // print list before rotation
        System.out.print("Before Rotation: ");
        printList(list);

        // indicate unit of rotation
        int rotation = 2;
        System.out.println("\nRotated by: " + rotation);

        // rotate the list then print it
        rotateList(list, rotation);
        System.out.print("After  Rotation: ");
        printList(list);


    } // main() ends here

    /**
     * method will rotate a given list by the given rotation value
     * @param list
     * @param rotation
     */
    public static void rotateList(List<Integer> list, int rotation){
        for (int i = 0; i < rotation; i++) {
            list.add(list.remove(0));
        }
    }

    /**
     * print a given list
     */
    public static void printList(List<Integer> list){
        System.out.print("[");
        for (Integer data:list) {
            System.out.print(data + ", ");
        }
        System.out.print("]");
    }

} // class RotateList ends here
