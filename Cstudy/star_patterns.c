#include <stdio.h>

int main(void) {

  /* 変数を定義する */
  int height =5;
  int  width;
  int max_width;
  int space;
  int i;
  int j;

  max_width = (height - 1) * 2 + 1;

  for(i =0; i<height;i++){
    //*表示
    for (j = 0; j < i+1; j++)
    {
   printf("*");
    }
    printf("\n");

  }
printf("\n");
  for(i =5; i>=1;i--){
   //*表示
    for (j = 1; j <= i; j++)
    {
   printf("*");
    }
    printf("\n");

  }
  printf("\n");
  for(i =5; i>=1;i--){
    //空白
  for(j =0; j<height-(i+0);j++){
    printf(" ");
  }
   //*表示
    for (j = 1; j <= i; j++)
    {
   printf("*");
    }
    printf("\n");

  }
 
printf("\n");
  /* アスタリスクでピラミッドを描画する */
  for( i=0; i<height; i++){
    width = i * 2 + 1;
    space = (max_width - width) / 2;
    //空白
    for( j=0; j<space; j++){
      printf(" ");
    }
     //*表示
    for( j=0; j<width; j++){
      printf("*");
    }
    printf("\n");
  }

  return 0;
}
