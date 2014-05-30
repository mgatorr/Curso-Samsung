package pruebasIniciales;

public class PruebaAngulo {
	public void Prueba() {
		Angulo ang1 = new Angulo();
		Angulo ang2 = new Angulo(3.14);
		Angulo ang3 = new Angulo(-3.14);
		Angulo ang4 = new Angulo(720);
		Angulo ang5 = new Angulo(-720);

		if (ang1.getGrados() == 0) {
			System.out.println("El constructor sin parametros es correcto");
		}else{
			System.out.println("El constructor sin parametros es ERRONEO");
		}
		
		if (ang2.getGrados() == 3.14){
			System.out.println("El constructor con parametros es correcto");
		}else{
			System.out.println("El constructor con parametros es ERRONEO");
		}
		
		if (ang4.conversorGrandRad() == 12.56 ){
			System.out.println("El conversor de grados a radianes con numero positivos es correcto");
		}else{
			System.out.println("El conversor de grados a radianes con numero positivos es ERRONEO");
		}
		
		if (ang2.conversorRadGrad() == 180){
			System.out.println("El conversor de de radianes a grados con numero positivos es correcto");
		}else{
			System.out.println("El conversor de de radianes a grados con numero positivos es ERRONEO");
		}
		
		if (ang5.conversorGrandRad() == -12.56 ){
			System.out.println("El conversor de grados a radianes con numero negativoss es correcto");
		}else{
			System.out.println("El conversor de grados a radianes con numero negativos es ERRONEO");
		}
		
		if(ang3.conversorRadGrad() == -180 ){
			System.out.println("El conversor de de radianes a grados con numero negativos es correcto");
		}else{
			System.out.println("El conversor de grados a radianes con numero positivos es ERRONEO");
		}
	}
	
	public static void main(final String[] args){
		new PruebaAngulo().Prueba();
	}

}
