/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalesabinarios;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Medranda
 */
public class DecimalesABinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> binarios = new ArrayList<String>();
        StringBuffer arrayCadena = new StringBuffer();
        boolean bandera = false;
        while(bandera == false){
        try{
            
            int decimal = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero decimal"));
            if (decimal<0){
            decimal = decimal * -1;
            }
            while(decimal>=1){
            String modulo = String.valueOf(decimal % 2);
            binarios.add(modulo);
            decimal = decimal / 2;
            
                             }
                             
            Object[] arrayBinarios = binarios.toArray();
            int valorActual = arrayBinarios.length;
            for(int i = 0;i<arrayBinarios.length;i++){
            arrayCadena = arrayCadena.append(arrayBinarios[valorActual-1]);
            valorActual = valorActual - 1 ;
            
                                                      }
        JOptionPane.showMessageDialog(null,"El resultado es :\n "+arrayCadena);
        bandera = true;
            }
        
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"ERORR!\n Por favor solo escriba numeros enteros.");
            System.out.println(e);
            
                          }
        }
    }
    
}
