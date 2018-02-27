import javax.swing.JFrame;
import javax.swing.JLabel;
//Syed Ahsan Sirat
class Main{
    JFrame jfm;
    JLabel label;
    Main(){
        jfm= new JFrame("Assignment by Sirat");
        jfm.setSize(400, 100);
        jfm.setLocationRelativeTo(null);
        jfm.setVisible(true);
        label=new JLabel("Java Code Running...");
        jfm.add(label);
        
    }
    
    
    
    
    
    
    
    public static void main(String args[]){
        new Main(); 
    }
}