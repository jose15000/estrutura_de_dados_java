
public class Main{
    public static void main (String[] args)
    {
        Vetor<Aluno> aluno = new Vetor<Aluno>(1);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        aluno.Add(a1, 0);

        

        System.out.println("Aluno:" + aluno.recuperar(0).getNome() + "\n" + "Existe dado: " + aluno.existeDado(0) + "\n" + "Tamanho do vetor: " + aluno.Length() + "\n" 
        + "Está vazia: " + aluno.vazio());
        }
    }

