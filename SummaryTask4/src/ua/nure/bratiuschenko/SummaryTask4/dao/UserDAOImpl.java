package ua.nure.bratiuschenko.SummaryTask4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ua.nure.bratiuschenko.SummaryTask4.domain.Doctor;
import ua.nure.bratiuschenko.SummaryTask4.domain.Patient;
import ua.nure.bratiuschenko.SummaryTask4.domain.User;
import ua.nure.bratiuschenko.SummaryTask4.exception.DBException;

public class UserDAOImpl implements UserDAO {
	private static final String SQL_FIND_USER = "SELECT * FROM `jtj-948`.users WHERE login=? AND password=?";
	private static final Logger LOG = Logger.getLogger(UserDAOImpl.class);
	public static final String SQL_SELECT_INFO_BY_ID = "SELECT * FROM `jtj-948`.patient WHERE id =?";
	public static final String SQL_SELECT_INFO_ABOUT_DOCTOR_BY_ID = "SELECT * FROM `jtj-948`.doctor WHERE id =?";
	private Connection connection;

	public UserDAOImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public List<Patient> findById(int id) throws DBException {
		List<Patient> users = new ArrayList<Patient>();
		LOG.trace("find by id started");
		try (PreparedStatement st1 = connection
				.prepareStatement(SQL_SELECT_INFO_BY_ID)) {
			st1.setInt(1, id);
			ResultSet rs = st1.executeQuery();
			LOG.trace("find by id finished");
			while (rs.next()) {
				Patient user = new UserDAOImpl(connection).extractUserFromResultSet(rs);
				users.add(user);
			}
		} catch (SQLException e) {
			LOG.error("can not find by id", e);
		}
		return users;
	}
	
	protected Patient extractUserFromResultSet(ResultSet rs)
			throws SQLException {
		Patient user = new Patient();
		user.setId(rs.getInt(1));
		user.setSurname(rs.getString(2));
		user.setName(rs.getString(3));
		user.setPatronymic(rs.getString(4));
		user.setDateOfBirth(rs.getDate(5));
		user.setIdOfAttendingMedicalDoctor(rs.getInt(6));
		user.setProcedures(rs.getString(7));
		user.setMedicines(rs.getString(8));
		user.setOperations(rs.getString(9));
		user.setDiagnosis(rs.getString(10));
		user.setStatus(rs.getString(11));
		return user;
	}
	protected Doctor extractUserFromResultSet1(ResultSet rs)
			throws SQLException {
		Doctor user = new Doctor();
		user.setId(rs.getInt(1));
		user.setSurname(rs.getString(2));
		user.setName(rs.getString(3));
		user.setPatronymic(rs.getString(4));
		user.setCategory(rs.getString(5));
		user.setDateOfBirth(rs.getDate(6));
		user.setPhone(rs.getString(7));
		user.setNumberOfPatients(rs.getInt(8));
		return user;
	}
	
	

	public List<Doctor> findDoctorById(int idD) throws DBException {
		List<Doctor> users = new ArrayList<Doctor>();
		LOG.trace("find doctor by id started");
		try (PreparedStatement st = connection
				.prepareStatement(SQL_SELECT_INFO_ABOUT_DOCTOR_BY_ID)) {
			st.setInt(1, idD);
			ResultSet rs = st.executeQuery();
			LOG.trace("find doctor by id finished");
			while (rs.next()) {
				Doctor user = new UserDAOImpl(connection).extractUserFromResultSet1(rs);
				users.add(user);
			}
		} catch (SQLException e) {
			LOG.error("can not find by id", e);
		}
		return users;
	}
	
	@Override
	public User getUserByCredetials(String login, String pass) {
		LOG.error("can not find user by credetials");
		return null;
	}
	public static User find(String login, String pass) throws DBException {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_FIND_USER);
			ps.setString(1, login);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = extractUser(rs);
			}
			cn.commit();
		} catch (SQLException ex) {
			manager.rollback(cn);
			throw new DBException("CANNOT OBTAIN USER", ex);
		} finally {
			manager.close(rs);
			manager.close(ps);
			manager.close(cn);
		}
		return user;
	}
	
	private static User extractUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setLogin(rs.getString(1));
		user.setPassword(rs.getString(2));
		user.setPrivileges(rs.getString(4));
		LOG.trace("user" + user);
		return user;
	}
}
