# 3 Sum


Question 🔗:[3 Sum](https://leetcode.com/problems/3sum/description/)

## ***Approach 1***:Brute Force Approach
```
public static List<List<Integer>> triplet(int n, int[] arr) {
    Set<List<Integer>> st = new HashSet<>();

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    temp.sort(null);
                    st.add(temp);
                }
            }
        }
    }

    return new ArrayList<>(st);
}
```

***Time Complexity***: $$O(N3 * log(no. of unique triplets))$$, where N = size of the array
***Space Complexity***: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.




## ***Approach 2***:Better Approach
```
public static List<List<Integer>> triplet(int n, int[] arr) {
    Set<List<Integer>> st = new HashSet<>();

    for (int i = 0; i < n; i++) {
        Set<Integer> hashset = new HashSet<>();
        for (int j = i + 1; j < n; j++) {
            int third = -(arr[i] + arr[j]);

            if (hashset.contains(third)) {
                List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                temp.sort(null);
                st.add(temp);
            }
            hashset.add(arr[j]);
        }
    }

    return new ArrayList<>(st);
}

```
***Time Complexity***: O(N2 * log(no. of unique triplets)), where N = size of the array.
***Space Complexity***: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set

# Approach 3:Optimal Approach
```
public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            
            if (i != 0 && arr[i] == arr[i - 1]) continue;

           
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                  
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return ans;
    }
```
***Time Complexity**: O(NlogN)+O(N2), where N = size of the array
***Space Complexity***: O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space to solve this problem
