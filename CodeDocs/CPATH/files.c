#include <stdio.h>
int main() {
    FILE *file = fopen("example.txt", "w");
    if (file != NULL) {
        fprintf(file, "This is a test. Today it's Wednesday. \n");
        fclose(file);
    } else {
        printf("Error opening file!\n");
    }
    return 0;
}
