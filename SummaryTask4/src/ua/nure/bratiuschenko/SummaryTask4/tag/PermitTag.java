package ua.nure.bratiuschenko.SummaryTask4.tag;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import ua.nure.bratiuschenko.SummaryTask4.domain.User;

public class PermitTag extends TagSupport {

	private static final long serialVersionUID = 4097617313156061564L;
	private User user;
	public void setU(User user) {
		this.user = user;
	}
	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
		if (user == null) {
			request.setAttribute("errorMessage", "Access denied");
			String forward = "/WEB-INF/jsp/error/error_page.jsp";
			try {
				request.getRequestDispatcher(forward).forward(request, response);
			} catch (ServletException | IOException e) {
				throw new JspException("Acess denied", e);
			}
		}
		return SKIP_BODY;
	}
}
