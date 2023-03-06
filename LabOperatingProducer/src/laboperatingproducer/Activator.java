package laboperatingproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration labServiceReg;
	
	public void start(BundleContext  bundleContext) throws Exception {
		
		System.out.println("Meical Lab Service has Started\n");
		LabOperatingProducer labServicePublish = new LabOperatingProducerImpl();
		labServiceReg = bundleContext.registerService(LabOperatingProducer.class.getName(), labServicePublish, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Medical Lab Service has Stopped\n");
		labServiceReg.unregister();
	}
}
