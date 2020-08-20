package programacao1.terca.aula05;

public class PrecedenciaOperadores {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 0;

		int res0 = -a * ++b - --c;
		a = 1;
		b = 2;
		c = 0;
		int res1 = a * b++ - --c;
		a = 1;
		b = 2;
		c = 0;
		boolean res2 = --b > a * c;
		a = 1;
		b = 2;
		c = 0;
		int res3 = --c / a * --b;
		a = 1;
		b = 2;
		c = 0;
		int res4 = ++c / --b * ++a;
		a = 1;
		b = 2;
		c = 0;
		int res5 = -a * b++ - c--;
		System.out.println("Res0:" + res0);
		System.out.println("Res1:" + res1);
		System.out.println("Res2:" + res2);
		System.out.println("Res3:" + res3);
		System.out.println("Res4:" + res4);
		System.out.println("Res5:" + res5);

		int d = 2;
		int e = 0;
		System.out.println("d - Res6:" + d);
		int res6 = d++ - --e;
		System.out.println("Res6:" + res6);
		System.out.println("d - Res6:" + d);
		a = 0;
		b = 0;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		a = b++;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		a = ++b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		 

	}

}
