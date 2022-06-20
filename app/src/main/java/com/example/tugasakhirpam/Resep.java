package com.example.tugasakhirpam;

public class Resep {
    private String id,name,bahan,proses;

    public Resep(){

    }

    public Resep(String name, String bahan, String proses){
        this.name = name;
        this.bahan = bahan;
        this.proses = proses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getProses() {
        return proses;
    }

    public void setProses(String proses) {
        this.proses = proses;
    }
}