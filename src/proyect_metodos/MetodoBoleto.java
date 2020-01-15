package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Boleto;
import proyect_clases.Pasajero;
import proyect_clases.Usuario;
import proyect_gui.GUI_Principal;

public class MetodoBoleto {
    Vector vPrincipal = new Vector();
    
    public void crearBoleto(Boleto unBoleto) {
        vPrincipal.addElement(unBoleto);
        //FALTA
          }
    
    public void guardarBoleto(Boleto unBoleto) {
        vPrincipal.addElement(unBoleto);
    }
    
    //guardar archivo txt
    public void guardarArchivoBoleto(Pasajero pasajero){
        try {
            FileWriter fw = new FileWriter ("C:\\Pasajero.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(pasajero.getNombre_pasajero());
            pw.print("|"+pasajero.getApellido_pasajero());
            pw.print("|"+pasajero.getTipo_pasajero());
            pw.print("|"+pasajero.getCedula_pasajero());
            pw.println("|"+pasajero.getEdad_pasajero());
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        //FALTA
        
    }

    public void BuscarBoleto(Usuario unUsuario){
      
        //FALTA
        
    }
    
}
