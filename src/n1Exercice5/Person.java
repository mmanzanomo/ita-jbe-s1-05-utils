package n1Exercice5;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -8631248413443936293L;
	private String name;
	private String surname;
	private String dni;
	
	
	public Person(){}
	
	public Person(String name, String surname, String dni) {
		super();
		this.name = name;
		this.surname = surname;
		this.dni = dni;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", dni=");
		builder.append(dni);
		builder.append("]");
		return builder.toString();
	}
	
}
