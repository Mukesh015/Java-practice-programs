
import java.lang.String;
public class Practice3{
    public static void main(String[] args) {
        String str = "I Loves Anisha Very Much!";
        System.out.println(str);
        int size = str.length();
        System.out.println("String size is " + size);
        String l_case_string = str.toLowerCase();
        System.out.println("Lowercase string is : " + l_case_string);
        String u_case_String = str.toUpperCase();
        System.out.println("upperercase string is : " + u_case_String);
        String non_trimmed_string = "   Very    much    ";
        System.out.println("non trimmed string is : " + non_trimmed_string);
        String trimmed_str = non_trimmed_string.trim();
        System.out.println("trimmed string is : " + trimmed_str);
        System.out.println(str.replace('I', 'M'));
        System.out.println(str.replace("I", "Mukesh"));
        System.out.println(str.startsWith("I "));
        System.out.println(str.endsWith("ch!"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("Very", 12));
        System.out.println(str.equals("I Loves"));
        System.out.println(str.equalsIgnoreCase("I Loves"));
        System.out.println("I am escape sequence\tdouble quote");
    }
}