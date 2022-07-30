import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author HP001
 */
public class AWTCalculator extends   Frame implements ActionListener {
TextField tf; 
Panel panel;

String btnString[]={"7","8","9","+", 
                    "4","5","6","-",
                     "1","2","3" ,"*",
                     "C","0","=","/" 
}; 
Button btn[]= new Button[16]; 
int num1=0,num2=0,result=0; 
char op;

public AWTCalculator(){
    Font f = new Font("Cambria", Font.BOLD, 18);
  
  tf = new TextField(10);
  tf.setFont(f);
  
  panel = new Panel();
  
  add(tf, "North");
  add(panel, "Center");
  
  panel.setLayout(new GridLayout(4,4));
  
  for(int i=0; i < 16; i++) {
   
   btn[i] = new Button(btnString[i]);
   btn[i].setFont(f);
   btn[i].addActionListener(this);
   panel.add(btn[i]);
  }
  
  addWindowListener(new WindowAdapter(){
   
   public void windowClosing(WindowEvent we) {
    System.exit(0);
   }
  });
}
    public static void main(String[] args) {
        AWTCalculator ac=new AWTCalculator();
        ac.setTitle("Rudraksh AWT Calculator"); 
        ac.setSize(300,400); 
        ac.setVisible(true); 
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
  
  if(str.equals("+")) {
   
   op = '+';
   num1 = Integer.parseInt(tf.getText());
   tf.setText("");
  }
  else if(str.equals("-")) {
   op = '-';
   num1 = Integer.parseInt(tf.getText());
   tf.setText("");
  }
  else if(str.equals("*")) {
   op = '*';
   num1 = Integer.parseInt(tf.getText());
   tf.setText("");
  }
  else if(str.equals("/")) {
   op = '/';
   num1 = Integer.parseInt(tf.getText());
   tf.setText("");
  }
  else if(str.equals("=")) {
   
   num2 = Integer.parseInt(tf.getText());
   
   switch(op) {
    
    case '+' : result = num1 + num2;
     break;
    case '-' : result = num1 - num2;
     break;
    case '*' : result = num1 * num2;
     break;
    case '/' : result = num1 / num2;
     break;
   }
   tf.setText(result + "");
   result = 0;
  }
  else if(str.equals("C")) {
   
   tf.setText("");
   num1 = num2 = result = 0;
  }
  else {
   tf.setText(tf.getText() + str);
  }

    }
    
}
