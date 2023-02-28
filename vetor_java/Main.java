import javax.swing.GroupLayout.Alignment;
import javax.xml.transform.Source;

public class Main{
    public static void main (String[] args)
    {
        Vetor<Aluno> aluno = new Vetor<Aluno>(3);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("José");
        a2.setNome("Pedro");

        aluno.Add(a1, 0);
        aluno.Add(a2, 1);
  
        
        System.out.println("Aluno:" + aluno.recuperar(0).getNome() + "\n" + "Existe dado: " + aluno.existeDado(0) + "\n" + "Tamanho do vetor: " + aluno.Length() + "\n" 
        + "Está vazia: " + aluno.vazio() + "\n");
        }
        
    }

