package GithubProject.test;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class Log {
	public static Logger log=Logger.getLogger(Log.class.getClass());
	public static void info(String mess)
	{
		PropertyConfigurator.configure("log4j1.properties");
		log.info(mess);
	}
	public static void debug(String mess)
	{
		log.debug(mess);
	}
}
