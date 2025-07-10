#include <stdio.h>

int main() {
    int number;
    char input[100];

    printf("数値を入力してください: ");
    fgets(input, sizeof(input), stdin);

    while (sscanf(input, "%d", &number) != 1) {
        printf("エラー: 数値を入力してください\n");
        printf("数値を再度入力してください: ");
        fgets(input, sizeof(input), stdin);
    }

    printf("入力された数値は %d です\n", number);

    return 0;
}
