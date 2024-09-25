#include <stdio.h>

int doModification(int num);
 int main(){

int num= 3;
num = doModification(num);
printf("%d \n",num);
}

int doModification(int num){
    num = num+1;
    return num;
}