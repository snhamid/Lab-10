mport static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort{
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 6;
        arr[1] = 9;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 1;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 6;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 12;

        SelectionSort sortArray = new SelectionSort();
        sortArray.basicSelectionSort(arr);
        System.out.print("Testing POSITIVE values: ");
        checkSort(arr,Sortedarr);
        printArray(arr,Sortedarr);

        /** add tests to check for this unit test **/
    }

    public void testNegative(){
    	int[] arr = new int[5];
    	  arr[0] = -3;
        arr[1] = -6;
        arr[2] = -9;
        arr[3] = -4;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -6;
        Sortedarr[2] = -4;
        Sortedarr[3] = -3;
        Sortedarr[4] = -2;

        SelectionSort sortArray = new SelectionSort();
        sortArray.basicSelectionSort(arr);
        System.out.print("Testing NEGATIVE values: ");
        checkSort(arr,Sortedarr);
        printArray(arr,Sortedarr);
        /** Test data contains negative values only **/
    }

    public void testMixed(){
    	int[] arr = new int[5];
    	arr[0] = -4;
        arr[1] = -6;
        arr[2] = -10;
        arr[3] = 3;
        arr[4] = 10;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -6;
        Sortedarr[2] = -4;
        Sortedarr[3] = 3;
        Sortedarr[4] = 10;

        SelectionSort sortArray = new SelectionSort();
        sortArray.basicSelectionSort(arr);
        System.out.print("Testing MIXED values: ");
        checkSort(arr,Sortedarr);
        printArray(arr,Sortedarr);
        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
    	arr[0] = -9;
        arr[1] = 6;
        arr[2] = -4;
        arr[3] = 6;
        arr[4] = -11;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -11;
        Sortedarr[1] = -9;
        Sortedarr[2] = -4;
        Sortedarr[3] = 6;
        Sortedarr[4] = 6;

        SelectionSort sortArray = new SelectionSort();
        sortArray.basicSelectionSort(arr);
        System.out.print("Testing DUPLICATE values: ");
        checkSort(arr,Sortedarr);
        printArray(arr,Sortedarr);

        /** Test data contains duplicates **/
    }

    public boolean checkSort(int[] firstArray, int[] secondArray) {

    	for(int i = 0; i < secondArray.length; i++) {
    		if(firstArray[i] != secondArray[i]) {

    			System.out.println("Test case failed, arrays are different!");
    			return false;
    		}
    	}
    	System.out.println("Test case passed, arrays are the same!");
    	return true;
    }

    public void printArray(int[] firstArray, int[] secondArray) {

    	for(int i = 0; i < firstArray.length; i++) {
    		System.out.print(firstArray[i] + ",");
    	}
    	System.out.println();

    	for(int i = 0; i < firstArray.length; i++) {
    		System.out.print(secondArray[i] + ",");
    	}
    	System.out.println();
    }
}
