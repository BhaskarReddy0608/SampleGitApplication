package app.corejava;
class Bank{
	int getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest(){
		return 4;
	}
}
class ICICI extends Bank{
	int getRateOfInterest(){
		return 5;
	}
}
class HDFC extends Bank{
	int getRateOfInterest(){
		return 3;
	}
}
public class RuntimePolyApp {

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("SBI interst rate is :"+b.getRateOfInterest());

		Bank b1=new ICICI();
		System.out.println("ICICI interst rate is :"+b1.getRateOfInterest());
		
		Bank b2=new HDFC();
		System.out.println("HDFC interst rate is :"+b2.getRateOfInterest());
		System.out.println("gg");
	}

}
