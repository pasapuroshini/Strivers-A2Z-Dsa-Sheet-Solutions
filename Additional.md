

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
