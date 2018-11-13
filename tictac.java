

import java.util.*;
 
   class tictac {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Hello world!");
   char a[][],c=0,e=0,f=0,g=0,h=0,flag=0,p=0;
     a=new char[3][3];
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
  
        a[i][j]='-';
      }
    
    do

    {
      if(p!=1)
      {
      for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
{  
       System.out.print(a[i][j]+"\t");
      }
      System.out.println ();
    }
      }
      p=0;
     if(flag==1)
  {
  break;
  } 

if(c%2==0)
{
  System.out.println ("enter row and column where you want to enter x");
int b=sc.nextInt();
int d=sc.nextInt();
if(a[b][d]=='0'||a[b][d]=='x')
{
  System.out.println("the value is entered enter again");

}
else
{
  a[b][d]='x';
  c++;
}
}
else

{
  if(p!=1)
  {
System.out.println("computers turn"); 
  }
int b=(int)(Math.random() * 3);
int d=(int)(Math.random() * 3);
if(a[b][d]=='0'||a[b][d]=='x')
{
  p=1;
  }
else
{
  a[b][d]='0';
  c++;
}
}
for(int i=0;i<3;i++)
{
  for(int j=0;j<3;j++)
  {
    if(a[i][j]=='x')
    e++;
   else if(a[i][j]=='0')
   h++; 
  else
  {
}
  if(a[j][i]=='x')
  {
  f++;
  }
  else if(a[j][i]=='0')
  {
  g++;
  }
  else
 {
 }
 }
if(e==3||f==3)
{  flag=1;
  System.out.println("X wins!!!");
break;
}
else if(h==3||g==3)
{  flag=1;
  System.out.println("0 wins!!");
break;
}
else
{
  e=0;
  f=0;
  g=0;
  h=0;
  }
}
  if((a[0][0]=='x'&&a[1][1]=='x'&&a[2][2]=='x')||(a[0][2]=='x'&&a[1][1]=='x'&&a[2][0]=='x'))  
  {
    flag=1;
  System.out.println("X wins!!!");

  }
    else if(a[0][0]=='0'&&a[1][1]=='0'&&a[2][2]=='0'||(a[0][2]=='0'&&a[1][1]=='0'&&a[2][0]=='0'))  
  {
    flag=1;
  System.out.println("0 wins!!!");

  }
 
    }while(c<9);

if(flag==0)
{
   for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
{  
       System.out.print(a[i][j]+"\t");
      }
      System.out.println ();
    }
  System.out.println("draw !!!");
}



  }
}