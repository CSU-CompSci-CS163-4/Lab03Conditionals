# Lab 03 - Conditionals

Today's lab will focus on conditionals, or `if`, `else if`, and `else` statements, while also reviewing `Strings`.

## Step 1: Compiling 
Take a moment to look through the provided code for the lab. If you end up running the code at this moment, you will find there is a *Syntax Error* and the code won't compile. (hint: The syntax error is the method that has the 'Step 1' comment).

Fix this syntax error now. While there are many ways to fix it, we suggest simply putting in a `return "";` at the bottom of the method for now. Compile/run the code. 

## Step 2: Self-Explanation
Reading through the `laneCheck(int)` method, you should write out *in your own words* what you think the code does. What happens when certain parameters are passed into the method? How does it respond? Write directly in your code as a comment above the method. It is alright to talk it out, but know it is not important that you get it correct! It is more important that you write out what you think. 

## Step 3: Runtime Errors
It is possible to have your code run, and it not run correctly. Take a moment to open the [javadoc](https://csu-compsci-cs163-4.github.io/Lab03Conditionals/ConditionalsLab.html), and review the `laneCheck(int)` method. The javadoc provides a description of the method, including given a certain input, you should have a specific output. Using that method **description** and the **diagram below**, ask yourself the following questions:

1. How well does it match your self-explanation of the method?
2. Does the code do what is described in the javadoc? If so, you are good, if not - write notes about what it isn't doing right (you can add them as comments to the file)
3. Look at the code, does it match the following diagram of how the if statements should be working?

![laneCheck()](https://user-images.githubusercontent.com/77072076/147894580-884ddeb0-f957-4387-9437-2c88a8353b9b.png)

Now take a moment to run the code. You will notice the `main` method is calling a test method `testLaneCheck()`. It is *very common* (required in the industry) to test every method you write! This lab mimics that idea, and we have tests for every method. When you run the program, you will find the tests aren't doing what they should be doing!

**Your action:** Fix the laneCheck() method so it passes the tests and matches what is described in the javadoc. 

## Step 4: Working with Strings
Look at `streetLight1()`. When you ran the tests in Step3, you will have noticed that this method is also failing tests! However, the return types seem correct. Take a moment to look through this method, and work on the following:

1. Create a diagram similar to the example in Step 3. 
2. Fix this method so that it works. 
3. Describe in your own words (as the comment) why you needed to make the change that you made. 


## Step 5: Tree Diagrams and Testing
Creating Tree Diagrams is extremely helpful in working out your logic, and while the logic for these problems is 'simple', as your logic gets more complex, you will thank yourself for creating it. Create a tree diagram for `streetLight2A(String)` and `streetLight2B(String)`.

Compare the diagrams, are they functionally the same or different? 

Look at `testStreeLight2AB()`. Looking at the *tree diagram* write tests that test every 'path' of that tree. Similar to the tests for the past two methods, you should ask yourself if you tested every condition of `streetLight2A(String)` and `streetLight2B(String)`.

Now, change the `.equalsIgnoreCase()` in `streetLight2B(String)` to `.contains()`. How did this change the tests you wrote? Why did some of them end up failing (if any)? Can you write a test that causes a failing condition?


## Step 6: Turning In / Receiving Credit

To receive credit for this lab you need to do the following:
1. In Zybooks, submit the lab for grading (after clicking through the canvas link again!).

2. On-campus students, have a TA look over that you completed the self-explanations, your diagrams, and the tests you created (we are not autograding those). Just show what you completed at the end of the course period, even if it isn't fully complete.

3. Online students, there will be a discussion assignment in canvas. Copy your self-explanations, your diagrams, and your tests you created as part of the discussion post. A TA will review your submission. 
 
4. Summer students, you will not be asked to submit self-explanations, diagrams, or tests but we do highly recommend that you do all three as they're beneficial to your understanding of the code.  


## Step 7: Extra Practice (optional) 
Look at `streetLight3(String)`. Create a tree diagram for it, along with additional tests (don't forget to add a method call to those tests in main). Ask yourself the following questions:

* Are the 'else if' statements in streetLight3() necessary? 
* Or could we substitute in an 'if' in this case and not change the functionality of our code?
* If instead of .equalsIgnoreCase() we used .contains(), would your answer still apply?


## Additional Background Information
Read through the following if you are stuck, or simply seek a better understanding of if/else statements. 


The `if` statement checks if a certain statement is true. It can look like:

```java
  boolean havingFun = true;
  if(havingFun == true){
    celebrate(); 
  }
```

Or simplified:

```java
  boolean havingFun = true; 
  if(havingFun) {
    celebrate();
  }
```

`if` statements will execute regardless of the outcome of the conditional before it. This can be handy if you want to, say, add multiple things to a String if multiple things are true. 

Maybe we have a square. Is a square a shape? Yes. A triangle? No. A rectangle? Yes. A square? Also yes. We can then add those properties to our square
and combine them, instead of choosing only one property for it. For example:

```java
String str = "";
if(square){
  str += "This shape is a square. "
}

if(triangle){
  str += "This shape is a triangle."
}

if(rectangle){
  str += "This is a rectangle."
} else{
  str += "This shape is not a rectangle."
}
return str;
```

If we have a square, our print statement will be 

```This is a square. This is a rectangle.```

Notice the `else` statement did not execute, and it will only be activated if the 'if' statement directly above it is false. When we have several `if` statements, it is important to remember the else only considers the `if` directly above it. 

On the other hand, if we only want one property to be portrayed instead of several, we could choose to use an 'else if' statement. That way, in an if/else if' block, only one statement will be executed. For example:

```java
String str = "This is a ";

if(square){
  str += "square."
} else if(triangle){
  str += "triangle."
} else if(rectangle){
  str += "rectangle."
} else{
  str += "shape."
}

return str;
```

If we have a square, our print statement will be 

```This is a square.```

The `else` is a last resort, it is supposed to catch all cases outside
what is being checked. Neglecting it can possibly result in a logic error. Putting one else after several 'if's and not 'else ifs' can also result in an error.

Debugging and coming up with good test cases are very useful for finding
pesky bugs in logic. This may be helpful in the first parts of your assignment.
For example, what if we go outside of red, yellow, or green and input a color like purple? How does each method handle this?

### .equalsIgnoreCase() and .contains()

The `.equalsIgnoreCase()` method will check if two Strings are equal, ignoring case. So "red", "Red", and "rEd" or any other similar case substitution will evaluate to true.

The `.contains()` method will check if a String contains the String passed in.
So if String str = "red-orange", str.contains("orange") will evaluate to true.

More information on these and other methods can be found in the [String javadoc online](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html).
