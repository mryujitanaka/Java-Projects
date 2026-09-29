void main(){

    var id = 2;
    var cardapio = "Cardápio";
    var categoria = "Pratos Principais";
    var nome = "Sanduíche de Presunto do Chaves";
    var descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
    var emPromocao = true;
    var preco = 3.50d;
    var precoComDesconto = 2.99d;
    var porcentagemDesconto = (preco - precoComDesconto) / preco;
    var valorDesconto = preco * porcentagemDesconto;

    IO.println("Porcentagem com desconto: " + porcentagemDesconto);
    IO.println("Valor do desconto: " + valorDesconto);
    IO.println("Preço com desconto (calculado): " + (preco - valorDesconto));
}