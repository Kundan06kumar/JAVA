int[] arr = {10,2,6,1,8};
int count = 0;

for(int i = 0; i < arr.length; i++)
{
    if(arr[i] % 2 == 0)
    {
        count++;
    }
}

System.out.println("Even count: " + count);
