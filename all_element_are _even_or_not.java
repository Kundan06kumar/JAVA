public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 7,10};
        boolean allEven = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                allEven=false;
              break;
            }
        }
      if(allEven){
                System.out.println("All number is even");
      }
      else{
        System.out.println("Not all number is even");
    }
  }
}
