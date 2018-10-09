/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.Date;
import model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author erick
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping
    public Cliente getCliente() {
        return new Cliente(1, "Erick");
    }
    
    @PostMapping
    public String setCliente(String nome) {
        Cliente cl = new Cliente();
        cl.setNome(nome);
        return cl.getNome();
    }
}
