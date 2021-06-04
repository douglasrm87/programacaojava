package sistemaoperacional.livelock;

public class Policia {
    private boolean moneySent = false;
    public void aguardarLiberacaoRefem(Sequestrador criminal) {
        while (!criminal.liberarRefem()) {
            System.out.println("Policia: Aguardando sequestrador liberar refem.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
         System.out.println("Policia: Enviou dinheirodo resgate.");
        this.moneySent = true;
    }
    public boolean enviarDinheiro() {
        return this.moneySent;
    }
}