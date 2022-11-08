import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1;
        int size1;
        int[] arr2;
        int size2;
        int[] arr3;
        int size3;

        System.out.println("Enter array 1 size:");
        size1 = sc.nextInt();
        System.out.println("Enter array 2 size:");
        size2 = sc.nextInt();

        arr1 = new int[size1];
        arr2 = new int[size2];

        System.out.println("Now enter the elements of array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the element " + (i + 1));
            arr1[i] = sc.nextInt();
        }

        System.out.println("Now enter the elements of array 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the element " + (i + 1));
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array 1 now:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Array 2 now:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        size3 = size1 + size2;
        arr3 = new int[size3];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[j];
            j++;
        }

        System.out.println("Array 3 when concatenating array 1 and array 2:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}