public class BubbleSort {

    public static void main(String[] args) {
 
        int myArray[] = {39, 8, 25, 47, 56, 15, 94};
        bubbleSort(myArray);
        System.out.println("Sorted Array: ");
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
    }


    public static void bubbleSort(int[] myArray) {
      int l = myArray.length;

      for(int i=0; i<l-1; i++){
        for(int j=0; j<l-i-1; j++){
          if(myArray[j]>myArray[j+1]){
             int original= myArray[j];
             myArray[j] = myArray[j+1];
             myArray[j+1] = original;
          }
        }
      }
    }
}