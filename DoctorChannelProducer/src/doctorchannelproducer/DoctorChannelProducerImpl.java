package doctorchannelproducer;

import java.util.Scanner;

public class DoctorChannelProducerImpl implements DoctorChannelProducer {

	private String Name;
	private String Age;
	private int Id;
	private String[] symptoms = new String[5];
	
	Scanner scn = new Scanner(System.in);
	
	public DoctorChannelProducerImpl() {
		symptoms[0] = "Gastritis";
		symptoms[1] = "Depression";
		symptoms[2] = "Feaver";
		symptoms[3] = "Migraine";
		symptoms[4] = "High Blood Pressure";
	}
	
	@Override
	public void main() {
		PatientDetails();
		SelectSymptoms();
		Prescription();
		Payment();
	}
	
	@Override
	public void PatientDetails() {
		
		System.out.print("Enter Patient Name : ");
		this.Name = scn.next();
		
		System.out.print("Enter Patient Age : ");
		this.Age = scn.next();
	}

	@Override
	public void SelectSymptoms() {
		
		System.out.println("\nSymptoms: \n");
		
		for (int i = 0; i < symptoms.length; i++) {
			System.out.println((i + 1) + " - " + symptoms[i]);
		}
		
		System.out.print("\nEnter the Symptom Id : ");
		
		while(true) {
			int check = scn.nextInt();
			
			if ((check >= 1) && (check <=5)) {
				this.Id = check;
				break;
			} else {
				System.out.print("Enter valid Symptom Id: ");
			}
		}
	}

	@Override
	public void Prescription() {
		
		System.out.print("\nPrescription: ");
		
		switch(Id) {
			case 1: System.out.println("Cimetidine");
					break;
			case 2: System.out.println("Sertraline");
					break;
			case 3: System.out.println("Cetirizine");
					break;
			case 4: System.out.println("Imitrex");
					break;
			case 5: System.out.println("Prednisolone");
					break;
			default: System.out.print("Please Enter Symptom Id: ");
					 break;
		}
	}

	@Override
	public void Payment() {
		
		System.out.print("\nTotal Payment: ");
		
		switch(Id) {
			case 1: System.out.println("Rs. 500.00\n");
					break;
			case 2: System.out.println("Rs. 300.00\n");
					break;
			case 3: System.out.println("Rs. 1000.00\n");
					break;
			case 4: System.out.println("Rs. 700.00\n");
					break;
			case 5: System.out.println("Rs. 200.00\n");
					break;
			default: System.out.print("Please Enter Symptom Id: ");
					 break;		
		}
	}
}
