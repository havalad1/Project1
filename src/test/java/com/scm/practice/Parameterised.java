package com.scm.practice;

import org.testng.annotations.Test;

public class Parameterised {
@Test
public void p()
{
System.out.println(System.getProperty("url"));
System.out.println(System.getProperty("password"));
}
}
