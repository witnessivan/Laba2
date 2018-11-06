
package laba2.pkg2;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Laba22 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder reader = new StringBuilder();
        reader = input_text(reader);
        format_texta(reader);
        sum_text(reader);
        
    }
    static StringBuilder input_text(StringBuilder reader)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = input.nextLine();
        reader.append(text);
        System.out.println(reader);
        return reader;
    }
    static void format_texta(StringBuilder reader)
    {
        for(int index = 0;index < reader.length();index++)
        {
            if(reader.charAt(index) == '.')
            {
                int temp = index + 2;
                while((reader.charAt(temp) != ' ')
                   &(temp + 2) < reader.length())
                {
                    reader.setCharAt(temp,' ');
                    temp++;
                }
            }
        }
        for(int index = 0;index < reader.length();index++)
        {
            if(reader.charAt(index) == ' ')
            {
                while((reader.charAt(index - 1) == ' ')
                    &(index < reader.length()))
                {
                    reader.deleteCharAt(index);
                    index--;
                    
                }
            }
        }
        System.out.println(reader.toString());
    }
    static void sum_text(StringBuilder reader)
    {   
        StringBuilder temp = new StringBuilder();
        double nacopitel = 0;
        double chet = 0;
        for(int index = 0; index < reader.length();index++)
        {
            if((reader.charAt(index) == '0')
                |(reader.charAt(index) == '1')
                |(reader.charAt(index) == '2')
                |(reader.charAt(index) == '3')
                |(reader.charAt(index) == '4')
                |(reader.charAt(index) == '5')
                |(reader.charAt(index) == '6')
                |(reader.charAt(index) == '7')
                |(reader.charAt(index) == '8')
                |(reader.charAt(index) == '9'))
            {
                while((reader.charAt(index) != ' ')
                    &(index < reader.length()))
                { 
                    temp.append(reader.charAt(index));
                    index++;
                }
                try
                {
                    chet = Double.valueOf(temp.toString());    
                }
                catch (NumberFormatException e)
                {
                    System.err.println("Неверный формат строки");
                }
                nacopitel = nacopitel + chet;
                chet = 0;
                temp.setLength(0);
            }
        }
        System.out.println(reader.append(Double.toString(nacopitel)));
    }
    
}
