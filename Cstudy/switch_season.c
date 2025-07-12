#include <stdio.h>

int main(void) {
    int month;
    int season = 0;

    printf("月（1〜12）を入力してください: ");
    if (scanf("%d", &month) != 1) {
        printf("入力エラー: 数値を入力してください。\n");
        return 1;
    }

    // 入力値の妥当性チェック
    if (month < 1 || month > 12) {
        printf("エラー: 月は1〜12の間で入力してください。\n");
        return 1;
    }

    // 季節コードの決定
    if (month >= 3 && month <= 5) {
        season = 1; // 春
    } else if (month >= 6 && month <= 8) {
        season = 2; // 夏
    } else if (month >= 9 && month <= 11) {
        season = 3; // 秋
    } else {
        season = 4; // 冬（1,2,12月）
    }

    // 季節の表示
    switch (season) {
        case 1:
            printf("季節: 春\n");
            break;
        case 2:
            printf("季節: 夏\n");
            break;
        case 3:
            printf("季節: 秋\n");
            break;
        case 4:
            printf("季節: 冬\n");
            break;
        default:
            printf("予期せぬエラーが発生しました。\n");
            break;
    }

    return 0;
}
