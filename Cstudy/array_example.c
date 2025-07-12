#include <stdio.h>

int i;
int array[10];
int sum;

int main(void) {

    // 配列の初期化
    for (i = 0; i < sizeof(array) / sizeof(array[0]); i++) {
        array[i] = i * 10;
    }

    // 逆順に出力
    for (i = 9; i >= 0; i--) {
        printf("array[%d] = %d\n", i, array[i]);
    }

    // 合計計算
    for (i = 0; i < sizeof(array) / sizeof(array[0]); i++) {
        sum += array[i];
    }

    printf("合計は、%d\n", sum);

    return 0;
}
