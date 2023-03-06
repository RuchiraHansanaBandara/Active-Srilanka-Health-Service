package doctorchannelproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration doctorServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Channel Doctor Producer has Started\n");
		DoctorChannelProducer doctorServicePublish = new DoctorChannelProducerImpl();
		doctorServiceRegistration = context.registerService(DoctorChannelProducer.class.getName(), doctorServicePublish, null);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Channel Doctor Producer has Stopped\n");
		doctorServiceRegistration.unregister();
	}
}
