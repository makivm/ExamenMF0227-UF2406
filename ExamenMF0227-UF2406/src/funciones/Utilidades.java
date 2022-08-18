package funciones;

public class Utilidades {

	/**
	 *  Función que devuelve valor de calificacion media del alumno como
	 *  Suspenso, Bien, Notable, Sobresaliente y Matricula segun la nota numerica obtenica.
	 * @param double nota se pasa como parametro la nota media del alumno
	 * @return String devuelve valor indicado anteriormente de la nota media
	 * @throws ArithmeticException devuelve esta excepcion si la nota pasada como parametro es inferior a 0 
	 * o superior a 10
	 */
	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}