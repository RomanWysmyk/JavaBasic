package com.company;

public class Variables {

    int intName; // 4 bytes // full numbers // range from -2147483648 to 2147483647
    int smallInt = 3;
    int bigInt = 2147483641;
    int negativeInt = -9400234;


    boolean booleanName; // 1 byte // yes no // (default in primitive is false and in object  isnull) // range 0 or 1
    boolean trueBoolean = true;
    boolean falseBoolean = false;
    boolean alsoFalseBoolean;


    float floatName; // 4 bytes // numbers // range from 1.40239846e-45f to 3.40282347e+38f // at the end of value "f" is required
    float imFloat = 1.3f;
    float imFloatToo = 0.323124f;


    char charName; // 2 bytes // range from 0 ('\u0000') to 65535 ('\uffff')
    char aChar = 'a';
    char alsoChar = ' ';


    byte byteName; // 1 byte // full numbers // range from -128 to 127
    byte smallByte = 5;
    byte theSmallestByte = -128;


    short shortName; // 2 bytes // numbers // range from -32768 to 32767
    short hiImShort = 10000;
    short imShortAsWell = -5;


    long longName; // 8 bytes // numbers // range from -9223372036854775808 to 9223372036854775807 // at the end of value "L" is required
    long longVar = 1322312312313393746L;
    long longVarToo = -234L; // waste of memory space

    double doubleName; // 24 bytes // numbers // range from 4.94065645841246544e-324 to 1.79769313486231570e+308
    double doublePleasureVar = 3323.123123;
    double doubleTheFunVar = -123123124.3231233123;

    String stringName; // Special object (not a primitive variable)/ / holds a string of chars //cannot calculate memory usage//
    String fineStringExample = "OK";
    String moreComplexStringExample = "Oh yeah, my String is twice as good as th one above me haha! btw I can hold numbers as well 123124 see?";
    String letsMixTogetherTwoStrings = fineStringExample+moreComplexStringExample;
}
