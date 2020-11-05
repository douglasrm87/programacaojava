package programacao22s.thread02;

public class ExemploDaemonPrincipal {
	public static void main(String[] str) {
		ExemploDaemonNormal Ta;
		ExemploDaemon Tb;
		Ta = new ExemploDaemonNormal();
		Tb = new ExemploDaemon();
		Ta.start();
		Tb.start();
	}

}
