
/**
 *
 * @author Heitor R Vital
 */
import javax.swing.JOptionPane;

public class GreatestNumber 
{
    public static void main(String[] args)
    {
        String first_number = JOptionPane.showInputDialog("Insira o primeiro número");
        String second_number = JOptionPane.showInputDialog("Insira o segundo número"); 
        int integer_first_number = Integer.parseInt(first_number);
        int integer_second_number = Integer.parseInt(second_number);
        String greatest_number; 
        
        if(integer_first_number > integer_second_number)
        {
            greatest_number = "O maior número é: " + integer_first_number;
        }else if(integer_first_number < integer_second_number)
        {
            greatest_number = "O maior número é: " + integer_second_number;
        }else
        {
            greatest_number = "Os números são iguais";
        }
        
        JOptionPane.showMessageDialog(null, greatest_number);
    }
    
}
