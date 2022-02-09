import java.util.ArrayList;
import java.util.List;

public class RotateList {

    /**
     * Rotating an arrayList:
        * start a for loop and run it "n" number of times, where n = rotation
        * in each run remove the first/front element and add it to the end
     *
     * Rotating an array:
        * Array rotation is done, as it in each run it rotates values by 1
        * so if we want to rotate by 2 or 3 for example then it needs to run 2 or 3 times respectively and so on
     *
     * Rotation rules -
        * if rotation value is higher than the size of the given list
        *  then, rotation will happen as follows:
            *  ( (rotation value) - (size of the list) )
            *  Example. if list size is 7 and rotation is 8, then actual rotation is (8-7) i.e 1
     */

    /**
     * print a given list
     * @param list
     */
    public static void printList(List<Integer> list){
        System.out.print("[");
        for (Integer data:list) {
            System.out.print(data + ", ");
        }
        System.out.print("]");
    }

    /**
     * print a given array
     * @param data
     */
    public static void printArray(int[] data){
        for (int value:data) {
            System.out.print(value + ", ");
        }
    }

    /**
     * method will rotate a given list (ArrayList) by the given rotation value
     * @param list
     * @param rotation
     */
    public static void rotateList(List<Integer> list, int rotation){
        for (int i = 0; i < rotation; i++) {
            list.add(list.remove(0));
        }
    }


    /**
     * method to rotate a given array
     * rotateArray is working as it in each run it rotates values by 1
     * so if we want to rotate by 2 or 3 for example then it needs to run 2 or 3 times respectively and so on
     * @param data
     * @param rotation
     */
    public static void rotateArray(int[] data, int rotation){

        // rotation define number of times rotation should be done to reach the goal
        for (int i = 0; i < rotation; i++) {

            // rotate all element in the array by 1
            for (int j = 1; j < data.length; j++) {
                int temp1 = data[j-1];
                int temp2 = data[j];

                data[j-1] = temp2;
                data[j] = temp1;
            }
        }
    }

    public static void main(String[] args) {

        //***********************************************************//
        // Below code demonstrate how to rotate an arrayList

        // create an ArrayList and add some values
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9 ; i++) {
            list.add(i);
        }

        // print list before rotation
        System.out.print("arrayList Before Rotation: ");
        printList(list);

        // indicate unit of rotation, print it
        int rotation = 2;
        System.out.println("\nRotated by: " + rotation);

        // rotate the list then print it
        rotateList(list, rotation);
        System.out.print("arrayList After  Rotation: ");
        printList(list);
        // demonstration of rotating an ArrayList finish here
        //***********************************************************//

        System.out.println("\n"); // just to make printing nice

        //***********************************************************//
        // Below code demonstrate how to rotate an array
        // make an integer array
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // indicate rotation
        int rotationArray = 2;

        // print array before rotation
        System.out.print("Array before rotation: ");
        printArray(data);

        // print rotation value
        System.out.println("\nRotation: " + rotationArray);

        // rotate the array
        rotateArray(data, rotationArray);

        // print array after rotation
        System.out.print("Array  after rotation: ");
        printArray(data);
    } // main() ends here


} // class RotateList ends here
