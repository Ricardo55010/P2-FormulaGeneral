/*
* @author Ian Alexander Ruiz González
* Grupo: 2CV3
* UA:POO
* Profesor: Saul de la O Torres
*/
import java.util.List;

public class Calculadora {
    
    private EcuacionCuadratica coeficientesABC; 
    private FormulaGeneral ecuacionGeneral; 

    public void calcularValores(double coeficienteA, double coeficienteB, double coeficienteC) {

        coeficientesABC = new EcuacionCuadratica();
        ecuacionGeneral = new FormulaGeneral();

        coeficientesABC.setEcuacionCuadratica(coeficienteA, coeficienteB, coeficienteC);
        coeficientesABC.mostrarEcuacionCuadratica();
        
        Raiz solucionRaiz [] =  solucionRaiz = ecuacionGeneral.calcularRaices(coeficientesABC);
        
        for (int i = 0; i < solucionRaiz.length; i++) {
            System.out.println("X"+(i+1)+" :"+solucionRaiz[i].toString());
        }
    }
}