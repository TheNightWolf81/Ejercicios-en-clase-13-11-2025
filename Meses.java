import java.util.Scanner;
public class Meses{
	public static void main(String args[]){

		String mes[] = {"Enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre"};

		int dias[] = new int[12];
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<12; i++){
			System.out.println("El mes:" +mes[i]+ " tiene: ");
		dias[i]=sc.nextInt();
		}
	}
}