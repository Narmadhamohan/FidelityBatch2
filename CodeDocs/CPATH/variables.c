#include<stdio.h>
#include<stdlib.h>

int main(){

        int sum,sub,div,mul,rem;
        int num1 = 10;
        int num2= 20;
        int a =0;
        sub = num2-num1;
        mul = num2*num1;
        div = num2/num1;
        rem = num2%num1;

        //printf("Addition of two numbers: %d", sum);
        //printf("Sub of two numbers: %d", sub);
        printf("mul of two numbers: %d \n", mul);
        printf("div of two numbers: %d \n", div);
        printf("rem of two numbers: %d \n", rem);


        a += 5;  //a=a+5
        printf("a %d\n\n",a);  


       int total = (10 + 5) * 3;//precedence
        int result = 10 + 2 * 3;
	printf("total  %d\n",total);  
        printf("result  %d\n",result );  


}
