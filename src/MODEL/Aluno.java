/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author anton
 */
public class Aluno {	 
	private int id_aluno;
    
        private int matricula_aluno;
	 
	private String nome_aluno;
	 
	private String cpf_aluno;
	 
	private Date data_nasc_aluno;
	 
	private Curso curso;
        
        public Aluno(int id_aluno, int matricula_aluno, String nome_aluno, String cpf_aluno, Date data_nasc_aluno, Curso curso){
            this.id_aluno = id_aluno;
            this.matricula_aluno = matricula_aluno;
            this.nome_aluno = nome_aluno;
            this.cpf_aluno = cpf_aluno;
            this.data_nasc_aluno = data_nasc_aluno;
            this.curso = curso;
        }
        
        public Aluno(){
            
        }
        
        
        
        public int getId_aluno() {
            return id_aluno;
        }
        
        public void setId_aluno (int id_aluno) {
            this.id_aluno = id_aluno;
        }

    
    public int getMatricula_aluno() {
        return matricula_aluno;
    }

    
    public void setMatricula_aluno(int matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    
    public String getNome_aluno() {
        return nome_aluno;
    }

    
    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    
    public String getCpf_aluno() {
        return cpf_aluno;
    }

    
    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    
    public Date getData_nasc_aluno() {
        return data_nasc_aluno;
    }

    
    public void setData_nasc_aluno(Date data_nasc_aluno) {
        this.data_nasc_aluno = data_nasc_aluno;
    }

   
    public Curso getCurso() {
        return curso;
    }

    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
        
        
        
}
