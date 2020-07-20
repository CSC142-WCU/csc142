---
title: "Search and Sort"
teaching: 20
exercises: 20
questions:
- "How do you search through data items in an array?"
- "How do you sort data items in an array?"
- "Why do we learn search and sort in the same lecture?"
objectives:
- "Be able to interate through an array-like structure to find data items."
- "Be able to rearrange data items of an array in ascending or descending orders."
- "Understand how easier it is to search through a sorted array."
keypoints:
- "By iterating through that array."
- "By switching positions (index) of different data items in an array."
- "Searching can be done faster on a sorted array."
---

# Sequential Search

We can use a loop to step through an array from the first item, and stop when:
- We find the item of interest, or
- We reach the end of the array. 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=SearchInt.java"></script>

> ## Code Modification:
> 
> Create a copy of `SearchInt.java` called `SearchMultiInt.java`. Modify this code such 
> that users can provide multiple command line arguments, 
> and the program will check all these arguments against the elements in `numArray`.
>
> > ## Solution
> >  Use a nested loop ...
> {: .solution}
{: .challenge}

# Selection Sort 

Selection sort is a sorting technique, in which we find the smallest (or largest) element
and place it at the beginning of the array, and then continue to find the second smallest
(or second largest) element and place it at the next position, and so on. Since we are 
*selecting* which element to place into which position as we iterate through all positions
in an array, this is called **selection sort**.

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=SelectionSort.java"></script>

The outcome of this sorting technique is shown below:

<img src="../assets/fig/SelectionSort.PNG" alt="Compile and Run SelectionSort.java" style="height:300px">

To see how this works, `SelectionSort.java` is modified inton `SelectionSortVisual.java`:

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=SelectionSort.java"></script>

<img src="../assets/fig/SelectionSortVisual.PNG" alt="Compile and Run SelectionSortVisual.java" style="height:800px">


# Binary Search

In the real world, When we want to find something, it is always easier to find if the 
surrounding environment is organized. This principle applies to searching/finding data
items in programs: it is easier and faster if the array of data is aleady sorted. 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=BinarySearch.java"></script>


{% include links.md %}
