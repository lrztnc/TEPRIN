#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main() {
    int pid1, pid2, pid3;
    pid1 = fork();

    if (pid1 == 0) {
        printf("1. Sono il figlio PID: %i \n", getpid());
        exit(1);
    }else{
        printf("2. Sono il processo padre\n");
        printf("2. Ho creato un processo PID: %d\n", pid1);
        printf("3. Il mio PID è invece: %i\n", getpid());
        pid2 = fork();  

        if (pid2 == 0) {
            printf("5. Sono il figlio PID: %i\n", getpid());
            exit(2);
        }else{
            printf("4. Sono il processo padre\n");
            printf("5. Ho creato il il filgio PID: %i\n", pid2);
        }
    }
}