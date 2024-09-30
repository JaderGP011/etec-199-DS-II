package exemplo;

public class Main {
    public static void main(String[] args) {
        Aluno aluno  = new Aluno("Rafael", "Rua 10", "(11)99999-3333", "2344");
        aluno.apresentar();

        System.err.println("----------------------------");
        
        Professor professor = new Professor("Thayani", "Rua 3", "(11) 98888-2222", "TPA");
        professor.apresentar();
        
        System.err.println("----------------------------");

        //Interface não tem construtor e não pode ser instanciado
        //Pessoa pessoa  = new pessoa();
        
        Pessoa pessoa = new Professor("Thayani", "Rua 3", "(11) 98888-2222", "TPA");
        pessoa.apresentar();

        System.err.println("----------------------------");
        
        pessoa = new Aluno("Rafael", "Rua 10", "(11)99999-3333", "2344");
        pessoa.apresentar();
        
        System.err.println("----------------------------");
    }
}
