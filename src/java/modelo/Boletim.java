/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 2017101680
 */
public class Boletim {

    private float av1, av2, av3, media;
    private String status;

    public Boletim(float av1, float av2, float av3) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public float media() {

        this.calcular().checke();
        return media;
    }

    public Boletim checke() {

        status = (media >= 7) ? "APROVADO" : "REPROVADO";
        return this;
    }

    public Boletim calcular() {

        if (av1 >= av2) {
            if (av2 > av3) {
                media = (av1 + av2) / 2;
                return this;
            }
            media = (av1 + av3) / 2;
            return this;
        }
        media = (av3 + av2) / 2;
        return this;

    }

    /**
     * @return the av1
     */
    public float getAv1() {
        return av1;
    }

    /**
     * @param av1 the av1 to set
     */
    public void setAv1(float av1) {
        this.av1 = av1;
    }

    /**
     * @return the av2
     */
    public float getAv2() {
        return av2;
    }

    /**
     * @param av2 the av2 to set
     */
    public void setAv2(float av2) {
        this.av2 = av2;
    }

    /**
     * @return the av3
     */
    public float getAv3() {
        return av3;
    }

    /**
     * @param av3 the av3 to set
     */
    public void setAv3(float av3) {
        this.av3 = av3;
    }
       public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
