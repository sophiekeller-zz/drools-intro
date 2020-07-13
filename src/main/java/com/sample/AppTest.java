package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/** This is a sample class to launch a rule. */
public class AppTest {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base: Knowledge is Everything
			// KieServices is the interface from where it possible to access all the Kie building and runtime
			// facilities
			KieServices ks= KieServices.Factory.get();
			// Kie resources are compiled and deployed into the KieContainer which makes its contents available
			// for use at runtime.
			KieContainer kContainer= ks.getKieClasspathContainer();
			// KieSession stores and executes on the runtime data
			KieSession kSession= kContainer.newKieSession("ksession-rules");

			// assembling facts and firing
			Applicant A= new Applicant("Jane Doe", 1, "7/13/1990", 5000, true, Applicant.MASTERS);
			Applicant B= new Applicant("John Doe", 0, "7/15/2000", 95000, true, Applicant.HIGH_SCHOOL_DIPLOMA);
			Applicant C= new Applicant("Rachel Green", 1, "12/10/1999", 22124, true, Applicant.BACHELORS);
			Applicant D= new Applicant("Brownie Brown", 1, "12/15/1999", 50004, false, Applicant.HIGH_SCHOOL_DIPLOMA);
			kSession.insert(A);
			kSession.insert(B);
			kSession.insert(C);
			kSession.insert(D);
			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
