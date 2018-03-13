/*
 * 2014105102 «‘»øπŒ
 * Practice 01_2
 */

public class Identifier {
	
	Type type;
	private String use;
	private String system;
	private String value;
	
	Identifier (String use, Type type, String system, String value) {
		this.use = use;
		this.type = type;
		this.system = system;
		this.value = value;
	}
	
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public String getUse() {
		return use;
	}
	
	public void setUse(String use) {
		this.use = use;
	}
	
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
