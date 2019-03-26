package com.example.opet.firebaseestudos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by opet on 25/03/2019.
 */

public class StarWars {
    @SerializedName("id")
    private long ID;
    private String nomeFilme;
    private String nomeDiretor;

    public StarWars() {
    }

    public StarWars(long ID, String nomeFilme, String nomeDiretor) {
        this.ID = ID;
        this.nomeFilme = nomeFilme;
        this.nomeDiretor = nomeDiretor;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    @Override
    public String toString() {
        return "StarWars{" +
                "ID=" + ID +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", nomeDiretor='" + nomeDiretor + '\'' +
                '}';
    }


}
