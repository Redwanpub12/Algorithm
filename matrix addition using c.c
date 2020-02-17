#include <stdio.h>

int main()
{
  int i,j,a[10][10],b[10][10],c[10][10],row,col;
  
  printf("Enter number of row and columns: \n");
  scanf("%d%d",&row,&col);
  
   printf("Enter the elements of matrix 1:\n");
   for(i=0; i<row; i++){
      for(j=0; j<col; j++){
          scanf("%d",&a[i][j]);
          
      }
  }
    printf("Enter the elements of matrix 2: \n");
    for(i=0; i<row; i++){
      for(j=0; j<col; j++){
        scanf("%d",&b[i][j]);
         
      }
      
  }
  printf("Addition of two matrix: \n");
   for(i=0; i<row; i++){
       for(j=0; j<col; j++){
        c[i][j]=a[i][j]+b[i][j];
        printf("%d\t",c[i][j]);
  
       }
       printf("\n");
      
   }
   return 0;
}
