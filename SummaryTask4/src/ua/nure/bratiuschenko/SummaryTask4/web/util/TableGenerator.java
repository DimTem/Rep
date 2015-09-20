package ua.nure.bratiuschenko.SummaryTask4.web.util;

import java.util.List;

import ua.nure.bratiuschenko.SummaryTask4.domain.Doctor;
import ua.nure.bratiuschenko.SummaryTask4.domain.Patient;

public class TableGenerator {
	private static final String TR = "<tr>";
	private static final String TD = "<td>";
	private static final String TDE = "</td>";
	private static final String TRE = "</tr>";

	public static String generateDoctorsTable(List<Doctor> doctors) {
		StringBuilder result = new StringBuilder(
				"<h3>DOCTORS</h3>"
						+ "<table border=\"1\"><tr><th><button>id</button></th><th><form action=\"/SummaryTask4/Doctor\" method=\"post\"><input type=\"submit\" name=\"sortDatesubmit\" value=\"surname\"></form></a></th><th><button>name</button></th><th><button>patronymic</button></th><th><button>category</button></th><th><form action=\"/SummaryTask4/Doctor\" method=\"post\"><input type=\"submit\" name=\"sortsubmit\" value=\"date of birth\"></form></a></th><th><button>phone</button></th><th><form action=\"/SummaryTask4/Doctor\" method=\"post\"><input type=\"submit\" name=\"numberDatesubmit\" value=\"number of patients\"></form></a></th>");
		for (Doctor doctor : doctors) {

			result.append(TR + TD + doctor.getId() + TDE);
			result.append(TD + doctor.getSurname() + TDE);
			result.append(TD + doctor.getName() + TDE);
			result.append(TD + doctor.getPatronymic() + TDE);
			result.append(TD + doctor.getCategory() + TDE);
			result.append(TD + doctor.getDateOfBirth() + TDE);
			result.append(TD + doctor.getPhone() + TDE);
			result.append(TD + doctor.getNumberOfPatients() + TDE + TRE);
		}
		result.append("</table>");
		return result.toString();
	}

	public static String generatePatientsTable(List<Patient> patients) {
		StringBuilder result = new StringBuilder(
				"<h3>PATIENTS</h3>"
						+ "<table border=\"1\"><tr><th>id</th><th><form action=\"/SummaryTask4/Patient\" method=\"post\"><input type=\"submit\" name=\"asubmit\" value=\"surname\"></form></a></th><th>name</th><th>patronymic</th><th><form action=\"/SummaryTask4/Patient\" method=\"post\"><input type=\"submit\" name=\"dsubmit\" value=\"date of birth\"></form></a></th><th>id of attending medical doctor</th><th>procedures</th><th>medicines</th><th>operations</th><th>diagnosis</th><th>status</th>");
		for (Patient patient : patients) {
			result.append(TR + TD + patient.getId() + TDE);
			result.append(TD + patient.getSurname() + TDE);
			result.append(TD + patient.getName() + TDE);
			result.append(TD + patient.getPatronymic() + TDE);
			result.append(TD + patient.getDateOfBirth() + TDE);
			result.append(TD + patient.getIdOfAttendingMedicalDoctor() + TDE);
			result.append(TD + patient.getProcedures() + TDE);
			result.append(TD + patient.getMedicines() + TDE);
			result.append(TD + patient.getOperations() + TDE);
			result.append(TD + patient.getDiagnosis() + TDE);
			result.append(TD + patient.getStatus() + TDE + TRE);
		}
		result.append("</table>");
		return result.toString();
	}

	public static String generatePatientsTableForDoctor(List<Patient> patients) {
		StringBuilder result = new StringBuilder(
				"<h3>PATIENTS</h3>"
						+ "<table border=\"1\"><tr><th>id</th><th><form action=\"/SummaryTask4/DoctorForDoctor\" method=\"post\"><input type=\"submit\" name=\"surnamesubmit\" value=\"surname\"></form></a></th><th>name</th><th>patronymic</th><th><form action=\"/SummaryTask4/DoctorForDoctor\" method=\"post\"><input type=\"submit\" name=\"datesubmit\" value=\"date of birth\"></form></a></th><th>id of attending medical doctor</th><th>procedures</th><th>medicines</th><th>operations</th><th>diagnosis</th><th>status</th>");
		for (Patient patient : patients) {
			result.append(TR + TD + patient.getId() + TDE);
			result.append(TD + patient.getSurname() + TDE);
			result.append(TD + patient.getName() + TDE);
			result.append(TD + patient.getPatronymic() + TDE);
			result.append(TD + patient.getDateOfBirth() + TDE);
			result.append(TD + patient.getIdOfAttendingMedicalDoctor() + TDE);
			result.append(TD + patient.getProcedures() + TDE);
			result.append(TD + patient.getMedicines() + TDE);
			result.append(TD + patient.getOperations() + TDE);
			result.append(TD + patient.getDiagnosis() + TDE);
			result.append(TD + patient.getStatus() + TDE + TRE);
		}
		result.append("</table>");
		return result.toString();
	}
}
