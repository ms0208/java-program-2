# include<stdio.h>

int main()
{
    int n,remain,reverse = 0;
    printf("Enter a integer");
    scanf("%d",&n);
     
     while(n != 0){
        remain = n % 10;
       reverse = reverse * 10 + remain;
       n /=10;

     }
     printf("The reverse integer is %d", reverse);
     return 0;
}