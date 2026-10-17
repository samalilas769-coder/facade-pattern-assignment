
# Assignment 4 — Facade Pattern

## Project Overview
This project demonstrates the Facade Design Pattern
using a Home Theater system.

## Technologies
- Java 17
- Maven
- JUnit 5
- IntelliJ IDEA

## Design Pattern
Facade is a structural design pattern that provides
a simplified interface to a complex subsystem.

## Subsystem Classes
- DVDPlayer — plays and stops movies.
- Projector — manages video projection.
- SoundSystem — controls audio and volume.
- Lights — controls room brightness.

## Facade Class
HomeTheaterFacade coordinates all subsystem classes
and provides two simple methods:

- watchMovie(String movie)
- endMovie()

## Client
Main.java demonstrates how to use the Facade.

## Clean Code Principles
The project follows principles from Robert C.
Martin's Clean Code, Chapters 7, 8 and 9.

1. Use exceptions instead of error codes.
2. Provide meaningful exception messages.
3. Avoid returning or passing null.
4. Maintain clean boundaries between components.
5. Write clean and independent unit tests.

## Running the Project
Run Main.java in IntelliJ IDEA.

## Running Tests
Run HomeTheaterFacadeTest.java or execute:

mvn test

## Conclusion
The Facade Pattern simplifies interaction with
multiple Home Theater components while preserving
their individual responsibilities.
