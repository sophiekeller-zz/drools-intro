package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/** This is a sample class to launch a rule. */
public class AppTest {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks= KieServices.Factory.get();
			KieContainer kContainer= ks.getKieClasspathContainer();
			KieSession kSession= kContainer.newKieSession("ksession-rules");

			// assembling facts and firing
			Applicant A= new Applicant("Jane Doe", 'f', "7/13/1990", 22124, true, Applicant.BACHELORS);
			kSession.insert(A);
			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
