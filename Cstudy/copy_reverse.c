#include <stdio.h>
int main(void){
int i; //for文用のやつ

int a[4]={6,9,4,4}; //配列a
int b[4]; //配列b



for(i=0;i<4;i++){
printf("%d ",a[i]);
}

printf("\n\n"); //改行


for(i=0;i<4;i++){
b[i]=a[3-i];
}

printf("\n"); //改行


for(i=0;i<4;i++){
printf("%d ",b[i]);
}

printf("\n"); //改行
return(0);
}
