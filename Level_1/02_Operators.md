sc.next( ) → Reads only one word from the user input

sc.nextLine( ) → Reads entire sentence from the user input [until he clicks enter]

```java
        //Guess the Output
        String a = scan.next();
        String b = scan.nextLine();

        //Now give input as 
            //Hello
            //Who are u..?
        System.out.println(b);

        /*
         * The above sop statement gives an empty output
         * Why..?
         *      As theere are 2 lines of input, 
         *          1st line has only 1 word which was read by scan.next()
         *          But there is nothing present for nextLine() fn so it takes up the empty string
         *      i.e., why empty output is displayed
         *      If there is " " after Hello word, then that will be printed as output
        */
```

## Integer Overflow

- when the container/bucket is filled with a data which is more than the actual container can hold, then overflow happens
- In this overflow case, java will give some random value
- We need to understand how this overflow is happening so that we never lose our Imp data when it happens.

## Type Casting in java

- It is the process of converting one data type to another either automatically [implicit] or manually [explicit]
- `Implicit Casting` → Automatic Conversion of data from one type to another type when required
    - Type Conversion happens only when
        1. types are compatible → [ boolean & float are NOT compatible but int & float are compatible ]
        2. destination type > source type
    - `byte → short → int → long -> float → double`
        - Type conversion from Left to Right is automatic
        - But from Right to Left, we need explicit casting
- `Explicit Casting` → Explicit Conversion of data from one type to another type when required
    - Here, we explicitly convert data from one type to another using `(int/float/boolean..)`

```java
public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        char ch = 'a';
        int charToNum = ch;
        System.out.println(charToNum);

        int num = 15;
        float numToFloat = num;
        System.out.println(numToFloat);

        // Explicit Casting
        float fl = 45.2f;
        int floatToNum = (int) fl;
        System.out.println(floatToNum);
    }
}
```

## Type Promotion in Expression

- Whenever there are expressions in java, Then the types involved in the expression are automatically promoted
- Their types will be promoted based on
    1. When evaluating an expression, Java automatically promotes each `byte`, `short` (or) `char` operand to `int`
    2. If any one of the operand is `long` , `float` (or) `double` , Then the whole expression is converted to `long` , `float` (or) `double` respectively
        - `long -> float -> double`
            - i.e., if an exp contains atleast one double → Whole exp is converted to double
            - i.e., if an exp contains atleast one float & long → Whole exp is converted to float
            - i.e., if an exp contains atleast one long with NO float & double → Whole exp is converted to long

```java
// Type Promotion in Expressions
        char ch1 = 'a';
        char ch2 = 'b';

        System.out.println(ch1);            // this will print char as it is NOT an Expression
        System.out.println(ch1 - ch2);      // This will print int as it is an expression

        byte b = 10;
        short s = 20;
        char c = 'c';

        System.out.println(b+s+c);

        byte total = (byte) (b+s+c);
        System.out.println(total);

        int n = 10;
        float f = 20.25f;
        long l = 100;

				// What will be the type here..?
        System.out.println("Type is: " + ((Object)(n+f+l)).getClass().getSimpleName());

        double db = n + f + l;
        System.out.println(db);

        long ln = 1000;
        float f1 = ln;
        System.out.println(f1);
```

<aside>
💡 To check the type of any primitive datatype → `(Object)(var/exp)).getClass().getSimpleName()`

`Boolean Expression` → the expression which results either true or false is called a boolean expression.

</aside>

## Why this is NOT an Error

```java
        long ln = 1000L;
        float f1 = ln;
        System.out.println(f1);
```

- cuz, java follows this widening → `byte → short → int → long -> float → double`
- hence, for left to right No casting is requried

## What is O/P of following code

```java
        byte b = 10;
        b = b*2;
        System.out.println(b);
```

- Error → since RHS of 2nd line is an expression → it is converted to `int`
- `int` cannot be stored in `byte`
- So make some changes

```java
        byte b = 10;
        b = (byte)(b*2);
        System.out.println(b);
```

- Now ans → 20

```java
//How to print a float upto 2 decimal points..?
        System.out.printf("%.2f", 54.36987);
```

