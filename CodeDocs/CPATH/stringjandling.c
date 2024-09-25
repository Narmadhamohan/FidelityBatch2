#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    // String Initialization
    char str1[] = "Hello, World!";
    char str2[50] = "Hello";
    char str3[] = " World!";
    
    // 1. String Length
    size_t len1 = strlen(str1);
    printf("Length of str1: %zu\n", len1);

    // 2. String Copying
    char copy[50];
    strcpy(copy, str1);
    printf("Copied string: %s\n", copy);

    // 3. String Concatenation
    strcat(str2, str3);
    printf("Concatenated string: %s\n", str2);

    // 4. String Comparison
    int result = strcmp(str1, str2);
    if (result < 0) {
        printf("'%s' is less than '%s'\n", str1, str2);
    } else if (result > 0) {
        printf("'%s' is greater than '%s'\n", str1, str2);
    } else {
        printf("'%s' is equal to '%s'\n", str1, str2);
    }

    // 5. String Tokenization to split the string 
    char str4[] = "Hello, World, C, Programming";
    char *token = strtok(str4, ", ");
    printf("Tokens:\n");
    while (token != NULL) {
        printf("%s\n", token);
        token = strtok(NULL, ", ");
    }

    // 6. String to Number Conversion
    char str5[] = "1234";
    char str6[] = "3.14";
    int num = atoi(str5);
    double pi = atof(str6);
    printf("Integer value: %d\n", num);
    printf("Floating-point value: %.2f\n", pi);

    // 7. Safe String Handling (Avoiding Buffer Overflow)
    char safeCopy[20];
    strncpy(safeCopy, str1, sizeof(safeCopy) - 1);
    safeCopy[sizeof(safeCopy) - 1] = '\0'; // Ensure null termination
    printf("Safe copied string: %s\n", safeCopy);

    return 0;
}
