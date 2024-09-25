#include <stdio.h>

int main() {
    int a[3][3]={{11,12,13},{21,22,23},{31,32,33}};
    int i,j;
    printf("a[0,0] %d\n",a[0][0]);
    printf("a[1,1] %d\n",a[1][1]);
    printf("a[2,2] %d\n",a[2][2]);
      printf("\n\n");
    for (i=0;i<=2;i++)
    {
        for (j=0;j<=2;j++)
        {
            printf("%d  ",a[i][j]);
        }
     printf("\n");
    }

}
