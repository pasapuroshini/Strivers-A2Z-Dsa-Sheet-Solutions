# Given the row number n. Print the n-th row of Pascal’s triangle.


 Pascal’s triangle should be that the n-th row of the triangle has exactly n elements.

 ## Naive Approach:

 

<img width="361" alt="Screenshot 2025-02-11 at 7 57 22 PM" src="https://github.com/user-attachments/assets/a7647974-063a-44dd-8d67-1cf2c96b0c0a" />

Applying combination formula for each element in a row.


<img width="305" alt="Screenshot 2025-02-11 at 7 58 03 PM" src="https://github.com/user-attachments/assets/953e922b-935b-4e5e-82d4-c2bbd2d5401a" />

**Time Complexity:** O(n\*r), where n is the given row number, and r is the column index which can vary from 0 to n-1.**Reason:** We are calculating the element for each column. Now, there are total n columns, and for each column, the calculation of the element takes O(r) time where r is the column index.

**Space Complexity:** O(1) as we are not using any extra space.

## Optimal Approach:


 <img width="723" alt="Screenshot 2025-02-11 at 7 50 51 PM" src="https://github.com/user-attachments/assets/2036f9ac-9eeb-48e4-8f56-2c7c11f9e8fc" />

**Complexity Analysis**

**Time Complexity:** O(N) where N = given row number. Here we are using only a single loop.

**Space Complexity:** O(1) as we not using any extra space.


<img width="275" alt="Screenshot 2025-02-11 at 7 54 09 PM" src="https://github.com/user-attachments/assets/916b2a68-eabe-48bc-8d68-35520ca48398" />


