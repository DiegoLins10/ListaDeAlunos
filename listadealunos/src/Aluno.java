
/**
 * Classe lógica para Aluno
 * @author Andrea
 * @version 24/09/2020
 */
public class Aluno {
    private String nome;
    private String ra;
/**
 * Construtor
 * @param nome é o nome do aluno
 * @param ra é o registro acadêmico do aluno
 */
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }
/**
 * Método de acesso ao atributo nome
 * @return nome do aluno
 */
    public String getNome() {
        return nome;
    }
/**
 * Método modificador do atributo nome
 * @param nome é o novo nome do aluno
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * Método de acesso ao registro acadêmico do aluno
 * @return registro acadêmico
 */
    public String getRa() {
        return ra;
    }
/**
 * Método modificador do registro acadêmico
 * @param ra é o registro acadêmico do aluno
 */
    public void setRa(String ra) {
        this.ra = ra;
    }
/**
 * Método que retorna valor de todos atributos
 * @return string com o valor de todos atributos
 */
    @Override
    public String toString() {
        return "Nome=" + nome + ", RA=" + ra + '\n';
    }
}