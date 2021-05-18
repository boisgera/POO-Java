package utils;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.RuntimeException;
import java.lang.System;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// TODO: simple error handling (RuntimeException only, message)

public class Utils {

// Error Management
// -----------------------------------------------------------------------------
    public static void error(String message) {
        throw new RuntimeException(message);
    }

// Conversion to String
// -----------------------------------------------------------------------------
    public static String str(boolean b) {
        return Boolean.valueOf(b).toString();
    }

    public static String str(byte b) {
        return Integer.valueOf(b).toString();
    }

    public static String str(short s) {
        return Integer.valueOf(s).toString();
    }

    public static String str(int i) {
        return Integer.valueOf(i).toString();
    }

    public static String str(float f) {
        return Float.valueOf(f).toString();
    }

    public static String str(double d) {
        return Double.valueOf(d).toString();
    }

    public static String str(char c) {
        return Character.toString(c);
    }

    // quote the stuff instead? Dunno. I'd say no for consistency 
    // since str(char) is not quoted either.
    public static String str(String s) {
        return s;
    }

    public static String str(long l) {
        return Long.valueOf(l).toString();
    }

// Standard Output and File I/O
// -----------------------------------------------------------------------------
    public static void print(String string) {
        System.out.print(string);
    }

    public static String read(String filename) {
        Path path = Paths.get(filename);
        try {
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException error) {
            String message = error.getMessage();
            throw new RuntimeException("IOException: " + message);
        }
    }

    public static void write(String filename, String content) {
        try {
            FileOutputStream output = new FileOutputStream(filename);
            OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
            writer.write(content);
            writer.close();
        } catch (IOException error) {
            String message = error.getMessage();
            throw new RuntimeException("IOException: " + message);
        }
    }

}