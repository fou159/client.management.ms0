package com.banking.ensas.core;

import com.banking.ensas.Operations.OperationRepository;
import com.banking.ensas.Operations.Operations;
import com.banking.ensas.user.Client;
import com.banking.ensas.user.ClientRepository;
import com.banking.ensas.user.Role;
import com.banking.ensas.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    OperationRepository operationRepository;
    ClientRepository clientRepository;
    UserRepository userRepository;
    @Autowired
    public DataLoader(OperationRepository operationRepository,ClientRepository clientRepository,UserRepository userRepository) {
        this.operationRepository=operationRepository;
        this.clientRepository=clientRepository;
        this.userRepository=userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        operationRepository.deleteAll();
        userRepository.deleteAll();
        clientRepository.deleteAll();



        Client client1=new Client("koloxjer","AHMED","SURTINI","159753","heu","0695885522","KK2552",36);
        Operations operations=new Operations("CONFIRMED REQUEST FOR YOUR ACCOUNT","Apres revision vous etes bien admis");
        Role role = new Role("ADMIN");
        client1.addRole(role);
        operations.setClient(client1);
        clientRepository.save(client1);
        operationRepository.save(operations);



    }
}
