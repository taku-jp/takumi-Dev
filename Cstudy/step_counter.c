#include<stdio.h>

int main(){
   double x;
   double y;
   double xm;
   double ym;
   double nos;
   int goal;
   int rem;
    printf("歩幅(cm)を入力: ");
    scanf("%lf", &x);
    printf("距離(km)を入力: ");
    scanf("%lf", &y);
    printf("目標を入力");
    scanf("%d",&goal);
    xm = 0.01 * x;
    ym = 1000.0 * y;
    nos = ym / xm;
    printf("歩数は約 %.0lf です。\n", nos);
    if(nos >= goal){
        printf("目標達成");
    }
    else{
            rem =goal-nos;
            printf("目標であと%d歩",rem);
    }
    return 0;
