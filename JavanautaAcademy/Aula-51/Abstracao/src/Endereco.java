/*
Java OOP

OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

OOP is ideal for building scalable, reusable, and maintainable code.

Object-oriented programming has several advantages over procedural programming:
- OOP provides a clear structure for the programs;
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug;
- OOP makes it possible to create full reusable applications with less code and shorter development time

Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
*/

/*
Java Abstraction

Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.

Abstração envolve a criação de classes que representam entidades do mundo real com suas propriedades e comportamentos mais relevantes, ignorando os detalhes que não são importantes para o contexto específico.

Objetivo: Simplificar a complexidade do sistema, tornando mais fácil para desenvolvedores entenderem e utilizarem os objetivos sem se preocuparem com os detalhes internos.

Identificação dos Aspectos Essenciais: Determine quais atributos e métodos são relevantes para a entidade que você está modelando.

Ocultação de Detalhes Complexos: Oculte a implementação dos métodos, fornecendo apenas a assinatura do método (no caso de métodos abstratos) ou uma interface que define os métodos que a classe deve implementar.

Fornecimento de uma Interface Simples: Exponha apenas os métodos...
*/

/*
Interfaces x Classe Abstrata

- Interface: é um contrato. Quando uma classe extende uma interface, é obrigatório a implementar todos os métodos dentro da interface.

- Classe Abstrata: não é um contrato. Pode-se implementar os métodos que forem importantes ou que fazem sentido para o projeto.
*/

public abstract class Endereco {

    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {
    }

    // Constructor for Funcionario class
    public Endereco(String rua, String numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Constructor for Cliente class
    public Endereco(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void mostrarEndereco(){
        System.out.println("Endereço: " + rua + ", nº " + numero + ", " + cidade + ", " + estado + ", CEP: " + cep);
    }
}