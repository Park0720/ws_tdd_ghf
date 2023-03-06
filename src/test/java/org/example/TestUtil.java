package org.example;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TestUtil {
    public static Scanner genScanner(String input){
        InputStream in = new ByteArrayInputStream(input.getBytes());

        return new Scanner(in);
    }
}
