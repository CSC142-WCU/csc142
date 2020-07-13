---
title: "Arrays of Objects"
teaching: 20
exercises: 20
questions:
- "Can array be used to organize complex (non-primitive) object?"
- "Can multiple arrays be used to represent something similar to a spreadsheet?"
objectives:
- "Be able to declare, initialize, access, and manipulate arrays of complex objects."
- "Be able to declare, initialize, access, and manipulate two-dimensional arrays."
keypoints:
- "As a data structure, arrays can be used to organize collection of any objects (of the same complex type."
- "Arrays can have multiple dimensions to represent spreasheets whose columns are of the same type and have the same length."
---

Array (the concept) is the most basic data structure (*just line things up!*) in programming and 
can be used to organized  both primitive and complex objects. 

> ## Problem Statement
> We wish to study how many awards, and how much money, have been granted to Pennsylvania
> from National Science Foundation (NFS)'s Directorate of Computer and Information Science
> and Engineering (CISE) in 2019. The file `Awards_CISE_2019.csv` contains all awards from 
> CISE. The first line is the header line. The header represents the relevant fields of an 
> an award, including AwardNumber, Title, NSFOrganization, Program(s), StartDate, 
> LastAmendmentDate, PrincipalInvestigator, State, Organization, AwardInstrument, 
> ProgramManager, EndDate, AwardedAmountToDate, Co-PIName(s), PIEmailAddress, 
> OrganizationStreet, OrganizationCity, OrganizationState, OrganizationZip,
> OrganizationPhone, NSFDirectorate, ProgramElementCode(s), ProgramReferenceCode(s),
> ARRAAmount, Abstract. The data (string) in each field is enclosed in double quotes, and
> separated by a comma. 
> - Mine the list of all states that received awards in 2019. 
> - Refine/augment list of work to include award titles. 
> - Include additional information per award, including the amount of money. 
{: .prereq}

# Array of Strings

In `ParseAwards.java`, we carry out the first task of mining the URL of the online site, 
extract information about Shakespeare's work, and classify individual work into play, sonnets, or poems. 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=ParseAwards.java"></script>

> ## Code Reading Practice:
> 
> Going over the above source code line by line. 
>
> > ## Solution
> >  - Line 1-2: Java imports
> >  - Line 4: Class name - `ParseAwards`
> >  - Line 5: Main function
> >  - Line 6-12: Scope of `try` 
> >  - Line 7: Create a `File` object using the *relative path* to data file `Awards_CISE_2019.csv`. Assign this object to variable `awardFile`.
> >  - Line 8: Declare a Scanner object that *scan* from content of `awardFile`, and assign this object to variable `sc`. 
> >  - Line 9: While there is still next line (`hasNextLine()`) in `awardFile`, step into `while` loop. 
> >  - Line 10: The string read in by `sc.nextLine()` is splitted using `","` as token. This is due to the characteristics of data line in the file. The resulting array of Strings is assigned to variable `award` of type array of Strings.  
> >  - Line 11: The eigth element of the `award` variable (`award[7]`) is printed out.  
> >  - Line 13-15: The `catch` portion in the case we have an IOException error. 
> {: .solution}
{: .challenge}

> ## Code Correction:
> 
> There is a logical error with this code. What is it, and how do you fix it? 
>
> > ## Solution
> >  - The `State` header is included in the results. 
> >  - Run `nextLine()` once prior to the `while` loop to ommit the header row. 
> {: .solution}
{: .challenge}

In running the above code, besides creating the `ParseAwards.java` file, we must also download [Awards_CISE_2019.csv](awards-cise-2019) and store this 
file in the same directory as the Java file. 

<img src="../assets/fig/parseAwards.png" alt="Viewing data and source code for ParseAwards.java and then compile and run" style="height:300px">

To further improve on `parseAwards.java`, we can redesign it so that `main()` is simplified and the heavy work is moved into another function. This is 
shown `ExtendedParseAwards.java`. 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=ExtendedParseAwards.java"></script>

