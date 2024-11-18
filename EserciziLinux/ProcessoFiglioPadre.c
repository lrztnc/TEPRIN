#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main () {
    int pid;
    printf("1. Prima della fork \n");
    pid = fork();
    printf("2. Dopo la fork \n");
    if (pid == 0) {
        printf("3. Sono il processo figlio \n");
        exit(1);
    }else{
        printf("4. Sono il processo padre \n");
        exit(0);
    }
}