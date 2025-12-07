// MÓDULO 01 - AULA 03 - VARIÁVEIS, OPERADORES E CONDICIONAIS

void main() {

    var nome = "Sanduíche de Presunto do Chaves"; // String
    var descricao = "Sanduíche de presunto simples mas feito com muito amor."; // String
    var emPromocao = true; // boolean
    var preco = 3.50; // double
    var precoComDesconto = 2.99; // double
    var id = 2; // int
    int categoria = 2;

    if (emPromocao) {
        var porcentagemDesconto = (preco - precoComDesconto) / preco;
        IO.println("Porcentagem de desconto: " + porcentagemDesconto);
        IO.println("Preço: de R$" + preco + " por R$" + precoComDesconto);
    } else {
        IO.println("Preço: R$" + preco);
    }

    IO.println("=======");
    IO.println("if, else if, else: ");

    if (categoria == 1) {
        IO.println("Categoria: Entradas");
    }
    else if (categoria == 2) {
        IO.println("Categoria: Pratos Principais");
    }
    else if (categoria == 3) {
        IO.println("Categoria: Sobremesas");
    }
    else if (categoria == 4) {
        IO.println("Categoria: Bebidas");
    }
    else {
        IO.println("Categoria não encontrada.");
    }

    IO.println("=======");
    IO.println("switch: ");

    switch (categoria) {
        case 1:
            IO.println("Categoria: Entradas");
            break;
        case 2:
            IO.println("Categoria: Pratos Principais");
            break;
        case 3:
            IO.println("Categoria: Sobremesas");
            break;
        case 4:
            IO.println("Categoria: Bebidas");
            break;
        default:
            IO.println("Categoria não encontrada.");
    }
}