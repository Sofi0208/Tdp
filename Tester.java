public class prueba{ 
	public static void main(String[]){ 
		Hora h=new Hora(02,30); 
		Hora h1=new Hora(05,40);
		System.out.println("La cantidad de horas es: "+h.obtenerHora());
		System.out.println("La cantidad de minutos es: "+h.obtenerMinutos()); 
	}
} 