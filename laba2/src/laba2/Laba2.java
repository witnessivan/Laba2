
package laba2;
import java.util.Scanner;
import java.util.Arrays;

public class Laba2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = " ";
        int select;
        do
        {
            select = input.nextInt();
            switch(select)
            {
                case 0:
                    text = input_text(text);
                    schet_texta(text);
                    break;
                case 1:
                    break;
                case 9:
                    break;
            }
        }while(select != 9);
    }
    static String input_text(String text)//¬вод текста
    {
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
        System.out.println(text);
        return text;
    }
    static void schet_texta(String text)
    {   
       String text2 = text.replaceAll("\\s","");
       char []array_char = text2.toCharArray();
       System.out.println(array_char.length);
       System.out.println(Arrays.toString(array_char));
    }
}
