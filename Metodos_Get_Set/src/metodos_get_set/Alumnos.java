/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_get_set;

/**
 *
 * @author BOG-A411-E-002
 */
public class Alumnos {
    String nombre, apellido, curso, sexo;
    int codigo, edad;  
    Alumnos (String nom, String ape, String cur, String sex,int cod, int ed){
        this.nombre=nom;
        this.apellido=ape;
        this.curso=cur;
        this.codigo=cod;
        this.sexo=sex;
        this.codigo=cod;
        this.edad=ed;        
    
    }
    String getnombre(){
        return this.nombre;
    }
    String getapellido(){
        return this.apellido;
    }
    String getcurso(){
        return this.curso;
    }
    String getsexo(){
        return this.sexo;
    }
    int getcodigo(){
        return this.codigo;
    }
    int getedad(){
        return this.edad;
    }
    void setnombre(String nom){
        this.nombre=nom;
    }
    void setapellido(String ap){
        this.apellido=ap;
    }
    void setcurso(String cur){
        this.curso=cur;
    }
    void setsexo(String sex){
        this.sexo=sex;
    }
    void setcodigo(int cod){
        this.codigo=cod;
    }
    void setedad(int ed){
        this.edad=ed;
    }        
}


