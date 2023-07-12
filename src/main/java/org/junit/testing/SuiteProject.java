package org.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sun.tools.javac.util.Assert;

//@RunWith(Suite.class)
//@SuiteClasses({A.class,B.class,AssertProject.class})

public class SuiteProject {
	
	@Test
	public void tc() {
		Result rnc = JUnitCore.runClasses(A.class,B.class,AssertProject.class);
		System.out.println("Get run time : " + rnc.getRunTime());
		System.out.println("Get run count : " + rnc.getRunCount());
		System.out.println("Get failure count : " + rnc.getFailureCount());
		System.out.println("Get ignore count : " + rnc.getIgnoreCount());
		List<Failure> fail = rnc.getFailures();
		
		for (Failure fails : fail) {
			System.out.println("Get failures : " + fails);
			
		}
		

	}
	
	

}
