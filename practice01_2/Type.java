/*
 * 2014105102 ��ȿ��
 * Practice 01_2
 */


public class Type {
	
	
	Coding[] coding = new Coding[8];
	
	Type (Coding[] coding) {
		this.coding = coding;
	}

	public Coding[] getCoding() {
		return coding;
	}

	public void setCoding(Coding[] coding) {
		this.coding = coding;
	}
}