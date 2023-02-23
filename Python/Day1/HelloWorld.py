
#simple hello world program in python
print("Hello World");

#new line \n
print("Hello Everyone \n Hello Everyone")

# tab in words
print("Day1 \t Day2")

# add strings
print("super" + "man")

# String Concatenation
print("Hello"+" "+"Angela")

# Day1 Exercise 1 - Printing
print("Day 1 - Python Print Function")
print("The function is declared like this:")
print("print('what to print')")

# Day1 Exercise 2 - Debugging Practice
print("Day 1 - String Manipulation")
print("String Concatenation is done with the "'"+"'" sign.")
print('e.g. print("Hello " + "world")')
print("New lines can be created with a backslash and n.")

# input() funtion
# input() will get user input in console
# then print() will print hello the user input

# a=input("What is your name?")
# print(len(a))


# Day1 Exercise 3 - Input Function
print(len(input("What is your name? ") ) )


# Day1 Exercise 4 - Variables

# 🚨 Don't change the code below 👇
a = input("a: ")
b = input("b: ")
# 🚨 Don't change the code above 👆
####################################
#Write your code below this line 👇
temp=a
a=b
b=temp
#Write your code above this line 👆
####################################
# 🚨 Don't change the code below 👇
print("a: " + a)



# Day 1 Project: Band Name Generator

#1. Create a greeting for your program.
print("Welcome to the band name generator.")
#2. Ask the user for the city that they grew up in.
city = input("Which city did you grow up in?\n")
#3. Ask the user for the name of a pet.
pet = input("what is the name of the pet?\n")
#4. Combine the name of their city and pet and show them their band name.
print("Your band name could be " + city + " " + pet)
#5. Make sure the input cursor shows on a new line:

# https://replit.com/@MohtasimAhemad/band-name-generator-start#main.py