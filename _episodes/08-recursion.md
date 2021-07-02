---
title: "Introduction to Recursion"
teaching: 20
exercises: 20
questions:
- "What is recursion?"
objectives:
- "Understanding the concept of recursion"
keypoints:
- "Recursion happens when a method calls itself!"
---

# Introduction to Recursion

Miriam Webster definition: "a computer programming technique involving the user of a 
procedure, subroutine, function, or algorithm that **calls itself one or more time** 
until a specified contition is met at which time the rest of each repetition is processed from the last one called to the first."

> ## A realistic example:
> The class is taking an exam today. The instructor steps into the class and gives a 
> stack of printed exams to the first student at the front row. This student keeps one
> copy and give the rest to the next student. The second student keeps one copy and give
> the rest to the third student and so on. When it gets to the last student, there is 
> no more student without a copy of the exam, and this last student keeps one last copy
> (assuming the number of copies is equal to the number of students). At this point, 
> everyone starts taking the exam. 
{: .callout}

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=Exams.java"></script>

The visual of `Exams.java`'s recursive `keepAndPass` call can be seen below:

<img src="../fig/recursion/Exams.PNG" alt="Compile and run Exams.java" style="height:400px">

<img src="../fig/recursion/Exams_diagram.png" alt="Visual demonstration of keepAndPass recursive calls" style="height:700px">

> ## Approach to solve a problem recursively:
> - Carry out a few steps of the intended task and identify if
> the problem reduces in size but remain structurally the same. 
> - Identify a **stopping condition**. 
{: .callout}

# Examples of problems solved by recursive methods. 

- Given a string, check if it is a palindrome or not. 
- Calculate factorials of a number. 
- Calculate an arithmetic series. 
- Binary search. 

<img src="../fig/recursion/recursive.PNG" alt="Visual examination of recursive examples" style="height:900px">

{% include links.md %}
