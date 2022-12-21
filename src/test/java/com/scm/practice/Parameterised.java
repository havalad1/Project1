package com.scm.practice;

import org.testng.annotations.Test;

public class Parameterised {
@Test
public void p()
{
System.out.println("URL: "+System.getProperty("url"));
System.out.println("PASSWORD: "+System.getProperty("password"));
}
}
