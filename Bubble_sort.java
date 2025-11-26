import java.util.Scanner;
class Program{
  public static void printArray(int arr[])
  {
    for(int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i]+ " ");
      }
    System.out.println();
  }
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    //taking array size 
  System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    //taking array elements from user
  System.out.println("Enter " + n + " elements");
    for(int i = 0; i < n ; i++)
      {
        arr[i] = sc.nextInt();
      }
    //Bubble sort
  for (int i = 0; i<arr.length-1; i++)
    {
      for (int j = 0; j< arr.length-i-1; j++)
        {
          if(arr[j] > arr[j+1])
          {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
    }
    System.out.println("Sorted array: ");
    printArray(arr);
  }
}

            
