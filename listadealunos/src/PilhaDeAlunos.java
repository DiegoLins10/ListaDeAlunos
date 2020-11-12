/**
 * Esta classe controla uma pilha com alunos - LIFO
 * @author Andrea
 * @version 24/09/2020
 */
public class PilhaDeAlunos {
    private Aluno dados[];
    private int topo;
    /**
     * Construtor
     * @param capMax capacidade máxima da pilha 
     */
    public PilhaDeAlunos(int capMax){
        dados = new Aluno[capMax];
        topo = -1;
    }
    /**
     * Método que adiciona novo aluno no topo da pilha
     * @param e é o novo aluno
     */
    public void empilha(Aluno e){
        if (topo+1 == dados.length){
            System.out.println("ERRO! Pilha Cheia");
        } else {
            dados[++topo]=e;
            //dados[topo=topo+1]=e
            //dados[topo++]= e; provoca erro quando a pilha 
            //está vazia
        }
    }
    /**
     * Método que desempilha um elemento
     * @return aluno removido da pilha
     */
    public Aluno desempilha(){
        Aluno r = null;
        if(topo == -1){
            System.out.println("ERRO! Pilha Vazia");
        }else {
            r = dados[topo--];
        }
        return r;
    }
    /**
     * Método que retorna todos os elementos da Pilha
     * @return String com todos os elementos da Pilha
     */
    public String toString(){
        String s="";
        for (int i=topo;i>=0;i--)
            s = s + " " + dados[i].toString();
        return s;
    }
}
