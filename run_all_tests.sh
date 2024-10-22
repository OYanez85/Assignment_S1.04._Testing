#!/bin/bash

# List of directories where Maven commands should be executed
dirs=(
    "Level_1-JUnit/Exercise_1"
    "Level_1-JUnit/Exercise_2"
    "Level_1-JUnit/Exercise_3"
    "Level_2-AssertJ/Exercise_1"
    "Level_2-AssertJ/Exercise_2"
    "Level_2-AssertJ/Exercise_3"
    "Level_2-AssertJ/Exercise_4"
    "Level_2-AssertJ/Exercise_5"
    "Level_2-AssertJ/Exercise_6"
    "Level_2-AssertJ/Exercise_7"
    "Level_3-JUnit/Exercise_1"
)

# Loop through each directory and run `mvn test`
for dir in "${dirs[@]}"; do
    echo "Running Maven in $dir"
    (cd $dir && mvn clean test) # Change to the directory and run Maven test
done
