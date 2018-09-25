package Sistema;

public class Main {

    public static void main(String[] args) {
        DigitalHouseManager dHM = new DigitalHouseManager();

        dHM.registrarCurso("Android", 20002, 2);
            dHM.registrarProfessorTitular("Tadashi", "-Ta", 50001, "Asiático");
            dHM.registrarProfessorAdjunto("Guilherme", "Sartori", 50002, 2);
        dHM.alocarProfessores(20002, 50001, 50002);

        dHM.registrarCurso("Full Stack", 20001, 3);
            dHM.registrarProfessorTitular("Alexandre", "Beard", 50003, "Barba maneira");
            dHM.registrarProfessorAdjunto("Hendy", "Faucon", 50004, 4);
        dHM.alocarProfessores(20001, 50003, 50004);

        dHM.registrarAluno("Tyo", "Drak", 10001);
        dHM.registrarAluno("Binho", "Rubinho", 10002);
        dHM.registrarAluno("Rafa", "Fafa", 10003);
        dHM.registrarAluno("Po", "Lala", 10004);
        dHM.registrarAluno("Caue", "Rain", 10005);

        dHM.matricularAluno(10001, 20002);
        dHM.matricularAluno(10002, 20002);
        dHM.matricularAluno(10003, 20002);

        System.out.println(dHM.buscarCursoPorCodigo(20002).getListaDeAlunosMatriculados().get(0).getNome());
        System.out.println(dHM.buscarCursoPorCodigo(20002).getListaDeAlunosMatriculados().get(0).printNomesCursos());
        System.out.println(dHM.buscarCursoPorCodigo(20002).getListaDeAlunosMatriculados().get(1).getNome());


    }

}
