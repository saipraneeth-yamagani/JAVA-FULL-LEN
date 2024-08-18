#include <stdio.h>

int main() {
    int n, i , num;

    for(i =0;i<n;i++)
    {
        printf("enter integers %d : ", i+1);
        scanf("%d", &num);

        if(num %2==0)
        {
            printf("%d is even /n",num);
        }else{
            printf("%d is odd/n", num);
        }
    }
}
