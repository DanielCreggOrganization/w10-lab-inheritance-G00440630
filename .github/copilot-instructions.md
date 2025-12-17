# Copilot Instructions for Java Inheritance Lab

## Project Overview
This is a Java lab focused on object-oriented inheritance concepts. The codebase demonstrates inheritance patterns through simple class hierarchies like Person/Employee and Animal/Dog.

## Architecture
- **Package Structure**: All classes reside in `ie.atu.inheritance` package under `src/`.
- **Main Entry Point**: [Main.java](src/ie/atu/inheritance/Main.java) - currently empty, serves as the application entry point.
- **Inheritance Patterns**: Subclasses extend superclasses using `extends`. Follow "Is-A" relationships (e.g., Dog is an Animal).
- **Class Design**: Private fields with public getter/setter methods. No advanced OOP features like interfaces or abstract classes in basic exercises.

## Developer Workflows
- **Compilation**: Use `javac -d . src/ie/atu/inheritance/*.java` to compile all Java files in the package.
- **Execution**: Run with `java ie.atu.inheritance.Main` from the project root.
- **No Build Tools**: Relies on standard JDK tools; no Maven, Gradle, or IDE-specific runners.

## Code Conventions
- **Naming**: CamelCase for classes (e.g., `Animal`, `Dog`), lowerCamelCase for methods (e.g., `getName()`, `setSpecies()`).
- **Fields**: Private instance variables (e.g., `private String name;`).
- **Methods**: Public getters/setters for encapsulation. Main method in `Main` class for testing inheritance.
- **Imports**: Minimal; classes within the same package don't require imports.

## Key Patterns
- **Basic Inheritance**: Subclass inherits fields/methods from superclass. Example: `public class Dog extends Animal`.
- **Method Usage**: Instantiate subclass, call inherited setters/getters. See [README.md](README.md) for examples.
- **Output**: Use `System.out.println()` for console output in Main.

## References
- [README.md](README.md): Contains lab instructions, examples, and DIY exercises.
- Focus on exercises like creating Animal/Dog classes with inheritance.</content>
<parameter name="filePath">/workspaces/w10-lab-inheritance-G00440630/.github/copilot-instructions.md