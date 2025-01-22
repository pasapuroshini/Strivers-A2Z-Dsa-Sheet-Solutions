### **Fractional Knapsack Problem**

#### **Problem Statement**

Given weights and values of n items, the goal is to maximize the total value in a knapsack of capacity W. You can take fractions of items.

#### **Key Points**

1.  **Greedy Algorithm** is used.
    
2.  Sort items based on the **value/weight ratio** in descending order.
    
3.  Take the maximum possible amount of an item starting from the highest ratio until the capacity is filled.
    
4.  If the item cannot be fully accommodated, take a fraction of it.
    

#### **Approach**

1.  Calculate value/weight ratio for all items.
    
2.  Sort items by the ratio in descending order.
    
3.  Initialize totalValue = 0 and iterate through the sorted list:
    
    *   If the item can fit, add its full value to totalValue.
        
    *   Otherwise, add the fraction of the item that fits to totalValue.
        
4.  Return totalValue.
    

#### **Code Implementation in Java**

`   import java.util.*;  class Item {    int value, weight;    Item(int x, int y) {      this.value = x;      this.weight = y;    }  }  class itemComparator implements Comparator  {      @Override      public int compare(Item a, Item b)       {          double r1 = (double)(a.value) / (double)(a.weight);           double r2 = (double)(b.value) / (double)(b.weight);           if(r1 < r2) return 1;           else if(r1 > r2) return -1;           else return 0;       }  }  public class solve{      static double fractionalKnapsack(int W, Item arr[], int n) {          Arrays.sort(arr, new itemComparator());           int curWeight = 0;           double finalvalue = 0.0;           for (int i = 0; i < n; i++) {              if (curWeight + arr[i].weight <= W) {                  curWeight += arr[i].weight;                  finalvalue += arr[i].value;              }              else {                  int remain = W - curWeight;                  finalvalue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;                  break;              }          }          return finalvalue;      }      public static void main(String args[])      {          int n = 3, weight = 50;          Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};          double ans = fractionalKnapsack(weight, arr, n);          System.out.println("The maximum value is "+ans);      }  }   `

#### **Time Complexity**

*   Sorting items: O(nlog⁡n)O(n \\log n)O(nlogn)
    
*   Iterating through items: O(n)O(n)O(n)**Total:** O(nlog⁡n)O(n \\log n)O(nlogn)
    

#### **Space Complexity**

*   Sorting overhead: O(n)O(n)O(n)
