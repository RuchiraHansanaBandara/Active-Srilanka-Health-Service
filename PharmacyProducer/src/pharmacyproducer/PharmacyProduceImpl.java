package pharmacyproducer;

import java.util.*;

public class PharmacyProduceImpl implements PharmacyProduce {

	private String CName;
	private String MediName;
	private int itemNo;

	HashMap<Integer, String> medicine = new HashMap<Integer, String>();
	HashMap<Integer, Double> selectedMediName = new HashMap<Integer, Double>();
	Scanner sc = new Scanner(System.in);
	
	public PharmacyProduceImpl() {
		medicine.put(1, "Cloxacillin");
		medicine.put(2, "Omeprazole");
		medicine.put(3, "Atorvastain");
		medicine.put(4, "Telmizartan");
		medicine.put(5, "Cinnarazine");
	}	
	public void main() {
		setCustomer();
		displayItem();
		displayCost();
	}
	
	public void setCustomer() {
		System.out.print("Enter Customer Name : ");
		this.CName = sc.next();
	}

	public void displayItem() {
		System.out.println("\nMedicines : \n");
		for (Map.Entry item : medicine.entrySet()) {
			System.out.println("Medicine Number : " + item.getKey() + ". " + "Medicine Name : " + item.getValue());
		}		
		userinputs();
	}

	public void displayCost() {
		Double totalAmount = 0.00;
		System.out.println("\nCustomer Name : " + this.CName);
		
		for(Map.Entry selectedItm : selectedMediName.entrySet()) {
			int iNo = (int) selectedItm.getKey();
			System.out.println("\nMedicine No : " + iNo);
			System.out.println("Medicine Name : " + this.medicine.get(iNo));
			System.out.println("Price : " + getItemCost(iNo) * (double)selectedItm.getValue());
			totalAmount +=  getItemCost(iNo)* (double)selectedItm.getValue();
		}
		System.out.println("\nTotal Price : " + totalAmount);
	}
	public void userinputs() {
		int itemNo1;
		Double itemQuantity;
		System.out.println("\nEnter Medicine No and Quantity (For Skip Enter 0 For Medicine Number)");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("\nEnter Medicine No: ");		
			itemNo1 = sc.nextInt();
			
			if(itemNo1 == 0) break;
			
			System.out.print("Enter Number Of Medicines: ");		
			itemQuantity = sc.nextDouble();
			selectedMediName.put(itemNo1, itemQuantity);
		}
	}
	public double getItemCost(int itemNo) {
		double value;
		
		switch (itemNo) {
			case 1:
				value = 100.00;
				break;
			case 2:
				value = 240.00;
				break;
			case 3:
				value = 250.20;
				break;
			case 4:
				value = 98.00;
				break;
			case 5:
				value = 102.70;
				break;
			default:
				value = 0.00;
				break;
			}
		return value;
	}
}
