#include <stdio.h>

int main() {
    int a,b;
    a=10;
    b=9;
    
    printf("a%d\n",a);
    if (a>10)
    {
        printf("a is greater");
    }
    else
    {
        printf("a is not greater");
    }

     if ((a>=10) && (b>=9))
    {
        printf("a,b is greater");
    }
    else
    {
        printf("a,b is not greater");
    }
    return 0;
}
