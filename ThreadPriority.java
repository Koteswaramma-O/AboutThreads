package multithreading;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("run Method");
	}

	public static void main(String[] args) {
		ThreadPriority t = new ThreadPriority();
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		t.setPriority(MIN_PRIORITY);
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t.start();
		t1.start();
		t2.start();
		System.out.println(t.getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

	}

}
