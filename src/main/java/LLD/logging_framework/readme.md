🧩 Problem #1: Logging Framework
Difficulty: Easy

Background
<br>
You are a software engineer at a startup called TechFlow. The company is building a large-scale backend application that will have multiple services and components. The engineering team has identified a need for a centralized logging mechanism across the entire application.
<br>
Currently, developers are using System.out.println() scattered throughout the codebase, which makes debugging difficult, logs inconsistent, and there's no way to filter logs by severity.
<br>
Problem Statement
<br>
Design and implement a Logging Framework for the application.

Functional Requirements
<br>
The system should provide a way to log messages with different severity levels:
<br>
INFO - General information
<br>
DEBUG - Debugging information
<br>
WARNING - Warning messages
<br>
ERROR - Error messages
Each log entry should contain:
Timestamp
Log level
The actual message
The logger should print logs to the console.
Any class or component in the application should be able to access and use the logger.
Non-Functional Requirements
There should be only ONE logger instance across the entire application to ensure consistency.
The design should be extensible - in the future, we might want to add more log levels or change the output format.
Expectations
Provide the class design (classes, interfaces, enums, etc.)
Implement the core functionality in Java
Demonstrate usage with a simple driver/main class

Sample Output

<code>
[2026-01-13 23:00:12] [INFO] User authentication successful
<br>
[2026-01-13 23:00:13] [DEBUG] Cache hit for key: user_123
<br>
[2026-01-13 23:00:14] [WARNING] API rate limit approaching
<br>
[2026-01-13 23:00:15] [ERROR] Database connection failed
</code>