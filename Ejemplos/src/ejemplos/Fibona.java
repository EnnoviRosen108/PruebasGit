/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import javax.swing.JOptionPane;

public class Fibona {

 public static void main(String[] args) {
 int elemento = 0;
 String resultado;

 // Para que ingrese un número positivo el usuario .
 do {
 resultado = JOptionPane.showInputDialog("Escribe un número positivo.\n "
 + "Salir = -1");
 elemento = Integer.parseInt(resultado);

 } while ( elemento < -1 && elemento != -1);

 // Las variables para los números ant=anterior, act=actual y next+siguiente
 int ant = 0;
 int act = 1;
 int next = 1;

 //Imprimimos el 0.
 System.out.print("0, ");
 for (int i = 0; i < elemento - 1; i++) {
 System.out.print(next + ", ");
 // Suma del actual con el anterior para tener el siguietne elemento
 next = act + ant;
 ant = act;
 act = next;
 }
 System.out.println();
 }
}