---

## Operators in Java

- `Operators` → Symbols that tell Compiler to perform an Operation
- `int sum = a + b` →
    - `a` & `b` are Operands
    - `+` is Operator

<aside>
💡 `Operands` are the variables/literals upon which the operation is performed
`literals` are the constant values in a program

</aside>

## Types of Operators

- Arithmetic Operators [ Binary & Unary ]
- Relational Operators
- Logical Operators
- Bitwise Operators
- Assgnment Operators

## Arithmetic Operators

- Arithmetic Operators → Used to perform Arithmetic Operations
- These are 2 types
    - Binary Operators → Operator which requires 2 operands to perform an operation
        - `+` → Performs Addition Operation
        - `-` → Performs SubtractionOperation
        - `*`  → Performs MultiplicationOperation
        - `/` → Division Operator → used to give the Quotient
        - `%` → Modulo Operator → used to give the reminder
    - Unary Operators → Operators which require only 1 operand to perform an operation
        - `++` → Increment Operator → Increases the value by 1
        - `--` → Decrement Operator → decrrease the value by 1

`pre-Increment` → ++a → first increases the value of `a` by 1 AND then evaluates the expression/equation with the latest value of `a` 

`post-Increment` → a++ → first evaluates the expression/equation with the current value of `a` AND then increases the value of `a` by 1

<aside>
💡 Formula for Division → `Dividend = Divisor × Quotient + Remainder`

</aside>

## Relational Operators

- Comparison/Relational operators are used to compare two values/Operands
    - `==` → checks whether 2 values/operands are Equal or not
    - `!=` → checks whether 2 values/operands are NOT Equal or not
    - `>` → checks whether LHS is Greater than RHS
    - `<` → checks whether LHS is Less than RHS
    - `>=`  → checks whether LHS is greater than or equals to RHS
    - `<=`  → checks whether LHS is Less than or equals to RHS

<aside>
💡 Relational Operators always return a `boolean` value & requires 2 operands

</aside>

## Logical Operators

- Logical operators are used to determine the logic between variables or values
    - `&&` → Logical AND → Returns true only if both the statements are true
    - `||` → Logical OR→ Returns true if anyone of the statements is true
    - `!` → Logical NOT→ Reverse the result [ i.e, returns false if the result is true  & viceversa ]

<aside>
💡 Logical NOT `!` is an Unary Operator → requires only 1 operand to perform the operation

</aside>

## Assignment Operators

- Assignment operators are used to assign values to variables
    - `=` → Assigns RHS value to LHS
    - `+=` → Addition Assignment Operator → Adds & then assigns the value to LHS [ `a += 10` same as `a = a + 10` ]
    - `-=` → Subtraction Assignment Operator → Subtracts & then assigns the value to LHS [ `a -= 10` same as `a = a - 10` ]
    - `*=` → Multiplication Assignment Operator → Multiplies & then assigns the value to LHS [ `a *= 10` same as `a = a * 10` ]
    - `/=` → Division Assignment Operator → Divides & then assigns the value to LHS [ `a /= 10` same as `a = a / 10` ]
    - `%=` → Modulo Assignment Operator → finds remainder & then assigns the value to LHS [ `a %= 10` same as `a = a % 10` ]

<aside>
💡 Is `a != b` same as `a = a ! b` ..?
→ NO

</aside>

## Operator Precedence in Java

- `Operator precedence` → determines the order in which the operators in an expression are executed/evaluated.
    - `postfix  >>  [ prefix, unary ]  >>  [ *, /, % ]  >>  [ +, - ]  >>  Relational  >>  [ ==, != ]  >> Logical`
    - If an expression has two operators with similar precedence, Then they are evaluated → Left to Right
        - Except prefix & Unary operators, They are evaluated → Right to Left

```java
        // We cannot do this
        int a = 10;
        int (--b) = --a;
        
        // We cannot do this
        int a = 10;
        int --b = --a;
```

## Practice Question

```java
 public class Test {
     public static void main(String[] args){
         int x = 9, y = 12;
         int a = 2, b = 4, c = 6;
         int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
         System.out.println(exp);
     }
 }
```