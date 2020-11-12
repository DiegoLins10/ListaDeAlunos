import javax.swing.*;
public class Main
{
    public static void main(String[] args) {
        //PilhaDeAlunos p1 = new PilhaDeAlunos(3);
        FilaDeAlunos f1 = new FilaDeAlunos(3);
		/*String menu = "Menu de Opções\n1 - Adicionar no início\n" +
		 "2 - Adicionar no final\n3 - Adicionar em posição específica\n"+
		 "4 - Remover do início\n5 - Remover do final\n" +
		 "6 - Remover de posição específica\n7 - Consultar lista completa\n"+
		 "99 - Sair";*/
        String menu = "Menu de Opções\n1 - Adicionar\n" +
        "2 - Remover\n3 - Consultar fila completa\n"+
        "99 - Sair";
        int op=0;
        String mensagem,valor, nome;
        Aluno a=null;
	while (op != 99){
	    op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                        case 1:
                            valor =JOptionPane.showInputDialog("RA ?");
                            nome =JOptionPane.showInputDialog("Nome ?");
                            //p1.empilha(new Aluno(nome,valor));
                            f1.adiciona(new Aluno(nome,valor));
                            break;
                        case 2:
                        /*    valor =JOptionPane.showInputDialog("RA ?");
                            nome =JOptionPane.showInputDialog("Nome ?");
                            l1.adicionaFinal(new Aluno(nome,valor));
                            break;
                        case 3:
                        case 4:
                        case 5:
                             a = l1.removeFinal();
                             a=p1.desempilha();*/
                            a=f1.remove();
                            JOptionPane.showMessageDialog(null, "Aluno removido: "+ 
                                    a.toString());
                            break;
                        //case 6:
                        //      break;
                        //case 7:
                        case 3:
                            //mensagem=p1.toString();
                            mensagem=f1.toString();
                            if (mensagem.isEmpty())
                                JOptionPane.showMessageDialog(null, "Pilha Vazia");
                            else
                                JOptionPane.showMessageDialog(null, mensagem);
                    }
		}
	}
}