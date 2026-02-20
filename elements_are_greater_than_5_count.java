public class Main{
  public static void main(String[] args){
    int[] arr ={1,3,4,6,7,8};
    int count=0;
    for (int i=0; i < arr.length; i++){
      if(arr[i]>5){
        count++;
      }
    }
    System.out.println("greater than 5 count : "+ count);
  }
}
