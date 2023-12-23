import java.util.Scanner;

public class Pravoagolnik {

		public static void main(String[] args) {
			
			double str1, str2, povrsina, perimetar;
			
			Scanner tastatura = new Scanner(System.in);
			System.out.println("Programata presmetuva povrsina i perimetar na pravoagolnik");
			System.out.println("Vnesete dolzina na edna strana: ");
			str1 = tastatura.nextDouble();
			System.out.println("Vnesete dolzina na drugata strana: ");
			str2 = tastatura.nextDouble();
			povrsina = str1 * str2;
			perimetar = 2*str1 + 2* str2;
			System.out.println();
			System.out.println("Perimetarot e: "+ perimetar);
			//System.out.println(perimetar);
			System.out.println("Plostinata e: "+ povrsina);
			//System.out.println(povrsina);
		}

}
