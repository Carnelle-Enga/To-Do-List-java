## Java Console Todo List

## Overview

**Java Console Todo List** is a simple task management application developed using the **Java programming language**.
The application runs in the terminal and allows users to manage their daily tasks efficiently.

This project was created as a **learning project** to practice core Java concepts such as:

* Object-Oriented Programming (OOP)
* Collections (`ArrayList`)
* File handling (reading and writing files)
* User input handling with `Scanner`
* Working with dates using `LocalDate`

The application allows users to create tasks, organize them by category, assign deadlines, mark them as completed, and store them persistently in a local file.

---

# Features

The application provides the following functionalities:

### Task Management

Users can:

* Add a new task
* View all tasks
* Mark a task as completed
* Delete a task
* Modify an existing task

### Task Attributes

Each task contains:

* **Title**
* **Description**
* **Category**
* **Due date**
* **Completion status**

### Categories

Tasks can be organized into categories such as:

* Work
* Personal
* Study
* Other

### Due Dates

Each task can have a **deadline** using the `LocalDate` class.

### File Persistence

All tasks are saved locally in a text file so that data is not lost when the program stops.

The application automatically:

* Loads tasks at startup
* Saves tasks when changes occur

---

# Project Objectives

The purpose of this project is to strengthen understanding of:

* Java syntax and programming structure
* Object-oriented programming principles
* Working with lists and collections
* File input/output operations
* Basic application architecture

This project is intentionally kept **simple and console-based** to focus on mastering fundamental programming concepts.

---

# Technologies Used

* **Java**
* Java Collections Framework (`ArrayList`)
* File I/O (`FileWriter`, `BufferedWriter`, `BufferedReader`)
* `Scanner` for user input
* `LocalDate` for date management

---

# Example Menu

When the application starts, the user is presented with a menu:

```
===== TODO LIST =====

1 - Add a task
2 - View all tasks
3 - Mark a task as completed
4 - Delete a task
5 - Exit
```

The user interacts with the system by entering the number corresponding to the desired action.

---

# Data Storage Format

Tasks are stored in the file:

```
tasks.txt
```

Each task is saved using the following format:

```
title | description | category | dueDate | completed
```

Example:

```
Finish Java assignment | Collections exercise | Study | 2026-03-10 | false
```

---

# How to Run the Project

### 1. Clone the repository

```
git clone https://github.com/yourusername/java-todo-list.git
```

### 2. Navigate to the project directory

```
cd todo-list-java
```

### 3. Compile the program

```
javac src/*.java
```

### 4. Run the application

```
java src/Main
```

---

# Example Usage

Example session:

```
===== TODO LIST =====

1 - Add a task
2 - View tasks
3 - Complete a task
4 - Delete a task
5 - Exit
```

User adds:

```
Title: Study Java
Description: Practice ArrayList
Category: Study
Due Date: 2026-03-10
```

The task will appear in the list.

---

# Future Improvements

Possible enhancements for future versions include:

* Graphical user interface (web version )
* Task priority levels
* Notifications for upcoming deadlines
* Database integration

---

# Author

**Carnelle Enga**

Computer Science Student
University of Dschang

Interested in:

* Artificial Intelligence
* Software Development

---

# License

This project is open source and available for educational purposes.
