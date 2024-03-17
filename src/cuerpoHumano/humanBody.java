
package cuerpoHumano;

public class humanBody {
    
    String tipoSangre;
   String tonoPiel;
   String sexo;
   
   public Pulmon pulmon = new Pulmon();
   public Higado higado = new Higado();
   public Corazon corazon = new Corazon();
   public Apendice apendice = new Apendice();

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTonoPiel() {
        return tonoPiel;
    }

    public void setTonoPiel(String tonoPiel) {
        this.tonoPiel = tonoPiel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }
}

   