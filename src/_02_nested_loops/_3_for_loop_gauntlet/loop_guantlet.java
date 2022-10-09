package _02_nested_loops._3_for_loop_gauntlet;

public class loop_guantlet {
	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			System.out.println(" ");
			for(int i = 1; i < 101; i++) {
			System.out.println(i);
			}
			System.out.println(" ");
			for(int g = 100; g>0; g--) {
				System.out.println(g);
			}
			System.out.println(" ");
			for(int a = 2; a<101; a++) {
				if(a%2==0) {
					System.out.println(a);
				}
			}
			System.out.println(" ");
			for(int b = 1; b<100; b++) {
				if(b%2==1) {
					System.out.println(b);
				}
			}
			System.out.println(" ");
			for(int c = 1; c < 501; c++) {
				if(c%2==0) {
				System.out.println(c+" even");
				}
				if(c%2==1) {
					System.out.println(c+" odd");
				}
			
			
			}
			System.out.println(" ");
			for(int b = 7; b < 784; b+=7) {
				System.out.println(b);
			}
			System.out.println(" ");
			for(int f = 0; f<12; f++) {
				int n = (2010+f);
				System.out.println("In "+n+", I was "+f+" years old.");
			}
			System.out.println(" ");
			for(int s = 0; s<3; s++) {
				for(int q = 0; q<3; q++) {
					System.out.println(s+" "+q);
			}
				
					}
			System.out.println(" ");
			for(int i = 0; i<9; i+=3) {
				System.out.println();
				for(int j = 1; j<4; j++) {
					int b = (i+j);
					System.out.print(b+" ");
				}
				}
			System.out.println(" ");
			for(int i = 0; i<100; i+=10) {
				System.out.println(" ");
				for(int b = 1; b<11; b++){
					int g = (b+i);
					System.out.print(g+" ");
				}
			}
			System.out.println(" ");
			for(int i = 0; i>6; i++) {
				
			}
			System.out.println(" ");
			for(int i = 0; i>(-101);i--) {
				int g = (i+100);
				System.out.println(g);
			}
			
		
		}
}

