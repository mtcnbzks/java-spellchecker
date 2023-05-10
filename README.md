# Java Spell Checker

## About

This project is a Java-based spellchecker that utilizes a Binary Search Tree (BST) and the Levenshtein distance
algorithm to suggest potential correct spellings for misspelled words.

### Note

**BST is a commonly used data structure for searching and sorting data. Although it may not be the most efficient data
structure for this specific application, it was chosen for this project as a requirement for a school project.**

### Structure

The project consists of three classes - GUI, BST, and SpellChecker. The GUI class is responsible for providing a user
interface with Swing framework that allows users to input text and initiate the spellchecking process. The BST class is
responsible for
maintaining the BST data structure and providing search and insert functions. Finally, the SpellChecker class utilizes
the BST and Levenshtein distance algorithm to suggest potential correct spellings for misspelled words.

One of the key functions in the SpellChecker class is the `closestWords` function, which takes a misspelled word and
returns a BST of potential correct spellings. This function utilizes the Levenshtein distance algorithm to measure the
distance between the misspelled word and potential correct spellings. You can also see suggestions by select misspelled
word and click right mouse button.
