
public class Person {
	
	String m_name;
	int m_age = -1;
	String m_phoneNumber;
	String m_address;
	
	public Person (String name, int age, String phoneNumber, String address){
		m_name = name;
		m_age = age;
		m_phoneNumber = phoneNumber;
		m_address = address;
	}
	
	public String getName() {
		return m_name;
	}

	public void setName(String m_name) {
		this.m_name = m_name;
	}

	public int getAge() {
		return m_age;
	}

	public void setAge(int m_age) {
		this.m_age = m_age;
	}

	public String getPhoneNumber() {
		return m_phoneNumber;
	}

	public void setPhoneNumber(String m_phoneNumber) {
		this.m_phoneNumber = m_phoneNumber;
	}

	public String getAddress() {
		return m_address;
	}

	public void setAddress(String m_address) {
		this.m_address = m_address;
	}

	public void growOlder(){
		this.setAge(this.getAge() + 1);
	}
	
	public String greeting(){
		return ("Hi my name is " + this.m_name);
	}
}