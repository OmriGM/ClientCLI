package run;

public class Run {

	public static void main(String[] args) {
		String ip=args[0];
		int port= Integer.parseInt(args[1]);
		CLI client=new CLI();
		client.start(ip, port);
	}

}
