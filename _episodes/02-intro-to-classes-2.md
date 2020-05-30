---
title: "Constructors, public versus private, and static versus non-static"
teaching: 20
exercises: 20
questions:
- "Key question (FIXME)"
objectives:
- "First learning objective. (FIXME)"
keypoints:
- "First key point. Brief Answer to questions. (FIXME)"
---

Let's revisit our CellPhoneOne code. From the previous lecture, we realize that
the way that code is setup does not make intuitive sense. The physical attributes
should be assigned specific values as the CellPhoneOne object is instantiated. 
This brings up a number of expanded definitions: public and private fields/attributes.

# Public and Private

A(n) field/attribute in a class must be either public or private. A **public** field can 
be accessed and modified by method/operation from outside of the class' definition. A **private**
field can only be accessed/modified from within the class' definition. Similarly, a **public** 
method is a method that can be called from outside of the class' definition, while a **private** 
method can only be called from inside the class definition.

Analogically speaking, let's think about the brightness setting of a cell phone. It is 
possible to change the strength of electrical currents from inside the phone such that 
the light emittors on the screen increase/reduce their intensity. It is not possible 
to do that *directly*. Therefore we need that sliding function on the phone so that 
we can adjust the phone's brightness via this function. In this case, brightness is a 
**private attribute** that can be manipulated by a method controllable externally (the slider), 
which means that it is a **public method**. 

In another analogy, let's think about iPhone's performance throttling incident, where 
older iPhones automatically slowdown when their battery degrade. Battery level, battery life, 
and CPU performance are all internal measureable attributes of a cell phone. To throttle
the performance (e.g., reduce CPU speed), there must be an internal function/method that
evalutes battery level and battery life and then throttles the CPU accordingly. This is 
an example of a **private method** manipulating **private attributes**. 

In most cases, a class' methods use that class' private attributes for specific purposes. 
However, there are two types of special methods whose purposes are quite straightforward:
to present the current value of a private attribute to the outside world and to change the 
current value of a private attribute to a new value given by the outside world. The former 
is called a **mutator** method and the latter is called an **assessor** method. 

# Constructors

In `CellPhoneOneMain.java`, line 7 instantiates the object from its class definition. In 
other words, the `aPhone` object is created from class `CellPhoneOne`. Relating this back 
to the real world, we know that once something is physically created from a blueprint, its
characteristics are now materialized and in some sense, measurable. The creation of a cell
phone from a blueprint, therefore, is an involved process. We could certainly do the same
thing with our object instantiation process through the help of **constructors**. 

<script src="https://gist.github.com/linhbngo/d4dcf56c9d764b7f444e1452fcddc045.js?file=CellPhoneOneMain.java"></script>

A **constructor** is a special method that is called when an object of a class is created/instantiated. 
The constructor contains codes that help initilizing the object's attributes. 

# Example



# Passing Objects as Arguments

{% include links.md %}
