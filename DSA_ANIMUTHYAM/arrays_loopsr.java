package DSA_ANIMUTHYAM;

public class arrays_loopsr {
    public static void main(String[] args) {
        // int arr[] = {1,2,4,1,7,3,1};

        // int count = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] ==1)
        //     {
        //         count++;//count =count +1
        //     }
        // }
        // System.out.println(count);


            int arry[] ={ 2, 4, 6,14, 9, 3, 15,27};
            int count =0;
            for(int i=0;i<arry.length;i++)
            {
                int temp = arry[i];
                if(temp % 2 ==0 || temp % 3 ==0)
                {
                    count++;
                }
            }
            System.out.println(count);



// or - ||
// and - &&
    int arrys[] ={ 2, 4, 6,14, 9, 3, 15,27};
            int counts =0;
            for(int i=0;i<arry.length;i++)
            {
                int temp = arry[i];
                if(temp % 2 ==0 && temp % 3 ==0)
                {
                    counts++;
                }
            }
            System.out.println(counts);









    }
}