> ## Code Reading Practice:
> 
> Going over the above source code line by line. 
>
> > ## Solution
> >  - Line 1-2: Java imports
> >  - Line 4: Class name - `ParseAwards`
> >  - Line 24: Main function
> >  - Line 25: Static method `stateList` is invoked with argument is the name of the data file (same-directory assumption). The returned value of this method call will be assigned to variable fundedStates of type array of Strings. 
> >  - Line 6: Declaration of method `stateList` with parameter is a String contains the path to the file. 
> >  - Line 7: Assign an empty String to variable states of type String. 
> >  - Line 8-17: Scope of `try` 
> >  - Line 9: Create a `File` object using the *relative path* to data file `Awards_CISE_2019.csv`. Assign this object to variable `awardFile`.
> >  - Line 10: Declare a Scanner object that *scan* from content of `awardFile`, and assign this object to variable `sc`. 
> >  - Line 11-16: While there is still next line (`hasNextLine()`) in `awardFile`, step into `while` loop. 
> >  - Line 12: The string read in by `sc.nextLine()` is splitted using `","` as token. This is due to the characteristics of data line in the file. The resulting array of Strings is assigned to variable `award` of type array of Strings.  
> >  - Line 13: If `states` does **not** already contain the eigth element of the `award` variable (`award[7]`),
> >  - Line 14: Append `award[7]` and a space to `states`.  
> >  - Line 17: Return the result of a split call on `states` using a single space (`" "`) as token. 
> >  - Line 18-20: The `catch` portion in the case we have an IOException error. 
> >  - Line 21: If an exception happens, a `null` value will be returned. 
> >  - Line 26-28: Iterate through elements of `fundedStates` using `i`, with `i` iterates from 0 to a value less than the length of the `fundedStates` array. 
> >  - Line 27: Print out the element at index i<sup>th</sup> of `fundedStates`.  
> {: .solution}
{: .challenge}

# Array of Objects

To store additional information on each individual states, we will need to create a `State` class (`State.java`). 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=Work.java"></script>

Class `ExtendedURLParser.java` leverages `Work` to acquire and display more information. 
Intead of using an array of Strings to store only the partial links to the individual work, 
`ExtendedURLParser` uses an array of `Work`. When contents are extract from the base URL, both 
title and partial URL of each work are used as arguments in the instantiation of an object of type `Work`. 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=ExtendedParseAwards.java"></script>

> ## Code Reading Practice:
> 
> Indentify the differences between `ExtendedURLParser.java` and `URLParser.java`. 
>
> > ## Solution
> >  - Line 46: Declare variable `workList` as an array of `Work` objects instead of an array of Strings.  
> >  - Line 30: Declare a variable `results` as an array of `Work` objects and initialize `results` to **null** value. 
> >  - Line 35: Initialize variable `results` (declared in line 28) to an array of `Work` objects. 
> >  - Line 38: The item ranked `b` in the `results` array is assigned a `Work` object that has been instantiated with the text of the title and the partial URL as constructor arguments. 
> >  - Line 37: Return `results`. This will terminate the method. 
> >  - Line 50: Call method `getType` with argument is variable `workList`, which contains the returned array of `Work` objects from `getWork`. 
> >  - Line 14: Define method `getType` as a public and static method, which takes in an array of `Work` objects as a parameter. `getType` does not return anything (void). 
> >  - Line 15-23: A **for** loop that iterates through each item in the array of `Work` objects. 
> >  - Line 16-21: The over ideas are the same, but asessor and mutator methods are used to access and modify title and type attributes of individual `Work` objects. 
> {: .solution}
{: .challenge}

# Two dimensional arrays

To know the length of each play, we can (naively) multiply the number of acts and the number of scenes in each act. In other word, we need to mine and store this information. Perhaps a two dimensional array of integers, with the first dimension storing 

{% include links.md %}
