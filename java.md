# Java

## Table of Contents
1. [JDK-JRM-JVM](#JDK-JRM-JVM)
2. [Classes vs Objects](#classes-vs-objects)
3. [Java Class Members](#java-class-members)
4. [Constructors-Methods-Parameters](#constructors-methods-parameters)
5. [Packages and Imports](#packages-and-imports)
6. [Exception Hierarchy](#exception-hierarchy)
7. [Annotations in Java](#annotations-in-java)
8. [Java Primitive Data Types](#java-primitive-data-types)
   1. [Java Wrapper Classes](#java-wrapper-classes)
   2. [Literals in Java](#literals-in-java)
   3. [Operators in Java](#operators-in-java)
   4. [Coercion in Java](#coercion-in-java)
9. [Java CharSequence](#java-charsequence)
10. [Java String, StringBuilder, and StringBuffer](#java-string-stringbuilder-and-stringbuffer)
    1. [Reading and Writing in Java](#reading-and-writing-in-java)
11. [Generics in Java](#generics-in-java)
12. [Encapsulation](#encapsulation)
    1. [Access Modifiers](#access-modifiers)
    2. [Non Access Modifiers in Java](#non-access-modifiers-in-java)
13. [Inheritance in Java](#inheritance-in-java)
14. [Abstraction in Java](#abstraction-in-java)
    1. [Abstract Classes in Java](#abstract-classes-in-java)
    2. [Interfaces in Java](#interfaces-in-java)
15. [Polymorphism in Java](#polymorphism-in-java)
    1. [Method Overloading](#method-overloading)
    2. [Method Overriding](#method-overriding)
16. [Object-Oriented Programming Principles](#object-oriented-programming-principles)
17. [Types of References in Java](#types-of-references-in-java)
18. [Arrays in Java](#arrays-in-java)
19. [ArrayList in Java](#arraylist-in-java)
20. [LinkedList in Java](#linkedlist-in-java)

## JDK JRM JVM

**Java Development Kit (JDK)** is a software development environment used for developing Java 
applications and applets. It includes the Java Runtime Environment (JRE), an 
interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation 
generator (Javadoc), and other tools needed in Java development.

Now we need an environment to make a run of our program. Henceforth, JRE stands for 
“Java Runtime Environment” and may also be written as “Java RTE.” The **Java Runtime 
Environment** provides the minimum requirements for executing a Java application; it 
consists of the _Java Virtual Machine (JVM), core classes, and supporting files_.

Now let us discuss **JVM**, which stands out for java virtual machine. It is as follows:

* A specification where the working of **Java Virtual Machine** is specified. But 
implementation provider is independent to choose the algorithm. Its implementation 
has been provided by Sun and other companies.


* An implementation is a computer program that meets the requirements of the JVM 
specification.


* Whenever you write a java command on the command prompt to run 
the java class, an instance of JVM is created.

## Classes vs Objects

To develop a program in Java, we make use of objects and classes. While a class in 
Java is only a logical unit, an object in Java is both a physical and logical entity.

**What is an object in Java?**

An object is an entity that has a state and exhibit behavior. For example, any 
real-life entity like a pen, a laptop, a mobile, a table, a chair, a car, etc. is an object.

**State** tells us how the object looks or what properties it has.
**Behavior** tells us what the object does.

**So what is a Class?**

We know the main component of object-oriented programming is an object. If we want 
to build a specific type of object, we need a blueprint. This blueprint will provide 
us a set of instructions that will help us to build an object.

For example, let’s say we want to build a house. The house here is an object. 
To build a house we need an initial blueprint for the house. We cannot go about 
directly building the house as we please.

This is where class comes into the picture. So to build an object or real-life 
entity, we will first have a blueprint that determines the contents and behavior 
of an object. This is known as a class in object-oriented programming.

So a class can be defined as “a blueprint or a template, and it defines the state and 
behavior of the object”.

### How To Create A Class In Java

The general class syntax of a class definition in Java is:

**<access_modifier>** class **<class_name>** { }

```java
public class Dog {

    /*
     * fields
     * constructors
     * methods
     */

}
```

### Objects In Java

Now, we have enough knowledge about classes in Java, we can redefine the object in terms of class. So an object is “an
instance of a class”. Thus we create a variable or instance of type class_name and it is termed as an object.

Some points to remember about an object:

- An object is seen as a basic unit of OOP along with the class.
- An object is a runtime unit.
- An object is termed as an instance of a class.
- An object has behavior and state.
- An object takes all the properties and attributes of the class of which it is an instance. But at any point, each
  object has different states or variable values.
- An object is used to represent a real-time entity in software applications.
- A single class can have any number of objects.
- Objects interact with each other by way of invoking methods.

### How To Instantiate An Object

Declaration of the object is also termed as an instantiation of objects in Java.
The declaration of an object is the same as declaring a variable.

```java
public class Main {
    public static void main(String[] args) {
        
        /* creating a dog object */
        Dog mydog = new Dog();
        
        /* with this dog object I'm able to access its attributes and behaviors with the "." operator */
        mydog.bark(); // this will print out "Woof!"
        mydog.shake(); // this will print out "Shake shake!"
    }
}
```

## Java Class Members

### Fields

Fields are variables or data of the class. Fields are also called as member 
variables in Java. We use the terms field and variable interchangeably.

**Usually, Fields of a class are of two types:**

1) **Class Variables:** Class variables are declared with the word “static” so that they are static variables. This
   means that this type of variable has only one copy per class, irrespective of how many instances or objects are
   present for that class.


2) **Instance Variables:** These are the opposite of class variables. The data 
members are called instance variables because these variables have separate memory
allocated for them for each class instance at runtime.

```java
public class Dog {
    /* these are fields or attributes of the class Dog */
    private int age;
    private String breed;
    private String fur;
}
```
## Constructors-Methods-Parameters

### Constructor

Constructors are special methods that are generally used to initialize an instance of 
a class. Constructors do not have a return type, they have the same name as the 
class, and may or may not contain parameters.

```java
public class Dog {
    /* these are fields or attributes of the class Dog */
    private int age;
    private String breed;
    private String fur;

    /* default constructor. We need a constructor to "construct" the Dog class into an object */
    public Dog() {
        /* this can be empty since it's a default constructor */
    }

    /* this constructor is used for setting the attributes/fields during instantiation of the class. */
    public Dog(int age, String breed, String fur) {
        this.age = age;
        this.breed = breed;
        this.fur = fur;
    }
}
```

### Method

A method in a Java class is the function that defines the behavior of the object and its members.

```java
public class Dog {
    /* these are fields or attributes of the class Dog */
    private int age;
    private String breed;
    private String fur;

    /* default constructor. We need a constructor to "construct" the Dog class into an object */
    public Dog() {
        /* this can be empty since it's a default constructor */
    }

    /* this constructor is used for setting the attributes/fields during instantiation of the class. */
    public Dog(int age, String breed, String fur) {
        this.age = age;
        this.breed = breed;
        this.fur = fur;
    }

    /* these are the behaviors aka "methods" of the dog */
    public void bark() {
        System.out.println("Woof!");
    }

    public void shake() {
        System.out.println("Shake shake!");
    }
}
```

## Packages and Imports

A package in Java is used to group related classes. Think of it as a folder in a 
file directory. We use packages to avoid name conflicts, and to write a better 
maintainable code. Packages are divided into two categories:

* Built-in Packages (packages from the Java API)
* User-defined Packages (create your own packages)

To use a class or a package, you need to use the import keyword:

```java
import packageName.Class;   // Import a single class
import packageName.*;   // Import the whole package
```

## Exception hierarchy

In Java "an event that occurs during the execution of a program that disrupts the 
normal flow of instructions" is called an **exception**. This is generally an unexpected 
or unwanted event which can occur either at compile-time or run-time in application 
code. Java exceptions can be of several types and all exception types are 
organized in a fundamental hierarchy.

The class at the top of the **exception** class hierarchy is the `Throwable` class, 
which is a direct subclass of the `Object` class. `Throwable` has two direct 
subclasses - `Exception` and `Error`.

The diagram below shows the standard exception and error classes defined in Java, 
organized in the Java exceptions' hierarchy:

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png">

The `Exception` class is used for exception conditions that the application may 
need to handle. Examples of exceptions include 
`IllegalArgumentException`, `ClassNotFoundException` and `NullPointerException`.

The `Error` class is used to indicate a more serious problem in the architecture and 
should not be handled in the application code. Examples of errors 
include `InternalError`, `OutOfMemoryError` and `AssertionError`.

Exceptions are further subdivided into checked (compile-time) and unchecked 
(run-time) exceptions. All subclasses of`RuntimeException` are unchecked exceptions, 
whereas all subclasses of `Exception` besides `RuntimeException` are checked
exceptions.

## Checked vs Unchecked exceptions

## Checked Exceptions

Exceptions that can occur at compile-time are called checked exceptions since 
they need to be explicitly checked and handled in code. Classes that directly 
inherit `Throwable` - except `RuntimeException` and Error - are checked exceptions
e.g. `IOException`, `InterruptedException` etc.

Here is an example of a method that handles a checked exception:

```java
public void writeToFile() {
try (BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"))) {
        bw.write("Test");
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
} 
```

In this example, both statements within the try block (the instantiation of 
the `BufferedWriter` object and writing to file using the object) can throw 
`IOException`, which is a checked exception and therefore needs to be handled 
either by the method or its caller. In the example, `IOException` is handled within 
the method and the exception stack trace is printed to the console.

Furthermore, the `BufferedWriter` object is a resource, which should be closed when 
it is no longer needed and closing it can throw an `IOException` as well. In such 
cases where closing resources themselves can throw exceptions, using a 
try-with-resources block is best practice since this takes care of the closing 
of resources automatically. The example shown earlier uses try-with-resources 
for exactly this reason.

## Unchecked Exceptions

Unchecked exceptions can be thrown "at any time" (i.e. run-time). Therefore, 
methods don't have to explicitly catch or throw unchecked exceptions. Classes that 
inherit `RuntimeException` are unchecked exceptions e.g. `ArithmeticException`,
`NullPointerException`.

Here is an example of a method that throws an unchecked exception 
(`NullPointerException`) which is not handled in code:

```java
public void writeToFile() {
    try (BufferedWriter bw = null) {
        bw.write("Test");
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
} 
```

When the above method is called, a `NullPointerException` is thrown because 
the `BufferedWriter` object is null:

```java
Exception in thread "main" java.lang.NullPointerException
    at IOExceptionExample.writeToFile(IOExceptionExample.java:10)
    at IOExceptionExample.main(IOExceptionExample.java:17) 
```

As mentioned, since `NullPointerException` is an unchecked exception, it did not 
need to be handled in code - only the checked exception (`IOException`) was handled.

## Try-with-resources

## Java try block

Java **try** block is used to enclose the code that might throw an exception. 
It must be used within the method.

If an exception occurs at the particular statement in the try block, the rest of 
the block code will not execute. So, it is recommended not to keep the code in 
try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

## Syntax of Java try-catch

```java
try {

    //code that may throw an exception
        
} catch (Exception_class_Name ref){ }    
```

## Syntax of try-finally block

```java
try {
    
    //code that may throw an exception
        
} finally { } 
```

## Internal Working of Java try-catch block

<img src="https://simplesnippets.tech/wp-content/uploads/2018/05/internal-working-of-try-catch-finally-block-in-java.jpg">

The JVM firstly checks whether the exception is handled or not. If exception is 
not handled, JVM provides a default exception handler that performs the following 
tasks:

- Prints out exception description.
- Prints the stack trace (Hierarchy of methods where the exception occurred).
- Causes the program to terminate.

But if the application programmer handles the exception, the normal flow of the 
application is maintained, i.e., rest of the code is executed.

# Multi-catch blocks

A try block can be followed by one or more catch blocks. Each catch block must 
contain a different exception handler. So, if you have to perform different tasks 
at the occurrence of different exceptions, use java multi-catch block.

## Points to remember

- At a time only one exception occurs and at a time only one catch block is executed.
- All catch blocks must be ordered from most specific to most general, i.e. 
catch for `ArithmeticException` must come before catch for `Exception`.

## Flowchart of Multi-catch Block

<img src="https://www.scientecheasy.com/wp-content/uploads/2020/05/multiple-try-catch-block.png">

## Custom Exceptions

In Java, we can create our own exceptions that are derived classes of the 
`Exception` class. Creating our own `Exception` is known as custom exception or 
user-defined exception. Basically, Java custom exceptions are used to customize 
the exception according to user need.

```java
public class MyCustomException extends Exception {  
    // constructor of custom exception
    public MyCustomException(String errorMessage) {  
        //call to constructor of parent Exception
        super(errorMessage);  
    }  
}  
```

## Annotations in Java

Annotations are used to provide supplemental information about a program.


* Annotations start with ‘@’.


* Annotations do not change the action of a compiled program.


* Annotations help to associate metadata (information) to the
  program elements i.e. instance variables, constructors, methods,
  classes, etc.


* Annotations are not pure comments as they can change the way
  a program is treated by the compiler. See below code for example.


* Annotations basically are used to provide additional information,
  so could be an alternative to XML and Java marker interfaces.

## Predefined/ Standard Annotations

Java popularly defines seven built-in annotations as we have
seen up in the hierarchy diagram.

Four are imported from java.lang.annotation:
**@Retention**, **@Documented**, **@Target**, and **@Inherited**.
Three are included in java.lang: **@Deprecated**, **@Override**
and **@SuppressWarnings**

## User-defined Annotations

User-defined annotations can be used to annotate
program elements, i.e. variables, constructors, methods,
etc. These annotations can be applied just before the
declaration of an element (constructor, method, classes, etc).

### Syntax: Declaration
```
<Access Specifier> @interface <AnnotationName>
{         
DataType <Method Name>() default <value>;
}
```
Do keep these certain points as rules for custom annotations
before implementing user-defined annotations.

* AnnotationName is an interface.

* The parameter should not be associated with method
  declarations and throws clause should not be used with method
  declaration.

* Parameters will not have a null value but can have a default value.

* **default** value is optional.

* The return type of method should be either primitive,
  enum, string, class name, or array of primitive, enum,
  string, or class name type.

## Java Primitive Data Types
The eight primitives defined in Java are *int, byte, short, long, float,
double, boolean and char*. These aren't considered objects and
represent raw values.

They're stored **directly on the stack**.

<img src=https://2.bp.blogspot.com/-3y_BWimrMYA/W8LeDu8HNwI/AAAAAAAAETo/ojpo7dHnRNQNvYrCbMtdBXK3SctT24qyQCLcBGAs/s1600/primitive-data-types.PNG>

## Java Wrapper Classes
Wrapper classes provide a way to use primitive data types (`int`, `boolean`, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| byte                | 	Byte         |
| short               | 	Short        |
| int                 | 	Integer      |
| long                | 	Long         |
| float               | 	Float        |
| boolean             | 	Boolean      |
| char                | 	Character    |

Sometimes you must use wrapper classes, for example when working
with Collection objects, such as ArrayList, where primitive types
cannot be used.

## Literals in Java
Literal in Java is a synthetic representation of boolean, numeric,
character, or string data. It is a means of expressing particular
values in the program, such as an integer variable named ‘’/count
is assigned an integer value in the following statement.

```java
int count = 0;
```

Literals in Java can be classified into six types, as below:

* Integral Literals
* Floating-point Literals
* Char Literals
* String Literals
* Boolean Literals
* Null Literals

### 1. Integral Literals
Integral literals are specified in four different ways, as follows:

#### Decimal:
It has base ten, and digits from 0 to 9.

For example,

```java
int x = 108;
```

#### Octal:
It has base eight and allows digits from 0 to 7.
While assigning an octal literal in the Java code, a number must
have a prefix 0.

For example,

```java
int x = 0745;
```

#### Hexadecimal:

It has base 16. Hexadecimal allows digits from 0 to 9, and
characters from A to F. Even though Java is case sensitive,
and it also provides an exception for using either uppercase
or lowercase characters in the code for hexadecimal literals.

For example,

```java
int x = 0X123Fadd;
```

#### Binary:

It can be specified in binary literals, that is 0 and 1 with a
prefix 0b or 0B.

For example,
```java
int x = 0b1011;
```

### 2. Floating-Point Literals
Floating-point literals can be expressed using only decimal
fractions or as exponential notation.

For example,
```java
decimalNumber = 89d;

decimalNumber = 3.14159e0;

decimalNumber = 1.0e-6D;
```

Floating-point literals can indicate a positive or negative value,
leading + or – sign respectively. If not specified, the value is
always considered positive. It can be represented in the following
formats:

-Integer digits (representing digits 0 through 9) followed by
either a suffix or an exponent to distinguish it from an integral
literal.

-Integer digit.

-integer digit. integer digit

– integer digit

An optional exponent of the form might be as below:

-an optional exponent sign + or –

-the exponent indicator e or E

–integer digit representing the integer exponent value

An optional floating-point suffix might be as below:

Single precision (4 bytes) floating-point number indicating either
for F

Double precision (8 bytes) floating-point number indicating d or D

### 3. Char Literals
Character (Char) literals have the type char and are an
unsigned integer primitive type. They are constant value
character expressions in the Java program. These are sixteen-bit
Unicode characters that range from 0 to 65535. Char literals
are expressed as a single quote, a single closing quote, and
the character in Java.

Char literals are specified in four different ways, as given below:

#### Single quote:
Java literal is specified to a char data type as a single
character enclosed in a single quote.

For example,

```java
char ch = ‘a’;
```

#### Char Literal:
Java literal is specified as an integer literal
representing the Unicode value of a char. This integer can
be specified in octal, decimal, and hexadecimal, ranging from
0 to 65535.

For example,

```java
char ch = 062;
```

#### Escape Sequence:
Every escape char can be specified as char literal.

For example,

```java
char ch = ‘\n’;
```

#### Unicode Representation:
Java literal is specified in Unicode representation ‘\uzzz’, where
zzzz are four hexadecimal numbers.

For example,

```java
char ch = ‘\u0061’;
```

### 4. String Literals
A sequence of (zero or more including Unicode characters)
characters within double quotes is referred to as string literals.

For example,

```java
String s = “Hello”;
```

String literals may not have unescaped line feed or newline characters, but the Java compiler always evaluates compile-time expressions. Unicode escape sequences or special characters can be used within the string and character literal as backlash characters to escape special characters, as shown in the table below:

| Name 	           | Character	 | ASCII	 | Hex    |
|------------------|------------|--------|--------|
| Single quote     | 	\’        | 	39    | 	0x27  |
| Double quote     | 	\”        | 	34    | 	0x22  |
| Carriage control | 	\r        | 	13    | 	0xd   |
| Backlash         | 	\\        | 	92    | 	0x5c  |
| Newline          | 	\n        | 	10    | 	0x0a  |
| NUL character    | 	\0        | 	0     | 	0x00  |
| Backspace        | 	\b        | 	8     | 	0x08  |
| TAB              | 	\t        | 	9     | 	0x09  |

### 5. Boolean Literals
Boolean literals allow only two values and thus are divided
into two literals:

**True:** it represents a real boolean value

**False:** it represents a false boolean value

For example,
```java
boolean b = true;
boolean d = false;
```

### 6. Null Literals
Null literal is a particular literal in Java representing a null
value. This value refers to no object. Java throws
NullPointerException. Null often describe the uninitialized state
in the program. It is an error to attempt to dereference the null
value.

## Operators in Java
### 1. Arithmetic Operators
They are used to perform simple arithmetic operations on primitive
data types.

* `*`: Multiplication
* `/` : Division
* `%` : Modulo
* `+` : Addition
* `–` : Subtraction

### Unary Operators:
Unary operators need only one operand.
They are used to increment, decrement or negate a value.

* `–` : Unary minus, used for negating the values.
* `+ `: Unary plus indicates the positive value
  (numbers are positive without this, however). It performs an
  automatic conversion to int when the type of its operand is the
  byte, char, or short. This is called unary numeric promotion.
* `++` : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators.
* `—` : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators.
* `!` : Logical not operator, used for inverting a boolean value.

### Assignment Operator
`=` Assignment operator is used to assign a value to any variable.
It has a right to left associativity, i.e. value given on the
right-hand side of the operator is assigned to the variable on the
left, and therefore right-hand side value must be declared before
using it or should be a constant.

The general format of the assignment operator is:

`variable = value;`

## Coercion in Java

Conversion of one data type to another is nowadays easy as many languages including 
Java supports the conversion as a convenience to the programmer. Here conversion 
can be done in two ways i.e. implicit or explicit conversion.

### Widening
Widening, also known as upcasting, is a conversion that implicitly takes place in the 
following situations:
* Widening takes place when a smaller primitive type value is automatically 
accommodated in a larger/wider primitive data type.


* Widening also takes place when a reference variable of a subclass is
  automatically accommodated in a reference variable of its superclass.
### Narrowing

Narrowing, also known as downcasting/casting, is a conversion that is 
explictly performed in the following situations:

* Narrowing a wider/bigger primitive type value to a smaller primitive type value.


* Narrowing a superclass reference to a subclass reference, during inheritance.

## Java CharSequence
CharSequence is an interface that represents a sequence of
characters. Mutability is not enforced by this interface.
Therefore, both mutable and immutable classes implement this
interface.

Of course, an interface can't be instantiated directly;
it needs an implementation to instantiate a variable:

```java
CharSequence charSequence = "baeldung";
```

Here, charSequence is instantiated with a String.
Instantiating other implementations:

```java
CharSequence charSequence = new StringBuffer("baeldung");
CharSequence charSequence = new StringBuilder("baeldung");
```

## Java String, StringBuilder, and StringBuffer

### Java.lang.String Class

The `java.lang.String` class represents character strings. All string literals
in Java programs, such as `"abc"`, are implemented as instances of this
class. Strings are constant, their values cannot be changed after they are created.

### Class Declaration

```java
public final class String
   extends Object
      implements Serializable, Comparable<String>, CharSequence
```
### Class Constructors

| Constructor                                                           | Description                                                                                                                                                                                      |
|-----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **String()**                                                          | This initializes a newly created String object so that it represents an empty character sequence.                                                                                                |
| **String(byte[ ] bytes)**                                             | This constructs a new String by decoding the specified array of bytes using the platform's default charset.                                                                                      |
| **String(byte[ ] bytes, Charset charset)**                            | This constructs a new String by decoding the specified array of bytes using the specified charset.                                                                                               |
| **String(byte[ ] bytes, int offset, int length)**                     | This constructs a new String by decoding the specified subarray of bytes using the platform's default charset                                                                                    |
| **String(byte[ ] bytes, int offset, int length, Charset charset)**    | This constructs a new String by decoding the specified subarray of bytes using the specified charset.                                                                                            |
| **String(byte[ ] bytes, int offset, int length, String charsetName)** | This constructs a new String by decoding the specified subarray of bytes using the specified charset.                                                                                            |
| **String(byte[ ] bytes, String charsetName)**                         | This constructs a new String by decoding the specified array of bytes using the specified charset.                                                                                               |
| **String(char[ ] value)**                                             | This allocates a new String so that it represents the sequence of characters currently contained in the character array argument.                                                                |
| **String(char[ ] value, int offset, int count)**                      | This allocates a new String that contains characters from a subarray of the character array argument.                                                                                            |
| **String(int[ ] codePoints, int offset, int count)**                  | This allocates a new String that contains characters from a subarray of the Unicode code point array argument.                                                                                   |
| **String(String original)**                                           | This initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string. |
| **String(StringBuffer buffer)**                                       | This allocates a new string that contains the sequence of characters currently contained in the string buffer argument.                                                                          |
| **String(StringBuilder builder)**                                     | This allocates a new string that contains the sequence of characters currently contained in the string builder argument.                                                                         |

### Class Methods

| Method                                                            | Description                                                                                                    |
|-------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| **char charAt(int index)**                                        | This method returns the char value at the specified index.                                                     |
| **int compareTo(String anotherString)**                           | This method compares two strings lexicographically.                                                            |
| **int compareToIgnoreCase(String str)**                           | This method compares two strings lexicographically, ignoring case differences.                                 |
| **String concat(String str)**                                     | This method concatenates the specified string to the end of this string.                                       |
| **boolean contains(CharSequence s)**                              | This method ceturns true if and only if this string contains the specified sequence of char values.            |
| **boolean endsWith(String suffix)**                               | This method tests if this string ends with the specified suffix.                                               |
| **boolean equals(Object anObject)**                               | This method compares this string to the specified object.                                                      |
| **boolean equalsIgnoreCase(String anotherString)**                | This method compares this String to another String, ignoring case considerations.                              |
| **static String format(Locale l, String format, Object... args)** | This method returns a formatted string using the specified locale, format string, and arguments.               |
| **int hashCode()**                                                | This method returns a hash code for this string.                                                               |
| **int indexOf(int ch)**                                           | This method returns the index within this string of the first occurrence of the specified character.           |
| **boolean isEmpty()**                                             | This method returns true if, and only if, length() is 0.                                                       |
| **int lastIndexOf(int ch)**                                       | This method returns the index within this string of the last occurrence of the specified character.            |
| **int length()**                                                  | This method returns the length of this string.                                                                 |
| **String substring(int beginIndex)**                              | This method returns a new string that is a substring of this string.                                           |
| **String substring(int beginIndex, int endIndex)**                | This method returns a new string that is a substring of this string.                                           |
| **char[] toCharArray()**                                          | This method converts this string to a new character array.                                                     |
| **String toLowerCase()**                                          | This method converts all of the characters in this String to lower case using the rules of the default locale. |
| **String toUpperCase()**                                          | This method converts all of the characters in this String to upper case using the rules of the default locale. |
| **String toString()**                                             | This method returns the string itself.                                                                         |
| **static String valueOf(primitive arg)**                          | This method returns the string representation of the object argument.                                          |


### StringBuffer Class in Java

**StringBuffer** is a peer class of **String** that provides much of the functionality
of strings. The string represents fixed-length, immutable character sequences
while **StringBuffer** represents growable and writable character sequences.
**StringBuffer** may have characters and substrings inserted in the middle or
appended to the end. It will automatically grow to make room for such additions
and often has more characters pre-allocated than are actually needed, to allow
room for growth.


### Constructors of StringBuffer Class

* `StringBuffer()`: It reserves room for 16 characters without reallocation


* `StringBuffer(int size)`: It accepts an integer argument that explicitly sets
  the size of the buffer.


* `StringBuffer(String str)`: It accepts a string argument that sets the
  initial contents of the StringBuffer object and reserves room for 16 more
  characters without reallocation.


### Methods of StringBuffer Class

| Methods              | 	Action Performed                                                            |
|----------------------|------------------------------------------------------------------------------|
| **append()**         | 	Used to add text at the end of the existing text.                           |
| **length()**         | 	The length of a StringBuffer can be found by the length( ) method           |
| **capacity()**       | 	the total allocated capacity can be found by the capacity( ) method         |
| **charAt()**         | 	Returns the character at given index                                        |
| **delete()**         | 	Deletes a sequence of characters from the invoking object                   |
| **deleteCharAt()**   | 	Deletes the character at the index specified by loc                         |
| **ensureCapacity()** | 	Ensures capacity is at least equals to the given minimum.                   |
| **insert()**         | 	Inserts text at the specified index position                                |
| **length()**         | 	Returns length of the string                                                |
| **reverse()**        | 	Reverse the characters within a StringBuffer object                         |
| **replace()**        | 	Replace one set of characters with another set inside a StringBuffer object |


### StringBuilder Class in Java

The **StringBuilder** in Java represents a mutable sequence of characters.
Since the **String** Class in Java creates an immutable sequence of characters,
the **StringBuilder** class provides an alternative to **String** Class, as it creates
a mutable sequence of characters.

The function of **StringBuilder** is very much
similar to the **StringBuffer** class, as both of them provide an alternative to
**String** Class by making a mutable sequence of characters. However, the **StringBuilder**
class differs from the **StringBuffer** class on the basis of synchronization. The
StringBuilder class provides no guarantee of synchronization whereas the **StringBuffer**
class does. Therefore, this class is designed for use as a drop-in replacement
for **StringBuffer** in places where the **StringBuffer** was being used by a single
thread (as is generally the case).

Where possible, it is recommended that this
class be used in preference to **StringBuffer** as it will be faster under most
implementations. Instances of **StringBuilder** are not safe for use by multiple
threads. If such synchronization is required then it is recommended that
**StringBuffer** be used.

### Constructors in Java StringBuilder:


* `StringBuilder()`: Constructs a string builder with no characters in it and
  an initial capacity of 16 characters.


* `StringBuilder(int capacity)`: Constructs a string builder with no characters
  in it and an initial capacity specified by the capacity argument.


* `StringBuilder(CharSequence seq)`: Constructs a string builder that contains
  the same characters as the specified CharSequence.


* `StringBuilder(String str)`: Constructs a string builder initialized to the
  contents of the specified string.


### Methods in Java StringBuilder:

* `StringBuilder append(X x)`: This method appends the string representation
  of the X type argument to the sequence.


* `int capacity()`: This method returns the current capacity.


* `char charAt(int index)`: This method returns the char value in this sequence
  at the specified index.


* `StringBuilder delete(int start, int end)`: This method removes the characters
  in a substring of this sequence.


* `StringBuilder deleteCharAt(int index)`: This method removes the char at the
  specified position in this sequence.


* `void ensureCapacity(int minimumCapacity)`: This method ensures that the capacity
  is at least equal to the specified minimum.


* `void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)`: This method
  characters are copied from this sequence into the destination character array dst.


* `int indexOf()`: This method returns the index within this string of the
  first occurrence of the specified substring.


* `StringBuilder insert(int offset, boolean b)`: This method inserts the string
  representation of the boolean argument into this sequence.


* `StringBuilder insert()`: This method inserts the string representation of the
  char argument into this sequence.


* `int lastIndexOf()`: This method returns the index within this string of the
  last occurrence of the specified substring.


* `int length()`: This method returns the length (character count).


* `StringBuilder replace(int start, int end, String str)`: This method replaces
  the characters in a substring of this sequence with characters in the specified String.


* `StringBuilder reverse()`: This method causes this character sequence to be
  replaced by the reverse of the sequence.


* `void setCharAt(int index, char ch)`: In this method, the character at the specified
  index is set to ch.


* `void setLength(int newLength)`: This method sets the length of the character sequence.


* `CharSequence subSequence(int start, int end)`: This method returns a new
  character sequence that is a subsequence of this sequence.


* `String substring()`: This method returns a new String that contains a
  subsequence of characters currently contained in this character sequence.


* `String toString()`: This method returns a string representing the data in
  this sequence.

## Reading and Writing in Java
## Reading from Console

### 1. Using Scanner Class

This is probably the most preferred method to take input.
The main purpose of the Scanner class is to parse
primitive types and strings using regular expressions,
however, it is also can be used to read input from the
user in the command line.
```java
// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class GetInputFromUser {
public static void main(String[] args)
{
// Using Scanner for Getting Input from User
Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		System.out.println("You entered string " + s);

		int a = in.nextInt();
		System.out.println("You entered integer " + a);

		float b = in.nextFloat();
		System.out.println("You entered float " + b);
	}
}
```

### 2. Using Console Class

It has been becoming a preferred way for reading
user’s input from the command line. In addition,
it can be used for reading password-like input
without echoing the characters entered by the user;
the format string syntax can also be used
(like `System.out.printf()`).

```java
// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
public class Sample {
	public static void main(String[] args)
	{
		// Using Console to input data from user
		String name = System.console().readLine();

		System.out.println("You entered string " + name);
	}
}
```

## Reading from a File

There are multiple ways of writing and reading a text
file. this is required while dealing with many
applications. There are several ways to read a
plain text file in Java e.g. you can use `FileReader`,
`BufferedReader`, or `Scanner` to read a text file.
Every utility provides something special e.g.
`BufferedReader` provides buffering of data for fast
reading, and Scanner provides parsing ability.

### Using FileReader Class

Convenience class for reading character files.
The constructors of this class assume that the
default character encoding and the default byte-buffer
size are appropriate.

Constructors defined in this class are as follows:

* `FileReader(File file)`: Creates a new FileReader,
  given the File to read from


* `FileReader(FileDescriptor fd)`: Creates a new
  FileReader, given the FileDescriptor to read from


* `FileReader(String fileName)`: Creates a new FileReader,
  given the name of the file to read from

```java
// Java Program to Illustrate reading from
// FileReader using FileReader class

// Importing input output classes
import java.io.*;

// Main class
// ReadingFromFile
public class GFG {

	// Main driver method
	public static void main(String[] args) {
        // Passing the path to the file as a parameter
		FileReader fr = new FileReader(
			"C:\\Users\\pankaj\\Desktop\\test.txt");

		// Declaring loop variable
		int i;
		// Holds true till there is nothing to read
		while ((i = fr.read()) != -1)

			// Print all the content of a file
			System.out.print((char)i);
	}
}
```

### Using Scanner Class

A simple text scanner that can parse primitive types
and strings using regular expressions. A `Scanner`
breaks its input into tokens using a delimiter pattern,
which by default matches whitespace. The resulting
tokens may then be converted into values of different
types using the various next methods.

```java
// Java Program to illustrate
// reading from Text File
// using Scanner Class
import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner {
  public static void main(String[] args) throws {
      // pass the path to the file as a parameter
      File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
      Scanner sc = new Scanner(file);
  
      while (sc.hasNextLine()) System.out.println(sc.nextLine());
  }
}

```
## Generics in Java

**Generic** means parameterized types. The idea is to allow type
(Integer, String, … etc., and user-defined types) to be a
parameter to methods, classes, and interfaces. Using **Generics**,
it is possible to create classes that work with different data
types. An entity such as class, interface, or method that
operates on a parameterized type is a generic entity.

## Generic Class
```
// To create an instance of generic class
BaseType <Type> obj = new BaseType <Type>()
```

```
// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test<T> {
// An object of type T is declared
T obj;
Test(T obj) { this.obj = obj; } // constructor
public T getObject() { return this.obj; }
}
```

## Generic Functions

We can also write generic functions that can be called with
different types of arguments based on the type of arguments
passed to the generic method. The compiler handles each method.
```
// Java program to show working of user defined
// Generic functions

class Test {
// A Generic method example
static <T> void genericDisplay(T element)
{
System.out.println(element.getClass().getName()
+ " = " + element);
}
```

## Advantages of Generics

Programs that use Generics has got many benefits over
non-generic code.

### 1. Code Reuse:
We can write a method/class/interface once
and use it for any type we want.

### 2. Type Safety:
Generics make errors to appear compile time than at runtime
(It’s always better to know problems in your code at compile
time rather than making your code fail at run time).

## Encapsulation

By definition, **encapsulation** describes the idea of bundling
data and methods that work on that data within one unit, like
a class in Java. This concept is also often used to hide the
internal representation, or state of an object from the outside.
This is called information hiding.

The general idea of this mechanism is simple. For example,
you have an attribute that is not visible from the outside of an
object. You bundle it with methods that provide read (getter methods)
or write (setter methods) access. Encapsulation allows you to hide specific
information and control access to the internal state of the object.

## Access Modifiers
Java supports four access modifiers that you can use to define
the visibility of classes, methods and attributes. Each modifier
specifies a different level of accessibility, and you can only use
one modifier per class, method or attribute. As a rule of thumb,
you should always use the most restrictive modifier that still
allows you to implement your business logic.

Starting from the most to the least restrictive, these modifiers are:

* private

* no modifier (default)

* protected

* public

Let’s take a closer look at each of these modifiers and discuss
when you should use them.

### Private
The most restrictive and most commonly used access modifier,
the private modifier makes an attribute or method only accessible
within the same class. Subclasses or any other classes within the
same or a different package can’t access this attribute or method.

For all attributes and internal methods that shouldn’t be called
from external classes, choose the private modifier by default.
You might need to make an exception to this rule when you’re
using inheritance. Also, exempt some of the subclasses that need
direct access to an attribute or internal method. In that case,
you should use the protected modifier instead of private.

### No Modifier (default)
No modifiers mean you can access attributes or methods within
your class and from all classes within the same package. That’s
why it’s often called package-private.

### Protected
Attributes and methods with the access modifier protected
can be accessed within your class, by all classes within the
same package and by all subclasses within the same or other packages.

The protected modifier gets mostly used for internal methods that
need to be called or overridden by subclasses. You can also use the
protected modifier to allow subclasses to access internal attributes
of a superclass directly.

### Public
This is the least restrictive access modifier. Methods and attributes
that use the public modifier can be accessed within your current
class and by all other classes.

Public methods and attributes become part of the public API of
your class and of any component in which you include them. That
is almost never a good idea for any attribute, so you should think
twice before using this modifier on a method.

### Accessibility Matrix
Here you can see an overview of the different access modifiers
and the accessibility of the attributes or methods.

<img src=https://stackify.com/wp-content/uploads/2017/11/word-image-20.png>

## Non Access Modifiers in Java
Non-access modifiers provide information about the characteristics of a class,
method, or variable to the JVM. Seven types of Non-Access modifiers are present in Java.

### 1. `static`

The `static` keyword means that the entity to which it is applied is available
outside any particular instance of the class. That means the static methods
or the attributes are a part of the class and not an object. The memory is
allocated to such an attribute or method at the time of class loading. The
use of a `static` modifier makes the program more efficient by saving memory.
A static field exists across all the class instances, and without creating
an object of the class, they can be called.

### 2. `final`

The `final` keyword indicates that the specific class cannot be extended or a method
cannot be overwritten.

### 3. `abstract`

`abstract` keyword is used to declare a class as partially implemented means
an object cannot be created directly from that class. Any subclass needs
to be either implement all the methods of the abstract class, or it should
also need to be an abstract class. The `abstract` keyword cannot be used with
static, final, or private keywords because they prevent overriding, and we
need to override methods in the case of an abstract class.

### 4. `synchronized`

`synchronized` keyword prevents a block of code from executing by multiple
threads at once. It is very important for some critical operations.

### 5. `volatile`

The `volatile` keyword is used to make the class thread-safe. That means if
a variable is declared as `volatile`, then that can be modified by multiple
threads at the same time without any issues. The `volatile` keyword is only
applicable to a variable. A volatile keyword reduces the chance of memory
inconsistency. The value of a volatile variable is always read from the main
memory and not from the local thread cache, and it helps to improve thread
performance.

### 6. `transient`

The `transient` keyword may be applied to member variables of a class to
indicate that the member variable should not be serialized when the containing
class instance is serialized. Serialization is the process of converting
an object into a byte stream. When we do not want to serialize the value
of a variable, then we declare it as `transient`. 

To make it more transparent, let’s take an example of an application where we 
need to accept UserID and Password. At that moment, we need to declare some variable 
to take the input and store the data, but as the data is susceptible, so we do not 
want to keep it stored after the job is done. 

To achieve this, we can use the`transient` keyword for variable declaration. 
That particular variable will not participate in the serialization process, and when 
we deserialize that, we will receive the default value of the variable.

### 7. `native`

The `native` keyword may be applied to a method to indicate that the method
is implemented in a language other than Java. Using this java application
can call code written in C, C++, or assembler language. A shared code
library or DLL is required in this case.

## Inheritance in Java

Inheritance is an important pillar of OOP
(Object-Oriented Programming). It is the mechanism in java
by which one class is allowed to inherit the features(fields
and methods) of another class.

**Important terminology:**

* **Super Class**: The class whose features are inherited is known
  as superclass(or a base class or a parent class).


* **Sub Class**: The class that inherits the other class is known as
  a subclass(or a derived class, extended class, or child class).
  The subclass can add its own fields and methods in addition to
  the superclass fields and methods.


* **Reusability**: Inheritance supports the concept of “re-usability”,
  i.e. when we want to create a new class and there is already a
  class that includes some code that we want, we can
  derive our new class from the existing class. By doing this,
  we are reusing the fields and methods of the existing class.

### How to use inheritance in Java

The keyword used for inheritance is extends.

```java
class derivedClass extends baseClass  
{  
   //methods and fields  
}  
```

## Abstraction in Java

**Data Abstraction** is the property by virtue of which only the
essential details are displayed to the user. The trivial or
the non-essentials units are not displayed to the user.

**Data Abstraction** may also be defined as the process of
identifying only the required characteristics of an object
ignoring the irrelevant details. The properties and behaviours
of an object differentiate it from other objects of similar
type and also help in classifying/grouping the objects.

In java, **abstraction** is achieved by **interfaces** and **abstract
classes**. We can achieve 100% abstraction using interfaces.

## Abstract classes and Abstract methods :

* An abstract class is a class that is declared with an
  abstract keyword.


* An abstract method is a method that is declared without
  implementation.


* An abstract class may or may not have all abstract methods.
  Some of them can be concrete methods


* A method defined abstract must always be redefined in the
  subclass, thus making overriding compulsory OR either make
  the subclass itself abstract.


* Any class that contains one or more abstract methods must
  also be declared with an abstract keyword.


* There can be no object of an abstract class. That is, an
  abstract class can not be directly instantiated with the
  new operator.


* An abstract class can have parameterized constructors and
  the default constructor is always present in an abstract class.

## Interfaces in Java

An **Interface** in Java programming language is defined as an
abstract type used to specify the behavior of a class. An
**interface** in Java is a blueprint of a class. A Java **interface**
contains static constants and abstract methods.

Like a class, an interface can have methods and variables,
but the methods declared in an interface are by default
abstract (only method signature, no body).

* Interfaces specify what a class must do and not how. It is the
  blueprint of the class.


* An Interface is about capabilities like a Player may be an
  interface and any class implementing Player must be able to
  (or must implement) move(). So it specifies a set of methods
  that the class has to implement.


* If a class implements an interface and does not provide
  method bodies for all functions specified in the interface,
  then the class must be declared abstract.

### Syntax:
```java
interface {

    // declare constant fields
    // declare methods that abstract 
    // by default.   
}
```
To declare an interface, use the `interface` keyword. It is
used to provide total abstraction. That means all the methods
in an interface are declared with an empty body and are
public and all fields are public, static, and final by default.
A class that `implements` an interface must implement all the
methods declared in the interface. To implement interface
use `implements` keyword.


### Why do we use an Interface?
* It is used to achieve total abstraction.


* Since java does not support multiple inheritances in the
  case of class, by using an interface it can achieve multiple
  inheritances.


* It is also used to achieve loose coupling.


* Interfaces are used to implement abstraction. So the
  question arises why use interfaces when we have abstract classes?

The reason is, abstract classes may contain non-final variables,
whereas variables in the interface are `final`, `public` and `static`.

## Abstract Classes in Java

Abstract is a java modifier applicable for classes
and methods in java but not for Variables.

```java
abstract class Shape 
{
    int color;

    // An abstract function
    abstract void draw();
}
```

Following are some important observations about
abstract classes in Java.

* An instance of an abstract class can not be created.


* Constructors are allowed.


* We can have an abstract class without any abstract method.


* There can be final method in abstract class but any
  abstract method in class(abstract class) can not be
  declared as final or in simpler terms final method can
  not be abstract itself as it will yield error: “Illegal
  combination of modifiers: abstract and final”


* We are not allowed to create object for any abstract class.


* We can define static methods in an abstract class


* We can use abstract keyword for declaring top level
  classes (Outer class) as well as inner classes as
  abstract


* If a class contains at least one abstract method then
  it is mandatory to declare class as abstract


* If Child class is unable to provide implementation to
  all abstract methods of Parent class then we should
  declare that Child class as abstract so that the next
  level Child class should provide implementation to
  remaining abstract method

## Abstract vs Interface
* **Type of methods:** Interface can have only abstract
  methods. An abstract class can have abstract and
  non-abstract methods. From Java 8, it can have default
  and static methods also.


* **Final Variables:** Variables declared in a Java
  interface are by default final. An abstract class may
  contain non-final variables.


* **Type of variables:** Abstract class can have final,
  non-final, static and non-static variables. The interface
  has only static and final variables.


* **Implementation:** Abstract class can provide the
  implementation of the interface. Interface can’t provide
  the implementation of an abstract class.


* **Inheritance vs Abstraction:** A Java interface can
  be implemented using the keyword “implements” and an
  abstract class can be extended using the keyword “extends”.


* **Multiple implementations:** An interface can extend
  another Java interface only, an abstract class can extend
* another Java class and implement multiple Java interfaces.


* **Accessibility of Data Members:** Members of a Java
  interface are public by default. A Java abstract class
  can have class members like private, protected, etc.

## Polymorphism in Java

The word **polymorphism** means having many forms. In simple words,
we can define **polymorphism** as the ability of a message to be
displayed in more than one form.

**Polymorphism** is considered one of the important features
of Object-Oriented Programming. **Polymorphism** allows us to
perform a single action in different ways. In other words,
**polymorphism** allows you to define one interface and have
multiple implementations. The word “poly” means many and
“morphs” means forms, So it means many forms.

## Method Overloading:

When there are multiple functions with
the same name but different parameters then these functions
are said to be overloaded. Functions can be overloaded by
change in the number of arguments or/and a change in the
type of arguments.

```java
// Java Program for Method overloading
// By using Different Types of Arguments

// Class 1
// Helper class
class Helper {

	// Method with 2 integer parameters
	static int Multiply(int a, int b)
	{

		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{

		// Returns product of double numbers
		return a * b;
	}
}

// Class 2
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Calling method by passing
		// input as in arguments
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}

```

## Method Overriding:

```java
// Java Program for Method Overriding
 
// Class 1
// Helper class
class Parent {
 
    // Method of parent class
    void Print()
    {
 
        // Print statement
        System.out.println("parent class");
    }
}
 
// Class 2
// Helper class
class subclass1 extends Parent {
 
    // Method
    void Print() { System.out.println("subclass1"); }
}
 
// Class 3
// Helper class
class subclass2 extends Parent {
 
    // Method
    void Print()
    {
 
        // Print statement
        System.out.println("subclass2");
    }
}
 
// Class 4
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1
        Parent a;
 
        // Now we will be calling print methods
        // inside main() method
 
        a = new subclass1();
        a.Print();
 
        a = new subclass2();
        a.Print();
    }
}
```
## Object-Oriented Programming Principles

**SOLID** is an acronym used to refer to a group of five important principles
followed in software development. This principle is an acronym of the five
principles which are given below…

* Single Responsibility Principle (SRP)
* Open/Closed Principle
* Liskov’s Substitution Principle (LSP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

## Single Responsibility Principle

When we design our classes, we need to ensure that our class is
responsible only for 1 task or functionality and when there is a change in that
task/functionality, only then, that class should change.

## Open/Closed Principle

This principle states that software entities like class,
modules, functions, etc.; should be able to extend a class
behavior without modifying it. This principle separates the
existing code from modified mode to provide better stability,
maintainability and minimizes the changes in the code. In a
nutshell, the developer must need to change only a specific
part of the code (a class or a function) every time a
requirement changes.

## Liskov’s Substitution Principle

The principle defines that objects of a superclass shall
be replaceable with objects of its subclasses without breaking
the application. That requires the objects of your subclasses
to behave in the same way as the objects of your superclass.

An overridden method of a subclass needs to accept the
same input parameter values as the method of the superclass.
That means you can implement less restrictive validation rules,
but you are not allowed to enforce stricter ones in your
subclass. Otherwise, any code that calls this method on an
object of the superclass might cause an exception, if it gets
called with an object of the subclass.

Similar rules apply to the return value of the method.
The return value of a method of the subclass needs to
comply with the same rules as the return value of the
method of the superclass. You can only decide to apply
even stricter rules by returning a specific subclass of
the defined return value, or by returning a subset of
the valid return values of the superclass.

## Interface Segregation Principle

This principle was first defined by Robert C. Martin as:
“Clients should not be forced to depend upon interfaces that
they do not use“.

The goal of this principle is to reduce the side effects
of using larger interfaces by breaking application interfaces
into smaller ones. It's similar to the Single Responsibility
Principle, where each class or interface serves a single purpose.

Precise application design and correct abstraction is the
key behind the Interface Segregation Principle. Though it'll
take more time and effort in the design phase of an application
and might increase the code complexity, in the end, we get a
flexible code.

## DRY (Don't Repeat Yourself) Principle

DRY is simply an approach, or we can say a different
perceptive to programmers. DRY stands for Don’t Repeat
Yourself. In Java, it means don’t write the same code repeatedly.
Suppose you are having the same code at many places in your
program, then It is known as DRY, You are repeating the same
code repeatedly at different places. Hence, the solution is
obtained using the DRY concept by placing the methods in
place of all repeated codes and define the code in one method.
So By calling methods, we will reach the principle DRY.

## Types of References in Java

In Java there are four types of references differentiated on the way by which 
they are garbage collected.

1. Strong References
2. Weak References
3. Soft References
4. Phantom References

**Strong References**: This is the default type/class of Reference Object. 
Any object which has an active strong reference are not eligible for garbage 
collection. The object is garbage collected only when the variable which was strongly 
referenced points to null.

```java
MyClass obj = new MyClass (); 
```

Here `obj` object is strong reference to newly created instance of `MyClass`, 
currently `obj` is active object so can’t be garbage collected.
```java
obj = null;
//'obj' object is no longer referencing to the instance.
```
So the `MyClass` type object is now available for garbage collection.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Strong-References-in-java.png">

**Weak References**: Weak Reference Objects are not the default type/class of `Reference 
Object`, and they should be explicitly specified while using them.

This type of reference is used in `WeakHashMap` to reference the entry objects.
If JVM detects an object with only weak references (i.e. no strong or soft references 
linked to any object), this object will be marked for garbage collection.

To create such references `java.lang.ref.WeakReference` class is used.
These references are used in real time applications while establishing a `DBConnection` 
which might be cleaned up by Garbage Collector when the application using the 
database gets closed.

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Weak-references-in-Java.png">

**Soft References**: In Soft reference, even if the object is free for garbage collection 
it is not garbage collected until JVM is in need of memory badly.The objects 
get cleared from the memory when JVM runs out of memory.To create such references 
`java.lang.ref.SoftReference` class is used.

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Soft-references-in-Java.png">

**Phantom References**: The objects which are being referenced by phantom references are 
eligible for garbage collection. But, before removing them from the memory, JVM 
puts them in a queue called ‘reference queue’ . They are put in a reference queue 
after calling `finalize()` method on them. To create such references 
`java.lang.ref.PhantomReference` class is used.

## Arrays in Java

An array in Java is a group of like-typed variables referred to by a common name.
Following are some important points about Java arrays.

* In Java, all arrays are dynamically allocated.
* Since arrays are objects in Java, we can find their length using the object
  property length.
* A Java array variable can also be declared like other variables with []
  after the data type.
* The variables in the array are ordered, and each has an index beginning from 0.
* Java array can be also be used as a static field, a local variable, or a
  method parameter.
* The size of an array must be specified by int or short value and not long.
* The direct superclass of an array type is Object.
* Every array type implements the interfaces Cloneable and java.io.Serializable.

### One-Dimensional Arrays:

The general form of a one-dimensional array declaration is
```
type var-name[];
```
```
type[] var-name;
```
### Instantiating an Array in Java

`var-name = new type [size];`

### Array Literal
In a situation where the size of the array and variables of the array are
already known, array literals can be used.
```
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
// Declaring array literal
```
### Multidimensional Arrays

Multidimensional arrays are **arrays of arrays** with each element of the array
holding the reference of other arrays. These are also known as Jagged Arrays.
A multidimensional array is created by appending one set of square brackets ([])
per dimension.

```
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```

### Cloning of Arrays

When you clone a single-dimensional array, such as Object[], a
“deep copy” is performed with the new array containing copies of the original
array’s elements as opposed to reference.

A clone of a multidimensional array (like Object[][]) is a “shallow copy,”
however, which is to say that it creates only a single new array with each
element array a reference to an original element array, but subarrays are shared. 

## ArrayList in Java

ArrayList is a part of collection framework and is present
in java.util package. It provides us with dynamic arrays in
Java. Though, it may be slower than standard arrays but can
be helpful in programs where lots of manipulation in the array
is needed. This class is found in java.util package.

Since ArrayList is a dynamic array and we do not have to
specify the size while creating it, the size of the array
automatically increases when we dynamically add and remove
items. Though the actual library implementation may be more
complex, the following is a very basic idea explaining the
working of the array when the array becomes full and if we
try to add an item:

* Creates a bigger-sized memory on heap memory (for example
  memory of double size).


* Copies the current memory elements to the new memory.


* New item is added now as there is bigger memory available now.


* Delete the old memory.

**Important Features:**

* ArrayList inherits AbstractList class and implements the
  List interface.


* ArrayList is initialized by the size. However, the size is
  increased automatically if the collection grows or shrinks if
  the objects are removed from the collection.


* Java ArrayList allows us to randomly access the list.


* ArrayList can not be used for primitive types, like int,
  char, etc. We need a wrapper class for such cases.


* ArrayList in Java can be seen as a vector in C++.


* ArrayList is not Synchronized. Its equivalent synchronized
  class in Java is Vector.


## Constructors in the ArrayList
In order to create an ArrayList, we need to create an
object of the ArrayList class. The ArrayList class
consists of various constructors which allow the possible
creation of the array list. The following are the constructors
available in this class:


### 1. ArrayList():
This constructor is used to build an empty array list.
If we wish to create an empty ArrayList with the name arr,
then, it can be created as:

`ArrayList arr = new ArrayList();`

### 2. ArrayList(Collection c):
This constructor is used to build an array list initialized
with the elements from the collection c. Suppose, we wish
to create an ArrayList arr which contains the elements present
in the collection c, then, it can be created as:

`ArrayList arr = new ArrayList(c);`

### 3. ArrayList(int capacity):
This constructor is used to build an array list with
initial capacity being specified. Suppose we wish to
create an ArrayList with the initial size being N, then, it
can be created as:

`ArrayList arr = new ArrayList(N);`

## Methods in Java ArrayList

| Method                            | Description                                                                                                                                                                                       |
|-----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, Object element)`  | This method is used to insert a specific element at a specific position index in a list.                                                                                                          |
| `add(Object o)`                   | This method is used to append a specific element to the end of a list.                                                                                                                            |
| `addAll(Collection C)`            | This method is used to append all the elements from a specific collection to the end of the mentioned list, in such an order that the values are returned by the specified collection’s iterator. |
| `addAll(int index, Collection C)` | Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.                                                                         |
| `clear()`                         | 	This method is used to remove all the elements from any list.                                                                                                                                    |
| `clone()`                         | 	This method is used to return a shallow copy of an ArrayList.                                                                                                                                    |
| `contains(Object o)`              | Returns true if this list contains the specified element.                                                                                                                                         |
| `get(int index)`                  | 	Returns the element at the specified position in this list.                                                                                                                                      |
| `indexOf(Object O)`               | The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.                                                                            |
| `isEmpty()`                       | Returns true if this list contains no elements.                                                                                                                                                   |
| `lastIndexOf(Object O)`           | The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list.                                                                           |
| `remove(int index)`               | Removes the element at the specified position in this list.                                                                                                                                       |
| `remove(Object o)`                | Removes the first occurrence of the specified element from this list, if it is present.                                                                                                           |
| `removeAll(Collection c)`         | Removes from this list all of its elements that are contained in the specified collection.                                                                                                        |
| `set(int index, E element)`	      | Replaces the element at the specified position in this list with the specified element.                                                                                                           |
| `size()`                          | Returns the number of elements in this list.                                                                                                                                                      |

## LinkedList in Java

`LinkedList` is a part of the `Collection` framework present in `java.util package`. 
This class is an implementation of the `LinkedList` data structure which is a linear 
data structure where the elements are not stored in contiguous locations and every 
element is a separate object with a data part and address part. The elements are 
linked using pointers and addresses. Each element is known as a node. 

Due to the ease of insertions and deletions, they are preferred over the arrays. 
It also has a few disadvantages like the nodes cannot be accessed directly instead 
we need to start from the head and follow through the link to reach a node we wish 
to access.

### Constructors in the `LinkedList`
In order to create a `LinkedList`, we need to create an object of the 
`LinkedList` class. The `LinkedList` class consists of various constructors that allow 
the possible creation of the list. The following are the constructors available in 
this class:

1. `LinkedList()`: This constructor is used to create an empty linked list. 
If we wish to create an empty `LinkedList` with the name `ll`, then, it can be created as:

```java
LinkedList ll = new LinkedList();
```

2. `LinkedList(Collection C)`: This constructor is used to create an ordered list 
that contains all the elements of a specified collection, as returned by the 
collection’s iterator. If we wish to create a `LinkedList` with the name `ll`, then, 
it can be created as:

```java
LinkedList ll = new LinkedList(C);
```

### Methods for Java LinkedList

| Method	                              | Description                                                                                                                                                                                                      |
|--------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, E element)`          | 	This method Inserts the specified element at the specified position in this list.                                                                                                                               |
| `add(E e) `                          | 	This method Appends the specified element to the end of this list.                                                                                                                                              |
| `addAll(int index, Collection<E> c)` | 	This method Inserts all of the elements in the specified collection into this list, starting at the specified position.                                                                                         |
| `addAll(Collection<E> c)`	           | This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.                                         |
| `addFirst(E e)`	                     | This method Inserts the specified element at the beginning of this list.                                                                                                                                         |
| `addLast(E e)`	                      | This method Appends the specified element to the end of this list.                                                                                                                                               |
| `clear()`	                           | This method removes all of the elements from this list.                                                                                                                                                          |
| `clone()`	                           | This method returns a shallow copy of this LinkedList.                                                                                                                                                           |
| `contains(Object o)`	                | This method returns true if this list contains the specified element.                                                                                                                                            |
| `descendingIterator()`	              | This method returns an iterator over the elements in this deque in reverse sequential order.                                                                                                                     |
| `element()`	                         | This method retrieves but does not remove, the head (first element) of this list.                                                                                                                                |
| `get(int index)`	                    | This method returns the element at the specified position in this list.                                                                                                                                          |
| `getFirst()`	                        | This method returns the first element in this list.                                                                                                                                                              |
| `getLast()`	                         | This method returns the last element in this list.                                                                                                                                                               |
| `indexOf(Object o)`	                 | This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.                                                                    |
| `lastIndexOf(Object o)`	             | This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.                                                                     |
| `listIterator(int index)`	           | This method returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.                                                                           |
| `offer(E e)`	                        | This method Adds the specified element as the tail (last element) of this list.                                                                                                                                  |
| `offerFirst(E e)`	                   | This method Inserts the specified element at the front of this list.                                                                                                                                             |
| `offerLast(E e)`	                    | This method Inserts the specified element at the end of this list.                                                                                                                                               |
| `peek()`	                            | This method retrieves but does not remove, the head (first element) of this list.                                                                                                                                |
| `peekFirst()`	                       | This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.                                                                                               |
| `peekLast()`	                        | This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.                                                                                                |
| `poll()`	                            | This method retrieves and removes the head (first element) of this list.                                                                                                                                         |
| `pollFirst()`	                       | This method retrieves and removes the first element of this list, or returns null if this list is empty.                                                                                                         |
| `pollLast()`	                        | This method retrieves and removes the last element of this list, or returns null if this list is empty.                                                                                                          |
| `pop()`	                             | This method Pops an element from the stack represented by this list.                                                                                                                                             |
| `push(E e)`	                         | This method pushes an element onto the stack represented by this list.                                                                                                                                           |
| `remove()`	                          | This method retrieves and removes the head (first element) of this list.                                                                                                                                         |
| `remove(int index)`	                 | This method removes the element at the specified position in this list.                                                                                                                                          |
| `remove(Object o)`	                  | This method removes the first occurrence of the specified element from this list if it is present.                                                                                                               |
| `removeFirst()`	                     | This method removes and returns the first element from this list.                                                                                                                                                |
| `removeFirstOccurrence(Object o)`	   | This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).                                                                                     |
| `removeLast()`	                      | This method removes and returns the last element from this list.                                                                                                                                                 |
| `removeLastOccurrence(Object o)`	    | This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).                                                                                      |
| `set(int index, E element)`	         | This method replaces the element at the specified position in this list with the specified element.                                                                                                              |
| `size()`	                            | This method returns the number of elements in this list.                                                                                                                                                         |
| `spliterator()`	                     | This method creates a late-binding and fail-fast Spliterator over the elements in this list.                                                                                                                     |
| `toArray()`	                         | This method returns an array containing all of the elements in this list in proper sequence (from first to last element).                                                                                        |
| `toArray(T[] a)`	                    | This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.                 |
| `toString()`	                        | This method returns a string containing all of the elements in this list in proper sequence (from first to the last element), each element is separated by commas and the String is enclosed in square brackets. |

## Stack Class in Java

Java `Collection` framework provides a `Stack` class that models and implements a 
Stack data structure. The class is based on the basic principle of last-in-first-out. 
In addition to the basic push and pop operations, the class provides three more 
functions of empty, search, and peek. 

The class can also be said to extend `Vector` and treats the class as a stack with 
the five mentioned functions. The class can also be referred to as the subclass 
of `Vector`.

The below diagram shows the hierarchy of the `Stack` class: 

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Selection_028.png">

The class supports one default constructor `Stack()` which is used to create 
an empty stack.

**Declaration:**

```java
public class Stack<E> extends Vector<E>
```

### How to Create a Stack?
In order to create a stack, we must import `java.util.stack` package and use 
the `Stack()` constructor of this class. The below example creates an empty `Stack`.
```java
Stack<E> stack = new Stack<E>();
```
Here `E` is the type of `Object`.

## Performing various operations on Stack class

| Method                   | Description                                                                                          |
|--------------------------|------------------------------------------------------------------------------------------------------|
| `empty()`                | It returns true if nothing is on the top of the stack. Else, returns false.                          |
| `peek()`                 | Returns the element on the top of the stack, but does not remove it.                                 |
| `pop()`                  | Removes and returns the top element of the stack.                                                    |
| `push(Object element)`   | Pushes an element on the top of the stack.                                                           |
| `search(Object element)` | returns the position of the element from the top of the stack. Returns -1 if element does not exist. |