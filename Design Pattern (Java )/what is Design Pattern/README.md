# Design Pattern

# Proven and Tested "ways of thinking" about Code Design.

* Strategy
* Observer
* Facade
* Factory
* Decorator
* Adapter
* Singleton
---
## The Strategy Design Pattern
#### is Used to creat different Algorithm for each object are called at run time.
---
## The Observer Design Pattern
#### defines a 1-to many dependency between object changes state, all of its dependents are notified and update automatically.
---
## The Decorator Design Pattern
#### Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior. Decorator design pattern is one of the structural design pattern (such as Adapter Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or interface with composition to implement.
---
## The Factory Design Pattern
#### In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.
---
## The Singleton Design Pattern
# sometimes we only need ONE instance of an object. 
# Singleton : Ensures a class  has only one instance, and provide a global point of access to it.

### Variable Visibility Problems
#### The Java volatile keyword guarantees visibility of changes to variables across threads. This may sound a bit abstract, so let me elaborate.

#### In a multithreaded application where the threads operate on non-volatile variables, each thread may copy variables from main memory into a CPU cache while working on them, for performance reasons. If your computer contains more than one CPU, each thread may run on a different CPU. That means, that each thread may copy the variables into the CPU cache of different CPUs 
---
## The Command Design Pattern
#### The Command pattern is known as a behavioural pattern,as it's used to manage algorithms, relationships and responsibilities between objects. Thedefinition of Command provided in the original Gang of Four book on DesignPatterns states: 
* Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations
---
## The Adapter Design Pattern
#### converts the interface of a class into another interface the client expect.
#### Adapter lets classes work together that couldn't otherwise becuase of incompatible interfaces. 

