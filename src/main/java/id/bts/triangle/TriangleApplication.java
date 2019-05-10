package id.bts.triangle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TriangleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriangleApplication.class, args);
		
//		Scanner scannerBaris = new Scanner(System.in);
//		
//		System.out.print("Masukan ukuran segitiga: ");
//		int barisSegitiga = scannerBaris.nextInt();
//		
//		
//		for (int i = 0; i < barisSegitiga; i++) {
//			
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println("");
//		}
//		
//
//		System.out.println("Mirrored triangle");
//		// mirror triangle
//		for (int i = 0; i < barisSegitiga; i++) {
//			
//			// Print space jumlahnya kebalikan dari iterasi baris
//			for (int j = 1; j < barisSegitiga - i; j++) {
//				System.out.print(" ");
//			}
//			
//			// Print Space jumlahnya paralel dengan iterasi baris
//			for (int k = 0; k <= i; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println(" ");
//		}
//		
//		// Pake While Loop
//		
//		System.out.println("Coba pake while loop");
//		
//		int i = 0;
//		
//		while (i < barisSegitiga) {
//			
//			int j = 0;
//			while(j <= i) {
//				System.out.print("*");
//				
//				j++;
//			}
//			
//			System.out.println(" ");
//			i++;
//		}
//		
//		System.out.println("Mirrored triangle while loop");
//		
//		i = 0;
//		while (i < barisSegitiga) {
//			
//			// print space
//			int j = 1;
//			while (j < barisSegitiga - i) {
//				System.out.print(" ");
//				
//				j++;
//			}
//			
//			// print stars
//			int k = 0;
//			while (k <= i) {
//				System.out.print("*");
//				
//				k++;
//			}
//			
//			System.out.println("");
//			i++;
//		}
//		
//		// Pake do-while loop
//		
//		System.out.println("do-while loop");
//		
//		i = 0;
//		do {
//			
//			int j = 0;
//			do {
//				 System.out.print("*");
//				 j++;
//			 }while(j <= i);
//			
//			System.out.println("");
//			i++;
//		}
//		while (i < barisSegitiga);
//		
//		System.out.println("Mirrored do-while loop triangle");
//		i = 0;
//		do {
//			
//			int j = 1;
//			if (j < barisSegitiga - i)
//			do {
//				System.out.print(" ");
//				j++;
//			} while (j < barisSegitiga - i);
//			
//			int k = 0;
//			do {
//				System.out.print("*");
//				k++;
//			}while(k <= i);
//			
//			System.out.println("");
//			i++;
//		}while (i < barisSegitiga);
//		
//		scannerBaris.close();
	}

}
