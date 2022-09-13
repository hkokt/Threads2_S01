package contr;

public class threadsip extends Thread {

	private int id;

	public threadsip(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(" id ==> " + id);
	}

}
