package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personagem implements Cloneable {
    private String nome;
    private int vida;
    private int mana;
    private int forca;
    private int defesa;
    private int velocidade;
    private int inteligencia;
    private int agilidade;
    private int resistencia;
    private int nivel;
    private int experiencia;
    private String classe;
    private String raca;
    private List<String> habilidades;
    private List<String> equipamentos;
    private List<String> armas;
    private String armadura;
    private double dinheiro;
    private List<String> inventario;

    public Personagem() {
        habilidades = new ArrayList<>();
        equipamentos = new ArrayList<>();
        armas = new ArrayList<>();
        inventario = new ArrayList<>();
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem clonePersonagem = (Personagem) super.clone();
        clonePersonagem.habilidades = new ArrayList<>(this.habilidades);
        clonePersonagem.equipamentos = new ArrayList<>(this.equipamentos);
        clonePersonagem.armas = new ArrayList<>(this.armas);
        clonePersonagem.inventario = new ArrayList<>(this.inventario);
        return clonePersonagem;
    }

    public void randomizarAtributos() {
        Random random = new Random();
        this.vida = random.nextInt(51) + 50;
        this.mana = random.nextInt(51) + 25;
        this.forca = random.nextInt(51) + 50;
        this.defesa = random.nextInt(51) + 50;
        this.velocidade = random.nextInt(51) + 50;
        this.inteligencia = random.nextInt(51) + 50;
        this.agilidade = random.nextInt(51) + 50;
        this.resistencia = random.nextInt(51) + 50;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<String> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<String> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<String> getArmas() {
        return armas;
    }

    public void setArmas(List<String> armas) {
        this.armas = armas;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public void setInventario(List<String> inventario) {
        this.inventario = inventario;
    }
}