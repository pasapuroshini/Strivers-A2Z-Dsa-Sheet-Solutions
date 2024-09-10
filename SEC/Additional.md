

# Problem: Sum of Matrix and Its Rotations

Given a 3x3 matrix `a`, the task is to compute the sum of the matrix `a` with its 90°, 180°, and 270° rotations using a space-optimized solution.

## Matrix Rotations

The rotations of the matrix `a` can be computed as follows:

- **a90 (90° rotation)**:
  - Transpose the matrix and then reverse the rows.
  - Formula: `a90[i][j] = a[n-j-1][i]`

- **a180 (180° rotation)**:
  - Rotate the matrix 90° twice.
  - Formula: `a180[i][j] = a[n-i-1][n-j-1]`

- **a270 (270° rotation)**:
  - Rotate the matrix 90° three times.
  - Formula: `a270[i][j] = a[j][n-i-1]`

## Space-Optimized Solution

To optimize space, we will calculate the sum directly by applying the rotation transformations on the fly, without creating additional matrices for each rotation.
```
public class MatrixRotationSum {

    // Function to compute the sum of the matrix with its rotations
    public static int computeSum(int[][] matrix) {
        int n = matrix.length; // Matrix is 3x3, so n = 3
        int sum = 0;

        // Iterate through the matrix and compute the sum of matrix and its rotations
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Original matrix element
                int original = matrix[i][j];

                // 90° rotation element: matrix[n-j-1][i]
                int a90 = matrix[n - j - 1][i];

                // 180° rotation element: matrix[n-i-1][n-j-1]
                int a180 = matrix[n - i - 1][n - j - 1];

                // 270° rotation element: matrix[j][n-i-1]
                int a270 = matrix[j][n - i - 1];

                // Add all these values to the sum
                sum += original + a90 + a180 + a270;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = computeSum(matrix);
        System.out.println("Sum of matrix and its rotations: " + result);
    }
}
```
