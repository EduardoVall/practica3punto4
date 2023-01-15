package practica3parte4;
import java.util.Arrays;
import java.util.Iterator;
/**
 * @author eduva
 *
 */
public class ModificarArray {
	public static void main(String[] args) {
			int [] numeros= new int [10];
			numeros=llenaVector(10);
			int mayor=numeros[0],menor=numeros[0],posicionMayor=0,posicionMenor=0;
			for (int i = 0; i < numeros.length; i++) {
				if(numeros[i]>mayor) {
					mayor=numeros[i];
					posicionMayor=i;
				}
				if(numeros[i]<menor) {
					menor=numeros[i];
					posicionMenor=i;
				}
			}
			System.out.println(Arrays.toString(numeros));
			System.out.println("el mayor es "+mayor+" y su posicion es "+posicionMayor);
			System.out.println("el menor es "+menor+" y su posicion es "+posicionMenor);
		}
		public static int [] llenaVector(int x) {
			int [] vector=new int [x];
			for (int i = 0; i < x; i++) {
				vector[i]=(int)(Math.random()*100+1);
			}
			return vector;
		}
	}



