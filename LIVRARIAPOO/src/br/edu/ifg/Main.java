package br.edu.ifg;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Usuario usuario = null;
		String nome="";
		Livraria livraria = new Livraria();
		Catalogo catalogo = new Catalogo();
		Livro livro = new Livro("A encarnação!", "José Roberto", 1, "Livro de terror", 25.6);
		catalogo.adicionaLivro(livro);
		livro = new Livro("O reviver!", "Marina Moscou", 2, "Livro de superação", 40.8);
		catalogo.adicionaLivro(livro);
		livraria.setCatalogo(catalogo);

		Carrinho carrinho = new Carrinho();
		Encomenda encomenda = new Encomenda();

		while (true) {
			int escolha = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n1. Adicionar livro ao carrinho\n"
							+ "2. Comprar\n3. LogOff\n4. Cadastrar\n5. Login\n6. Sair\n7. Carrinho\n8. Meus Dados"));

			switch (escolha) {
			case 1:
				if (usuario != null) {
					int opcaoLivro = Integer.parseInt(JOptionPane.showInputDialog(
							"Digite o numero do livro que deseja comprar:\n\n" + livraria.getCatalogo().toString()));

					switch (opcaoLivro) {

					case 1: {
						carrinho.adicionaLivro(catalogo.getLivros().get(0));
						break;
					}

					case 2: {
						carrinho.adicionaLivro(catalogo.getLivros().get(1));
						break;
					}
					default:
						JOptionPane.showMessageDialog(null, "Opção Invalida!");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Faça login antes de adicionar livros ao carrinho.");

				}
				break;
			case 2:
				if (usuario != null) {
					encomenda.setCarrinho(carrinho);
					encomenda.setEnumEncomenda(EnumEncomenda.EF);
					usuario.adicionaEncomenda(encomenda);
					JOptionPane.showMessageDialog(null, "Compra no valor de R$ "
							+ carrinho.somaValorLivros(carrinho.getLivros()) + " efetivada com sucesso!");
					carrinho.limpaCarrinho();

				} else {
					JOptionPane.showMessageDialog(null, "Faça login antes de comprar.");
				}
				break;
			case 3:
				if (usuario != null) {
					JOptionPane.showMessageDialog(null, "Usuario deslogado!");
					usuario = null;
				} else {
					JOptionPane.showMessageDialog(null, "Impossivel sair nenhum usuario Logado!");
				}
				break;

			case 4: {
				if (usuario == null) {
					usuario = new Usuario();
					String nomeCadastro = JOptionPane.showInputDialog("CADASTRO!\n\nDigite o seu nome:");
					usuario.setNome(nomeCadastro);
					String cpfCadastro = JOptionPane.showInputDialog("CADASTRO!\n\nDigite o seu CPF:");
					usuario.setCpf(cpfCadastro);
					String dataCadastro = JOptionPane.showInputDialog("CADASTRO!\n\nDigite a sua data de Nascimento:");
					usuario.setDataNascimento(dataCadastro);
					livraria.adicionaUsuario(usuario);

					int receptorEmail = Integer
							.parseInt(JOptionPane.showInputDialog("Receber Email? \n\n0-NÂO\n1-SIM"));
					if (receptorEmail == 1) {
						usuario.setReceptorEmail(true);
						String emailCadastro = JOptionPane.showInputDialog("Digite seu Email:");
						usuario.setEmail(emailCadastro);

					} else {
						usuario.setReceptorEmail(false);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Faça logOff antes de fazer um novo cadastro!");
				}

				break;
			}

			case 5: {

				if (usuario == null) {
					 nome = JOptionPane.showInputDialog("LOGIN \n\nDigite o nome:");

					if (livraria.verificaLogin(nome) == true) {
						usuario = livraria.retornaUsuario(nome);
					} else {
						JOptionPane.showMessageDialog(null, "Usuario não Cadastrado!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Usuario ja logado!");
				}
				break;
			}
			case 6: {
				JOptionPane.showMessageDialog(null, "Saindo...!");
				System.exit(0);
				break;
			}

			case 7: {
				if (usuario != null) {
					JOptionPane.showMessageDialog(null, "Carrinho\n\n" + carrinho.toString());

				} else {
					JOptionPane.showMessageDialog(null, "Faça Login antes de acessar o seu carrinho!");
				}
				break;
			}

			case 8: {
				if (usuario != null) {
					JOptionPane.showMessageDialog(null, usuario.toString());

				} else {
					JOptionPane.showMessageDialog(null, "Faça Login antes de acessar suas informações!");
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Opção invalida!");
			}

			}
		}

	}

}
