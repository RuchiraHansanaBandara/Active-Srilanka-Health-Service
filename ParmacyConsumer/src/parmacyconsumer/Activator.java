package parmacyconsumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import pharmacyproducer.PharmacyProduce;

public class Activator implements BundleActivator {

	ServiceReference pharmacyReference;
	
	Scanner input = new Scanner(System.in);
	int command;

	public void start(BundleContext context) throws Exception {
		
		pharmacyReference = context.getServiceReference(PharmacyProduce.class.getName());
		PharmacyProduce pharmacyProduce = (PharmacyProduce) context.getService(pharmacyReference);
		
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
				
				if (command == 2) {
					
					System.out.println("\n~~~~~You are now in The Pharmacy Producer~~~~~~\\n");
					pharmacyProduce.main();
					System.out.println("\n~~~~~Going Out From Pharmacy Producer~~~~~~\n");
				}else {
				
				System.out.println("\n***Please enter a valid command***\n");
				}
			}
		}
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Be Healthy! Good Luck!");
		context.ungetService(pharmacyReference);
	}

}