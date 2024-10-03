
import java.util.Arrays;


    public class Main {

        public static void main(String[] args) {
            Array items = new Array(5);

            int[] testArray = {5,8,9,2,5};

            System.out.println("Inserting Items in Array");
            items.insert(testArray);
            items.print();
            
            System.out.println("Min Items in Array");
            System.out.println(items.min());

            System.out.println("Max Items in Array");
            System.out.println(items.max());

            System.out.println("Sum of Items in Array");
            System.out.println(items.sum());

            System.out.println("Product of Items in Array");
            System.out.println(items.product());

            System.out.println("Average of Items in Array");
            System.out.println(items.average());

            System.out.println("Odd Items in Array");
            int[] oddNumbers = items.odd();
            for (int i = 0; i < oddNumbers.length; i++) {
                System.out.print(i == oddNumbers.length - 1 ? oddNumbers[i] + "\n" : oddNumbers[i] + ", ");
            }

            System.out.println("Reverse Items in Array");
            int[] reversedArray = items.reverse();
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.print(i == reversedArray.length - 1 ? reversedArray[i] + "\n" : reversedArray[i] + ", ");
            }

            System.out.println("Even Items in Array");
            int[] evenNumbers = items.even();
            for (int i = 0; i < evenNumbers.length; i++) {
                System.out.print(i == evenNumbers.length - 1 ? evenNumbers[i] + "\n" : evenNumbers[i] + ", ");
            }

            System.out.println("Remove Items in Array");
            items.removeItem(1);
            items.print();
            
            System.out.println("Finding Indexed Items in Array");
            System.out.println(items.indexOf(4));

            System.out.println("Replace Item in Array");
            items.replace(0, 3);
            items.print();

        }
    }
