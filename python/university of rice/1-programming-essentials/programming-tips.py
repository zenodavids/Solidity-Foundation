

############################# pythontutor.com - works like codelens and with javasript, java and python

"""
Examples of common errors in Python

- SyntaxError: "I don't recognize what you just wrote as Python code."
- NameError: "What in the world is X?"
- TypeError: "You're trying to use some of those things in a way that wasn't intended.- "
- IndentationError : "Several statements in the same block of code are not indented the same."
- IndexError: "That list/dictionary/tuple (etc.) doesn't have that many items in it."
- TokenError: "You probably forgot to close a bracket." *
- ValueError: "There's something wrong with the value of one of those arguments (but - the type is ok)."
- AttributeError: "That object doesn't know how do to what you asked it to do"

- Miscellaneous section - these errors are either self-explanatory or not common in the level of programming done in this class

ZeroDivisionError - you guessed it - you're trying to divide by zero somewhere

ImportError - caused by trying to import a module that doesn't exist. Check your spelling.

 HierarchyError - Internet Explorer is not supported by CodeSkulptor3. Use Chrome or Firefox.

JavaScript section - these are not Python errors. They are related to your browser, not your code
"""

# Remember you can use ctrl+k to comment a block of code and
# ctrl+shift+k to uncomment a block of code




# Syntax errors correspond to problems where your code doesn't follow the rules
# for writing valid Python programs.  Note that these errors arise
# before Python tries to run your code


       ################## ERROR 1

#Syntax Error: bad input ('"Hello world!"')
#Cause: forgetting to enclose the arguments to print in parenthesis

# print "To error is human, to forgive is divine"


# In Python 3, print is a function and its arguments should be enclosed in parentheses



      ################## ERROR 2

#SyntaxError: bad token ('"')
#Cause: Forgetting to close your quotation


#print("To error is human, to forgive is divine)

# As you enter expressions in Python, you will sometimes forget to include
# matching parentheses, quotations, brackets, etc.

# When you get a syntax error, always check whether you have matched up pairs correctly.

#A bit more information: a "token" is a piece of code
#that Python recognizes as meaningful - you can almost think
#of them as coding "atoms". In this case, the token in
#question is the quotation mark. It means something -
#namely it indicates the start/end of a string - but Python
#also knows that they always occur in pairs. Since it
#found only one lonely quotation mark, it generates an
#error saying so.



      ################## ERROR 3

#print_quote = True
#if print_quote:
#    print("To error is human, to forgive is divine")
#else:
# 'pass' is a statement that tells python to do nothing
#    pass
#print_quote = False


# Note that sometimes Python doesn't detect a syntax error until it's moved on to
# processing the next line in your program.  If the line marked as having an error looks OK,
# be sure to check your previous line of code for problems.

# Here the previous else clause is missing its body.  Since Python requires each if-else
# clause to have a body, we can insert a "pass" statement that does nothing.


# Syntax errors happen while Python is trying to parse your program into a recognizable form.
# A second class of errors happen while Python is running your code. Here are a few examples.


      ################## ERROR 4

#pope_quote = "To error is human, to forgive is divine"
#print(popequote)

# Name errors corresponds to issues where Python is trying to find a value for one
# of the variables in your code and doesn' have one.  In that case, Python tells
# you that your variable is not defined.

# The most common cause of this error is misspelling a variable name.


      ################## ERROR 5

#joe_ranking = 1
# this wont work
#print("Joe is number " + joe_ranking + " coder.")
# this will work
#print("Joe is number " + str(joe_ranking) + " coder.")

# Python loves to use the same operator on as many different types of data as possible.
# The + operator can be used to add numbers as well as add string (via concatenation)
# However, Python does know how to add a number and a string.
# Here, Python threw a Type error to indicate this fact.

# To fix this error, you can convert joe_ranking to a string using str().

############################################################################################################################ seeking for helping in python;

# https://py3.codeskulptor.org/docs.html#tabs-Python
# official python docs
# google



########################################################################################################################### coding standards and styles

# always use docstrings at the top of your file to explain what your code is about
# use comments under every function definitions to explain the use of that function and under every line of code to explain what they are been used for
# aviod the use of global variables and if you must use them, the variable names shoould be in uppercase.
# variable names must have at least three letters and make them make sense.
# indentation should be at least four spaces










