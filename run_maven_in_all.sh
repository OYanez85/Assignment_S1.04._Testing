#!/bin/bash

# List of directories where pom.xml is located
dirs=(
    "Level_1-JUnit/Exercise_1"
    "Level_1-JUnit/Exercise_2"
    "Level_1-JUnit/Exercise_3"
    "Level_2-AssertJ/Exercise_1"
    "Level_2-AssertJ/Exercise_2"
    "Level_3-JUnit/Exercise_1"
)

# Loop through directories and run mvn clean compile and mvn test
for dir in "${dirs[@]}"; do
    if [ -f "$dir/pom.xml" ]; then
        echo "Running Maven in $dir"
        cd "$dir" || exit

        # Run Maven clean and compile
        mvn clean compile

        # Run Maven tests
        mvn test

        cd - || exit
    else
        echo "No pom.xml found in $dir, skipping..."
    fi
done
