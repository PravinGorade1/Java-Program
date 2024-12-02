FloorAndCell.java
#include<stdio.h>   //floor closest lower number
#include<conio.h>   //cell closest highest
void main() {
int a[5],i,n,cell,floor;        // arr= 3 7 10 30 100
 printf("\n enter the array");  //      0  1 2  3  4
    for(i=0;i<5;i++)
     {
      scanf("%d",&a[i]);
     }
     printf("floor and cell is \n");
     scanf("%d",&n);

     for(i=0;i<5;i++)
      {
        if(a[0]>n)        // a[0]>n=2
         {
           floor=-1;   //-1
           cell=a[0];  //3
           break;
         }

         if(a[4]<n)  //a[4]<n=200
         {
           floor=a[4];  //100
           cell=-1;  //-1
           break;
         }

         if(a[i]==n)    // a[i]==n :- 4==4
         {
           floor=a[i];
           cell=a[i];
           break;
         }

         if(a[i]<n && a[i+1]>n)  //a[0]<n=34 && a[o+1]>34
          {
           floor=a[i];
           cell=a[i+1];     //
           break;
          }
      }

     printf("\n %d = %d\t%d",n,floor,cell);

}
