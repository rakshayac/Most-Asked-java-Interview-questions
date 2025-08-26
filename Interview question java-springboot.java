LEVEL 1 - Beginner (0-2 experience)
1. Different b/w JVM,JRE,JDK
    1. JVM (Java Virtual Machine)
Definition: JVM is a runtime environment that executes Java bytecode.
Role: It converts compiled Java bytecode (.class files) into machine code for the underlying OS.
Key Points:
Platform dependent (different JVM implementations for Windows, Linux, Mac).
Provides features like Garbage Collection, Memory Management, Security.
Doesn’t include tools for development (only for running).

2. JRE (Java Runtime Environment)
Definition: JRE is a package that provides everything needed to run a Java program.
Contains:
JVM
Core Java class libraries (java.lang, java.util, etc.)
Supporting files
Key Point: JRE = JVM + Libraries (but no development tools like compiler).
Used by: End users who just need to run Java apps, not develop.

3. JDK (Java Development Kit)
Definition: JDK is a software development kit for Java.
Contains:
JRE (so it also has JVM)
Development tools (like javac compiler, javadoc, debugger, etc.)
Key Point: JDK = JRE + Development tools
Used by: Developers who write, compile, and debug Java code.

📊 Comparison Table
Feature	JVM	JRE	JDK
Full form	  Java Virtual Machine	  Java Runtime Environment	              Java Development Kit
Purpose	    Executes Java bytecode	Provides environment to run Java apps	  Provides tools to develop & run Java apps
Includes	  Only JVM	              JVM + Libraries	                        JRE + Compiler + Tools
Used by	   Both developers & users 
          (indirectly)	            End users (running apps)	               Developers (writing apps)

👉 Simple Analogy:

JVM = Engine
JRE = Car (engine + essentials to run)
JDK = Car factory (car + tools to build new cars)
---------------------------------------------------------------------------------------------------------------------------------
2.Main features of java(oops principles)
1.Encapsulation
Wrapping data (variables) and methods (functions) together into a single unit → class.
Data hiding: internal details are hidden, only exposed through methods (getters/setters).

Example:
class Student {
    private String name;   // hidden data
    public void setName(String n) { name = n; }
    public String getName() { return name; }
}
2.Abstraction
Hiding implementation details and showing only essential features.
Achieved using abstract classes and interfaces in Java.

Example:
interface Vehicle {
    void start();   // only essential behavior
}
3.Inheritance
Mechanism of acquiring properties & behaviors of one class into another.
Promotes code reusability.

Example:
class Animal {
    void eat() { System.out.println("eating..."); }
}
class Dog extends Animal {
    void bark() { System.out.println("barking..."); }
}
4.Polymorphism
Same name but different behaviors.
Two types:
Compile-time (Overloading) → same method name, different parameter list.
Runtime (Overriding) → child class provides new implementation of parent method.

Example:
class Shape {
    void draw() { System.out.println("drawing shape"); }
}
class Circle extends Shape {
    void draw() { System.out.println("drawing circle"); }
}

✨ Other Supportive Features
Class & Object → Basic building blocks.
Constructor & Destructor → Object lifecycle management.
Association, Aggregation, Composition → Object relationships.

📊 Quick Table
Feature	         What it does	                Example Keyword
Encapsulation	  Data hiding + wrapping	    private, getter/setter
Abstraction	      Hides implementation	    abstract, interface
Inheritance	      Reusability of code	       extends, implements
Polymorphism	 Many forms of same method	  Overloading, Overriding

👉 A common real-life analogy is a Car:

Encapsulation → Engine is hidden inside.
Abstraction → You just use the steering wheel & pedals.
Inheritance → ElectricCar inherits from Car.
Polymorphism → start() works differently for PetrolCar vs ElectricCar.
    
3.what are primitive data types in java?
    Definition:
Primitive data types in Java are the basic building blocks of data manipulation. They are not objects and hold
    simple values directly in memory. Java provides 8 primitive data types, which are predefined by the language.

📊 List of Primitive Data Types
Data Type	   Size	         Default Value	     Example	Used For
byte	       8-bit	0	byte b = 10;	     Small integers (-128 to 127)
short	      16-bit	0	short s = 1000;	      Larger range than byte
int	           32-bit	0	int x = 50000;	       Common integer values
long	      64-bit	0L	long l = 100000L;	     Very large integers
float	      32-bit	0.0  float f = 3.14f;	Decimal values (single precision)
double	      64-bit	0.0ddouble d = 3.14159;	Decimal values (double precision)
char	     16-bit (Unicode)	'\u0000'	char c = 'A';	Single characters
boolean	   1-bit (JVM specific)	false	boolean flag = true;	True/False values
    Real-world Example
Think of primitive types as raw ingredients (sugar, flour, salt). They are basic and lightweight.
Whereas objects (like String, ArrayList) are ready-made dishes created using those raw ingredients.
