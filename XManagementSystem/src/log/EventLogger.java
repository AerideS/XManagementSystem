
package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;	// 파일헨들러
	LogManager logmanager;		// 로그메니저
	Logger logger;				// 로거 
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();	// 로그 메니저 할당
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);	// 파일 헨들러 생성
			filehandler.setFormatter(new SimpleFormatter());	// txt 형식으로 저장
			logger.addHandler(filehandler);
			
		} catch (IOException e) {		// 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}
}
