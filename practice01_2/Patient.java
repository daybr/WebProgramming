/*
 * 2014105102 «‘»øπŒ
 * Practice 01_2
 */

public class Patient {

	private String resourceType;
	private String id;
	Identifier[] identifier;
	boolean active;
	Name[] name = new Name[8];
	private String gender;
	private String birthDate;
	Address[] address = new Address[8];
	ManagingOrganization managingOrganization = new ManagingOrganization();

	public Name[] getName() {
		return name;
	}

	public void setname(Name[] name) {
		this.name = name;
	}

	public Identifier[] getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier[] identifier) {
		this.identifier = identifier;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public ManagingOrganization getManagingOrganization() {
		return managingOrganization;
	}

	public void setManagingOrganization(ManagingOrganization managingOrganization) {
		this.managingOrganization = managingOrganization;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
