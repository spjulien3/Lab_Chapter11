package program3;

import java.util.ArrayList;

public class ArrayListFunctions {
    public static int maxInArrayList(ArrayList<Integer> arrayInt) {
        int maxIndex = 0;
        int maxTotal = 0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < arrayInt.size(); i++) {
                if (arrayInt.get(i) >= maxTotal) {
                    maxIndex = i;
                    maxTotal = arrayInt.get(i);
                }
            }
        }
        return arrayInt.get(maxIndex);
    }

    public static int sumOfArrayList(ArrayList<Integer> arrayInt) {
        int total = 0;
        for (int i = 0; i < arrayInt.size(); i++) {
            total += arrayInt.get(i);
        }
        return total;
    }
    
    public static void mergeArrayList(ArrayList<Integer>array1,ArrayList<Integer>array2){
        for (int i = 0; i < array2.size(); i++) {
            array1.add(array2.get(i));
        }

            System.out.println(array1);


        
    }

}

