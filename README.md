# Java Algorithms & Data Structures

A collection of fundamental algorithms and data structures implemented from scratch in Java, without using built-in Java collections.

## Implementations

### Data Structures
- **Stack** — Generic stack with dynamic resizing (push, pop, peek)
- **LinkedList** — Generic singly linked list (add, get, remove)

### Algorithms
- **BinarySearch** — Iterative and recursive implementations on sorted arrays
- **BubbleSort** — Optimized bubble sort with early exit on sorted input

## Tech Stack

![Java](https://img.shields.io/badge/Java-24-orange?logo=java)
![Maven](https://img.shields.io/badge/Build-Maven-red?logo=apachemaven)
![JUnit](https://img.shields.io/badge/Tests-JUnit5-green)

## Installation

```bash
git clone https://github.com/mariolkotsiai/java-algorithms.git
cd java-algorithms
mvn test
mvn compile exec:java -Dexec.mainClass="com.mariol.App"
```

## Project Structure

java-algorithms/
├── src/
│   ├── main/java/com/mariol/
│   │   ├── App.java           # Demo entry point
│   │   ├── Stack.java         # Stack implementation
│   │   ├── LinkedList.java    # LinkedList implementation
│   │   ├── BinarySearch.java  # Binary search algorithms
│   │   └── BubbleSort.java    # Bubble sort algorithm
│   └── test/java/com/mariol/
│       └── AppTest.java       # Unit tests (10 tests)
└── pom.xml

## Test Results

Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

## License

MIT License