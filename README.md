# David’s Command Line Caesar Cipher Using Java Program

#### This project is about Ceasar Cipher Using Java Program, Version Date: 14th April 2023

#### By **David Muthui Ndung'u**

## Description

This project is my week one Java IP about Ceasar Cipher.

[Caesar Cipher](https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Caesar_cipher_left_shift_of_3.svg/320px-Caesar_cipher_left_shift_of_3.svg.png)

This is a Caesar cipher which you can use to encrypt or decrypt a piece of text.

## What is Caesar cipher?
In cryptography, a Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. For example, with a left shift of 3, D would be replaced by A, E would become B, and so on. The method is named after Julius Caesar, who used it in his private correspondence.
The Problem.
Implement a Caesar cipher, both encoding, and decoding. The key is an integer from 1 to 25. This cipher rotates the letters of the alphabet (A to Z). The encoding replaces each letter with the 1st to 25th next letter in the alphabet (wrapping Z to A). So key 2 encrypts "HI" to "JK", but key 20 encrypts "HI" to "BC".

## BDD
* After running the code, Select the process,
- Input either e for encoding or d for decoding
* Enter the message
- Input the message you want to display
* Enter the key
- Input the key number
* After getting the output displayed, choose whether to continue or to end
- Input continue or quit

## Steps for the problem
•   As always, follow the "Red, Green, Refactor" workflow. You should always write a test before implementing a new behavior. Keep this lesson open as you code, and follow along with the workflow as you develop the program.
•   First of all before everything, you'll want to create a test file to test the functionality of the ceaser cipher.
•   In the test file, you will need to test out if the entered input is appropriate: Only strings. And throws appropriate exceptions. Also the output is right given the input
•   The same case applies to decoding of the cipher;
•   You'll want to create an encoding class that takes an input and encrypts it using the desired key of your choice. You will need to create an attribute that holds the key and the input as well as the output.
•   You’ll also want to create a decoding class that converts the output that was produced by the encoding class and returns the original value or input that was fed earlier .
•   Note that all the classes should be encapsulated containing private properties. Use getter methods for all properties you must access outside of the class

## Formulae Used
En (x) = (x + n) mod 26
Any letter x is equal to (x + n), where n is the shift number and x is a character. The result will be taken under modulo division if there is a case where any character reaches the end of the alphabet. So the module will take the character to the start of the alphabet.
Dn (x) = (x - n) mod 26
Any letter x is equal to (x + n), where n is the shift number and x is a character. The result will be taken under modulo division if there is a case where any character reaches the end of the alphabet. So the module will take the character to the start of the alphabet.

## **Expected output is either**
Eventually, when your logic for encrypting and decrypting a String input (and well-tested), work on displaying the encrypted and decrypted data, like this:
Input String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Encrypted String: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
Decrypted String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

## Features:
We use the following steps to implement the program for the Caesar Cipher technique:
1.  Take an input string from the user to encrypt it using the Caesar Cipher technique.
2.  Take an input integer from the user for shifting characters. The input integer should be between 0-25.
3.  Traverse input string one character at a time.
4.  Depending on the encryption and decryption, we transform each character as per the rule.
5.  Returns the newly generated string.

## Setup/Installation Requirements
- Run the code
- Input either e for encoding or d for decoding
- Input the message you want to display
- Input the key number
- Get your output
  To access for code for learning:

- Go to Git clone https://github.com/dmuthui/MoringaSchoolJava-Week1IP-CaesarCipher.git
- Open cloned code on IntelliJ
- Run on the Code to view output

## Known Bugs
There are no known bugs on this project.

## Technologies Used
•   Written in Java (JDK 11.0.17).
•   Used Gradle 8.0.2 as a build tool, JVM:11.0.17 and Groovy:3.0.13
•   Used the IntelliJ IDEA as code editor for compiling and running the source code.

## Support and contact details
If you need any assistance on any issues or have questions, ideas or concerns. Kindly contact me through email: vyda2002us@gmail.com to make a contribution to the code or for any assistance on the app/project.

## Github URL Link
To be able to view the project click on https://github.com/dmuthui/MoringaSchoolJava-Week1IP-CaesarCipher.git

### License
_The License used is GPL_

### Copyright (c) 2023 **David Muthui Ndungu**
