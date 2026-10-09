package org.yourcompany.yourproject;
import java.util.Objects;

public class producto{
 int codigo;
 String nombre;
 double precio;

public producto(int codigo, String nombre, double precio){

this.codigo=codigo;
this.nombre=nombre;
this.precio=precio;
}
@Override
public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    producto otro = (producto) o;
    return Objects.equals(nombre, otro.nombre);
} 
@Override
public int hashCode() {
    return Objects.hash(nombre);
}  
}   
