package yt.video5;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Sayi: ");
		
		int x = in.nextInt();
		Sayi sayi = new Sayi(x);
		short[] rakamlar = sayi.rakamlar();
		
		for(var rakam : rakamlar) {
			System.out.print(rakam + " ");
		}
		
		System.out.println("\n");
		System.out.println("faktoriyel: "+sayi.faktoriyel());
		if(sayi.asalmi()) 	System.out.println("sayi asaldir");
		else 	System.out.println("sayi asal degildir");
		
	
         
        

        
    }
}
