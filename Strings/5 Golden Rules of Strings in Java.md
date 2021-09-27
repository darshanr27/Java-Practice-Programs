## 5 Golden Rules of Strings in Java


1. If we create a string without using `new` operator the string object will be created in the **constant pool**.
``` 
  String s1 = "Spring";
```

2. If we create a string using `new` operator the string object will be created in the **non-constant pool**.
```
  String s2 = new String("Java");
```

3. If we create a string by **concatinating two raw strings**, the string object will be created in the **constant pool**.
```
  String s3 = "Mark" + "Down";
```

4. If we crate a string by **concatinating the two strings by using the reference variables**, then the string object will be created in the **non-constant pool**.
```
  String s4 = "Two";
  String s5 = "Thousand";
  String s6 = s4 + s5;
```

5. If we assign **string reference variable to another string reference variable**, the refence would be copied, then the **both reference variable refer to the same string object**.
```
  String s7 = "Keyboard";
  String s8 = s7;
```
