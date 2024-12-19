#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main() {
    int pid1, pid2, pid3;

    pid1 = fork();
    // il codice del primo figlio parte da qua
    // anche il primo figlio genera dei figli
    pid2 = fork();
    pid3 = fork();

    // questo codice è eseguito da tutti i processi
    if ((pid1 == 0) || (pid2 == 0) || (pid3 == 0)) {
        printf("Sono il processo figlio con pid: %d\n", getpid());
        printf("Il mio papi ha il pid: %d\n", getpid());
        sleep(1);
        exit(1);
    }else{
        printf("Sono il processo padre con pid %d \n", getpid());
        sleep(2);
    }
}

