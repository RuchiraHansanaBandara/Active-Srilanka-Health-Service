package doctorchannelconsumer;

import org.osgi.framework.BundleActivator;

import java.util.Scanner;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import doctorchannelproducer.DoctorChannelProducer;

public class Activator implements BundleActivator {

	ServiceReference doctorReference;
	
	Scanner input = new Scanner(System.in);
	int command;

	public void start(BundleContext context) throws Exception {
		
		doctorReference = context.getServiceReference(DoctorChannelProducer.class.getName());
		DoctorChannelProducer doctorPublish = (DoctorChannelProducer) context.getService(doctorReference);
		
		System.out.println("\n~~~~~~~~~~~Hello! We are Active Srilanka Health Services~~~~~~~~~~~\n");
		
		while (true) {
			
			System.out.println("Please Enter as your requirement?");
			System.out.println("\n1. Channel Doctor Producer");
			System.out.println("2. Pharmacy Producer ");
			System.out.println("3. Medical Lab Service");
			System.out.println("4. Apoinment Check Service");
			System.out.print("\nInput the Command Please!: ");
			
			command = input.nextInt();
			
			if ((command >= 0) && (command <= 4)) {
				
				if (command == 1) {
					
					System.out.println("\n~~~~~You are now in The Channel Doctor Producer~~~~~~\n");
					doctorPublish.main();
					System.out.println("\n~~~~~Going Out From Channel Doctor Producer~~~~~~\n");
				}else {
				
				System.out.println("\n***Please enter a valid command***\n");
				}
			}
		}
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Be Healthy! Good Luck!");
		context.ungetService(doctorReference);
	}

}
