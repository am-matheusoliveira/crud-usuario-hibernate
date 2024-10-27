package com.matheus;

import com.matheus.dao.UsuarioDAO;
import com.matheus.modelo.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando uma nova instancia da classe UsuarioDAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();

//        // Criando um novo usuário
//        Usuario novoUsuario = new Usuario();
//        novoUsuario.setNome("Matheus Oliveira Pereira");
//        novoUsuario.setEmail("matheus.pereira@gmail.com");
//        novoUsuario.setSenha("M@theus_!_30");
//        novoUsuario.setDataNascimento("1996-12-28");
//        novoUsuario.setCpf("02255788241");
//        novoUsuario.setTelefone("98991968439");
//        novoUsuario.setEndereco("Rua Ipiranga, 517");
//
//        // Salvando o novo usuário
//        usuarioDAO.salvar(novoUsuario);

//        // Atualizando um usuário existente (supondo que o ID 1 exista no banco de dados)
//        Usuario usuarioExistente = usuarioDAO.buscar(1L); // Buscando o usuário com ID 1
//        if (usuarioExistente != null) {
//            // Atualizando as informações do usuário
//            usuarioExistente.setNome("João Silva Atualizado");
//            // usuarioExistente.setEmail("joao.silva.atualizado@exemplo.com");
//            // usuarioExistente.setTelefone("11999999999");
//
//            // Salvando as mudanças
//            usuarioDAO.atualizar(usuarioExistente);
//
//            System.out.println("Usuário atualizado com sucesso!");
//        } else {
//            System.out.println("Usuário não encontrado.");
//        }

//        // Deletando um usuário
//        Long idParaDeletar = 2101L; // ID do Usuário
//
//        // Buscando o usuário com o ID fornecido
//        Usuario usuarioExistente = usuarioDAO.buscar(idParaDeletar); // Buscando o usuário com ID 2101L
//
//        // Verificando se o este usuário existe
//        if (usuarioExistente != null) {
//            // Deletando o usuário com o ID fornecido
//            usuarioDAO.deletar(idParaDeletar);
//
//            // Mensagem informando o resultado da operação
//            System.out.println("Usuário com ID " + idParaDeletar + " deletado com sucesso.");
//        } else {
//            // Mensagem informando o resultado da operação
//            System.out.println("Usuário não encontrado.");
//        }

        // Listando todos os usuários
        List<Usuario> usuarios = usuarioDAO.listarUsuarios();
        
        // Exibindo os usuários no console
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail());
        }

        // Fechando a conexão
        usuarioDAO.fechar();
    }
}
