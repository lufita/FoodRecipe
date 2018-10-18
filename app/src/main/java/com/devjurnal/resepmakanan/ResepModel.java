package com.devjurnal.resepmakanan;

/**
 * Created by vfxstudio on 9/19/17.
 */

public class ResepModel {
    private String Judul;
    private int Poster;
    private String Detail;
    private String Summary;


    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public int getPoster() {
        return Poster;
    }

    public void setPoster(int poster) {
        Poster = poster;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }
}
