package com.example.opet.firebaseestudos;

import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("id")
    private long ID;
    private String nomeFilme;
    private String nomeDiretor;

    public Results() {
    }

    public Results(long ID, String nomeFilme, String nomeDiretor) {
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
        return "Results{" +
                "ID=" + ID +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", nomeDiretor='" + nomeDiretor + '\'' +
                '}';
    }
}
