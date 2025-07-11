#include <stdio.h>
#include <string.h>

struct person_ {
    char name[30];
    int age;
    int height;
};

void PrintPerson(struct person_ *p) {
    printf("名前: %s\n", p->name);
    printf("年齢: %d\n", p->age);
    printf("身長: %dcm\n", p->height);
}

int main(void) {
    struct person_ pers1;
    struct person_ *p_pers1 = &pers1;

    printf("name: ");
    scanf("%29s", p_pers1->name);  // 文字列バッファオーバーフロー対策

    printf("age: ");
    scanf("%d", &p_pers1->age);

    printf("height: ");
    scanf("%d", &p_pers1->height);

    printf("\n--- 入力された情報 ---\n");
    PrintPerson(p_pers1);

    return 0;
}
