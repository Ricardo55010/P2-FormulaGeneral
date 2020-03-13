/*
* @author Ian Alexander Ruiz González
* Grupo: 2CV3
* UA:POO
* Profesor: Saul de la O Torres
*/
import java.lang.Math;

public class Discriminante {

    public double obtenerDiscriminante(double coeficienteA, double coeficienteB, double coeficienteC) {
        double valorUno = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;
        return valorUno;
    }

}