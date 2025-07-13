#include <stdio.h>

int main() {
    int i;
    for (i = 0x20; i <= 0x7F; i++) {
       printf("%02X: %c  ", i, i);

        if ((i - 0x1F) % 16 == 0) {
            printf("\n");
        }
    }
    return 0;
}
