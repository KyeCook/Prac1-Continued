import javax.swing.JOptionPane;

public class if_testing {
    public static void main(String[] args)
    {
        Integer confirmBox;
        Integer helloWorld;

        confirmBox = JOptionPane.showConfirmDialog(null, "DO YOU WANT IT?");
        while (confirmBox != JOptionPane.CANCEL_OPTION) {
            if (confirmBox == JOptionPane.YES_OPTION) {
                helloWorld = JOptionPane.showConfirmDialog(null, "You clearly do, " +
                        "want to display hello world?");
                if (helloWorld == JOptionPane.YES_OPTION) {
                    System.out.println("Hello World");
                    confirmBox = JOptionPane.showConfirmDialog(null, "DO YOU WANT IT?");
                } else if (helloWorld == JOptionPane.NO_OPTION) {
                    System.out.println("D:");
                    confirmBox = JOptionPane.showConfirmDialog(null, "DO YOU WANT IT?");
                }
            } else if (confirmBox == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "YOU SELECTED NO");
                confirmBox = JOptionPane.showConfirmDialog(null, "DO YOU WANT IT?");
            }
            //        else if (confirmBox == JOptionPane.CANCEL_OPTION) {
            //            JOptionPane.showMessageDialog(null, "YOU SELECTED CANCEL");
            //        }
            else {
                JOptionPane.showMessageDialog(null, "YOU HAVE GLITCHED THE SYSTEM");
            }
        }
    }
}
