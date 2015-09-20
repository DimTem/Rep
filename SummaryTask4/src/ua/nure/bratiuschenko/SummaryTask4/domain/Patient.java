package ua.nure.bratiuschenko.SummaryTask4.domain;

import java.util.Date;

public class Patient {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private Date dateOfBirth;
	private int idOfAttendingMedicalDoctor;
	private String procedures;
	private String medicines;
	private String operations;
	private String diagnosis;
	private String status;

	public Patient() {

	}

	public Patient(int id, String surname, String name, String patronymic,
			Date dateOfBirth, int idOfAttendingMedicalDoctor,
			String procedures, String medicines, String operations,
			String diagnosis, String status) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
		this.idOfAttendingMedicalDoctor = idOfAttendingMedicalDoctor;
		this.procedures = procedures;
		this.medicines = medicines;
		this.operations = operations;
		this.diagnosis = diagnosis;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getIdOfAttendingMedicalDoctor() {
		return idOfAttendingMedicalDoctor;
	}

	public void setIdOfAttendingMedicalDoctor(int idOfAttendingMedicalDoctor) {
		this.idOfAttendingMedicalDoctor = idOfAttendingMedicalDoctor;
	}

	public String getProcedures() {
		return procedures;
	}

	public void setProcedures(String procedures) {
		this.procedures = procedures;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", surname=" + surname + ", name=" + name
				+ ", patronymic=" + patronymic + ", dateOfBirth=" + dateOfBirth
				+ ", idOfAttendingMedicalDoctor=" + idOfAttendingMedicalDoctor
				+ ", procedures=" + procedures + ", medicines=" + medicines
				+ ", operations=" + operations + ", diagnosis=" + diagnosis
				+", status"+ status+ "]";
	}

}