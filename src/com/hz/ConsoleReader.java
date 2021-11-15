package com.hz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements Response{
    public String readLine() {
        try{
            String line = (new BufferedReader(
                    new InputStreamReader(System.in))
            ).readLine();

            return line;
        }
        catch(IOException ex) {
            return "Gibberish input detected";
        }
    }

    @Override
    public boolean response( String answer) {
        if (answer.equals("true") || answer.equals("yes")|| answer.equals("oh yeah")|| answer.equals("great") || answer.equals("sure")
                || answer.equals("love to")|| answer.equals("of course")|| answer.equals("always")|| answer.equals("never done otherwise")){
            return true;
        }
        else         return false;
    }
}
