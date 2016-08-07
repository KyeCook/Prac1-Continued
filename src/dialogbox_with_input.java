import javax.swing.JOptionPane;

/**
 * Created by ACfan on 7/08/2016.
 */
public class dialogbox_with_input {
    public static void main(String[] args)
    {
        String input_result;
        input_result = JOptionPane.showInputDialog(null, "This is an input box");
        JOptionPane.showMessageDialog(null, "This is a dialog box showing the input which is :" + input_result);
    }
}
