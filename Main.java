// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //1

   int [] numbers1 = {50,-20,0,30,40,60,10};
            if (numbers1[0] == numbers1[numbers1.length-1]){
                System.out.println(true);
        }
            else System.out.println(false);


   //2

   int [] original = {1,4,17,7,25,3,100};
   double sum = 0;
   int count = original.length;
   double average =0;
   int num;
        ArrayList greater = new ArrayList();
        for (int j : original) {
            sum += j;
        }
        average = (int) sum/count;
        for (int i : original) {
            if (i > average) {
                num = i;
                greater.add(num);
            }
        }
        System.out.println("The average of the said array is : "+average+
                        " The numbers in the said array that are greater than the average are "+ greater);


   //3

   int [] arr1 = {20,30,40};
                if (arr1[arr1.length-1] > arr1[0]){
                System.out.println("Larger value between first and last element "+ arr1[arr1.length-1]);
            }
            else if(arr1[0] > arr1[arr1.length-1]){
                    System.out.println("Larger value between first and last element "+ arr1[0]);
                }




   //4

   int[] arr2 = {20,30,40};
   int temp;
   ArrayList arl = new ArrayList();
        for (int i = 0; i < arr2.length; i++) {
            if (i == 0) {
                temp = arr2[arr2.length-1];
                arl.add(temp);
                continue;
            }
            else if ( i == arr2.length-1) {
                temp = arr2[0];
                arl.add(temp);
                break;
            }
            arl.add(arr2[i]);
        }
        System.out.println("New array after swapping the first and last elements: "+arl);



   //5

   int[] arr3 = {2,3,40,1,5,9,4,10,7};
   int i=0;

    for (int j =i+1 ; j <= arr3.length-1; j++){

        if (arr3[j]%2 != 0){
            int temp1 = arr3[i];
            arr3[i]  =arr3[j];
            arr3[j] =temp1;
            i++;
    }
    }
        System.out.println(Arrays.toString(arr3));


    //6

    int[] arr01 = {2,3,6,6,4};
    int[] arr02 = {2,3,6,6,4};
        System.out.println("Is array 1 equal to array 2? "+(Arrays.equals(arr01,arr02)));










    }
}
