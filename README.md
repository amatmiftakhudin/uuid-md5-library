# Demo Library
This project is a library for generate UUID and MD5 Hash Strings in Java.


---

## How to use it:

Add the following dependency:
````XML
<dependency>
    <groupId>com.miftakhudin.library</groupId>
    <artifactId>uuidmd5library</artifactId>
    <version>${VERSION}</version>
</dependency>
````
The folling code
````java
String paddedString = this.stringPadder.padLeft("My String", 30, '-');
System.out.println(paddedString);
````
Will print:

````
---------------------My String
````