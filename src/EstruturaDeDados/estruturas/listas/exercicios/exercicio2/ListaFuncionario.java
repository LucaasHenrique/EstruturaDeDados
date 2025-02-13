package EstruturaDeDados.estruturas.listas.exercicios.exercicio2;

//Lista encadeada ordenada em ordem decrescente
public class ListaFuncionario {

    Funcionario inicio = null;
    Funcionario fim = null;
    Funcionario atual;
    Funcionario anterior;

    public void adicionarFuncionario(String nome, double salario) {
        Funcionario novo = new Funcionario(nome, salario);

        if (inicio == null) {
            inicio = fim = novo;
            novo.proximo = null;
        } else {
            anterior = null;
            atual = inicio;

            while (atual != null && novo.salario < atual.salario) {
                anterior = atual;
                atual = atual.proximo;
            }
            if (anterior == null) {
                novo.proximo = inicio;
                inicio = novo;
            } else if(atual == null) {
                fim.proximo = novo;
                fim = novo;
                fim.proximo = null;
            } else {
                anterior.proximo = novo;
                novo.proximo = atual;
            }
        }
    }

    public void consultarElementos() {
        if (inicio == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("Consultando toda a lista \n");
            atual = inicio;

            while (atual != null) {
                System.out.println(atual.nome+" " + " - " + atual.salario);
                atual = atual.proximo;
            }
        }
    }

    public void maiorSalario() {
        atual = inicio;
        double maiorSalario = 0;
        String nome = "";

        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        while (atual != null) {
            if (atual.salario > maiorSalario) {
                maiorSalario = atual.salario;
                nome = atual.nome;
            }
            atual = atual.proximo;
        }
        System.out.println("nome: " + nome + " - salario: R$" + maiorSalario);

        System.out.println("Funcionário(s) com o maior salário: ");
        while (atual != null) {
            if (atual.salario == maiorSalario) {
                System.out.println(atual.nome + " - " + atual.salario);
            }
            atual = atual.proximo;
        }
    }

    public void mediaSalario() {
        atual = inicio;
        double mediaSalarial = 0;

        while (atual != null) {
            mediaSalarial += atual.salario;
            atual = atual.proximo;
        }
        System.out.println("media salarial: " + mediaSalarial / 5);
    }

    public void salarioMaiorQue(double salario) {
        int cont = 0;
        atual = inicio;

        while (atual != null) {
            if (atual.salario > salario) {
                cont += 1;
            }
            atual = atual.proximo;
        }

        System.out.println("salarios maiores que R$ " + salario + ": " + cont);

        if (cont == 0) {
            System.out.println("Nem nenhum salario e maior que: " + salario);
        }
    }

}
