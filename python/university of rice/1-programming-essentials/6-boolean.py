# the boolean value returns either True or False
'''
## the below table better explains the boolean operators
here, True is represented by T, False id represented by F.
using two variables a and b, this better explains the 'or' and 'and' boolean operators.

a    b    a or b    a and b
T    T      T          T
T    F      T          F
F    T      T          F
F    F      F          F

'''
# Boolean values are True and False
# note to ALWAYS Capitalize True and False
value1 = True
value2 = False
print(value1, value2)

print("")

# Logical NOT
'''this is the reverse of the value. ie;
a = true
not a becomes false.'''

print("Logical NOT")
print("===========")
print(not value1)
print(not value2)

print("")

# Logical AND
'''this involves two variables and both variables must align.'''
# when you do logical AND with one false value, you always get false.
print("Logical AND")
print("===========")
print(value1 and value1)
print(value1 and value2)
print(value2 and value2)

print("")

# Logical OR
'''this involves two variables and either one of them must align'''
print("Logical OR")
print("==========")
print(value1 or value1)
print(value1 or value2)
print(value2 or value2)

print("")

value3 = True
value4 = True
'''
NOTE:
- here, we use operator precedence where from highest to lowest; NOT, AND, OR
- always use parenthesis in your boolean expressions

'''
print(value2 or ((value1 and value4) or value3))
