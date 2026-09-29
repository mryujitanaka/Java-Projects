/*
Programação Esctruturada

- Variáveis
- Operadores
- Condicionais
- Laços de Repetição
- Tipos Primitivos (char, byte, short, int, long, float, doable, boolean)
*/

/*
Categorias:
1 - Entradas
2 - Pratos Pincipais
3 - Sobremesas
4 - Bebidas
*/

void main(){

    int id = 001;
    int  categoria = 2;
    String nome = "Sanduíche de Presunto do Chaves";
    String descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
    boolean emPromocao = true;
    double preco = 3.50d;
    double precoComDesconto = 2.99d;
    double porcentagemDesconto = (preco - precoComDesconto) / preco;
    double valorDesconto = preco * porcentagemDesconto;

    IO.println(nome);
    IO.println(descricao);

    /*
    if (categoria == 1){
        IO.println("Entradas");
    } else if (categoria == 2) {
        IO.println("Pratos Pincipais");
    } else if (categoria == 3) {
        IO.println("Sobremesas");
    } else if (categoria == 4) {
        IO.println("Bebidas");
    } else {
        IO.println("Categoria não encontrada");
    }
    */

    switch (categoria){
        case 1:
            IO.println("Entradas");
            break;
        case 2:
            IO.println("Pratos Pincipais");
            break;
        case 3:
            IO.println("Sobremesas");
            break;
        case 4:
            IO.println("Bebidas");
            break;
        default:
            IO.println("Categoria não encontrada");
    }

    if (emPromocao){
        IO.println("Preço de R$" + preco + " por R$" + precoComDesconto);
        IO.println("Porcentagem com desconto: " + porcentagemDesconto);
        IO.println("Valor do desconto: " + valorDesconto);
        IO.println("Preço com desconto (calculado): " + (preco - valorDesconto));
    } else {
        IO.println("Preço: " + preco);
    }
}