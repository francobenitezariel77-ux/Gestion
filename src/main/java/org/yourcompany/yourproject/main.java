/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author betiana
 */
public class main {

    public static void main(String[] args) {

ArrayList<producto> listaProductos =new ArrayList<>();
producto n1 = new producto(003456,"Microhondas",500000);
producto n2 = new producto(100282,"lavarropasAut",1000000);
producto n3 = new producto(100282,"SmartTV",200000);
producto n4 = new producto(220282,"TV",20000);
      HashSet<producto> miConjunto = new HashSet<>(listaProductos);


    }
}
