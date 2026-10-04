/*
Temos um problema no código abaixo, pois se temos múltiplos valores, que é o caso do nosso CARDÁPIO do restaurante FlorindaEats, torna-se complicado e exaustivo o input manual das variáveis correspondentes a cada item do cardápio. Para resolver este problema, podemos usar Array.
 */

void main(){

    var idItem1 = 001;
    var categoriaItem1 = 4;
    var nomeItem1 = "Refresco do Chaves";
    var descricaoItem1 = "Suco de limão que parece de tamarindo, e tem gosto de groselha.";
    var emPromocaoItem1 = false;
    var precoItem1 = 2.99d;
    var precoComDescontoItem1 = 1.50d;
    var porcentagemDescontoItem1 = (precoItem1 - precoComDescontoItem1) / precoItem1;
    var valorDescontoItem1 = precoItem1 * porcentagemDescontoItem1;

    var idItem2 = 002;
    var categoriaItem2 = 2;
    var nomeItem2 = "Sanduíche de Presunto do Chaves";
    var descricaoItem2 = "Sanduíche de presunto simples, mas feito com muito amor.";
    var emPromocaoItem2 = true;
    var precoItem2 = 3.50d;
    var precoComDescontoItem2 = 2.99d;
    var porcentagemDescontoItem2 = (precoItem2 - precoComDescontoItem2) / precoItem2;
    var valorDescontoItem2 = precoItem2 * porcentagemDescontoItem2;

    IO.println(nomeItem1);
    IO.println(descricaoItem1);

    switch (categoriaItem1){
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

    if (emPromocaoItem1){
        IO.println("Preço de R$" + precoItem1 + " por R$" + precoComDescontoItem1);
        IO.println("Porcentagem com desconto: " + porcentagemDescontoItem1);
        IO.println("Valor do desconto: " + valorDescontoItem1);
        IO.println("Preço com desconto (calculado): " + (precoItem1 - valorDescontoItem1));
    } else {
        IO.println("Preço: " + precoItem1);
    }
}