//Kushagra Kurl
//A00246944
//MAPD: MOBILE APPLICATION DEVELOPMENT - fall 2021
//This is JAV-1001 - 91349 - App Development for Android - 202109 - 001 lab 2 - Arrays and Methods

import java.util.Scanner;

class ArrayTools
{
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
		System.out.println(26%6);
        return result;
    }

    public static int printArr(int[] arr) {
      for(int i=0; i<arr.length; i++)
        System.out.print(arr[i] + "   ");
        return 0;
    }

    public static boolean isArrayElement(int[] array, int searchVal){
      for(int i=0; i<array.length; i++) {
        if(array[i] == searchVal) {
          return true;
        }
      }
      return false;
    }

    public static void reverseArr(int[] a, int n) {
      int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        //enter array lenght and its elements
        System.out.print("Enter the number of elements you want to store in Array: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<array.length; i++)
          array[i]=sc.nextInt();

        //to find average of array elements
        double avg = 0;
        for(int i=0; i<array.length; i++) {
          avg += array[i];
        }
        avg = avg/array.length;
        System.out.println("Average of array elements is: " + avg);

        //to find if user input is present in array or not
        System.out.println("Enter integer value you want to search in array");
        int searchVal = sc.nextInt();
        if(isArrayElement(array, searchVal))
          System.out.println(searchVal + " exits in the array!");
        else
          System.out.println("Array does not contains: " + searchVal);

        reverseArr(array, n);

        //to find encrypted string using cipher encrypt method
        System.out.println("Enter the string you want to encrypt: ");
        String text = sc.next();
        System.out.println("Original Text is : " + text);
        System.out.println("Enter the value by which you want to encrypt with: ");
        int s  = sc.nextInt();
        System.out.println("Cipher text is: " + encrypt(text, s));
    }
}
