This repository contains a Java implementation of the Boyer-Moore string matching algorithm, which is a powerful and efficient algorithm for finding occurrences of one or more patterns in a given text.

## Table of Contents

- [Overview](#overview)
- [How to Use](#how-to-use)
- [Algorithm Details](#algorithm-details)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Boyer-Moore algorithm is a versatile pattern matching technique that excels at searching for multiple patterns in a text. This implementation provides both single-pattern and multi-pattern search capabilities. It preprocesses the text and patterns to efficiently locate all occurrences of the specified patterns within the text.

## How to Use

To use this code, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/Fololorose/String-Matching.git
   ```

2. Compile the Java code:

   ```bash
   javac BoyerMoore.java
   ```

3. Run the program:

   ```bash
   java BoyerMoore
   ```

4. You can customise the `text` and `patterns` variables in the `main` method to test different input data.

## Algorithm Details

The Boyer-Moore algorithm uses two preprocessing steps: bad character and good suffix shifts. It efficiently compares patterns with the text, taking advantage of mismatches to skip unnecessary comparisons.

- **Bad Character Shift**: Preprocesses a bad character matrix to determine shifts based on mismatched characters.

- **Good Suffix Shift**: Preprocesses a shift array for good suffixes to optimize pattern matching.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

---

