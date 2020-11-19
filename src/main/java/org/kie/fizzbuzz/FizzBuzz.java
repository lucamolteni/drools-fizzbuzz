package org.kie.fizzbuzz;

import java.util.ArrayList;
import java.util.stream.IntStream;

import org.drools.core.event.DebugAgendaEventListener;
import org.drools.core.reteoo.ReteDumper;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class FizzBuzz {


    public static void main(String[] args) {
        System.out.println("Hello world");


        KieServices kieServices = KieServices.Factory.get();

        KieContainer kContainer = kieServices.getKieClasspathContainer();
        KieBase kieBase = kContainer.getKieBase();

        KieSession session = kieBase.newKieSession();

        ArrayList<FizzBuzzEvaluation> o = new ArrayList<>();

        session.setGlobal("allNumbers", o);

        IntStream fiftyNumbers = IntStream.range(1, 51);

        fiftyNumbers.forEach(session::insert);

        int i = session.fireAllRules();

        System.out.println("Fired " + i + " rules");
    }

}
