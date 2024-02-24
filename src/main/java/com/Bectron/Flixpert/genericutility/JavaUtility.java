package com.Bectron.Flixpert.genericutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.LocalDateTime;

public class JavaUtility {
	public String localDteAndTime() {
		String dateAndTime=LocalDateTime.now().toString().replace(':', '-');
		return dateAndTime;
	}
	public void robotClass() throws AWTException {
		Robot robot=new Robot();
	}
	}

