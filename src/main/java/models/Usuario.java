package models;
import jakarta.persistence.*;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String nome;
    private String email;
    private String senha;

    public Usuario(int usuario_Id, String nome, String email, String senha) {
        this.Id = usuario_Id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public Usuario(){}
}
