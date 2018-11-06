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
                    given_letter(text);
                    break;
                case 1:
                    
                    break;
                case 9:
                    break;
            }
        }while(select != 9);
    }
    static String input_text(String text)//???? ??????
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
    
    static void given_letter(String text)
    {
        int temp = 0;
        char []array_char = text.toCharArray();
        Scanner input = new Scanner(System.in);
        System.out.println("??????? ?????");
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
        System.out.println(temp +" ?????????? ?????????? ????????? ????");
    }
}