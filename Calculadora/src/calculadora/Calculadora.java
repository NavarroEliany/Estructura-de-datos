
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

    
    public void sumar( float n1, float n2){
        
        float resultado= n1 + n2;
        
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    
     public void restar( float n1, float n2){
        
        float resultado= n1 - n2;
        
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
      public void multiplicar( float n1, float n2){
        
        float resultado= n1 * n2;
        
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
   
     public void dividir( float n1, float n2){
        
        float resultado= n1 / n2;
        
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
}
