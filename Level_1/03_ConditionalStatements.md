```java
Modulus Operator ( % ) -> It is a mathematical operator which gives us the remainder
         *      a % b  -> gives the remiander when a is divided by b.
         *      ex1: 35 % 8 = 3
         *      ex2: -4 % 7 = 0
         * 
         *  Dividend = Divisor * Quotient + Remiander
         *      35 = 8 * (35/8) + (35%8)
         *         = 8 * (4) + (3)
         *         = 32 + 3 = 35
         * 
         *      -4 = 7 * (-4/7) + (-4%7)
         *         = 7 * (0) + (-4)
         *         = 0 + (-4) = -4
         * 
         * NOTE: But remainder is never less than '0', So technically 3 should be ans
         *      but java is not like this & is explained in intermediate module
```

### Q: What will be the Output of a%b, when b divides a with NO remainder

- No remainder → 0
- ex: a = 49 && b=7 → a%b gives no remainder
- Output = 0

## Conditional Statements

- `Conditional statements` → used to control the flow of program based on certain conditions
- Conditional Statements enables us to create more complex & dynamic programs.
- Most common conditional statements -> if-else statements, switch cases & ternary operator.

## If-else

- `if` → if statement executes it's block of code, only when condition is true
- `else` → else satement executes it's block of code, only when if’s cond is false or all the previous conditions are false.
- `else-if` → this statement executes it's block of code, when previous cond is false & it's own cond is true
- In `if-else-if` ladder, if any one condition is met, it executes corresponding block & exits the flow of program, else moves to next condition

<aside>
💡 `if` & `if-else` are used to check only one condition.
`if-else if` are used to check multiple conditions in sequence BUT executes only one block of code & then exits from flow of program

→ In the conditional statements, The `condition` must always return a boolean value
→ `else` is an Optional in an if-else

</aside>

## Ternary Operator `?`

- `Ternary Operator` → Operator which requires 3 operands to perform an Operation
- It is the short-hand for if-else statements
- `variable = condition ? expression1 : expression2;`
    - If condition is `true` → expression1 is evaluates & the result stored in variable
    - if  condition is `false` → expression2 is evaluates & the result stored in variable

```java
        // Q. Check whether a student will pass or fail
        int marks = 55;
        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result); 
```

## Switch Statements

- `switch` statement executes one statement from multiple conditions based on the switch expression/variable & case values
- It is similar to an **if-else-if** ladder statement.
- *Java switch expression must be of byte, short, int, long(with its Wrapper type too), enums and string.*
- Rules for switch cases
    - Duplicate cases are NOT allowed
    - The value for a case must be of the same data type as the variable/expression in the switch.
    - The value for a case must be constant or literal. **Variables are not allowed.**
    - The `break` statement is optional. If omitted, execution will continue on into the next case.
    - The default statement is optional and can appear anywhere inside the switch block. And it will get executed only if no case matches.

```java
        int num = 3;

        switch (num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Bhajji");
                break;
            default:
                System.out.println("Biscuits");
                break;
            case 3:
                System.out.println("Vada");
                break;  
        }
```