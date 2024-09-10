# ComidaLang Compiler

This project implements a compiler for the **ComidaLang** language. It is capable of generating HTML files from `.comida` files, which contain descriptions of meals, preferences, and meal planning.

# Students
- Augusto Luchesi Matos, BCC, 740871
- Matheus Menecucci, BCC, 800310

# Project Setup Guide

This guide provides step-by-step instructions for setting up your development environment for the project.

## Linux Operational System

First, you must have a Linux distribution as your computer's operating system.

## Checking Java Installation

Now, you need to check if Java is installed on your system. Open a terminal and run:
```
java -version
```

If Java is installed, you should see a message similar to:

```
java version "11.0.8" 2020-07-14 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.8+10-LTS, mixed mode)
```

### Installing Java

If Java is not installed, you can install it using the following command:
```
sudo apt install openjdk-11-jre-headless
```


After installation, verify it again using `java -version`. You should see the version information as mentioned above.

## Checking GCC Installation

Next, check if GCC is installed by running:
```
gcc --version
```

If GCC is installed, you should see a message similar to:

```
gcc (Ubuntu 9.3.0-17ubuntu1~20.04) 9.3.0
```

### Installing GCC

If GCC is not installed, you can install it using:
```
sudo apt install gcc
```

###  Clone the Repository

First, clone the repository with the command:

```bash
git clone https://github.com/seu-usuario/comida-lang.git
cd comida-lang
```
### Run the program

Use Maven to compile the project and generate the executable JAR
```
mvn clean package
```

To run the program, use the following command:
```
java -jar target/ComidaLang-1.0-SNAPSHOT-jar-with-dependencies.jar <arquivo-entrada> <arquivo-saida>
```

### Example
```
java -jar target/ComidaLang-1.0-SNAPSHOT-jar-with-dependencies.jar ./casos-teste/entradas/teste1.comida ./casos-teste/saidas/teste1.html
```
