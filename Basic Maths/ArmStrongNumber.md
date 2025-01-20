# Armstrong Number in Java

## Overview

An **Armstrong number** (also known as a **narcissistic number**) is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, `153` is an Armstrong number because:

\[
1^3 + 5^3 + 3^3 = 153
\]

This project provides a Java implementation to check if a given number is an Armstrong number.

## Problem Statement

Given a number, the program will determine if it is an Armstrong number. If it is, it will print that the number is an Armstrong number; otherwise, it will print that the number is not an Armstrong number.

## Example

For the number `153`:
- **Number of digits** = 3
- The sum of the digits raised to the power of 3:
  - \(1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153\)

Since the sum equals the original number, `153` is an Armstrong number.

## Features

- Takes an integer input.
- Computes the number of digits in the input number.
- Sums the digits raised to the power of the number of digits.
- Compares the sum to the original number to check if it is an Armstrong number.

## How the Program Works

### Steps:

1. **Input**: The user provides a number to check.
2. **Number of Digits**: The program calculates how many digits are in the given number.
3. **Sum Calculation**: The program extracts each digit, raises it to the power of the number of digits, and sums them up.
4. **Comparison**: If the sum equals the original number, it is an Armstrong number; otherwise, it is not.

### Code:

```java
import java.lang.Math;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        
        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, k); 
            n = n / 10;
        }
        
        return sum == num ? true : false;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
