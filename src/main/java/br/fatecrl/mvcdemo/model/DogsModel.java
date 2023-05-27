package br.fatecrl.mvcdemo.model;

public class DogsModel {
    private String nome;
    private String type; //raça
    private int age;
    private String size;
    private String mood;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public DogsModel(String nome, String type, int age, String size, String mood) {
        this.nome = nome;
        this.type = type;
        this.age = age;
        this.size = size;
        this.mood = mood;
    }
}
