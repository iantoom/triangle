package id.bts.triangle.bootstrap;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import id.bts.triangle.services.TriangleGenerator;

@Component
public class Bootstrap implements CommandLineRunner {

	TriangleGenerator triangleGenerator;

	public Bootstrap(TriangleGenerator triangleGenerator) {
		super();
		this.triangleGenerator = triangleGenerator;
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scannerBaris = new Scanner(System.in);
		
		System.out.print("Masukan ukuran segitiga: ");
		int barisSegitiga = scannerBaris.nextInt();
		
		triangleGenerator.generateTriangle(barisSegitiga);
		
		scannerBaris.close();
	}

}
