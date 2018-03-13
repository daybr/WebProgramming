/*
 * 2014105102 «‘»øπŒ
 * Practice 01_2
 */

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args){
		
		Gson gson = new Gson();
		
		Patient patient = new Patient();
		
		patient.setResourceType("Patient");
		patient.setId("xds");
		
		Coding cod = new Coding("http://hl7.org/fhir/v2/0203", "MR");
		Coding[] codings = {cod};
		
		Type type = new Type(codings);
		
		Identifier iden = new Identifier("usual", type, "urn:1.2.3.4.5", "89765a87b");
		Identifier[] idens = {iden};
		patient.setIdentifier(idens);
			
		patient.setActive(true);
		
		String[] family = {"Doe"};
		String[] given = {"John"};
		Name name = new Name (family, given);
		Name[] names = {name};
		patient.setname(names);
		
		patient.setGender("male");
		patient.setBirthDate("1956-05-27");
		
		
		String[] line = {"100 Main St"};
		
		Address adderess = new Address(line, "Metropolis", "11", "44130", "USA");
		Address[] adderesses = {adderess};
		patient.setAddress(adderesses);
		
		
		patient.getManagingOrganization().setReference("Organization/2");
		
		
		System.out.println(gson.toJson(patient));
	}
}
