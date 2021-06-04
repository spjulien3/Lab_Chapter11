package program3;

import java.util.ArrayList;
import java.util.Random;

public class TestArrayListFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            intArray.add(rand.nextInt(100));
        }

        ArrayList<Integer> intArray2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArray2.add(rand.nextInt(100));
        }
        System.out.println(intArray);
        ArrayListFunctions.mergeArrayList(intArray,intArray2);

        System.out.println("Max: "+ArrayListFunctions.maxInArrayList(intArray));
        System.out.println("Sum: "+ArrayListFunctions.sumOfArrayList(intArray));
    /**[4, 43, 56, 13, 26, 67, 55, 93, 57, 25]
     [4, 43, 56, 13, 26, 67, 55, 93, 57, 25, 79, 20, 51, 98, 28, 63, 21, 74, 65, 82]
     Max: 98
     Sum: 1020**/

    }
}
