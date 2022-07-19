# Demonstration of arithmetic comparisons

# Six different arithmetic comparison operators
print("Comparisons")
print("===========")
# greater than
print(7 > 3)
# less than
print(7 < 3)
# greater than or equals to
print(7 >= 3)
# less than or equals to
print(7 <= 3)
# 'the same as'
print(7 == 3)
# not equals to
print(7 != 3)

print("")

# Using comparisons to get a boolean value
print("Comparing Variables")
print("===================")
num1 = 7.3
num2 = 8.6

greater = num1 > num2
print(greater)

print("")

# == and != are also useful for non-numeric types
print("Comparing Strings")
print("=================")
name = 'Scott'

# Beware of = and == confusion!
equal = name != "Joe"
print(equal)
