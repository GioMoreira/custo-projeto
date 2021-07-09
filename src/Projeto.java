public class Projeto {
    private String nome;
    private double custoHora;
    private int horas;

    //Construtor

    public Projeto(String nome, double custoHora){
            this.nome = nome.trim();
            this.custoHora = custoHora;
    }

    //Métodos

    public void setNome(String nome){
        if (!nome.trim().equals("")){
            this.nome = nome;
        }
    }

    public void setCustoHora(double custoHora){
        if (custoHora >0){
            this.custoHora = custoHora;
        }else {
            System.out.println("Valor incorreto.");
        }
    }

    public void registarHoras(int qtdHoras){
         if (qtdHoras > 0) {
             this.horas = qtdHoras;
         } else {
             System.out.println("Valor Inválido!");
         }

     }

     public double getCustoAtual(){
        return this.custoHora * this.horas;
    }

    public String getNome(){
        return this.nome;
    }
}
