import java.util.Scanner;
class Program{
  public static void printArray(int arr[])
  {
    for(int i=0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
    System.out.println();
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    //taking array size
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    //taking array elements from user
    System.out.println("Enter" + n + "Elements:");
    for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
    //insertion sort
    for(int i = 1; i < arr.length; i++)
      {
        int current = arr[i];
        int j = i-1;

        while(j>=0 && current<arr[j])
          {
            arr[j+1] = arr[j];
            j--;
          }
        arr[j+1]=current;
      }
    System.out.println("Sorted Array:");
    printArray(arr);
    sc.close();
  }
}
    
