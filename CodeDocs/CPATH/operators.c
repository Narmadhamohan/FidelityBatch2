    #include <stdio.h>
    #include <string.h>

    int main() {
        int sum,sub,div,mul,rem;
        int a=10;
        int total,result;
 


        sum= 2+2;
        sub= 2-2;
        div= 2/2;
        mul= 2*2;
        rem= 8%3;
    
        printf("sum %d\n",sum);  
        printf("sub %d\n",sub);  
        printf("div %d\n",div);  
        printf("mul %d\n",mul);  
        printf("remainder %d\n\n",rem);    
        
        a += 5;  //a=a+5
        printf("a %d\n\n",a);  


       int total = (10 + 5) * 3;//precedence
        int result = 10 + 2 * 3;
	printf("total  %d\n",total);  
        printf("result  %d\n",result );  
    }
