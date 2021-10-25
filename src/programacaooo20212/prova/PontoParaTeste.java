package programacaooo20212.prova;

public class PontoParaTeste {

	 public static final int BICICLETAS = 3;

	    public static Bicicleta[] bicicletas    = new Bicicleta[BICICLETAS];

	    public static int alugar(Bicicleta bicicleta) {
	        return 0;
	    }

	    public static void listar(){
	        for(int i = 0; i<3 ; i++){
	            System.out.println(bicicletas[i].toString());
	        }

	    }
}
