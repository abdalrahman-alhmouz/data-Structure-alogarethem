/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chaleng;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

        public static void main(String[] args) {
            int[] array={9,5,20,4,8,20,9};
            System.out.println(Arrays.toString(InsertionSort(array)));

        }

        public  static int[] InsertionSort(int[] arr){
            int n= arr.length,temp=0;
            int array[]=new int[arr.length];
            for(int i=0;i<n-1;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<=arr[min]){
                        min=j;
                        temp=arr[min];
                        arr[min]=arr[i];
                        arr[i]=temp;
                        array[i]=temp;
                        min=i;
                  }}}
             return arr ;
        }


}