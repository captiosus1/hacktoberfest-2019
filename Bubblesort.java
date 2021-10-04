import java.util.Scanner;
import java.util.Random;
public class Bubblesort{
    public static void main(String [] args){
        Random rd = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the lower limit of your array");
        int min = sc.nextInt();
        System.out.println("enter the highest limit of your arrray");
        int max = sc.nextInt();
        int[] a = new int[151515];
        int[] b = new int[151515];
        int[] c = new int[151515];
        for (int i = 0; i < c.length; i++){
        c[i] = min + rd.nextInt(max-min);
        }
        sc.close();
        long startc = System.nanoTime();
        bubble(c);
        long endc = System.nanoTime();
        long elapsedTimec = endc - startc;
        for(int i=0;i<c.length;i++){
            a[i]=c[i];
            b[c.length-i-1]=c[i];
        }
        long starta = System.nanoTime();
        bubble(a);
        long enda = System.nanoTime();
        long elapsedTimea = enda - starta;
        long startb = System.nanoTime();
        bubble(b);
        long endb = System.nanoTime();
        long elapsedTimeb = endb - startb;
        System.out.println("the time taken in ascending bubble sort is   "+elapsedTimea/1000+" micro seconds");
        System.out.println("the time taken in descending bubble sort is  "+elapsedTimeb/1000+" micro seconds");
        System.out.println("the time taken in random bubble sort is      "+elapsedTimec/1000+" micro seconds");

    }

    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                int a;
                a =arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = a;
                }
            }
        }
    }
}
