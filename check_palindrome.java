public static void main(String[] args) {
        System.out.println("Enter the number: ");
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int original = num;
         int reverse =0;
         
         while(num!=0){
             int digit=num%10;
             reverse = reverse*10 + digit;
             num = num/10;
         }
         if(original==reverse){
             System.out.println("the number is palindrome");
         }
         else{
             System.out.println("the number is not palindrome");
         }
    }
}
