#include <stdio.h>

int main() {
    int i,j;
    for (i=0;i<=5;i++)
    {
        printf("i %d\n",i);
    }
    printf("do while\n");
    do
    {
      printf("i %d\n",i);
      i=i-1;
    } while (i>0);

    printf("while\n");
    while (i<=5)
    {
      printf("i %d\n",i);
      i=i+1;
    }
    printf("break\n");
    for (j=0;j<=5;j++)
    {
        printf("j %d\n",j);
        if (j==3)
        {
            break;
        }
        
    }   
    printf("continue\n");
    for (j=0;j<=5;j++)
    {
        
        if (j==3)
        {
            continue;
        }
        printf("j %d\n",j);
    }   
    
}
