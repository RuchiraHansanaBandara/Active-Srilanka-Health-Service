package appointmentcheckproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration appointmentCheckRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Appointment Check Producer has Started\n");
		AppointmentCheckProduce appointmentCheckProduce = new AppointmentCheckProduceImpl();
		appointmentCheckRegistration = context.registerService(AppointmentCheckProduce.class.getName(), appointmentCheckProduce, null);
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Appointment Checker Producer has Stopped\n");
		appointmentCheckRegistration.unregister();
	}

}
