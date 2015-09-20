package ua.nure.bratiuschenko.SummaryTask4.web.command;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import org.apache.log4j.Logger;

import ua.nure.bratiuschenko.SummaryTask4.Path;
import ua.nure.bratiuschenko.SummaryTask4.dao.UserDAOImpl;
import ua.nure.bratiuschenko.SummaryTask4.domain.User;
import ua.nure.bratiuschenko.SummaryTask4.exception.AppException;

public class LoginCommand extends Command {

	private static final long serialVersionUID = -7415276852908053954L;
	private static final Logger LOG = Logger.getLogger(LoginCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		LOG.trace("login: " + login + " " + password);

		if (login == null || password == null || login.isEmpty()
				|| password.isEmpty()) {
			LOG.trace("login: Login/password cannot be empty");
			throw new AppException("Login/password cannot be empty");

		}

		User user = UserDAOImpl.find(login, password);

		if (user == null) {
			LOG.trace("login: Cannot find user with such login/password");
			throw new AppException("Cannot find user with such login/password");

		}

		String previlegies = new User().getPrivileges();

		String forward = Path.PAGE_ERROR_PAGE;
		String redirect = Path.COMMAND_MAIN;
		request.setAttribute("redirect", redirect);

		session.setAttribute("user", user);

		session.setAttribute("userRole", previlegies);
		LOG.trace("role: " + previlegies);
		locale(request);
		return forward;
	}

	private void locale(HttpServletRequest request) throws IOException,
			ServletException {
		String localeToSet = request.getParameter("localeToSet");
		if (localeToSet != null && !localeToSet.isEmpty()) {
			HttpSession session = request.getSession();
			Config.set(session, "javax.servlet.jsp.jstl.fmt.locale",
					localeToSet);
			session.setAttribute("defaultLocale", localeToSet);
			Locale.setDefault(new Locale(localeToSet));
			LOG.info("lacale: " + localeToSet);
		}
	}
}