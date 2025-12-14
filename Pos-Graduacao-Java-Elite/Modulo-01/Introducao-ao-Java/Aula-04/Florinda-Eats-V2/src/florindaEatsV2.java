// MÓDULO 01 - AULA 04 - VARIÁVEIS, OPERADORES E CONDICIONAIS

void main() {

    // ITEM 1
    var nomeItem1 = "Refresco do Chaves"; // String
    var descricaoItem1 = "Suco de limão que parece tamarindo e tem gosto de groselha."; // String
    var emPromocaoItem1 = false; // boolean
    var precoItem1 = 2.99; // double
    var idItem1 = 1; // int
    int categoriaItem1 = 4;

    // ITEM 2
    var nomeItem2 = "Sanduíche de Presunto do Chaves"; // String
    var descricaoItem2 = "Sanduíche de presunto simples mas feito com muito amor."; // String
    var emPromocaoItem2 = true; // boolean
    var precoItem2 = 3.50; // double
    var precoComDescontoItem2 = 2.99; // double
    var idItem2 = 2; // int
    int categoriaItem2 = 2;

    IO.println("=======");
    IO.println("arrays: ");
    double [] precoProduto = new double[7];
    precoProduto[0] = 2.99;
    precoProduto[1] = 3.50;
    precoProduto[2] = 12.99;
    precoProduto[3] = 4.99;
    precoProduto[4] = 2.50;
    precoProduto[5] = 4.99;
    precoProduto[6] = 25.90;

    boolean[] produtoEmPromocao = new boolean[] {false, true, true, true, true, true, false};

    IO.println("Preço do item 3: " + precoProduto[2]);
    IO.println("Tamanho do array: " + precoProduto.length);
    IO.println("Tamanho do array dos produtos em promoção: " + produtoEmPromocao.length);
    IO.println("O segundo item está em promoção? " + produtoEmPromocao[1]);

    IO.println("=======");
    IO.println("while: ");
    double totalDePrecos = 0.0;
    int i = 0; // inicialização de variável
    while (i < precoProduto.length) { // comparação
        // IO.println("rodou " + i);
        double preco = precoProduto[i];
        totalDePrecos = totalDePrecos + preco;
        // i = i + 1;
        i++; // incremento
    }
    IO.println("Soma dos precos: " + totalDePrecos);

    IO.println("=======");
    IO.println("do-while: ");
    int totalDeItensEmPromocao = 0; // inicialização de variável
    int j = produtoEmPromocao.length - 1;
    do {
        IO.println(j);
        if (produtoEmPromocao[j]) {
            totalDeItensEmPromocao++;
        } j--; // incremento/decremento
    } while (j >= 0); // comparação
    IO.println("Total de itens em promoção: " + totalDeItensEmPromocao);
}