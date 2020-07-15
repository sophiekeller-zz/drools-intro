package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/** This is a sample class to launch a rule. */
public class AppTest {
	public static Applicant A;
	public static Applicant B;
	public static Applicant C;
	public static Applicant D;
	public static Applicant E;
	public static Applicant F;
	public static Applicant G;
	public static Applicant H;

	public static final void main(String[] args) {
		MySqlConnection db= new MySqlConnection();
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
			A= new Applicant("Jane Doe", 1, "7/13/1990", 5000, 1, Applicant.MASTERS, 0);
			B= new Applicant("John Doe", 0, "7/15/2000", 95000, 1, Applicant.HIGH_SCHOOL_DIPLOMA, 1);
			C= new Applicant("Rachel Green", 1, "12/10/1999", 22124, 1, Applicant.BACHELORS, 0);
			D= new Applicant("Brownie Brown", 1, "12/15/1999", 50004, 0, Applicant.HIGH_SCHOOL_DIPLOMA,
				1);
			E= new Applicant("John Smith", 0, "12/15/1973", 45000, 0, Applicant.BACHELORS, 0);
			F= new Applicant("Sarah Johnson", 1, "12/15/1945", 0, 1, Applicant.HIGH_SCHOOL_DIPLOMA, 1);
			G= new Applicant("Sophie Keller", 1, "03/17/2000", 60613, 0, Applicant.BACHELORS, 0);
			H= new Applicant("Greta Keller", 1, "03/17/2000", 60613, 0, Applicant.BACHELORS, 0);
			kSession.insert(A);
			kSession.insert(B);
			kSession.insert(C);
			kSession.insert(D);
			kSession.insert(E);
			kSession.insert(F);
			kSession.insert(G);
			kSession.insert(H);
			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		try {
			db.writeDataBaseApplicant(A);
			db.writeDataBaseApplicant(B);
			db.writeDataBaseApplicant(C);
			db.writeDataBaseApplicant(D);
			db.writeDataBaseApplicant(E);
			db.writeDataBaseApplicant(F);
			db.writeDataBaseApplicant(G);
			db.writeDataBaseApplicant(H);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
