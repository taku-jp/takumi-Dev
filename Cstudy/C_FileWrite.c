#include<stdio.h>
int main(void){

   
    FILE *fp = fopen("deta.txt","w");
    char ch ='A';
    if (fp == NULL)
    {
       printf("--File open failed.--\n");
    }
    else{
     fputc((int)ch, fp);
     fputs("-Test--\n",fp);
     for(int i =0; i<5; i++){
     fprintf(fp,"Hello %d\n",i);
     }

        }
    
    fclose(fp);
    return 0;
}
