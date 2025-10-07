package org.onlineclass;

public class GarbageCollector2 {
	private int id;

	GarbageCollector2(int id) {
		this.id = id;
		System.out.println("Object" + id + "created");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Object" + id + "has been garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector2 c1 = new GarbageCollector2(1);
		GarbageCollector2 c2 = new GarbageCollector2(1);
		GarbageCollector2 c3 = new GarbageCollector2(1);
		c1 = null;
		c2 = null;
		c3 = null;
		System.gc();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
