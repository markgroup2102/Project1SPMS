package com.revature.logging;

import org.apache.log4j.Logger;

import com.revature.controller.Main;

public class LoggerNotes {

	
	public LoggerNotes() {
	}
	//private static Logger log = Logger.getLogger(Main.class.getName());
	private static Logger log = Logger.getLogger(LoggerNotes.class.getName());
	public static void main(String[] args) {
		log.info(" I am logging info");
		log.warn("I am sending out a warning");
		log.error("Something bad happened");
		log.fatal("Something terrible happened");
	}
}
		/**
		Logging Levels
		Log4j Usage
		Log4j has a simple class architecture as shown below:

		log4j classes

		The main components of the hierarchy are:

		Logger - logs the messages
		Appender - publishes logs to destination(s)
		Layout - formats logging information
		Configuration - stores settings
		Filter - used to filter out logs that do not meet the threshold
		Log4j Logging Levels
		Below are the Log4j log levels, in order of least to most restrictive:

		ALL => all levels
		DEBUG => designates fine-grained informational events that are most useful to debug an application
		INFO => informational messages that highlight the progress of the application at the coarse grained level
		WARN => designates potentially harmful situations
		ERROR => designates error events that might still allow the application to continue running
		FATAL => severe error events that presumably lead the application to abort
		OFF => highest possible level, intended to turn off logging
		How do logging levels work?
		A log request of level x in a logger with level y is enabled with x >= y. For the standard levels, we have that ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF

		Configuration
		Log4j (specifically Log4j2) can be configured using XML, JSON, YML, or Properties files, as described in their documentation.	}
*/

