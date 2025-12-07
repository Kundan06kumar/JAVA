 //    *
 //   * *
 //  *   *
 // *     *
 //  *   *
 //   * *
 //    *
int n = 5;

// upper hollow pyramid
for(int i=1;i<=n;i++){
    for(int s=1;s<=n-i;s++)
        System.out.print(" ");

    for(int j=1;j<=2*i-1;j++){
        if(j==1 || j==2*i-1)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}

// lower hollow pyramid
for(int i=n-1;i>=1;i--){
    for(int s=1;s<=n-i;s++)
        System.out.print(" ");

    for(int j=1;j<=2*i-1;j++){
        if(j==1 || j==2*i-1)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}
