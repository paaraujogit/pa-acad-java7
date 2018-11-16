package pt.barreirosvj.informações;

/**
 * Informação sobre o editor e criador do jogo
 * 
 */

public class InfoEdição {
    private String criador;
    private String editor;
    private String distribuidor;
    private int anoSaída;
    private int mêsSaída;
    private String modelo;
        //edição limitada? Normal? Coleccionador?
    
    /*InfoEdição (String criador, String editor, String distribuidor, int anoSaída, int mêsSaída, String modelo) {
        this.criador = criador;
        this.editor = editor;
        this.distribuidor = distribuidor;
        this.anoSaída = anoSaída;
        this.mêsSaída = mêsSaída;
        this.modelo = modelo;
    }*/
    InfoEdição (String criador, String editor) {
        this.criador = criador;
        this.editor = editor;
        }

    /**
     * @return the criador
     */
    public String getCriador() {
        return criador;
    }

    /**
     * @return the editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @return the distribuidor
     */
    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * @return the anoSaída
     */
    public int getAnoSaída() {
        return anoSaída;
    }

    /**
     * @return the mêsSaída
     */
    public int getMêsSaída() {
        return mêsSaída;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param criador the criador to set
     */
    public void setCriador(String criador) {
        this.criador = criador;
    }

    /**
     * @param editor the editor to set
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @param distribuidor the distribuidor to set
     */
    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    /**
     * @param anoSaída the anoSaída to set
     */
    public void setAnoSaída(int anoSaída) {
        this.anoSaída = anoSaída;
    }

    /**
     * @param mêsSaída the mêsSaída to set
     */
    public void setMêsSaída(int mêsSaída) {
        this.mêsSaída = mêsSaída;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}