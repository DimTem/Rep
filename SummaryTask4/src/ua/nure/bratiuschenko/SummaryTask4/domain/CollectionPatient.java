package ua.nure.bratiuschenko.SummaryTask4.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ua.nure.bratiuschenko.SummaryTask4.utils.Connector;

public class CollectionPatient {
	public static final String SQL_SELECT_ALL_PATIENTS = "SELECT * FROM patient";
	public static final String SQL_SELECT_ALL_BYALPHABET = "SELECT * FROM patient  ORDER BY `surname` ASC";
	public static final String SQL_SELECT_ALL_DATEOFBIRTH = "SELECT * FROM patient  ORDER BY `date of birth` ASC";

	private static final String TABLE = "<table border=\"1\"><tr><th>id</th><th>surname</th><th>name</th><th>patronymic</th><th>date of birth</th><th>id of attending medical doctor</th><th>procedures</th><th>medicines</th><th>operations</th><th>diagnosis</th><th>status</th>";
	private static final String TR = "<tr>";
	private static final String TD = "<td>";
	private static final String TDE = "</td>";
	private static final String TRE = "</tr>";
	
	public static String findAll(Connector cnr) {
		StringBuilder result = new StringBuilder("<h3>PATIENTS</h3>" + TABLE);
		Statement st = null;
		try {
			st = cnr.getStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL_PATIENTS);
			while (rs.next()) {
				result.append(TR + TD + rs.getInt(1) + TDE);
				result.append(TD + rs.getString(2) + TDE);
				result.append(TD + rs.getString(3) + TDE);
				result.append(TD + rs.getString(4) + TDE);
				result.append(TD + rs.getDate(5) + TDE);
				result.append(TD + rs.getInt(6) + TDE);
				result.append(TD + rs.getString(7) + TDE);
				result.append(TD + rs.getString(8) + TDE);
				result.append(TD + rs.getString(9) + TDE);
				result.append(TD + rs.getString(10) + TDE);
				result.append(TD + rs.getString(11) + TDE + TRE);
			}
			result.append("</table>");
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			if (st != null) {
				cnr.closeStatement(st);
			}
		}
		return result.toString();
	}

	public static String byAlphabet(Connector cnr) {
		StringBuilder result = new StringBuilder("<h3>BY ALPHABET</h3>" + TABLE);
		Statement st = null;
		try {
			st = cnr.getStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL_BYALPHABET);
			while (rs.next()) {
				result.append(TR + TD + rs.getInt(1) + TDE);
				result.append(TD + rs.getString(2) + TDE);
				result.append(TD + rs.getString(3) + TDE);
				result.append(TD + rs.getString(4) + TDE);
				result.append(TD + rs.getDate(5) + TDE);
				result.append(TD + rs.getInt(6) + TDE);
				result.append(TD + rs.getString(7) + TDE);
				result.append(TD + rs.getString(8) + TDE);
				result.append(TD + rs.getString(9) + TDE);
				result.append(TD + rs.getString(10) + TDE);
				result.append(TD + rs.getString(11) + TDE + TRE);
			}
			result.append("</table>");
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			if (st != null) {
				cnr.closeStatement(st);
			}
		}
		return result.toString();
	}

	public static String byDateOfBirth(Connector cnr) {
		StringBuilder result = new StringBuilder("<h3>BY DATE OF BIRTH</h3>"
				+ TABLE);
		Statement st = null;
		try {
			st = cnr.getStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_ALL_DATEOFBIRTH);
			while (rs.next()) {
				result.append(TR + TD + rs.getInt(1) + TDE);
				result.append(TD + rs.getString(2) + TDE);
				result.append(TD + rs.getString(3) + TDE);
				result.append(TD + rs.getString(4) + TDE);
				result.append(TD + rs.getDate(5) + TDE);
				result.append(TD + rs.getInt(6) + TDE);
				result.append(TD + rs.getString(7) + TDE);
				result.append(TD + rs.getString(8) + TDE);
				result.append(TD + rs.getString(9) + TDE);
				result.append(TD + rs.getString(10) + TDE);
				result.append(TD + rs.getString(11) + TDE + TRE);
			}
			result.append("</table>");
		} catch (SQLException e) {
			System.err.println("SQL exception (request or table failed): " + e);
		} finally {
			if (st != null) {
				cnr.closeStatement(st);
			}
		}
		return result.toString();
	}
}
