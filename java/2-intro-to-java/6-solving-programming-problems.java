// 7 STEP APPROACH

/** First get the PROBLEM STATEMENT by breaking it don to small bits then;

**[1] ==> work example by hand;

- solve small instances by hand
- having issues?
  -- means the problem is unclear. find out what you need to do.
  -- ask your technical lead, or customer or find it out yourself
  -- domain knowledge(seek knowledge on the concepts you are working on)

**[2] ==> write down what you did;

- write down the exact steps of what you did in step 1.
- having issues?
  -- go back to step 1

**[3] ==> find patterns

- look at the steps of what we wrote in step 2 and find patterns
- write an algorithm for any instance of the problem.
- Repetition
  -- what we are doing over and over again,
  -- how many times are we doing them(loops, constructs).
- conditions
  -- under what conditions does this happen(conditionals like if else, etc).
- values
  -- why we used a particular value(s)
- having issues?
  -- try step 1 and 2 again
  -- try different inputs

**[4] ==> check by hand

- check algorithm by hand for mistakes
  -- here, we sort everything out before translating it to code.
- check with one or more different inputs.

**[5] ==> Translate to code

- translate algorithm to code - any programming language you are working with.

**[6] ==> run test cases

- execute program
- run tests to check answer, if test passes, fine. else move to step 7

**[7] ==> debug failed cases

- apply step by step scientific method
  **\- observe a phenomenon
  when your exhibit incorrect behavior or even crashes.
  **\- ask a question
  ie; why code is broken and how to fix it.
  **\- gather information and apply expert knowledge
  gather information, run tests, research and repeat.
  --- print variables, or lines of code at every line to find the bug.
  --- the use of debugging tools
  --- execute code by hand

  **\- form a Hypothesis
  once you've gathered enough info, create a statement that predicts behavior of your program. ie; 'if i do this, my code should do this'.
  good hypothesis should be;
  --- testable(specifically predict behavior and outcome of our code).
  --- actionable.(if it returns true, then we know whats wrong and fix our code)
  --- be specific with the above two results(testable and actionable). ie; returning a print statement that says 'problem is division by 0 on line 5, when an input pixel has red < 30 and green > 245'

  **\- test your hypothesis
  test the code and if it fails, go back to gathering information and expert research. we test by;
  --- running our program
  --- if the behavior or outcome matches our prediction, that will be the outcome of the test case.
  --- it it does'nt match, we reject the hypothesis and begin a new one.

- understand problems and fix.
- having issues?
- if it's an algorithmic problem, return to step 3
- if it's an implementation problem, return to step 5.

*/

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

/**
 * * SEPARATION OF CONCERNS
this is a design principle for separating computer programs into distinct sections such that each section addresses a separate concern . ie;
a business logic is a concern, while the user interface is another concern
 * */
