Computer is “Stupid/Dumb” but it is very quick. 

i.e., why we need to elaborate all the steps which it needs to be performed so that it can perform those things in an un imaginable fastly manner.

All of us know that a **switch** has 2 states → ON & OFF

A computer has billion of these switches [transistors], that means it can have those switches in either ON or OFF states that has been maintained as 0 & 1 for simpler terms

That means computer can only understand ON & OFF i.e, 0 & 1

So, we made a way to elaborate all the steps to be performed by it in the combinations of 0’s & 1’s. 

This way of instructing the computer to do a specific task is called a programming the computer.

## Computer Prgramming (or) Coding

- `Programming` → process of writing Computer programs [ so that the computer can follow & perform the specific task ]
- `Program` → A set of instrcutions given to a computer to perform a specific task
- `Psuedocode` → step-by-step representation of an Algorithm/program in plain english [ without any syntax rules ]
- `Algorithm` → A Finite set of instructions executed in a specific order to perform a specific task
- `Syntax` → Rules of writing a Program

<br>
All of these instructions are written in combinations of 0’s & 1’s, which became the laguage of computers called Machine Language (or) Binary language.

But writing instructions in Binary Language is Very Very Difficult

Hence we write the instructions/code in Programming Languages like java, CPP & so on.. which is in English & easy to write

And a software called Compiler is developed to convert the code written in programming language to machine code

## What is a Compiler..?

- `Compiler` → converts the high-level language to machine/binary language to make programs executable
- It cheks for syntax errors
- `Compilation errors` → Errors encountered during compilation [due to syntax error]



## What is boilerplate code..?

- boilerplate code, or simply boilerplate, → piece of code that is repeated in multiple places with little to no variation

<aside>
💡 The file-name of java AND the public class name MUST be SAME

</aside>

## How to execute Java files..?

- Java files are saved with file extension → `.java`
- `Extensions`tells the computer, which applications can open/execute this file & which icon to use for the file
- To run a java file, we need to follow 2 steps
    1. compile the .java file with java compiler→ `javac file_name.java`
    2. execute the .java file with java virtual machine [ JVM ]→ `java file_name` (or) `java file_name.java`


## Why Variables..?

- Let’s say we have 2 containers/jars with white color powder crystals in it. Can you tell me which one of them is salt..?
- No, right
- But what if they have labeled them with salt & sugar. Now we can easily tell which one is salt by looking at label. [here labels are identifiers]
- Similarly, we have 2 integers 25 & 39 stored in containers called Inetegers. Now how to refer to int 25 or int 39..?
- Here too, we have labels in java called Variable names [idenfiers]. And the container itself is called variable.

## Why Data types..?

- How to store Ice, Water & Water Vapour..?
- Ice is stored in Box/Bucket, Water in a bottle/vessel & water vapour in a cylinder.
- Why they are stored in different ways instead of a single container..?
- Because, Each of them have different [their own unique] properties compared to others.
- Similarly, in Java we have different types of data like numbers & text.

## Variables in Java

- `variables` → Containers for storing data values.
    - Variables in Java are only a name given to a memory block
    - Since Java is Strongly Typed language, Each variable must be predefined with datatype
    - `DataType` → defines the type of data that the variable can hold.
        - It also defines how much of memory to be allocated to the variable in RAM
    - All variables must be declared beforehand inorder to use it in java

## How to declare & initilaize variables..?

- `int num;` → varibale declaration
    - here, int → data type || num → variable name (or) idenfier
    - `identifiers` → names given to classes, varibales, functions…so that to refer them in a program
- `num = 20` → variable initilization → giving variable an initial value
- We can do both variable declaration & initialization in a single step → `int num = 20`
- assignation → assigning a RHV to LHV

<br/>

<aside>
💡 NOTE:
———
1. In Java, Re-Declaration of same variable is NOT possible → Throws ERROR
2. In Java, Re-Assignation of same varibale is Possible
3. We can declare multiple variables in a single statement → `int num1, num2, num3, num4;` ⇒ We mention datatype only 1 time for all variables
4. we can declare & initialize multiple variablkes in a single statement → `int num1=10, num2=20, num3=30;`
5. But we can’t assign multiple variables with multiple values in a single statement → `num1 = 30, num2 = 40, num3 = 50;` → Throws error
6. But we assign multiple variables with same values in a single statementcan →  `num1 = num2 = num3 = 10;`

</aside>

## What happens when we define a variable..?

- Varibale defining is same as variable declaration
    1. So If we define a variable, Java will allocate some memory in RAM to the defined variable
    2. Java will name that memory block with the mentioned variable name & It will have some address to the memory block for future reference
    3. Finally, java stores the value of variable in that memory

