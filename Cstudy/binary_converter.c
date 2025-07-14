#include <stdio.h>

void print_binary(int n) {
    for (int i = 7; i >= 0; i--) {
        printf("%d", (n >> i) & 1);
    }
}

int main() {
    int decimal;
    while (scanf("%d", &decimal) == 1 && decimal >= 0) {
        printf("%dの二進数は、", decimal);
        print_binary(decimal);
        printf("\n");
    }
    return 0;
}
