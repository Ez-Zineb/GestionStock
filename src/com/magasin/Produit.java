package com.magasin;

public class Produit {

    private String nom;
    private double prix;
    private String marque;
    private Type type;
    private int stock;

    public Produit(String nom, double prix, String marque, Type type, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.marque = marque;
        this.type = type;
        this.stock = stock;
    }


}
