"""
Demonstration of compound arithmetic expressions in Python
"""

# Expressions can include multiple operations



print("Compound expressions")
print(3 + 5 + 7 + 27)
# operators with the same precedence(+ , - and /, *) are evaluated from left to right;
print(18 - 6 + 4)

print("")

# Operator precedence defines how expressions are evaluated
'''
order of precedence(from high to low)
- parenthesis ()
- exponentiation **
- integar divide(a.k.a truncated division or floor division) //
- multiplication * and division /
- Addition + and subtraction -
'''

print("Operator precedence")
print(7 + 3 * 5)
print(5.5 * 6 // 2 + 8)
print(-3 ** 2)

print("")

# Use parentheses to change evaluation order
print("Grouping with parentheses")
print((7 + 3) * 5)
print(5.5 * ((6 // 2) + 8))
print((-3) ** 2)
################################################################################################################################################################################

def f(x):
    y = - 5*x**5 + 67 * x**2 - 47
    return y

print(f(0))
print(f(1))
print(f(2))
print(f(3))

def future_value(present_value, annual_rate, periods_per_year, years):

    rate_per_period = annual_rate / periods_per_year
    periods = periods_per_year * years

    # Put your code here
    fv = present_value * (1 + rate_per_period ) ** periods
    return fv

from cmath import sqrt

print("$1000 at 2% compounded daily for 4 years yields $", future_value(1000, .02, 365, 4))
print(future_value(500, 0.04, 10, 10))

def equ(a):
    x = ( sqrt(3) / 4) * a**2
    return x
print(9)