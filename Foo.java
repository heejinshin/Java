import java.io.*;
import java.util.regex.*;

class Foo {
    public static void main(String[] args) {

        String s = "abcdooooOoefghi";

        try {
            if (s.matches(".(?i).*ooo.*"))
                System.out.println("매치되었습니다. %n");
            else
                System.out.println("그런 문자열이 없습니다.");
        }   catch (PatternSyntaxException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}