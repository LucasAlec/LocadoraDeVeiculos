package entidades;

public class Veiculo {
    private String id;
    private Tipo tipo;
    private String placa;
    private String modelo;
    public boolean disponivel;

    public enum Tipo {
        MOTO(100),
        CARRO(150),
        CAMINHAO(200);

        private Integer valor;

        Tipo(Integer valor) {
            this.valor = valor;
        }

        public Integer getValor() {
            return valor;
        }
    }

    public Veiculo(String id, Tipo tipo, String placa) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.disponivel = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("============================").append("\n");
        sb.append("ID: ").append(id != null ? id : "N/A").append("\n");
        sb.append("Tipo: ").append(tipo).append("\n");
        sb.append("Modelo: ").append(modelo != null ? modelo : "N/A").append("\n");
        sb.append("Placa: ").append(placa).append("\n");
        sb.append("Valor da Diária: R$ ").append(tipo.getValor()).append("\n");
        sb.append("Disponível: ").append(disponivel ? "Sim" : "Não").append("\n");
        sb.append("============================");
        return sb.toString();
    }


}
