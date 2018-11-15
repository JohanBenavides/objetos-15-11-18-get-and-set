/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_get_set;

/**
 *
 * @Johan Benavides Arias
 */
public class Metodos_Get_Set {  
    void mostrar_datos(String nom, String ape, String cur, String sex,int cod, int ed){
        
        System.out.println("Obteniendo el nombre del Alumno: "+nom); 
        System.out.println("Obteniendo el apellido del Alumno: "+ape);   
        System.out.println("Obteniendo el curso del Alumno: "+cur); 
        System.out.println("Obteniendo el sexo del Alumno: "+sex);
        System.out.println("Obteniendo el codigo del Alumno: "+cod);
        System.out.println("Obteniendo la edad del Alumno: "+ed);    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos_Get_Set mth = new Metodos_Get_Set();//le pongo al objeto el nombre de mth q significa metodo
        //aqui creo el objeto envio como parametros los datos originales y se imprimen
        Alumnos alu1 = new Alumnos("Johan","Benavides","Ingenieria","masculino",668123,25);
        
        System.out.println("DATOS ORIGINALES DEL ALUMNO 1:\n");        
        mth.mostrar_datos(alu1.getnombre(),alu1.getapellido(),alu1.getcurso(),alu1.getsexo(),alu1.getcodigo(),alu1.getedad());
        //aqui realizo el cambio de todos los atributos del objeto 1
        alu1.setnombre("Shneider"); 
        alu1.setapellido("Arias");  
        alu1.setcurso("Gastronomia"); 
        alu1.setsexo("muy masculino"); 
        alu1.setcodigo(123456);
        alu1.setedad(26);       
       //aqui imprimo los datos cambiados del objeto
        System.out.println("\nDATOS CAMBIADOS DEL ALUMNO 1:\n");
        mth.mostrar_datos(alu1.getnombre(),alu1.getapellido(),alu1.getcurso(),alu1.getsexo(),alu1.getcodigo(),alu1.getedad());
        
    }
    
}
