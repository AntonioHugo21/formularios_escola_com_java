package MODEL;

public class Curso {
        private int id_curso;
	 
	private String nome_curso;
        
        private String status_curso;
	 
	private Aluno aluno;
        
        public Curso(int id_curso, String nome_curso, String status_curso){
            this.id_curso = id_curso;
            this.nome_curso = nome_curso;
            this.status_curso = status_curso;
        }
        
        public Curso(){
            
        }

    /**
     * @return the id_curso
     */
    public int getId_curso() {
        return id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    /**
     * @return the nome_curso
     */
    public String getNome_curso() {
        return nome_curso;
    }

    /**
     * @param nome_curso the nome_curso to set
     */
    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the status_curso
     */
    public String getStatus_curso() {
        return status_curso;
    }

    /**
     * @param status_curso the status_curso to set
     */
    public void setStatus_curso(String status_curso) {
        this.status_curso = status_curso;
    }
        
    
    

}
