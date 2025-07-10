#include<stdio.h>
int main(void){
    char str1[10] ="abcdefghi";

    char *str2 ="hijklmnop";

    printf("str1 =%s\n",str1);
    printf("str2 =%s\n",str2);
   /* str1 ="ABCDEFGHI";

    str2 = "HIJKLMNOP";*/

    strcpy(str1, str2);
    strcpy(str1,"aaaabbbb");
     printf("str1=%s\n",str1);
    printf("str2=%s",str2);
