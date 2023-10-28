import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener{
    JFrame frame=new JFrame();
    JButton numbut[]=new JButton[10];
    JButton funbut[]=new JButton[9];
    JButton sumbut,subbut,mulbut,divbut,decbut,equbut,clearbut,delbut,modbut;
    JPanel panel=new JPanel();
    JTextField textfield=new JTextField();
    Font font=new Font("Serif Bold",Font.BOLD,50);
    double num1=0,num2=0,result=0;
    char operator;

    





    Calculator(){
        JFrame frame=new JFrame("MY_CALCULATOR");
        frame.setSize(452,620);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        sumbut=new JButton("+");
        sumbut.setBounds(335, 100,113 , 113);
        frame.add(sumbut);
        sumbut.setFont(font);
        sumbut.setBackground(Color.cyan);
        subbut=new JButton("-");
        subbut.setBounds(335, 213,113 , 113);
        frame.add(subbut);
        subbut.setFont(font);
        subbut.setBackground(Color.cyan);
        mulbut=new JButton("*");
        mulbut.setBounds(335, 326,113 , 113);
        frame.add(mulbut);
        mulbut.setFont(font);
        mulbut.setBackground(Color.cyan);
        divbut=new JButton("/");
        divbut.setBounds(335, 439,113 , 113);
        frame.add(divbut);
        divbut.setFont(font);
        divbut.setBackground(Color.ORANGE);
        decbut=new JButton(".");
        decbut.setBounds(224, 439,113 , 113);
        frame.add(decbut);
        decbut.setFont(font);
        
        decbut.setBackground(Color.cyan);
        modbut=new JButton("%");
        modbut.setBounds(335, 340,113 , 113);
        frame.add(modbut);
        modbut.setFont(font);
        modbut.setBackground(Color.cyan);
        equbut=new JButton("=");
        equbut.setBounds(0, 439,113 , 113);
        frame.add(equbut);
        equbut.setFont(font);
        equbut.setBackground(Color.cyan);
        
        numbut[0]=new JButton("0");
        numbut[0].setBounds(113,439,113 , 113);
        frame.add(numbut[0]);
       numbut[0].setFont(font);
      numbut[0].setBackground(Color.cyan);
       numbut[1]=new JButton("1");
        numbut[1].setBounds(0,100,113 , 113);
        frame.add(numbut[1]);
       numbut[1].setFont(font);
      numbut[1].setBackground(Color.gray);
       numbut[2]=new JButton("2");
        numbut[2].setBounds(113,100,113 , 113);
        frame.add(numbut[2]);
       numbut[2].setFont(font);
      numbut[2].setBackground(Color.gray);
       numbut[3]=new JButton("3");
        numbut[3].setBounds(226,100,113 , 113);
        frame.add(numbut[3]);
       numbut[3].setFont(font);
      numbut[3].setBackground(Color.gray);
       numbut[4]=new JButton("4");
        numbut[4].setBounds(0,213,113 , 113);
        frame.add(numbut[4]);
       numbut[4].setFont(font);
      numbut[4].setBackground(Color.gray);
      delbut=new JButton("<=");
      delbut.setBounds(0, 552, 226, 40);
      frame.add(delbut);
      delbut.setBackground(Color.red);
      clearbut=new JButton("CLEAR");
      clearbut.setBounds(226, 552, 226, 40);
      frame.add(clearbut);
      clearbut.setBackground(Color.BLUE);
    
     





    
      
 numbut[5]=new JButton("5");
        numbut[5].setBounds(113,213,113 , 113);
        frame.add(numbut[5]);
       numbut[5].setFont(font);
      numbut[5].setBackground(Color.gray);
      
 numbut[6]=new JButton("6");
        numbut[6].setBounds(223,213,113 , 113);
        frame.add(numbut[6]);
       numbut[6].setFont(font);
      numbut[6].setBackground(Color.gray);
       numbut[7]=new JButton("7");
        numbut[7].setBounds(0,326,113 , 113);
        frame.add(numbut[7]);
       numbut[7].setFont(font);
      numbut[7].setBackground(Color.gray);
      
 numbut[8]=new JButton("8");
        numbut[8].setBounds(113,326,113 , 113);
        frame.add(numbut[8]);
       numbut[8].setFont(font);
      numbut[8].setBackground(Color.gray);
       numbut[9]=new JButton("9");
        numbut[9].setBounds(224,326,113 , 113);
        frame.add(numbut[9]);
       numbut[9].setFont(font);
      numbut[9].setBackground(Color.gray);
      textfield=new JTextField();
      textfield.setBounds(0,0,452 ,100);
      textfield.setBackground(Color.BLACK);
      textfield.setFont(font);
      textfield.setForeground(Color.GREEN);
      frame.add(textfield);
      funbut[0]=sumbut;
       funbut[1]=subbut;
       funbut[2]=mulbut;
       funbut[3]=divbut;
       funbut[4]=decbut;
       funbut[5]=modbut;
       funbut[6]=equbut;
       funbut[7]=clearbut;
       funbut[8]=delbut;
       for(int i =0;i<9;i++){
        funbut[i].addActionListener(this);
        funbut[i].setFocusable(false);
      

       }
       for(int i =0;i<10;i++){
        numbut[i].addActionListener(this);
        numbut[i].setFocusable(false);
        numbut[i].setFont(font);

       }
       
        }
    public void actionPerformed (ActionEvent e){
for (int i=0;i<10;i++){
    if(e.getSource()== numbut[i]){
        textfield.setText(textfield.getText().concat(String.valueOf(i)));

    }}
   if(e.getSource()==decbut){
    textfield.setText(textfield.getText().concat("."));
   }
   if(e.getSource()==sumbut){
   num1= Double.parseDouble(textfield.getText());
    operator='+';
    textfield.setText("");
    
   }
    if(e.getSource()==subbut){
   num1= Double.parseDouble(textfield.getText());
    operator='-';
    textfield.setText("");
    
   }
    if(e.getSource()==mulbut){
   num1= Double.parseDouble(textfield.getText());
    operator='*';
    textfield.setText("");
    
   }
    if(e.getSource()==divbut){
   num1= Double.parseDouble(textfield.getText());
    operator='/';
    textfield.setText("");
    
   }
    if(e.getSource()==modbut){
   num1= Double.parseDouble(textfield.getText());
    operator='%';
    textfield.setText("");
    
   }
    if(e.getSource()==clearbut){
   num1= Double.parseDouble(textfield.getText());
    operator='c';
    textfield.setText("");
    
   }
    if(e.getSource()==delbut){
   num1= Double.parseDouble(textfield.getText());
    operator='d';
    textfield.setText("");
    
   }
   if(e.getSource()==equbut){
    num2=Double.parseDouble(textfield.getText());
   
   switch(operator){
    case '+':
    result=num1+num2;
    break;
    case '-':
    result=num1-num2;
    break;
    case '/':
    if(num2!=0)
    result=num1/num2;
    
    else
    result=0000;
    break;
    case '*':
    result=num1/num2;
    break;
    case '%':
    result=num1%num2;
    break;


   }
    textfield.setText(String.valueOf(result));
    num1=result;

   }
   if(e.getSource()==clearbut){
    textfield.setText("");

   }
   if(e.getSource()==delbut){
    String inp=textfield.getText();
    textfield.setText("");
    for(int i=0;i<inp.length()-1;i++){
        textfield.setText(textfield.getText()+inp.charAt(i));

    }

   }


    }
    




    
    public static void main (String args[]){
        Calculator calc=new Calculator();

    }
   
}