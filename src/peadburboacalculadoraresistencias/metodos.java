
package peadburboacalculadoraresistencias;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//Hecho por:
//Burboa Astorga Ricardo 8IS-01V
//Principios Eléctricos y Aplicaciones Digitales
//Programa Unidad 1 - Calculadora de Resistencias

public class metodos {
    
    public static Integer getColor(String banda, Integer valor) {
        if(banda.equals("Negro")) {
            valor = 0;
        } else if (banda.equals("Marrón")){
            valor = 1;
        } else if (banda.equals("Rojo")){
            valor = 2;   
        } else if (banda.equals("Naranja")){
            valor = 3;  
        } else if (banda.equals("Amarillo")){
            valor = 4;
        } else if (banda.equals("Verde")){
            valor = 5;
        } else if (banda.equals("Azul")){
            valor = 6;
        } else if (banda.equals("Violeta")){
            valor = 7;
        } else if (banda.equals("Gris")){
            valor = 8;
        } else if (banda.equals("Blanco")){
            valor = 9;
        }
        
        return valor;
    }
    
    public static Double getMultiplicador(String banda, Double valor) {
        if(banda.equals("Negro")) {
            valor = 1.0;
        } else if (banda.equals("Marrón")){
            valor = 10.0;
        } else if (banda.equals("Rojo")){
            valor = 100.0;   
        } else if (banda.equals("Naranja")){
            valor = 1000.0;  
        } else if (banda.equals("Amarillo")){
            valor = 10000.0;
        } else if (banda.equals("Verde")){
            valor = 100000.0;
        } else if (banda.equals("Azul")){
            valor = 1000000.0;
        } else if (banda.equals("Violeta")){
            valor = 10000000.0;
        } else if (banda.equals("Gris")){
            valor = 100000000.0;
        } else if (banda.equals("Blanco")){
            valor = 1000000000.0;
        } else if (banda.equals("Dorado")) {
            valor = 0.1;
        } else if (banda.equals("Plateado")) {
            valor = 0.01;
        }
        
        return valor;
    }
    
    public static Integer getTolerancia(String banda, Integer valor) {
        if (banda.equals("Marrón")){
            valor = 1;
        } else if (banda.equals("Rojo")){
            valor = 2;   
        } else if (banda.equals("Dorado")) {
            valor = 5;
        } else if (banda.equals("Plateado")) {
            valor = 10;
        }
        
        return valor;
    }
    
    public static void printValores(JTextArea area, Double resistencia, Double resistenciaK, Double resistenciaM, Integer tolerancia){
        area.setText(""); // Para limpiar el JTextArea por si se hizo un cálculo previamente.
        area.append("Normal = " + resistencia + " Ω");
        area.append("\n" + "En kilo-ohm = " + resistenciaK + " K Ω");
        area.append("\n" + "En mega-ohm = " + resistenciaM + " M Ω");
        area.append("\n\n" + "Tolerancia = +/- " + tolerancia + "%");
    }
    
    public static void pintarBanda(JPanel panelBanda, String banda) {
        if(banda.equals("Negro")) {
            panelBanda.setBackground(Color.BLACK);
        } else if (banda.equals("Marrón")){
            Color BROWN = new Color(102,51,0);
            panelBanda.setBackground(BROWN);
        } else if (banda.equals("Rojo")){
            panelBanda.setBackground(Color.RED); 
        } else if (banda.equals("Naranja")){
            panelBanda.setBackground(Color.ORANGE); 
        } else if (banda.equals("Amarillo")){
            panelBanda.setBackground(Color.YELLOW);
        } else if (banda.equals("Verde")){
            panelBanda.setBackground(Color.GREEN);
        } else if (banda.equals("Azul")){
            panelBanda.setBackground(Color.BLUE);
        } else if (banda.equals("Violeta")){
            Color VIOLET = new Color(102,0,153);
            panelBanda.setBackground(VIOLET);
        } else if (banda.equals("Gris")){
            panelBanda.setBackground(Color.GRAY);
        } else if (banda.equals("Blanco")){
            panelBanda.setBackground(Color.WHITE);
        } else if (banda.equals("Dorado")) {
            Color GOLD = new Color(255,204,51);
            panelBanda.setBackground(GOLD);
        } else if (banda.equals("Plateado")) {
            panelBanda.setBackground(Color.LIGHT_GRAY);
        }
    }
    
    public static void setColor(String valorResistencia, JPanel panelBanda1, JPanel panelBanda2, JPanel panelBanda3, JComboBox comboBanda1, JComboBox comboBanda2, JComboBox comboBanda3) {
        
        Integer longitudCadenaResistencia = valorResistencia.length();
        char car0 = valorResistencia.charAt(0);
        char car1 = '/';
        
        if (valorResistencia.length() >= 2) {
            car1 = valorResistencia.charAt(1);
        }
        
        switch (longitudCadenaResistencia) {
            case 1:
                comboBanda3.setSelectedItem("Negro");
                comboBanda1.setSelectedItem("Negro");
                setCaracter(car0, comboBanda2);
                break;
            case 2:
                comboBanda3.setSelectedItem("Negro");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 3:
                comboBanda3.setSelectedItem("Marrón");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 4:
                comboBanda3.setSelectedItem("Rojo");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 5:
                comboBanda3.setSelectedItem("Naranja");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 6:
                comboBanda3.setSelectedItem("Amarillo");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 7:
                comboBanda3.setSelectedItem("Verde");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 8:
                comboBanda3.setSelectedItem("Azul");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 9:
                comboBanda3.setSelectedItem("Violeta");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 10:
                comboBanda3.setSelectedItem("Gris");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            case 11:
                comboBanda3.setSelectedItem("Blanco");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
            default:
                comboBanda3.setSelectedItem("-Seleccionar-");
                setCaracter(car0, comboBanda1);
                setCaracter(car1, comboBanda2);
                break;
        }
    }
    
    public static void setCaracter(char car, JComboBox comboBanda) {
        if (car == '0') {
            comboBanda.setSelectedItem("Negro");
        } else if (car == '1') {
            comboBanda.setSelectedItem("Marrón");
        } else if (car == '2') {
            comboBanda.setSelectedItem("Rojo");
        } else if (car == '3') {
            comboBanda.setSelectedItem("Naranja");
        } else if (car == '4') {
            comboBanda.setSelectedItem("Amarillo");
        } else if (car == '5') {
            comboBanda.setSelectedItem("Verde");
        } else if (car == '6') {
            comboBanda.setSelectedItem("Azul");
        } else if (car == '7') {
            comboBanda.setSelectedItem("Violeta");
        } else if (car == '8') {
            comboBanda.setSelectedItem("Gris");
        } else if (car == '9') {
            comboBanda.setSelectedItem("Blanco");
        }
    }
    
}
