[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/qw7uShpN)
# Experiment 55: Throws Keyword

## Problem Statement

Create a method `check(int n)` that declares it `throws` an `IOException` if $n < 0$.
In the main method, call this method and handle the exception using a `try-catch` block.
* If $n < 0$, throw the exception.
* If $n \ge 0$, print the number.
* If exception is caught, print "Caught: IO Exception".

## Input Format

* An integer $n$.

## Output Format

* The number (if positive) OR "Caught: IO Exception".

### Example 1

**Input:**

```text
-5
```

**Output:**

```text
Caught: IO Exception
```

### Example 2

**Input:**

```text
10
```

**Output:**

```text
10
```
