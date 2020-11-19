package br.com.fundatec.receitafederal.controller;

import br.com.fundatec.receitafederal.service.CpfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpf")
public class CpfController {

    @Autowired
    private CpfService cpfService;

    @GetMapping("{cpf}")
    public ResponseEntity<Boolean> existsPendencia(@PathVariable("cpf") String cpf) {
        boolean resultado = cpfService.existsPendencia(cpf);

        return new ResponseEntity(resultado, HttpStatus.OK);
    }
}
