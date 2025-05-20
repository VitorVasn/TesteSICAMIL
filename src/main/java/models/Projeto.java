package models;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Projeto")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String nome;
    private String descricao;
    private LocalDate DataInicio;
    private LocalDate dataPrevistaFim;

    public Projeto(int projeto_Id, String nome, String descricao, LocalDate dataInicio, LocalDate dataPrevistaFim) {
        Id = projeto_Id;
        this.nome = nome;
        this.descricao = descricao;
        DataInicio = dataInicio;
        this.dataPrevistaFim = dataPrevistaFim;

    }
}
