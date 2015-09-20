package ua.nure.bratiuschenko.SummaryTask4.web.command;

import java.util.Map;
import java.util.TreeMap;

public class CommandContainer {
	private static Map<String, Command> commands = new TreeMap<String, Command>();
	static {
		commands.put("login", new LoginCommand());
		commands.put("doctor", new DoctorCommand());
		commands.put("doctor for doctor", new DoctorForDoctorCommand());
		commands.put("nurse", new NurseCommand());
		commands.put("patient", new PatientCommand());
		commands.put("user", new UserCommand());
		commands.put("locale", new LocaleCommand());
	}

	public static Command get(String commandName) {
		if (commandName == null || !commands.containsKey(commandName)) {
			return commands.get("noCommand");
		}

		return commands.get(commandName);
	}
}
