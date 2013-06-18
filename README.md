# libvarnam-java

Provides access to `libvarnam` from a JAVA. 

# Example

```java
Varnam varnam = new Varnam("/usr/local/share/varnam/vst/hi-unicode.vst");
varnam.enableSuggestions("learnings.varnam.hi");
List<Word> words = varnam.transliterate("hindi");
for (Word word : words) {
    System.out.println(word.getConfidence() + " - " + word.getText());
}
```
