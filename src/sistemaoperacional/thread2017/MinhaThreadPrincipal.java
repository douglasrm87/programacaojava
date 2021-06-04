package sistemaoperacional.thread2017;

public class MinhaThreadPrincipal {
	public static int x = 0;
	public static int y = 0;

	public static void main(String[] args) {
		while (true) {
			MinhaThreadPrincipal.x = 0;
			MinhaThreadPrincipal.y = 0;
			System.out.println("____________INI");
			ExecutaThread01 t1 = new ExecutaThread01();
			ExecutaThread02 t2 = new ExecutaThread02();
			t1.start();
			t2.start();
			try {

				t2.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		 
			MinhaThreadPrincipal.x = 0;
			MinhaThreadPrincipal.y = 0;
		}
	}
}
