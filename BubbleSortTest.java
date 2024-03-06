public class BubbleSortTest {

    public static void main(String[] args) {
        //BubbleSort arr = new BubbleSort();
        int myArray[] = {39, 8, 25, 47, 56, 15, 94};
        bubbleSort(myArray);
        //arr.bubbleSort(myArray);
        System.out.println("Sorted Array: ");
        //arr.print
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
    }
}