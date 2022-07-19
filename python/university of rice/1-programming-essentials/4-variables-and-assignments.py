"""
Demonstration of the use of variables and how to assign values to
them.
"""

# The = operator(assignment operator) can be used to assign values to variables
bakers_dozen = 12 + 1
temperature = 93

# Variables can be used as values and in expressions
print(temperature, bakers_dozen)
print("celsius:", (temperature - 32) * 5 / 9)
# the float() method returns a float... if its argument is a whole number, it gives a decimal point and 0. ie, float(4) = 4.0
print("fahrenheit:", float(temperature))

# You can assign a different value to an existing variable and the older one above doesnt change or get effected. so the change actually occurs after the new change
temperature = 26
print("new value:", temperature)

# Multiple variables can be used in arbitrary expressions
offset = 32
multiplier = 5.0 / 9.0
celsius = (temperature - offset) * multiplier
print("celsius value:", celsius)
# use variable names that makes sense!