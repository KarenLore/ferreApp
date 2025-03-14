package com.ferreApp;

import java.util.Map;

import com.ferreApp.domain.entities.Eps;
import com.ferreApp.infrastructure.adapter.ui.EpsUI;


public class Main {
    public static void main(String[] args) {
        EpsUI epsUI = new EpsUI();
        Map<Integer,Eps> myEps = epsUI.FindAllEps();
        //myEps.forEach((k,v) -> System.out.println("Id: " + k + " Nombre: " + v.getName()));
        // for (Eps eps : epsUI.FindAllEpsList("Coomeva", myEps)) {
        //     System.out.println("Id: " + eps.getId() + " Nombre: " + eps.getName());
        // }
        // Map<Integer, Eps> eps - epsUI.findFirstByName("Nueva", myEps);
        epsUI.FindAllEpsList("My Eps Colombia", myEps).iterator().forEachRemaining(eps -> System.out.println("Id: " + eps.getId() + " Nombre: " + eps.getName()));

    }
}