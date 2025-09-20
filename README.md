📘 Student Grade Tracker

A simple Java console application to manage student grades.
The program allows users to enter student names and grades, validates input, and generates a summary report with statistics including average, highest, and lowest grades.

📌 Features

Add multiple students and their grades.

Input validation:

Names are stored as strings.

Grades must be numbers between 0–100.

Statistics generated automatically:

Total number of students.

Average grade.

Student with the highest grade.

Student with the lowest grade.

Graceful exit if no students are entered.

📂 Project Structure
StudentGradeTracker.java   # Main Java source file

⚙️ Requirements

Java 8 or above

A terminal/IDE that supports running Java code (e.g., IntelliJ IDEA, Eclipse, VS Code, or command line)

🚀 How to Run

Compile the program:

javac StudentGradeTracker.java


Run the program:

java StudentGradeTracker

🖥️ Example Usage
===== Student Grade Tracker =====
Enter student name (or type 'done' to finish): Alice
Enter grade for Alice: 92
Enter student name (or type 'done' to finish): Bob
Enter grade for Bob: 78
Enter student name (or type 'done' to finish): done

===== Student Grade Report =====
Alice : 92.0
Bob   : 78.0

Total Students: 2
Average Grade: 85.00
Highest Grade: 92.0 ( Alice )
Lowest Grade : 78.0 ( Bob )
================================

📚 Concepts Demonstrated

Java basics: Scanner, loops, conditionals

ArrayList usage for dynamic data storage

Input validation with try-catch

Computing statistical results

🤝 Contributing

Feel free to fork this repo and submit pull requests with improvements such as:

Sorting students by grades.

Exporting report to a file.

Adding letter grades (A, B, C…).
