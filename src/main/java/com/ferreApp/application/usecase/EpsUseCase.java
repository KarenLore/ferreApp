package com.ferreApp.application.usecase;

import java.util.List;

import com.ferreApp.domain.entities.Eps;
import com.ferreApp.domain.repositories.EpsRepository;

public class EpsUseCase {
    private final EpsRepository epsRepository;

    public EpsUseCase(EpsRepository epsRepository) {
        this.epsRepository = epsRepository;
    }

    public void save(String name){
        Eps eps = new Eps(name);
        epsRepository.save(eps);
    }

    public Eps findById(int id){
        return epsRepository.findById(id);
    }

    public List<Eps> findAll(){
        return epsRepository.findAll();
    }

    public void update(int id, String name){
        Eps eps = new Eps(name);
        eps.setId(id);
        epsRepository.update(eps);
    }

    public void delete(int id){
        epsRepository.delete(id);
    }
    
}
