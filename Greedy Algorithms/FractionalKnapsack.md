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
    
3.  Initialize `finalValue = 0` and iterate through the sorted list:
    
    *   If the item can fit, add its full value to totalValue.
        
    *   Otherwise, add the fraction of the item that fits to totalValue.
        
4.  Return `finalValue.`
    

#### **Code Implementation in Java**
```

 import java.util.*;
class Item {
  int value, weight;
  Item(int x, int y) {
    this.value = x;
    this.weight = y;
  }
}

class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}
public class solve{
    static double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, new itemComparator()); 
        
        int curWeight = 0; 
        double finalvalue = 0.0; 
        
        for (int i = 0; i < n; i++) {
       
            if (curWeight + arr[i].weight <= W) {
                curWeight += arr[i].weight;
                finalvalue += arr[i].value;
            }
     
            else {
                int remain = W - curWeight;
                finalvalue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }
     
        return finalvalue;
        
    }
    public static void main(String args[])
    {
        int n = 3, weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }
}  

```
```
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read values array
            String[] valueInput = br.readLine().trim().split(" ");
            List<Integer> values = new ArrayList<>();
            for (String s : valueInput) {
                values.add(Integer.parseInt(s));
            }

            // Read weights array
            String[] weightInput = br.readLine().trim().split(" ");
            List<Integer> weights = new ArrayList<>();
            for (String s : weightInput) {
                weights.add(Integer.parseInt(s));
            }

            // Read the knapsack capacity
            int w = Integer.parseInt(br.readLine().trim());

            // Call fractionalKnapsack function and print result
            System.out.println(String.format(
                "%.6f", new Solution().fractionalKnapsack(values, weights, w)));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int n = val.size();
        double[][] items = new double[n][3]; // 2D array to store ratio, value, weight
        
        // Calculate value-to-weight ratio and store values
        for (int i = 0; i < n; i++) {
            items[i][0] = (double) val.get(i) / wt.get(i); // Ratio
            items[i][1] = val.get(i); // Value
            items[i][2] = wt.get(i); // Weight
        }

        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b[0], a[0]));

        int currWeight = 0;
        double currValue = 0.0;

        // Process the items
        for (int i = 0; i < n; i++) {
            if (currWeight + (int) items[i][2] <= capacity) {
                // Add the whole item
                currValue += items[i][1];
                currWeight += (int) items[i][2];
            } else {
                // Add a fraction of the item
                int rem = capacity - currWeight;
                currValue += items[i][0] * rem; // Fractional value
                break; // Knapsack is full
            }
        }

        return currValue;
    }
}
```

#### **Time Complexity**

*   Sorting items: O(nlogn)
    
*   Iterating through items: O(n)  **Total:** O(nlog⁡n+n)
    

#### **Space Complexity** O(1) 
