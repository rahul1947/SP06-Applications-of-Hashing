## Short Project SP06: Applications of Hashing
3 Problems from SP04 to be solved using HashMap/ HashSet instead of TreeMap/ TreeSet.

#### Author
* [Rahul Nalawade](https://github.com/rahul1947)

#### Date
* January 08, 2019

_______________________________________________________________________________
### Problems:

#### A. Optional tasks (individual): 
The following problems should be solved using HashMap/HashSet from the Java library.


**Problem 1.** 
   Given an array A of integers, and an integer X, find how many pairs of 
   elements of A sum to X:
```
   static int howMany(int[] A, int X) { // RT = O(n), expected.
      // How many indexes i,j (with i != j) are there with A[i] + A[j] = X?
      // A is not sorted, and may contain duplicate elements
      // If A = {3,3,4,5,3,5} then howMany(A,8) returns 6
   }
```

**Problem 2.**
   Given an array A, return an array B that has those elements of A that
   occur exactly once, in the same order in which they appear in A:
```
   static<T extends Comparable<? super T>> T[] exactlyOnce(T[] A) { 
      // RT = O(n), expected.
      // Ex: A = {6,3,4,5,3,5}.  exactlyOnce(A) returns {6,4}
   }
```

**Problem 3.** 
   Given an array A of integers, find the length of a longest streak of
   consecutive integers that occur in A (not necessarily contiguously):
```
   static int longestStreak(int[] A) { // RT = O(n), expected.
      // Ex: A = {1,7,9,4,1,7,4,8,7,1}.  longestStreak(A) return 3,
      // corresponding to the streak {7,8,9} of consecutive integers
      // that occur somewhere in A.
   }
```