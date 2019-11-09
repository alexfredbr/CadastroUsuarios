/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno07
 */
public class Usuario {
    private String email,senha;
    
    void atribuirEmail(String email){
        this.email = email;
    }
    void atribuirSenha(String senha){
        this.senha = senha;
    }
    String getEmail(){
        return email;
    }
    String getSenha() {
        return senha;
    }
    
    public static void main(String[] args) {
        String emailBusca;
        ArrayList<Usuario> array = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("\n Cadastro de Usuários\n");
            System.out.println("[1] Adicionar novo usuário");
            System.out.println("[2] Listar todos usuários");
            System.out.println("[3] Procurar usuário por E-mail");
            System.out.println("[4] Remover usuário por E-mail");
            System.out.println("[5] Finalizar Programa");
            System.out.println("Digite a opção desejada:");
            switch(sc.nextLine()){
                case "1":
                   
                    Usuario u = new Usuario();
                    System.out.print("Digite o e-mail:");
                    u.atribuirEmail(sc.nextLine());
                    System.out.print("\nDigite a senha: ");
                    u.atribuirSenha(sc.nextLine());
                    System.out.println("\n Usuário cadastrado!");
                    array.add(u);
                    System.out.println("Pressione enter para continuar");
                    sc.nextLine();
                    break;
                case "2": 
                    
                    for(int i = 0; i <array.size(); i++){
                        Usuario user = array.get(i);
                        System.out.println("Usuario "+ (i+1));
                        System.out.println("    Email: "+ user.getEmail());
                        System.out.println("    Senha: "+ user.getSenha());
                    }
                    System.out.println("Pressione enter para continuar");
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Digite o email do usuário:");
                    emailBusca = sc.nextLine();
                    for(int i = 0; i <=array.size(); i++){
                        if(i == array.size()){
                            System.out.println("Usuário não encontrado!");
                            break;
                        }   
                        Usuario user = array.get(i);
                        if(emailBusca.equals(user.getEmail())){
                            System.out.println("Usuário encontrado:");
                            System.out.println("    Email: "+ user.getEmail());
                            System.out.println("    Senha: "+ user.getSenha());
                            break;
                        }
                        
                    }
                    System.out.println("Pressione enter para continuar");
                    sc.nextLine();
                    break;
                case "4":
                    System.out.println("Digite o email do usuário:");
                    emailBusca = sc.nextLine();
                    for(int i = 0; i <=array.size(); i++){
                        if(i == array.size()){
                            System.out.println("Usuário não encontrado!");
                            break;
                        }   
                        Usuario user = array.get(i);
                        if(emailBusca.equals(user.getEmail())){
                            System.out.println("Usuário removido");
                            array.remove(i);
                            break;
                        }
                        
            
                    }
                    System.out.println("Pressione enter para continuar");
                    sc.nextLine();
                    break;
                case "5":
                    System.out.println("Encerrando programa...");
                    System.out.println("Programa encerrado");
                    return;
            }
        }

    }
}