## The general rules for naming variables/identifiers are:

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter and can also begin with $ and _
- Names should start with a lowercase letter, and cannot contain whitespace
- Names are case-sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as `int` or `boolean`) cannot be used as names

## Datatypes in Java

- As WKT,
    - Datatype defines the type of data that the variable can hold
    - Datatype also defines how much of memory to be allocated to the variable in RAM
- There are 2 types of datatypes
    1. Primitive Datatypes → pre-defined & built-in types used to store basic data
    2. Non-Primitive Datatypes → Not-Predefined types which based on primitive types & used to store complex data
- But the Real difference in both of these is, how they access the data
    - primitive datatrypes uses `pass by value` → they access the data directly & passes a copy of the actual data
    - Non-Primitive datatypes uses `pass by reference` → They access the data via reference i.e., memory address & they passes the copy of address

## Primitive Datatypes

- There are 8 primitive datatypes in java
    1. boolean → stores either true or false [default] && takes only 1 bit of memory
    2. char → stores a single character && takes 2 bytes of memory
    3. int → [ default ] stores only Integers && takes 4 bytes of memory
    4. byte → stores integers ranging from -128 to 127. Since it takes only 1 byte of memory
    5. short → stores integers only but takes only 2 bytes of memory
    6. long → stores integers only but takes 8 bytes of memory
    7. float → stores decimal values && takes 4 bytes of memory
    8. double → [ default ] stores decimal values but takes 8 bytes of memory

<aside>
💡 1 bit → either 0 (or) 1 → only 2 unique data can be stored
1 byte → 8 bits ⇒ we can store either 0 or 1 in each of these 8 bits → 2*2*2*2*2*2*2*2 = 2^8 = 256 unique data can be stored
But we use both positive & negavtive numbers → 1 bit must be allocated to sign → remaining 7 bits is used to allocate for actual numbers
→ 2^(8-1) == 2^7 == 128 [ i.e., 127 positive & 127 negative numebrs == 254 numbers can be stored in a byte memory ]
→ Out of these `0` is included twice [both at -ve sign && +ve sign ]
→ Hence we need to ignore one of two & given to -ve sign → Hence -128 to 127 numbers are possible with a byte of memory

General Formula → -2^(n-1) to 2^(n-1)-1 [ n is the memory in bits ]

</aside>

## Comments in Java..?

- Comments are ignored by compiler → Comments are NOT executed by java
- Comments are used for debugging the code → we can comment out the sections of code to understand it’s execution behavior
- Comments are mainly used for Documentation purpose, so that other developers can undertsand the code written by a developer
- There are 3 types of comments
    - single line comments → `//`
    - multiline comments → `/* comments */`
    - documenattion comments → `/** @comments */` [Basically same as multi-line but gives additional features like @

## What is Package in java..?

- A Java `package` is encapsulation of a collection of sub-packages, classes and interfacesof a similar type
- In Java, two packages namely `java.lang package` and **a** `default package` are imported by default in all the classes of Java.
    - Hence, we don;t need to import these packages seperately
- Default package is an unnamed package
    - Unnamed packagesa re provided by Java for small (or) temporary applications
    - Unnamed packages cannot have sub-packages [ since the syntax of a package declaration always includes a reference to a named top level package ]

`Input` → User interactions to the instructions given to the computer/machine

`Output` → Results displayed by computer upon performing the instructions given to it.

<aside>
💡 Intructions → User Interactions [Input] → Computer → Results [Output]

</aside>

## How to display Output in Java..?

System Class is used to print output onto console

But in order to actually print onto console, we need print() fn inside System class → `System.out.print()`

- `print()` --> used to print the arguments on the console window
- `println()` --> used to print the arguments & then cursor will be positioned in the new line
- `\n` --> a line break, used to immediately move & place the cursor to next line
- `;` --> It is a statement terminator & is mandatory in java

```java
public class Output {
    public static void main(String[] args) {
        System.out.print("Hello World..!");
        System.out.print("This prints the arguments & places the cursor on new line");
    }
}
```

## How to take Input from User..?

- Inorder to take input from User in java, we need another class called  `Scanner`
    - WKT, `System` class is used to print Output onto Console
    - Similarly, `Scanner` class is used to take input from user
- But It lies in a different package called `util` → Hence we need to import it, inorder to use it
- Now we make an Object out of the `Scanner` class → `Scanner scan = new Scanner(System.in);`
- This Object will have methods which helps us to take input from user → `scan.nextInt();`

```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
    }
}
```

<aside>
💡 `Scanner` is used for taking smaller data as input. 
While `BufferReader` is used to take larger size data [like 1000's lines of code] as inputs.

</aside>
