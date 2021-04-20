# Java Interview Question and Answer
#### 1. What is Serialization and deserialization ?</br>
**Answer:** 
Serialization is a mechanism of converting the state of an object into a byte stream file on a file or any local memory or database.
Deserialization is the reverse process where the byte stream is used to recreate the actual Java object memory.
Implementation of Serializable interface which is a marker interface a class will able create byte stream.
<br>**HandsOn Reference:** https://github.com/sourav1211/java_interview/tree/main/src/Serialization_deserilzation
***************************************
#### 2. Polymorphism  in java ? How can we achieve Polymorphism  ?</br>
**Answer:**
Polymorphism is a one of the most important concept of Java OOP.</br>
This concept help to use a method in multiple way.</br>
There are 2 kinds of Polymorphism:
1. **Compile Time (Overload):** Methods that determine during compile time
2. **Runtime (Override):** A method which is implemented from any interface.
<br>**HandsOn Reference:** https://github.com/sourav1211/java_interview/tree/main/src/Polimorphism
***************************************
#### 3. What is Synchronized, Transient and Volatile Modifiers?</br>
**Answer:**
1. Synchronized : Synchronization is a capacity to control the access of multiple threads to any shared resource. **Synchronized** keyword use only method level. Its ensure to access a shared resource by only one thread at a time.    
2. Transient : During Serialization if any variable need to prevent to serializing then we can use Transient. During byte stream creating the process avoit to serializing the Transient marked variable.   
3. Volatile Modifiers : Volatile keyword use in a multithreading environment. Volatile keyword is used to flush changes directly to the main memory.
<br>**HandsOn Reference:** https://github.com/sourav1211/java_interview/tree/main/src/Synchronization
***************************************


