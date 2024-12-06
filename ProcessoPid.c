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
        printf("3. Sono il processo figlio, con pid %d\n", getpid());
        printf("\n Il mio papi ha pid %d \n", getppid());
        exit(1);
    }else{
        printf("4. Sono il processo padre, con il pid %d \n", getpid());
        printf("Il mio papi ha pid %d \n", getppid());
        exit(0);
    }
}