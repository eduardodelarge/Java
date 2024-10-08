# Time to learn Java.

## HelloWorld Java Program

## Introduction
Java files typically start with a `public class` declaration followed by the class name. This is a fundamental aspect of Java programming. The class name should match the filename to ensure the program compiles and runs correctly.

### Why Java Files Start with `public class fileName`
- **Class Declaration**: In Java, every piece of code must reside within a class. The [`class`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fhome%2Fdel4rge%2FDocuments%2FJava%2FHelloWorld.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A0%2C%22character%22%3A7%7D%7D%5D%2C%223c911082-5f73-4177-a4f2-0861cec60863%22%5D "Go to definition") keyword is used to declare a class.
- **Public Access Modifier**: The [`public`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fhome%2Fdel4rge%2FDocuments%2FJava%2FHelloWorld.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A2%2C%22character%22%3A4%7D%7D%5D%2C%223c911082-5f73-4177-a4f2-0861cec60863%22%5D "Go to definition") keyword is an access modifier that makes the class accessible from any other class.
- **Class Name**: The name of the class should match the filename. For example, if the class is named [`HelloWorld`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fhome%2Fdel4rge%2FDocuments%2FJava%2FHelloWorld.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A0%2C%22character%22%3A13%7D%7D%5D%2C%223c911082-5f73-4177-a4f2-0861cec60863%22%5D "Go to definition"), the file should be named 

HelloWorld.java

. This is a requirement for the Java compiler to locate and compile the class correctly.

### Example Code
```java
public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

## How to Compile and Run Java Files

### Prerequisites
- Ensure you have the Java Development Kit (JDK) installed on your system. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html).

### Steps to Compile and Run

1. **Save the File**: Save the above code in a file named 

HelloWorld.java

.

2. **Open Terminal**: Open a terminal in Visual Studio Code or your preferred terminal.

3. **Navigate to the Directory**: Use the `cd` command to navigate to the directory where 

HelloWorld.java

 is saved.
   ```sh
   cd /path/to/directory
   ```

4. **Compile the Code**: Use the `javac` command to compile the Java file.
   ```sh
   javac HelloWorld.java
   ```

5. **Run the Compiled Code**: Use the `java` command to run the compiled class file.
   ```sh
   java HelloWorld
   ```

### Example Commands
```sh
cd /home/user/Documents/Java
javac HelloWorld.java
java HelloWorld
```

### Expected Output
```
Hello World
```

By following these steps, you can compile and run any Java program. The `javac` command compiles the Java source file into bytecode, and the `java` command runs the compiled bytecode.