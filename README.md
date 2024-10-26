### Assignment S1.04 - Testing

## Overview

This project consists of multiple exercises related to unit testing in Java using JUnit and AssertJ. The project is structured into different levels and exercises, and Maven is used as the build and test tool.

The goal is to automate the creation of `pom.xml` files and the running of Maven tests across multiple directories.

## Project Structure

The project is divided into the following levels and exercises:

Assignment_S1.04._Testing/ │ ├── Level_1-JUnit/ │ ├── Exercise_1/ │ ├── Exercise_2/ │ ├── Exercise_3/ │ ├── Level_2-AssertJ/ │ ├── Exercise_1/ │ ├── Exercise_2/ │ └── Level_3-JUnit/ ├── Exercise_1/

Each exercise contains Java source code files and JUnit test files that are executed using Maven.

## Debian Commands Used

### 1. Make the `create_pom_files.sh` Executable

```bash
chmod +x create_pom_files.sh
This command was used to make the shell script executable, which automatically creates pom.xml files in all the necessary directories.

2. Run the create_pom_files.sh Script

./create_pom_files.sh
This script generates the pom.xml files required for Maven to run in each exercise directory. Below is a summary of the shell script:

The script creates pom.xml files in the following directories:

Level_1-JUnit/Exercise_1
Level_1-JUnit/Exercise_2
Level_1-JUnit/Exercise_3
Level_2-AssertJ/Exercise_1
Level_2-AssertJ/Exercise_2
Level_3-JUnit/Exercise_1
It adds a simple Maven configuration for compiling Java 1.8 code and running JUnit tests.

3. Make the run_all_tests.sh Executable

chmod +x run_all_tests.sh
This command was used to make the run_all_tests.sh script executable, which automates running all the Maven tests across different directories.

4. Run the run_all_tests.sh Script

./run_all_tests.sh
This script loops through all the directories and runs mvn clean test in each one, ensuring that tests are executed and the directory is cleaned up before each run. The output will indicate whether the tests passed or failed in each directory.

5. Example Maven Command for Running Tests Manually
To run Maven tests manually in a specific directory (e.g., Level_1-JUnit/Exercise_1), you can use the following command:

cd Level_1-JUnit/Exercise_1
mvn test
This command navigates to the specific directory and runs all the tests defined in that directory.

Automation of Tests
create_pom_files.sh
This script automatically creates pom.xml files for each exercise directory. Each pom.xml contains basic Maven configuration, including dependencies for junit (version 4.12) and the necessary Maven plugins for compiling Java code and running tests.

run_all_tests.sh
This script automates the process of running tests for each exercise. It loops through all the exercise directories and runs the following Maven commands in each:

mvn clean test
This command cleans the directory, compiles the Java code, and runs all the tests.

Summary
By automating the creation of pom.xml files and the running of tests, the workflow is simplified. Instead of manually setting up Maven for each exercise, the scripts handle it for you. This ensures that all exercises are tested efficiently and consistently across the project.
