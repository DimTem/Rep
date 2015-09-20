package ua.nure.bratiuschenko.SummaryTask4.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.bratiuschenko.SummaryTask4.Path;
import ua.nure.bratiuschenko.SummaryTask4.exception.AppException;

public class DoctorForDoctorCommand extends Command {

	private static final long serialVersionUID = -5127945616587477692L;
	private static final Logger LOG = Logger
			.getLogger(DoctorForDoctorCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		String forward = Path.PAGE_ERROR_PAGE;

		LOG.debug("Commands starts");

		return forward;

	}

}
