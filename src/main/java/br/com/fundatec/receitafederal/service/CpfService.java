package br.com.fundatec.receitafederal.service;

import br.com.fundatec.receitafederal.repository.CpfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpfService {

    @Autowired
    private CpfRepository cpfRepository;

    public boolean existsPendencia(String cpf) {
        return cpfRepository.existsPendencia(cpf);
    }

}
