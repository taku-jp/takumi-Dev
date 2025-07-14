#include<stdio.h>
int i;
int x;
int array[3][4];
int sum;
int main(void){

array[0][1] =10;
//縦
for (i = 0; i <sizeof(array)/sizeof(array[0]); i++)
{
    //横
   for (x = 0; x <sizeof(array[0])/sizeof(array[0][0]); x++)
   {
  array[i][x] =i *10 +x;
   }
}
   for (i = 0; i < sizeof(array)/sizeof(array[0]); i++)
{
    //横
   for (x = 0; x < sizeof(array[0])/sizeof(array[0][0]); x++)
   {
 printf("array[%d][%d]=%d\t",i,x,array[i][x]);
   }
   printf("\n");
}

return 0;
}
