```
String s1 = s.toLowerCase().replaceAll("[^0-9a-z]", "");
String s2 = new StringBuilder(s1).reverse().toString();
return s2.equals(s1);
​
```