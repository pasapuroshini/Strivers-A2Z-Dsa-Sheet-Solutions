# Reverse a number :
```
import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int rev=0;
while(n>0)
{
int ld=n%10;
rev= (rev*10)+ld;
n/=10;
}
System.out.println(rev);
sc.close();

}
}
```
Time complexity:O(log n+1)
Space Complexity:O(1)
