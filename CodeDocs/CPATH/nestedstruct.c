
#include<stdio.h>

struct Address {
    char street[50];
    char city[30];
    int zip;
};

struct Employee{
    char name[50];
    int id;
    struct Address address;
};


int main(){

    struct Employee emp;

    printf("Enter employee name: ");
    //scanf("%s", emp.name);
    //strcpy(emp.name, "Dijo");
    emp.address.zip = 5;
    printf("The zip code is: %d\n", emp.address.zip);

    return 0;
}