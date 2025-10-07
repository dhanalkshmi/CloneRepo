package org.onlineclass;

public class GarbageCollector {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector g = new GarbageCollector();
		g = null;
		System.gc();
	}

}
