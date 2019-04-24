package model;

import interfaces.SocketAdapter;

public class SocketObjectAdapterImplementation implements SocketAdapter{
	
	
	// Using composition for Adapter Pattern
	private  Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}

	@Override
	public Volt get1Volt() {
		return null;
	}

	
	private Volt convertVolt(Volt v , int i) {
		return new Volt(v.getVolts()/i);
	}

	
}
