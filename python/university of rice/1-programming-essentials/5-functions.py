"""
Demonstration of how to call functions.
"""

# Function that we can call
# functions also have parameters- these are values we input inside the function(ie; input1, input2, input3)
def useless(input1, input2, input3):
    """
    This function takes three arguments
    """
    return 3

# Calling the function
# You must pass the right number of arguments
useless(1, 2, 3)

# Calling the function and printing the result
print(useless(4, 5, 6))

# Calling the function and assigning the result to a variable
result = useless(7, 8, 9)
print(result)

#################################################################################

"""
Demonstration of defining functions.
"""
# the 'def' keyword is short for definition and it defines a function, 'sayhello' is the name of this function, the function parameters that takes arguments and a colon(:)
def sayhello():
    """
    Prints "hello".
    """
    print("hello")

# Call the function
sayhello()

def double(value):
    """
    Return twice the input value
    """
    return value * 2

# Call the function and assign the result to a variable
result = double(6)
print(result)

def product(value1, value2, value3):
    """
    Returns the product of the three input values.
    """
    prod = value1 * value2
    prod = prod * value3
    return prod

# Call the function and assign the result to a variable
result = product(7, 13.3, -1.2)
print(result)

##########################################################################
"""
Demonstration of parameters and variables within functions.
"""

def fahrenheit_to_celsius(fahrenheit):
    """
    Return celsius temperature that corresponds to fahrenheit
    temperature input.
    """
    offset = 32
    multiplier = 5 / 9
    celsius = (fahrenheit - offset) * multiplier
    print("inside function:", fahrenheit, offset, multiplier, celsius)
    return celsius

temperature = 95
converted = fahrenheit_to_celsius(temperature)
print("Fahrenheit temp:", temperature)
print("Celsius temp:", converted)

# Variables defined inside a function are local to that function
fahrenheit = 27
offset = 2
multiplier = 19
celsius = 77
print("before:", fahrenheit, offset, multiplier, celsius)
newtemp = fahrenheit_to_celsius(32)
print("after:", fahrenheit, offset, multiplier, celsius)