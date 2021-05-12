/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author vinys
 */
public class Lutador {
    private String nome, nacionalidade;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    private String categoria;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, 
                   int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);   
    }
    
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " m");
        System.out.println("Peso: " + this.getPeso() + " Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }
    public void status(){
         System.out.println("Nome: " + this.getNome());
         System.out.println("Peso: " + this.getPeso() + " Kg");
         System.out.println("Categoria: " + this.getCategoria());
         System.out.println("Vitórias: " + this.getVitorias());
         System.out.println("Empates: " + this.getEmpates());
         System.out.println("Derrotas: " + this.getDerrotas());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2f) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <=70.3f) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 102.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
}
