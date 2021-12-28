**Conditionals Lab README:**

Today's lab will focus on conditionals, or 'if', 'else if', and 'else' statements.

To receive credit for the lab, present to your TA the following items:

- Two things wrong with streetLight1()

- Tree diagram of how streetLight2A() works

- Tree diagram of how streetLight2B() works

- Tree diagram of how streetLight3() works

- Compare your tree diagrams for streetLight2A() and streetLight2B().
  Right now these two methods are functionally doing the same thing.
  What happens if you use .contains() instead of .equalsIgnoreCase()?

- Compare your tree diagrams for streetLight2A() and streetLight3().
  Are the 'else if' statements in streetLight3() necessary? Or could we
  substitute in an 'if' in this case and not change the functionality of our code?
  If instead of .equalsIgnoreCase() we used .contains(), would your answer still apply?


**Additional Background Information:**

The 'if' statement checks if a certain statement is true. It can look like:

`boolean havingFun = true;
if(havingFun == true){
celebrate(); }`

Or simplified:

`boolean havingFun = true;
if(havingFun){
celebrate();
}`

'if' statements will execute regardless of the outcome of the conditional before it.
This can be handy if you want to, say, add multiple things to a String if multiple
things are true. Maybe we have a square. Is a square a shape? Yes. A triangle? No.
A rectangle? Yes. A square? Also yes. We can then add those properties to our square
and combine them, instead of choosing only one property for it. For example:

String str = "";

if(square){
str += "This shape is a square. "}

if(triangle){
str += "This shape is a triangle."
}

if(rectangle){
str += "This is a rectangle."
}

else{
str += "This shape is not a rectangle."
}`

return str;

If we have a square, our print statement will be "This is a square.
This is a rectangle." 

Notice the 'else' statement did not execute, and it will
only be activated if the 'if' statement directly above it is false. When we have
several 'if' statements, it is important to remember the else only considers the 'if'
directly above it. 

On the other hand, if we only want one property to be portrayed instead of several,
we could choose to use an 'else if' statement. That way, in an 'if/else if' block,
only one statement will be executed. For example:

String str = "This is a ";

if(square){
str += "square."}

else if(triangle){
str += "triangle."
}

else if(rectangle){
str += "rectangle."
}

else{
str += "shape."
}`

return str;

If we have a square, our print statement will be "This is a square."

The 'else' is a last resort, it is supposed to catch all cases outside
what is being checked. Neglecting it can possibly result in a logic error. Putting 
one else after several 'if's and not 'else ifs' can also result in error.
Debugging and coming up with good test cases is very useful for finding
pesky bugs in logic. This may be helpful in the first parts of your assignment.
For example, what if we go outside of red, yellow, green and input a color like purple?
How does each method handle this?

The .equalsIgnoreCase() method will check if two Strings are equal, ignoring case.
So "red", "Red", and "rEd" or any other similar case substitution will evaluate
to true.

The .contains() method will check if a String contains the String passed in.
So if String str = "red-orange", str.contains("orange") will evaluate to true.

More information on these and other methods can be found in the String javadoc online.
