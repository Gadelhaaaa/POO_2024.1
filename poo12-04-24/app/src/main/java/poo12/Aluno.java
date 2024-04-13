package poo12;

import java.time.LocalDate;

public class Aluno {
    private String Nome;
    private String Matricula;
    private String Curso;
    private String Telefone;
    private String Email;
    private LocalDate dataNascimento;
    public Aluno(String nome, String matricula, String curso, String telefone, String email, LocalDate dataNascimento) {
        Nome = nome;
        Matricula = matricula;
        Curso = curso;
        Telefone = telefone;
        Email = email;
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return "Aluno [Nome=" + Nome + ", Matricula=" + Matricula + ", Curso=" + Curso + ", Telefone=" + Telefone
                + ", Email=" + Email + ", dataNascimento=" + dataNascimento + "]";
    }

    
}
