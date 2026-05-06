package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("SamSung - powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("SamSung - powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("SamSung - chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("SamSung - chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("SamSung - soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("SamSung - soundDown...");
	}

}
