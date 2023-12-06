# Introduction

This is a skeleton project structure which will help you start solving the problem right away.

## Tools available to you.
- Java 17
- Apache Ant - A build tool to simplify the build process.
- JUnit5 - Unittesting framework to help you write and run unittests.

## Structure

- **src/main/java** is where all your java source files should be written to. Already has a `Main.java` file that contains the driver code.
- **src/test/java** is where all your unit test files should be written. Make sure all your test files end with `Tests.java`. Example: `CartTests.java`, `OrderTests.java`. 
- **lib** contains the jar files for the IDE to provide code suggestion capabilities on external dependecies. Like JUnit5.
- **build.xml** is a build config file. You don't need to worry about this or edit this.

## How to run unittests

- We have already configured everything for you to get started with running and writing unittests rightaway.
- Run the command `ant test` in the terminal to run unittests.
- `ant test` will detect all test files inside `src/test/java` and build and run the tests.
- All test files needs to end with `Tests.java`. Example: `BooksTests.java`, `BooksRepoTests.java`.

## How to build your solution

- Ant task have already been configured for you.
- Run `ant dist` to generate the `dist.jar` file. This can be found inside `dist/lib/` folder.

## Running the dist.jar file 

- After building your solution as per [How to build your solution](#how-to-build-your-solution) you can now run the `dist.jar` against inputs. 
- To run, issue the command `java -jar dist/lib/dist.jar '[cmd [options...]' 'cmd [options...]'...]` where
    - **cmd** is a valid problem specific command.
    - **options** are optional **cmd** specific options.

    Example: `java -jar dist/lib/dist.jar 'ADD APPLE 2' 'ADD ORANGE 3'  'SHOW'` <br>

    Note: Each full command should be wrapped in single quotes(').

## Ant tasks available to you.

You can run these following commands on the terminal.

- `ant clean` - will clean the older builds.
- `ant dist` - will compile your code and build the `dist.jar` file inside `dist/lib` folder.
- `ant test` - will build and run all your unittests. The test files are expected to reside inside `src/test/java`.