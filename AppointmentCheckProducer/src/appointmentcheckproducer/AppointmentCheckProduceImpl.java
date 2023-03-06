package appointmentcheckproducer;

import java.util.Scanner;

public class AppointmentCheckProduceImpl implements AppointmentCheckProduce {

	private String Name;
	private String Rno;
	private int Id;
	private String[] symptoms = new String[5];
    int channel = 1;
	
	Scanner scn = new Scanner(System.in);
	
	public AppointmentCheckProduceImpl() {
		symptoms[0] = "Monday";
		symptoms[1] = "Tuesday";
		symptoms[2] = "Wednesday";
		symptoms[3] = "Thursday";
		symptoms[4] = "Friday";
	}
	
	@Override
	public void main() {
		DoctorDetails();
		WorkDate();
		Location();
		DocAppointment();
	}
	
	@Override
	public void DoctorDetails() {
		
		
		System.out.println("Do you want to Check Appointment ? (Type 1 = Yes / Type 2 = No) : ");
		channel = scn.nextInt();

		if (channel == 1) {
			System.out.print("Doctor Name: ");
			this.Name = scn.next();
			
			System.out.print("Doctor Register No: ");
			this.Rno = scn.next();
			
		}else if (channel == 2) {

			System.out.println("");
			System.out.println(
					"							THANK YOU									");
			System.out.println(
					"						  HAVE A NICE DAY								");
			System.out.println();
			return;

	}  

	}

	@Override
	public void WorkDate() {
		
		System.out.println("\nDate: \n");
		
		for (int i = 0; i < symptoms.length; i++) {
			System.out.println((i + 1) + " - " + symptoms[i]);
		}
		
		System.out.print("\nEnter the Date : ");
		
		while(true) {
			int check = scn.nextInt();
			
			if ((check >= 1) && (check <=5)) {
				this.Id = check;
				break;
			} else {
				System.out.print("Enter valid Date: ");
			}
		}
	}

	@Override
	public void Location() {
		
		System.out.print("\nHospital Name: ");
		
		switch(Id) {
			case 1: System.out.println("Nawaloka Hospital - Colombo");
					break;
			case 2: System.out.println("Asiri Hospital - Nawala");
					break;
			case 3: System.out.println("Nawinna Hospital - Kurunegala ");
					break;
			case 4: System.out.println("Lanka Hospital - Colombo");
					break;
			case 5: System.out.println("Durdans Hspital - Colombo");
					break;
			default: System.out.print("Please Enter Date: ");
					 break;
		}
	}

	@Override
	public void DocAppointment() {
		
		System.out.print("\nAppointments: ");
		
		switch(Id) {
			case 1: System.out.println("10\n");
					break;
			case 2: System.out.println("15\n");
					break;
			case 3: System.out.println("12\n");
					break;
			case 4: System.out.println("20\n");
					break;
			case 5: System.out.println("16\n");
					break;
			default: System.out.print("Please Enter Date: ");
					 break;		
		}
	}
}
