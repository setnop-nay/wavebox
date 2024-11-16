package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.LoginEntity;
import repository.LoginRepository;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping
    public LoginEntity createLogin(@RequestBody LoginController login) {
        return loginRepository.save(login);
    }

    @GetMapping("/{cpf}")
    public LoginEntity getLogin(@PathVariable String cpf) {
        return loginRepository.findByCpf(cpf);
    }

    // Outros métodos (atualizar, deletar, etc.)
}
