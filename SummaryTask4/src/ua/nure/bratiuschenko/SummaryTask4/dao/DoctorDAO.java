package ua.nure.bratiuschenko.SummaryTask4.dao;

import java.util.List;

import ua.nure.bratiuschenko.SummaryTask4.domain.Doctor;
import ua.nure.bratiuschenko.SummaryTask4.exception.DBException;

public interface DoctorDAO {
	List<Doctor> findAll() throws DBException;
	List<Doctor> findDoctorsByCategory(String category) throws DBException;
	List<Doctor> finDoctorsBySurname(String surname) throws DBException;
	int findNOPSurgeons() throws DBException ;
	int findNOPTherapeutist() throws DBException;
	int findNOPDentist() throws DBException ;
	int findNOPSurgeonT() throws DBException;
	int findNOPNurse(int idOfAttendingMedicalDoctor);
	int findNOPNurse() throws DBException ;
	int findNOPNurseT() throws DBException ;
	int findNOPGynaecologist() throws DBException ;
	int findNOPNeuropathologist() throws DBException ;
	int findNOPPsychologist() throws DBException ;
	int findNOPOtolaryngologistt() throws DBException ;
	List<Doctor> finDoctorsByNumberOfPatients(String numberOfPAtients) throws DBException ;
	List<Doctor> findOne() throws DBException;
	List<Doctor> findTwo() throws DBException;
	List<Doctor> findThree() throws DBException;
	List<Doctor> findFour() throws DBException;
	List<Doctor> findFive() throws DBException;
	List<Doctor> findSix()  throws DBException ;
	List<Doctor> findSeven()throws DBException;
	List<Doctor> findEight() throws DBException;
	List<Doctor> findNine() throws DBException;
	List<Doctor> findTen() throws DBException;
}
