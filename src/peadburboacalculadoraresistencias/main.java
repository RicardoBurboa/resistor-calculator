
package peadburboacalculadoraresistencias;

//Hecho por:
//Burboa Astorga Ricardo 8IS-01V
//Principios Eléctricos y Aplicaciones Digitales
//Programa Unidad 1 - Calculadora de Resistencias

public class main {
    
    public static void main(String[] args) {
        ventana interfazMain = new ventana();
        
        interfazMain.setResizable(false);
        interfazMain.setTitle("Calculadora de Resistencias - Burboa Astorga Ricardo 8IS-01V");
        interfazMain.setSize(856, 630);
        interfazMain.setVisible(true);
        interfazMain.setLocationRelativeTo(null);
    }
    
}
