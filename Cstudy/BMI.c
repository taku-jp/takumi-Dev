#include<stdio.h>
#include<math.h>
int BMI_deta(float x,int y){
    float bmi;
   
  bmi= y/(x*x);
   printf("%.2f\n",bmi);
   if(x <0||y<0){
  printf("入力値エラー");
   }
   else if(bmi <18.5){
        printf("低体重");
    }
return bmi;
}

int main(void){
    float a;
    int b;
    //float Bmi;
    printf("身長(m)を入力してください");
    scanf("%f",&a);
     printf("体重(kg)を入力してください");
    scanf("%d",&b);
BMI_deta (a,b);
 /*Bmi =BMI_deta(a,b);
  printf("%.0f\n",Bmi);*/ 
   return 0;

}
