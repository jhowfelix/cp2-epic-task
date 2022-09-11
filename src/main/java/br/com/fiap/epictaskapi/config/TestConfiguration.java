package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.fiap.epictaskapi.model.Integrante;
import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.repository.IntegranteRepository;
import br.com.fiap.epictaskapi.repository.TaskRepository;
import br.com.fiap.epictaskapi.repository.UserRepository;

@Configuration
@Profile("dev")
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    
    @Autowired
    IntegranteRepository integranteRepository;
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
       
        taskRepository.saveAll(List.of(
            new Task("BD", "modelar o banco"), 
            new Task("Prototipo", "prototipar as telas"),
            new Task("Bug", "prototipar as telas"),
            new Task("Nova funcionalidade", "prototipar as telas"),
            new Task("Testes", "prototipar as telas"),
            new Task("Deploy", "prototipar as telas"),
            new Task("Login", "prototipar as telas"),
            new Task("Logout", "prototipar as telas"),
            new Task("Outro bug", "prototipar as telas")
        ));        
        
        integranteRepository.saveAll(List.of(
        		new Integrante("Cristine Acocella", "88251"),
        		new Integrante("Jonathan Felix", "88082"),
        		new Integrante("Marcos Vinicius","86904"),
        		new Integrante("Marcos Maciel", "88267"),
        		new Integrante("Priscila Nastacio", "88849")
        		));

        userRepository.save(
            new User(
                "fiap", 
                "admin@fiap.com.br", 
                passwordEncoder.encode("administrador"))
        );
        
        userRepository.save(
                new User(
                    "Cristine", 
                    "Cristine@fiap.com.br", 
                    passwordEncoder.encode("dev"))
            );
        
        userRepository.save(
                new User(
                    "Jonathan", 
                    "jonathan@fiap.com.br", 
                    passwordEncoder.encode("dev1"))
            );
     
    }
    
}
