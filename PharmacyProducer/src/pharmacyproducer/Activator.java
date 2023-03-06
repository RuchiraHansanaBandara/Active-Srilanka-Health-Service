package pharmacyproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration labServiceReg; 
	
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Pharmacy Producer has Started\n");
		PharmacyProduce labServicePublish = new PharmacyProduceImpl();
		labServiceReg = bundleContext.registerService(PharmacyProduce.class.getName(), labServicePublish, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Pharmacy Producer has Stopped\n");
		labServiceReg.unregister();
	}
}
