#include<stdio.h>
int main(void){

    char data[256];
    FILE *fp = fopen("deta.txt","r");

    if (fp == NULL)
    {
       printf("--File open failed.--\n");
    }
    else{
        while((fgets(data,256,fp))!= NULL){
            printf("%s",data);
        }
    }
    fclose(fp);
    return 0;
}
