/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort1;

/**
 *
 * @author Teuku Ade
 */
public class Bubblesort1 {

    /**
     * @param args the command line arguments
     */
 
        void bubbleSort(int arr[])
{
int n = arr.length;
for (int i = 0; i < n-1; i++)
for (int j = 0; j < n-i-1; j++)
if (arr[j] > arr[j+1])
{
// swap arr[j+1] and arr[i]
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
/* Prints the array */
void printArray(int arr[])
{
int n = arr.length;
for (int i=0; i<n; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
// Driver method to test above
public static void main(String args[])
{
BubbleSort ob = new BubbleSort();
int arr[] = {5, 3, 1, 9, 8, 2, 4, 7};
ob.bubbleSort(arr);
System.out.println("Sorted array");
ob.printArray(arr);
}
}
   