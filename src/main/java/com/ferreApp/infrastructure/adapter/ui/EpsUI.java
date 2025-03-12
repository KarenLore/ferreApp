package com.ferreApp.infrastructure.adapter.ui;

import java.util.Scanner;

import com.ferreApp.application.usecase.EpsUseCase;
import com.ferreApp.domain.repositories.EpsRepository;
import com.ferreApp.infrastructure.database.ConnectMysqlFactory;
import com.ferreApp.infrastructure.persistence.EpsRepositoryImpl;

public class EpsUI {
    EpsRepository repository = new EpsRepositoryImpl(ConnectMysqlFactory.crearConexion());
    EpsUseCase useCase = new EpsUseCase(repository);

    public void CreateEps(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre de la EPS: ");
            String name = sc.nextLine();
            useCase.save(name);
        }
    }

    public void UpdateEps(){
        try (Scanner sc = new Scanner(System.in)) {
            
        }
    }
}
