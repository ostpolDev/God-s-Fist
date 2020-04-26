package it.ostpol.godfist.proxy;

import it.ostpol.godfist.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		
	}

}
