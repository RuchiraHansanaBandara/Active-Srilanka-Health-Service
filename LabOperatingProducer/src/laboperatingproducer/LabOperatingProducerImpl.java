package laboperatingproducer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LabOperatingProducerImpl implements LabOperatingProducer {
	
	Scanner sc = new Scanner(System.in);
	private String PName;
	private String PAge;
	private int testId; 
	private String[] TestTypes = new String[5];
	private String[] ans = new String[3];
	private String Yes;
	private String No;
	//String choice = sc.next();
	

	
	
	
	
	public LabOperatingProducerImpl() {
		TestTypes[0] = "Blood Count Tests";
		TestTypes[1] = "Blood Sugar Test";
		TestTypes[2] = "Cancer Tests";
		TestTypes[3] = "Full Body CheckUp";
		TestTypes[4] = "Corona(PCR) Test";

	}
	
	
	
	@Override
	public void main() {
		getPatientDetails();
		selectCheckUpTypes();
		displayResults();
		displayPayment();
		confirmTest();
	}
	
	@Override
	public void getPatientDetails() {
		System.out.print("Patient's Name : ");
		this.PName = sc.next();
		
		System.out.print("Patient's Age : ");
		this.PAge = sc.next();	
	}

	@Override
	public void selectCheckUpTypes() {
		System.out.println("\nTesting Types: \n " );
		
		for (int i = 0; i < TestTypes.length; i++) {
			System.out.println((i + 1) + " - " + TestTypes[i]);
		}
		
		System.out.print("\nSelect Testing type Option : ");
		
		while (true) {
			int check = sc.nextInt();
			
			if ((check >= 1) && (check <=5)) {
				this.testId = check;
				break;
			} else {
				System.out.print("Please enter valid Test type number : ");
			}
		}
	}

	@Override
	public void displayResults() {
		
		System.out.print("\nResult: ");
		
		switch(testId) {
			case 1 :
				System.out.println("Normal");
				break;
			case 2 : 
				System.out.println("High");
				break;
			case 3 :
				System.out.println("Normal");
				break;
			case 4 :
				System.out.println("Normal");
				break;
			case 5 :
				System.out.println("Normal");
				break;
			default : 
				System.out.print("Please enter Test type: ");
				break;
		}
	}

	@Override
	public void displayPayment() {
		
		System.out.print("\nTotal Payment: ");
		
		switch(testId) {
			case 1 :
				System.out.println("Rs.2200 /=  \n");
				break;
			case 2 :
				System.out.println("Rs. 2000/=  \n");
				break;
			case 3 :
				System.out.println("Rs.10500/= \n");
				break;
			case 4 :
				System.out.println("Rs.35000/= \n");
				break;
			case 5:
				System.out.println("Rs.12800/= \n");
				break;
			default:
				System.out.print("Please enter a Test type: ");
				break;
		}
	}



	@Override
	public void confirmTest() {
		System.out.print("\nConfirmation (Yes/No) : ");
		String ans = sc.next();
		
			
			if (ans == Yes) {
				System.out.println("Thank YOU.");
				
			} else if(ans == No){
				System.out.print("See You Next Time ");
			}
		}
		
		
	}


	
	
	

