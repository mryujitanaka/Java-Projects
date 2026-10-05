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

    var idItem3 = 003;
    var categoriaItem3 = 2;
    var nomeItem3 = "Torta de Frango da D. Florinda";
    var descricaoItem3 = "Torta de frango com recheio cremoso e massa crocante.";
    var emPromocaoItem3 = true;
    var precoItem3 = 12.99d;
    var precoComDescontoItem3 = 10.99d;
    var porcentagemDescontoItem3 = (precoItem3 - precoComDescontoItem3) / precoItem3;
    var valorDescontoItem3 = precoItem3 * porcentagemDescontoItem3;

    var idItem4 = 004;
    var categoriaItem4 = 1;
    var nomeItem4 = "Pipoca do Quico";
    var descricaoItem4 = "Balde de pipoca preparado com carinho pelo Quico.";
    var emPromocaoItem4 = true;
    var precoItem4 = 4.99d;
    var precoComDescontoItem4 = 3.99d;
    var porcentagemDescontoItem4 = (precoItem4 - precoComDescontoItem4) / precoItem4;
    var valorDescontoItem4 = precoItem4 * porcentagemDescontoItem4;

    var idItem5 = 005;
    var categoriaItem5 = 4;
    var nomeItem5 = "Água de Jamaica";
    var descricaoItem5 = "Água aromatizada com hibisco e toque de açúcar.";
    var emPromocaoItem5 = true;
    var precoItem5 = 2.50d;
    var precoComDescontoItem5 = 2.00d;
    var porcentagemDescontoItem5 = (precoItem5 - precoComDescontoItem5) / precoItem5;
    var valorDescontoItem5 = precoItem5 * porcentagemDescontoItem5;

    var idItem6 = 006;
    var categoriaItem6 = 3;
    var nomeItem6 = "Churros do Chaves";
    var descricaoItem6 = "Churros recheados com doce de leite, clássicos e irresistíveis.";
    var emPromocaoItem6 = true;
    var precoItem6 = 4.99d;
    var precoComDescontoItem6 = 3.99d;
    var porcentagemDescontoItem6 = (precoItem6 - precoComDescontoItem6) / precoItem6;
    var valorDescontoItem6 = precoItem6 * porcentagemDescontoItem6;

    var idItem7 = 007;
    var categoriaItem7 = 2;
    var nomeItem7 = "Tacos de Carnitas";
    var descricaoItem7 = "Tacos recheados com carne tenra.";
    var emPromocaoItem7 = false;
    var precoItem7 = 25.90d;
    var precoComDescontoItem7 = 20.90d;
    var porcentagemDescontoItem7 = (precoItem7 - precoComDescontoItem7) / precoItem7;
    var valorDescontoItem7 = precoItem7 * porcentagemDescontoItem7;

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

    IO.println();

    double[] precos = new double[7];

    precos[0] = 2.99d;
    precos[1] = 3.50d;
    precos[2] = 12.99d;
    precos[3] = 4.99d;
    precos[4] = 2.50d;
    precos[5] = 4.99d;
    precos[6] = 25.90d;

    boolean[] emPromocao = {false, true, true, true, true, true, false};

    IO.println("O preço do item " + idItem3 + " é: R$" + precos[2]);
    IO.println("Tamanho do array: " + precos.length);
    IO.println("Tamanho do array emPromocao: " + emPromocao.length);
    IO.println("O item " + idItem2 + " está em promoção? " + emPromocao[1]);
}