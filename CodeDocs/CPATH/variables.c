#include <stdio.h>
#include <stdbool.h>


int main(){

    unsigned int player_age = 25;           // Unsigned int for player's age
    int player_score = 3500;       // Unsigned int for player's score
    signed int deduction = -20;
    short player_rank = 5;                  // Short for player’s rank (small range)

   

printf("Player_age: %u \n", player_age);
printf("player_score: %d \n", player_score);
printf("deduction: %d \n", deduction);
printf("player_rank: %d \n", player_rank);

    float player_height = 6.2f;              // Float to hold the player's height in feet
    double player_innings = 6.213; 
    printf("Player Height : %.5f \n", player_height);
    printf("Player Innings: %lf\n", player_innings);    

char player_initial = 'J';              // Char for player's initial
char player_name[50] = "Shantanu";      // String to hold the player's name

    printf("Player Initial: %c\n", player_initial);
    printf("Player Name: %s\n", player_name);

    const int MAX_LIMIT = 10;
    printf("Player MAX_LIMIT: %d\n", MAX_LIMIT);

    bool is_active = true;                  // Boolean type for player's active status (true/false)
    printf("Is Player Active: %s\n", is_active ? "Yes" : "No");


return 0;

}
