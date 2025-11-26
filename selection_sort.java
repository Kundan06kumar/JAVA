import java.util.Scanner;
class Program{
  public static void printArray(int arr[])
    {
    for (int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
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
    //taking arrray elements from user
    System.out.println("Enter " + n + "elements");
    for(int i = 0; i < n; i++)
      {
        arr[i]=sc.nextInt();
      }
    //selection sort
for (int i = 0; i < arr.length; i++)
  {
    int smallest=i;
    for(int j = i+1; j < arr.length; j++)
      {
        if(arr[smallest] > arr[j])
        {
          smallest = j;
        }
      }
    int temp = arr [smallest];
    arr[smallest] = arr [i];
    arr[i] = temp;
  }
    System.out.println("Sorted Array:");
      printArray(arr);
  }
}
