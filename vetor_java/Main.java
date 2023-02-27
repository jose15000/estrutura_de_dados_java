
public class Main{
    public static void main (String[] args)
    {
        Vetor<Aluno> aluno = new Vetor<Aluno>(10);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("João");
        a2.setNome("Pedro");

        aluno.Add(a1,0);

        System.out.println(aluno.Length());
    }
}
