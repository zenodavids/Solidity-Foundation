"""
Demonstration of importing modules.
"""

# Import the math module (look in the Docs for help)
import math

# Import example module
# nickname the example3_module as example only for use in this file.
# import examples3_module as example

# Constants
print("Math constants")
print("==============")
print(math.pi)
print(math.e)
print("")

# Functions
print("Math functions")
print("==============")
# returns the square root of a number
print(math.sqrt(25))
# converts floats to the nearest integar
print(math.trunc(14.83483))
print(math.sin(math.pi / 2.0))
print("")

# Dir
print("Dir")
print("===")
# the dir() returns a list of attributes for that module
print(dir(math))
# print(dir(example))
print("")

# this gives the name of the module
print(math.__name__)
# print(example.__name__)

################################################################################

"""
Demonstration of some of the features of the datetime module.
"""

import datetime
print(dir(datetime))

# Create some dates
print("Creating Dates")
print("==============")
# to create dates, pass the year, months and day
date1 = datetime.date(1999, 12, 31)
date2 = datetime.date(2000, 1, 1)
date3 = datetime.date(2016, 4, 15)
# date4 = datetime.date(2012, 8, 32)

# this method gives us Today's date
today = datetime.date.today()

print(date1)
print(date2)
print(date3)

print("")

# Compare dates
print("Comparing Dates")
print("===============")

print(date1 < date2)
print(date3 <= date1)
print(date2 == date3)

print("")

# Subtracting dates
print("Subtracting Dates")
print("=================")

diff = date2 - date1
print(diff)
# gives the number of days
print(diff.days)

diff2 = date3 - date2
print(diff2)
print(diff2.days)

print("")

