#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

// Ex 1/2:
void faiFiglio() {
    pid_t pid = fork();

    if (pid < 0) {
        // Errore nella creazione del processo figlio
        perror("Errore nella fork");
        exit(1);
    } else if (pid == 0) {
        // Questo è il codice eseguito dal figlio 
        printf("Processo figlio: PID = %d, PPID = %d\n", getpid(), getppid());
        exit(0);  // Terminazione del figlio
    }
    // Il padre non fa nulla qui
}

int main() {
    int n;

    // Chiede all'utente il numero di figli da creare
    printf("Inserisci il numero di processi figli da generare: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        faiFiglio();
    }

    // Il padre attende la terminazione dei figli
    for (int i = 0; i < n; i++) {
        wait(NULL);
    }

    printf("Tutti i processi figli sono terminati.\n");
    return 0;
}


// Ex 3: ciò che succede se si rimuovere exit(0), i figli continuerano ad eseguire il codice all'infinito probabilmente
