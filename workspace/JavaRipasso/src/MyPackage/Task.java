package MyPackage;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		//tradizionale
		Task j=new Task();
		Thread t = new Thread(j);
		t.start();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//oggetti anonimi
		//new Thread(new Task()).start();
	}

}
