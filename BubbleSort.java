package training;
import java.util.*; //declaracion de la libreria para utilizar numeros random
public class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
               /* if (arreglo[j] > arreglo[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }*/
    }
 
    //imprime el arreglo 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
            //System.out.print(arreglo[i] + " ");
        System.out.println();
    }
    /*void random(){
        Random r = new Random();
        int n1 = r.nextInt(25)*1;
        System.out.println(n1);
    }*/
 
    // Metodo para correr la prueba 
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
       // int arreglo[] ={n1};
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        //ob.bubbleSort(arreglo);
        System.out.println("Arreglo ordenado");
        ob.printArray(arr);
        //ob.printArray(arreglo);
    }
}