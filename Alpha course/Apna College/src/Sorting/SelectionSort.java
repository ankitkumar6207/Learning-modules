package Sorting;

public class SelectionSort {


    public static void selectionSort(int arr[],int n)
    {
        for(int i =0;i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

    }

    // Function to print an array
	static void printArray(int arr[], int size)
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		selectionSort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
    
}
