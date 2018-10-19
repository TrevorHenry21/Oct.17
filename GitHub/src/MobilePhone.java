
public class MobilePhone {

	private String Manufacturer;
	private String Model;
	private double Price;
	private String Carrier;
	
	public MobilePhone(String Manufacturer, String Model, double Price, String Carrier) {
		
		this.Manufacturer = Manufacturer;
		this.Model = Model;
		this.Price = Price;
		this.Carrier = Carrier;
		
	}
	
	public String Call(int Number) {
		return "I am calling " + Number;
	}
	
	public String Text(String Text) {
		return "Your text says: " + Text;
	}
	
	@Override
	public String toString() {
		
		return "MobilePhone " + "\n" + "Manufacturer=" + Manufacturer + ", Model=" + Model + ", Price=" + Price + ", Carrier="
				+ Carrier;
	}
	
	
	
}
