import java.util.Scanner;

public class Prework {
    
 public static int checkPalindrome(int num){
     
     int sum=0,r;
     while(num!=0){
         r=num%10;
         sum=(sum*10)+r;
         num/=10;
     }
 return sum;
 

 }//______________________________________________________________________________________________________________________
 public static void checkPrimeNumber(int n) {
     int i,m=0,flag=0;
     

  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }  

  }//______________________________________________________________________________________________________________________
public static void printFibonacciSeries(int count){
    int n1=0,n2=1,n3,j;    
 
 System.out.println(n1+" "+n2) ;  
 for(j=2;j<count;++j)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
}
 public static void printPattern(int row){

     int k, l;   
  
for(k=0; k<row; k++)   
{   
  
for(l=0; l<=k; l++)   
{   
  
System.out.print("* ");   
}   
 
System.out.println();   
}   
 }
 public static void main(String[] args) {

   int choice;    
   Scanner c = new Scanner(System.in);         
do {
    

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println("choose any number");
choice = c.nextInt();
switch (choice) {
case 0:
choice = 0;
break;
 case 1: {
     int n,t,s;
             	   // Scanner ob=new Scanner(System.in);
	    System.out.println("Enter any number ");
                   n=c.nextInt();
	    t=n;
	    s=checkPalindrome(n);
	    if(s==t)
		System.out.println(t+" is a palindrome number ");
                   else
		System.out.println(t+" is not a palindrome number "); 


}break;
 case 2: {
     System.out.println("Enter the number of rows");
     int row = c.nextInt();

 printPattern(row);
}
break;
 case 3: {
     int p;
     System.out.println("enter number to be checkrd");
     //Scanner c = new Scanner(System.in);
     p=c.nextInt();
 checkPrimeNumber(p);
 }break;
 case 4: {
     int count;
     System.out.println("enter size of series")  ;  
 //Scanner c= new Scanner(System.in);
 count= c.nextInt();

 printFibonacciSeries(count);
 }break;
default:
System.out.println("Invalid choice. Enter a valid no.\n");
}

 } while (choice != 0);

System.out.println("Exited Successfully!!!");

c.close();
}

 


}

 
