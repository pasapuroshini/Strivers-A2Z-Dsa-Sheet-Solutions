# Stack using Arrays
<img width="537" alt="Screenshot 2024-09-09 at 8 53 38 PM" src="https://github.com/user-attachments/assets/a3a9bd9f-7376-4172-8eb4-7109ad885860">
<img width="456" alt="Screenshot 2024-09-09 at 8 54 17 PM" src="https://github.com/user-attachments/assets/1b926ac4-7eeb-402d-bbb9-30a5ff5c4fdf">

``` java
import java.util.*;
public class Stac{
public static void main(String[] args)
{
stack s= new stack();
s.push(6);
s.push(3);
s.push(7);
System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
}
}
class stack{
int size= 10000;
int arr[]= new int[size];
int top=-1;
void push(int x)
{
top++;
arr[top]=x;
}
int pop()
{
int x= arr[top];
top--;
return x;
}
int top()
{
return arr[top];
}

int size()
{
return top+1;
}
}
```
Output:

Top of the stack before deleting any element 7
Size of the stack before deleting any element 3
The element deleted is 7
Size of the stack after deleting an element 2
Top of the stack after deleting an element 3

Time Complexity: O(N)

Space Complexity: O(N)
