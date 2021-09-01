
public class SuperVIP extends Customer {
	private static SuperVIP onlySuperVIP;
	private int reward_points;
	private SuperVIP(String name, String address, String iD, String phone) {
		super(name, address, iD, phone);
		this.reward_points = 0;
	}
	private SuperVIP(String name, String address, String iD, String phone, int reward_points) {
		super(name, address, iD, phone);
		this.reward_points = reward_points;
	}
	public static SuperVIP getInstance(String name, String address, String iD, String phone, int reward_points) {
		if (onlySuperVIP == null) {
			onlySuperVIP = new SuperVIP(name, address, iD, phone);
		}
		return onlySuperVIP;
	}
}
