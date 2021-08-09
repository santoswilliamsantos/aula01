/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author william.santos
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        aluno.setNome(nome);
        
        System.out.println("Nome: " + aluno.getNome());
        
    
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno");
        aluno.setNome(sobrenome);
        
        System.out.println("Sobreome: " + aluno.getSobrenome());
        
   
       
        String idade = JOptionPane.showInputDialog("Digite a idade do aluno");
        aluno.setNome(idade);
        
        System.out.println("Idade: " + aluno.getIdade());
        
    
        String telefone = JOptionPane.showInputDialog("Digite o telefone do aluno");
        aluno.setTelefone(telefone);
        
        System.out.println("Telefone: " + aluno.getTelefone());
        
      
  
        String salario = JOptionPane.showInputDialog("Digite o salario do aluno");
        aluno.setSalario(Float.parseFloat(salario));
        
        System.out.println("Salario: " + aluno.getSalario());
        
//        aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome");
//        aluno.idade = JOptionPane.showInputDialog("Digite sua idade");
//
//        aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario"));
//        aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF"));

//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome
//                + " " + aluno.sobrenome + "\nIdade" + aluno.idade
//                + "\nSalario " + aluno.salario + "\nCPF " + aluno.cpf);

    }

}
