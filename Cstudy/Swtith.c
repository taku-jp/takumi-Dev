#include <stdio.h>

int x;
int rank;

int main(void){
/*
入力された点数に応じてランクを判定する
1: Rank A（80～99）
2: Rank B（60～79）
3: Rank C（50～59）
4: 判定エラー（0未満または101以上）
5: Rank 1st（100点）
その他: ランク外（0～49）
*/
 printf("キーボードから入力\n");
    scanf("%d",&x);
    if (x >=101 ||x <0)
    {
       rank =4;
    }
    else if (x == 100)
    {
          rank = 5;
    }
    else if (x >= 80)
    {
      rank = 1;
    }
    else if (x >= 60 && x <80)
    {
      rank = 2;
    }
    else if (x >= 50 && x <= 59)
    {
      rank = 3;
    }
    switch (rank)
    {
    case 1:
        printf("Rank A");
        break;
         case 2:
        printf("Rank B");
        break;
         case 3:
        printf("Rank C");
        break;
    case 4:
    printf("判定エラー%d",x);
        break;
     case 5:
    printf("Rank 1st");
         break;
    default:
    printf("ランク外%d",x);
        break;
    }
   
}
    
    
    
    
