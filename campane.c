#include <pthread.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
 
void* thread1(void* arg) {
    sleep(rand()%2);
    printf("DIN");
    return NULL;
}

void* thread2 (void* arg) {
    sleep(rand()%3);
    printf("DON");
    return NULL;

}

void* thread3 (void* arg) {
    sleep(rand()%4);
    printf("DAN");
    return NULL;

}

int main() {
    pthread_t myThread1, myThread2, myThread3;
    
    pthread_create(&myThread1, NULL, &thread1, NULL);
    pthread_create(&myThread2, NULL, &thread2, NULL);
    pthread_create(&myThread3, NULL, &thread3, NULL);

    sleep(5);
}