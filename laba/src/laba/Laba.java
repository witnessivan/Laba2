
package laba;
import java.util.Scanner;

public class Laba {

    public static void main(String[] args) {
        String text =" ";
        String text2 =" ";
        text = input_text(text);
        text2 = format_text(text,text2);
        big_simvol(text2);
    }
    static String input_text(String text){
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
        System.out.println(text);
        System.out.println((text.trim()).length());
        return text;
    }
    static String format_text(String text,String text2)
    {
        char []array_char = text.toCharArray();
        for(int index = 0;index < array_char.length;index++)
        {
            if(array_char[index] == '.')
            {
                int temp = index + 2;
                while((array_char[temp]!= ' ')&(array_char[temp] < array_char.length))
                {
                    array_char[temp] = ' ';
                    temp++;
                }
            }    
        }
        text2 = new String(array_char);
        System.out.println(text2);
        return text2;
    }
    static void given_letter(String text2)
    {
        int temp = 0;
        char []array_char = text2.toCharArray();
        Scanner input = new Scanner(System.in);
        System.out.println("¬ведите букву");
        String simvol = input.nextLine();
        char []simvol_array = simvol.toCharArray();
        if(array_char[0] == simvol_array[0])
        {
            temp++; 
        }
        for(int index = 1; index<array_char.length;index++)
        {
            if((array_char[index - 1] ==' ')&(array_char[index] == simvol_array[0]))
            {
                temp++;
            }
        }
        System.out.println(temp);
    }
    static void big_simvol(String text2)
    {
        char []array_char = text2.toCharArray();
        int temp = 0;
        while((array_char[temp] != '0')
                &(array_char[temp] != '1')
                &(array_char[temp] != '2')
                &(array_char[temp] != '3')
                &(array_char[temp] != '4')
                &(array_char[temp] != '5')
                &(array_char[temp] != '6')
                &(array_char[temp] != '7')
                &(array_char[temp] != '8')
                &(array_char[temp] != '9')
                &(temp < array_char.length))
        {
            array_char[temp] = Character.toUpperCase(array_char[temp]);
            temp++;
        }
        String text3 = new String(array_char);
        System.out.println(text3);
    }
}
