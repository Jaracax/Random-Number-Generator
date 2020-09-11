public class Guidelines {

    // Exercises

    // Speed Converter // Done
/* Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
This method needs to return the rounded value of the calculation of type long.
If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
For conversion and rounding, check the notes in the text below.
Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
Then it needs to print a message in the format "XX km/h = YY mi/h".*/
    // MegaBytes Converter // Done
/*Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".*/
    // Barking Dog // Done
/*We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
In all other cases return false.
If the hourOfDay parameter is less than 0 or greater than 23 return false.*/
    // Leap Year Calculator // Done
/* The condition for a year to be a leap year is: Any year that is divisible by 400 is a leap year
except for the years that are divisible by 100, but this centurial years are leap years if they are divisible by 400
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step
2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.*/
    // Decimal Comparator // Done
/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
Otherwise, return false.*/
    // Equal Sum Checker // Done
/*Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter.
Otherwise, return false.*/
    // Teen Number Checker // Done
/*We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter
is in range 13(inclusive) - 19 (inclusive). Otherwise return false
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters
is in range 13(inclusive) - 19 (inclusive). Otherwise return false.*/
    // Area Calculator // Done
/*Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
For formulas and PI value please check the tips below.
TIP: The formula for calculating the area of a rectangle is x * y.
TIP: The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI*/
    // Minutes To Years and Days Calculator // Done
/*Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d"
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.*/
    // Equality Printer // Done
/*Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".*/
    // Playing Cat // Done
/*The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.*/
    // Number In Word // Done
/*Write a method called printNumberInWord.
The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.*/
    // Number Of Days In Month // Done
/*Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month.
Be careful about leap years they have 29 days in month 2 (February).*/
    // Sum Odd // Done
/*Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise  return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input. */
    // Number Palindrome // Done
/*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
If both are the the same then the number is a palindrome otherwise it is not.
Tip: Logic to reverse a number
Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero.
A while loop would be good for this coding exercise.*/
    // First And Last Digit Sum // Done
/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.*/
    // Even Digit Sum // Done
/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.*/
    // Shared Digit // Done
/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.*/
    // Last Digit Checker // Done
/*
Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
otherwise return false.
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
otherwise, it should return false.*/
    // Greatest Common Divisor // Done
/*Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).*/
    // All Factors // Done
/*Write a method named printFactors with one parameter of type int named number.
If number is < 1, the method should print "Invalid Value".
The method should print all factors of the number.
A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.*/
    // Perfect Number // Done
/*What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number
without leaving a remainder and exclude the perfect number itself.
For example, take the number 6:
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded),
and the sum of its proper divisors is 1 + 2 + 3 = 6.
Therefore, 6 is a perfect number (as well as the first perfect number).
Write a method named isPerfectNumber with one parameter of type int named number.
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect,
the method should return true; otherwise, it should return false.*/
    // Number To Words // Done
/*Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:
1. Extract the last digit of the given number using the remainder operator.
2. Convert the value of the digit found in Step 1 into a word.
There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.
The logic above is correct, but in its current state, the words will be printed in reverse order.
For example, if the number is 234, the logic above will produce the output
"Four Three Two" instead of "Two Three Four". To overcome this problem,
write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int).
For example, if the number passed is 234, then the reversed number would be 432.
The method  reverse should also reverse negative numbers.
Use the method reverse within the method numberToWords in order to print the words in the correct order.
Another thing to keep in mind is any reversed number with leading zeroes
(e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One",
but that is incorrect. It should print "One Zero Zero".
To solve this problem, write a third method called getDigitCount.
The method getDigitCount should have one int parameter called number and
return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
HINT: Use a for loop to print zeroes after reversing the number.
As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero".
To get the number of zeroes, check the difference between the digit count from the original number and the reversed number. */
    // Flour Pack Problem // Done
/*Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
The parameter bigCount represents the count of big flour bags (5 kilos each).
The parameter smallCount represents the count of small flour bags (1 kilo each).
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
For example, if goal = 9, bigCount = 2, and smallCount = 0,
the method should return false since each big bag is 5 kilos and cannot be divided.
However, if goal = 9, bigCount = 1, and smallCount = 5,
the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
and it's okay if there are additional bags left over.
If any of the parameters are negative, return false.*/
    // Largest Prime // Done
/*Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.*/
    // Diagonal Star // Done // But Practice for nested loops
/*Write a method named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*).
This should be accomplished by using loops (see examples below).
The patterns above consist of a number of rows and columns (where number is the number of rows to print).
For each row or column, stars are printed based on four conditions (Read them carefully):
* In the first or last row
* In the first or last column
* When the row number equals the column number
* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
HINT: Use a nested loop (a loop inside of a loop).
HINT: To print on the same line, use the print method instead of println,
e.g. System.out.print(" "); prints a space and does not "move" to another line.
HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .*/
    // Read User Input // Done
/*
-Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Create a Scanner like we did in the previous video.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number.
Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message 
gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be gEnter number #1:h,
the next gEnter number #2: h, and so on.
Hint:
-Use a while loop.
-Use a count variable for counting valid numbers.*/
    // Min and Max Input // Done
/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message "Enter number:"
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
TIP: You can create an endless loop this way "while(true)"
*/
    // Input Calculator // Done
/*
* Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
TIP: Use casting when calling the round method since it needs double as a parameter.
NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.*/
    // Paint Job // Done
/*
1. Write a method named getBucketCount with 4 parameters.
The first parameter should be named width of type double.
This parameter represents the width of the wall.
The second parameter should be named height of type double.
This parameter represents the height of the wall.
The third parameter should be named areaPerBucket.
This parameter represents the area that can be covered with one bucket of paint.
The fourth parameter should be named extraBuckets.
This parameter represents the bucket count that Bob has at home.
The method needs to return a value of type int that represents the number of buckets
that Bob needs to buy before going to work.
To calculate the bucket count, refer to the notes below.
If one of the parameters width, height or areaPerBucket is less or equal to 0
or if extraBuckets is less than 0, the method needs to return -1
to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.

2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
Write another overloaded method named getBucketCount with 3 parameters
namely width, height, and areaPerBucket (all of type double).
This method needs to return a value of type int that represents
the number of buckets that Bob needs to buy before going to work.
To calculate the bucket count, refer to the notes below.
If one of the parameters width, height or areaPerBucket is less or equal to 0,
the method needs to return -1 to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.

3. In some cases, Bob does not know the width and height of the wall but
he knows the area of a wall. He needs you to write another method.
Write another overloaded method named getBucketCount with 2 parameters namely,
area and areaPerBucket (both of type double).
The method needs to return a value of type int that represents the number of buckets
that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
If one of the parameters area or areaPerBucket is less or equal to 0,
the method needs to return -1to indicate an invalid value.
If all parameters are valid, the method needs to calculate the number of buckets and return it.

NOTE: Use the method Math.ceil to round the number of calculated buckets (double)
then convert it into an int before returning the value from the methods.*/
    // Sum Calculator // Done
/*Write a class with the name SimpleCalculator. The class needs two fields (instance variables)
with names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
*Method named getFirstNumber without any parameters,
it needs to return the value of firstNumber field.
*Method named getSecondNumber without any parameters,
it needs to return the value of secondNumber field.
*Method named setFirstNumber with one parameter of type double,
it needs to set the value of the firstNumber field.
*Method named setSecondNumber with one parameter of type double,
it needs to set the value of the secondNumber field.
*Method named getAdditionResult without any parameters,
it needs to return the result of adding the field values of firstNumber and secondNumber.
*Method named getSubtractionResult without any parameters,
it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
*Method named getMultiplicationResult without any parameters,
it needs to return the result of multiplying the field values of firstNumber and secondNumber.
*Method named getDivisionResult without any parameters
it needs to return the result of dividing the field values of firstNumber by the secondNumber.
In case the value of secondNumber is 0 then return 0.*/
    // Person // Done
/*Write a class with the name Person.
The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName field.
*Method named getLastName without any parameters, it needs to return the value of the lastName field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field.
If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if
the value of the age field is greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
*In case both firstName and lastName fields are empty, Strings return an empty String.
*In case lastName is an empty String, return firstName.
*In case firstName is an empty String, return lastName.
To check if s String is empty, use the method isEmpty from the String class.
For example, firstName.isEmpty() returns true if the String is empty or in other words,
when the String does not contain any characters.*/
    // Bank Class
/*Create a new class for a bank account
Create fields for the account number, balance, customer name, email and phone number.
Create getters and setters for each field
Create two additional methods
1. To allow the customer to deposit funds (this should increment the balance field).
2. To allow the customer to withdraw funds. This should deduct from the balance field,
but not allow the withdrawal to complete if their are insufficient funds.
You will want to create various code in the Main class (the one created by IntelliJ) to
confirm your code is working.
Add some System.out.println's in the two methods above as well.*/
    // Vip Class
/*Create a new class VipCustomer
it should have 3 fields name, credit limit, and email address.
create 3 constructors
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
3rd constructor should save all fields.
create getters only for this using code generation of intellij as setters wont be needed
test and confirm it works.*/
    // Wall Area
/*Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters width and height of type double and it needs to initialize the fields.
In case the width is less than 0 it needs to set the width field value to 0,
in case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double,
it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double,
it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.*/
    // Point
/*You have to represent a point in 2D space. Write a class with the name Point.
The class needs two fields (instance variables) with name x and y of type int.
The class needs to have two constructors.
The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters x and y of type int and it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point (x) and Point(y) 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) xA and yA = fields xB and yB = parameters
* Method named distance with parameter another of type Point (the class Point and the parameter is calls point),
it needs to return the distance between this Point and another Point (the parameter point calling the fields) as double.
Where √ represents square root.*/
    // Carpet Cost Calculator
/*1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0,
in case the length parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
* Method named getArea without any parameters, it needs to return the calculated area (width * length).
2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
In case the cost parameter is less than 0 it needs to set the cost field value to 0.
Write the following methods (instance methods):
* Method named getCost without any parameters, it needs to return the value of cost field
3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.*/
    // Complex Number
/*A complex number is a number that can be expressed in the form a + bi,
where a and b are real numbers, and i is a solution of the equation x2 = −1.
Because no real number satisfies this equation, i is called an imaginary number.
For the complex number a + bi, a is called the real part, and b is called the imaginary part.
To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.
For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
Write a class with the name ComplexNumber. The class needs two fields (instance variables)
with name real and imaginary of type double. It represents the Complex Number.
The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getReal without any parameters, it needs to return the value of real field.
* Method named getImaginary without any parameters,
it needs to return the value of imaginary field.
* Method named add with two parameters real and imaginary of type double,
it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
* Method named add with one parameter of type ComplexNumber.
It needs to add the ComplexNumber parameter to the corresponding instance variables.
* Method named subtract with two parameters real and imaginary of type double,
it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
* Method named subtract with one parameter other of type ComplexNumber.
It needs to subtract the other parameter from this complex number.*/

    
}
