/**
 * Classe que controla uma fila de alunos - FIFO
 * @author Diego Lins
 * @version 24/09/2020
 */
public class FilaDeAlunos {
    private Aluno dados[];
    private int tamanho;
    /**
     * Construtor
     * @param capMax capacidade máxima da Fila 
     */
    public FilaDeAlunos(int capMax){
        dados= new Aluno[capMax];
    }
    /**
     * Metodo que adiciona um novo elemento no final da fila
     * @param  novo aluno
     */
    public void adiciona(Aluno e){
        if (dados.length==tamanho){
            System.out.println("ERRO! Fila Cheia");
        }
        else{
            dados[tamanho++]=e;
        }
    }
    /**
     * Remove o primeiro elemento da Fila
     * @return aluno removido
     */
    public Aluno remove(){
        Aluno r = null;
        if (tamanho == 0)
            System.out.println("ERRO! Fila Vazia");
        else{
            r = dados[0];
            for(int i=1;i<tamanho;i++)
                dados[i-1]=dados[i];
            tamanho--;
        }
        return r;
    }
    /**
     * Metodo que retorna todos os alunos da fila
     * @return String com os dados de todos os alunos
     */
    public String toString(){
        String s="";
        for (int i=0;i<tamanho;i++)
            s = s + " " + dados[i].toString();
        return s;
    }
}
