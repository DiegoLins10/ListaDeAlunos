/**
 * Classe controla a lista de alunos
 * @author Andréa
 * @version 24/09/2020
 */
public class ListaDeAlunos {
    private Aluno dados[ ];
    private int tamanho;
    /**
     * Construtor
     * @param capMax capacidade máxima da lista 
     */
    public ListaDeAlunos (int capMax){
        dados = new Aluno[capMax];
    }
   /**
    * Método que adiciona novo aluno no início da lista
    * @param e é o novo aluno
    */ 
   public void adicionaInicio(Aluno e){
       if (dados.length != tamanho) {
           for (int i = tamanho; i>=1; i--){
               dados[i] = dados[i-1];
           }
           dados[0]=e;
           tamanho++;
       }else{
           System.out.println("ERRO! Lista Cheia");
       }
   }
    /**
     * Método que remove o aluno do início da lista
     * @return aluno removido
     */
    public Aluno removeInicio(){
       Aluno r = null; 
       if (tamanho !=0) {
           r = dados[0];
           for (int i = tamanho; i>=1; i--){
               dados[i] = dados[i+1];
           }
           tamanho--;
       }else{
           System.out.println("ERRO! Lista Cheia");
       }
       return r;
   }
    /**
     * Método que adiciona novo aluno no final da lista
     * @param e é o novo aluno
     */
   public void adicionaFinal (Aluno e){
        if (dados.length != tamanho) {
            // não está cheia
            dados[tamanho] = e;
            tamanho = tamanho + 1;
        } else {
            //sim está cheia
            System.out.println("ERRO! Lista Cheia");
        }
    }
    /**
     * Método que remove aluno do final da lista
     * @return aluno removido
     */
   public Aluno removeFinal (){
        Aluno r = null;
        if (tamanho != 0) {
            // não está vazia
            r = dados[tamanho-1] ;
            tamanho = tamanho - 1;
        } else {
            //sim está vazia
            System.out.println("ERRO! Lista Vazia");
        }
        return r;
    }
    /**
     * Método que retorna o valor dos atributos da classe
     * @return String com o valor dos atributos
     */    
    public String toString(){
        String r = "";
        for (int i=0;i<tamanho;i++){
            r = r + dados[i].toString() + " ";
        }
        r = r + "\nTotal de elementos: "+tamanho;
        return r;
    }
}