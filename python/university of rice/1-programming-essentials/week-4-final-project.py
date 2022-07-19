"""
Project for Week 4 of "Python Programming Essentials".
Collection of functions to process dates.

Be sure to read the project description page for further information
about the expected behavior of the program.
"""

import datetime
datetime = datetime.datetime

def days_in_month(year, month):
    """
    Inputs:
      year  - an integer between datetime.MINYEAR and datetime.MAXYEAR
              representing the year
      month - an integer between 1 and 12 representing the month

    Returns:
      The number of days in the input month.
    """
    month1 = datetime(year,month,1)
    next_month = month+1
    if next_month > 12 :
        next_month = 1
        year = year + 1
    month2 = datetime(year, next_month,1)
    difference = month2-month1
    return difference.days


def is_valid_date(year, month, day):
    """
    Inputs:
      year  - an integer representing the year
      month - an integer representing the month
      day   - an integer representing the day

    Returns:
      True if year-month-day is a valid date and
      False otherwise
    """
    if year >= datetime.min.year and year <= datetime.max.year:
        if month >= 1 and month <= 12:
            if day >= 1 and day <= days_in_month(year,month):
                return True
    return False

def days_between(year1, month1, day1, year2, month2, day2):
    """
    Inputs:
      year1  - an integer representing the year of the first date
      month1 - an integer representing the month of the first date
      day1   - an integer representing the day of the first date
      year2  - an integer representing the year of the second date
      month2 - an integer representing the month of the second date
      day2   - an integer representing the day of the second date

    Returns:
      The number of days from the first date to the second date.
      Returns 0 if either date is invalid or the second date is
      before the first date.
    """
    if is_valid_date(year1,month1,day1) and is_valid_date(year2,month2,day2):
        difference = datetime(year1,month1,day1) - datetime(year2,month2,day2)
        return difference.days

    return 0

def age_in_days(year, month, day):
    """
    Inputs:
      year  - an integer representing the birthday year
      month - an integer representing the birthday month
      day   - an integer representing the birthday day

    Returns:
      The age of a person with the input birthday as of today.
      Returns 0 if the input date is invalid or if the input
      date is in the future.
    """
    today = datetime.now()
    days = days_between(today.year,today.month,today.day, year,month,day)
    if days < 0:
        return 0
    return days
