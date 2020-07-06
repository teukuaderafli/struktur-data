/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bublesort2;

/**
 *
 * @author Teuku Ade
 */
public class Bublesort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] ={5, 3, 1, 9, 8, 2, 4, 7};
System.out.println("---Array BEFORE Bubble Sort---");
printArray(arr);
BubbleSortDetail(arr);//sorting array elements using bubble sort
System.out.println("---Array AFTER Bubble Sort---");
printArray(arr);
}
static void BubbleSortDetail(int[] array){
int n = array.length;
int temp = 0;
for(int i=0; i < n; i++) // Looping through the array length
{ System.out.println("Sort yang ke "+(i+1));
for(int j=1; j < (n-i); j++){
System.out.println("Bandingkan "+ array[j-1]+ " dan " + array[j]);
if(array[j-1] > array[j]){
//swap elements
temp = array[j-1];
array[j-1] = array[j];
array[j] = temp;
System.out.println(array[j] + " lebih besar dari pada " + array[j-1]);
System.out.println("Tukar elemen: Array baru setelah tukar");
printArray(array);
}
}
}
}
static void printArray(int[] array){
for(int i=0; i < array.length; i++){
System.out.print(array[i] + " ");
}
System.out.println();
}
}
  