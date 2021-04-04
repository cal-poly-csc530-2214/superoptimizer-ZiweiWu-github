﻿# superoptimizer-ZiweiWu-github
I read the Superoptimzer paper and the Aha paper. I looked through the Aha code and played around with it before trying to think about how I would implement such a thing from scratch. I used Java for some OOP. Most of the time was spent on trying to figure out the search space.

The Aha Code folder contains the Aha Code. The "mytest.h" file contains the user defined function of "return x+60;". The file "mytest.out" contains the output of the superoptimizer for the function, but not all of it. The program seemed to have stalled for unknown reasons and I had to manually halt it. 

The "src" folder contains Java code.  
AhaJava.java contains my attempt at starting form scratch after looking at the Aha code and trying to implement it myself with some OOP. I stopped at trying to define the search space as a giant tree and didn't know if it was a good idea to continue on this line of thought.  
App.java contains code to test the timing of the optimized code "return x+60;" code. What's interesting is that it's slower than just doing "x+60" in Java for lower numbers of iterations, but becomes faster when the number of iterations is greater than or equal to 50,000.  
App.class contains the bytecode for App.java. Use "javap -verbose App.class" to see the bytecode.
