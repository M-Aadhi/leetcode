
# Two Sum Problem

## Problem Description:
The program aims to find two numbers in an array whose sum equals a given target value. It returns the indices of these two numbers using a HashMap data structure for efficient lookups.

## Steps:

1. **Input:** The program takes an array of integers and a target value.

2. **Initialize HashMap:** A HashMap is created where the key represents the array value, and the value represents the index of that element in the array.

3. **Loop through Array:**
    - The program iterates through the array using a loop.
    - For each element at index `i`, the program calculates the difference (or "complement") between the target value and the current element's value.
    - If this complement exists in the HashMap, it means that the current element and the element represented by the complement add up to the target value.
    - In this case, the program returns the indices of the two numbers.

4. **Add Element to HashMap:** If the complement is not found, the current element is added to the HashMap with its index as the corresponding value.

5. **Return Result:** Once the pair of numbers is found, their indices are returned. If no such pair exists, the program can return an error message or indication (if that is implemented).

## Example Code Explanation:

Let’s say you have an array `arr = [2, 7, 11, 15]` and the target value `9`.

- As you loop through the array, at the first index `0` with value `2`, the complement is `9 - 2 = 7`.
- Since `7` is not in the HashMap, you add `2` to the HashMap with `0` as its index.
- Moving to the next index `1` with value `7`, the complement is `9 - 7 = 2`.
- Now, `2` exists in the HashMap (from the previous iteration). Therefore, the program returns the indices `0` and `1`, since `2 + 7 = 9`.

```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
