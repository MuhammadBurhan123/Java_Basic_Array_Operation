import java.util.Arrays;

public class Array {
    private int[] items;

    public Array(int length) {
        items = new int[length];
    }

    /**
     * Prints all elements in the array.
     *
     */
    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(i == items.length - 1 ? items[i] + "\n" : items[i] + ", ");
        }
    }

    /**
     * Prints all elements in the array using a for-each loop.
     *
     */
    public void printForEach() {
        for (int item : items) {
            System.out.println(item);
        }
    }

   /**
     * Getting minimum number from an array.
     *
     */
    public int min() {
        int minNumber = items[0];
        for (int i = 0; i < items.length && i < items.length; i++) {
            if (items[i] < minNumber) {
                minNumber = items[i];
            }
        }
        return minNumber;
    }

    /**
     * Getting maximum number from an array
     *
     */
    public int max(){
        int maxNumber = items[0];
        for(int i = 0; i < items.length; i++){
            if(items[i] > maxNumber) {
                maxNumber = items[i];
            }
        }
        return maxNumber;
    }

    /**
     * Getting sum of an array
     *
     */
    public int sum(){
        int sumNumber = 0;
        for(int i = 0; i < items.length; i++){
            sumNumber += items[i];
        }
        return sumNumber;
    }

    /**
     * Getting product of an array
     *
     */
    public int product(){
        int productNumber = 1;
        for(int i = 0; i < items.length; i++){
            productNumber *= items[i];
        }
        return productNumber;
    }

    /**
    * Getting average number from array.
    * 
    */
    public int average(){
        return sum() / items.length;
    }

    /**
    * Getting odd number from array.
    * 
    */
    public int[] odd() {
        int oddNumberCount = 0;
        for (int item : items) {
            if (item % 2 != 0) {
                oddNumberCount++;
            }
        }

        int[] oddNumbers = new int[oddNumberCount];
        int oddIndex = 0;

        for (int item: items) {
            if (item % 2 != 0) {
                oddNumbers[oddIndex++] = item;
            }
        }

        return oddNumbers;
    }
    
      /**
    * Getting even number from array.
    * 
    */
    public int[] even() {
        int evenNumberCount = 0;
        for (int item : items) {
            if (item % 2 == 0) {
                evenNumberCount++;
            }
        }

        int[] evenNumbers = new int[evenNumberCount];
        int evenIndex = 0;

        for (int item: items) {
            if (item % 2 == 0) {
                evenNumbers[evenIndex++] = item;
            }
        }

        return evenNumbers;
    }

    /**
     * For reversing an array.
     */
    public int[] reverse(){
       int[] reversedArray = items;
       
       int start = 0;
       int end = reversedArray.length - 1;

       for (int i = start; i < end; i++) {
         int temp = reversedArray[i];
         reversedArray[i] = reversedArray[end];
         reversedArray[end] = temp;
         start++;
         end--;
       }

       return reversedArray;
    }

    /**
     * Inserts all elements from the given param array.
     *
     */
    public void insert(int[] itemParams) {
        for (int i = 0; i < items.length && i < itemParams.length; i++) {
            items[i] = itemParams[i];
        }
    }

    /**
     * Removes the element at the given index from the array.
     *
     */
    public void removeItem(int removingIndex) {
        for (int i = removingIndex; i < items.length - 1; i++) {
            items[i] = items[i + 1];
        }
        items = Arrays.copyOfRange(items, 0, items.length-1);
    }

    /**
     * Returns the item of param index in the array.
     *
     */
    public int indexOf(int index) {
        return index < items.length ? items[index] : -1;
    }

    /**
     * Replaces the item at the param index in the array with the given value.
     *
     */
    public void replace(int index, int value) {
        if (index < items.length) {
            items[index] = value;
        }
    }
}
