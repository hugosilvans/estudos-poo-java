package Atividade1;

/** Agrega os dados de hardware e software do exercício de composição. */
public class Computador {
    public Integer MemoriaRAM;
    public Integer SSD;
    public Integer Nucleos;
    public Float OperacoesPorSegundo;

    public Computador(Integer MemoriaRAM, Integer SSD, Integer Nucleos, Float OperacoesPorSegundo) {
        this.MemoriaRAM = MemoriaRAM;
        this.SSD = SSD;
        this.Nucleos = Nucleos;
        this.OperacoesPorSegundo = OperacoesPorSegundo;
    }

    // Getters ae Setters

    public Integer getMemoriaRAM() { return MemoriaRAM; }

    public void setMemoriaRAM(Integer MemoriaRAM) { this.MemoriaRAM = MemoriaRAM; }

    public Integer getSSD() { return SSD; }

    public void setSSD(Integer SSD) { this.SSD = SSD; }

    public Integer getNucleos() { return Nucleos; }

    public void setNucleos(Integer Nucleos) { this.Nucleos = Nucleos; }

    public Float getOperacoesPorSegundo() { return OperacoesPorSegundo; }

    public void setOperacoesPorSegundo(Float OperacoesPorSegundo) {
        this.OperacoesPorSegundo = OperacoesPorSegundo;
    }
}