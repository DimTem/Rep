package ua.nure.bratiuschenko.SummaryTask4.dao;

import java.util.List;

import ua.nure.bratiuschenko.SummaryTask4.domain.Doctor;
import ua.nure.bratiuschenko.SummaryTask4.domain.Patient;
import ua.nure.bratiuschenko.SummaryTask4.domain.User;
import ua.nure.bratiuschenko.SummaryTask4.exception.DBException;

public interface UserDAO {
    User getUserByCredetials(String login, String pass);

	List<Patient> findById(int id) throws DBException;
	List<Doctor> findDoctorById(int idD) throws DBException;
}
