package Control;

import Model.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Anderson Silva", "andersonsilva@ibmec.com", "Mestrado em Ti", "Engenharia de dados");
        Instrutor instrutor2 = new Instrutor("Talita Vieira", "talitavieira.com", "Doutorado em computação", "Poo");
        Organizador organizador = new Organizador("Thiago Souza", "thiagosouza@ibmec.com", "Coordenador de computação");

        Auditorio auditorioPrincipal = new Auditorio("Auditório premium", 100, "Bloco A", true, false);
        Sala sala201 = new Sala("Sala de Aula 302", 35, "Bloco B", 307, true);
        Laboratorio labInformatica = new Laboratorio("LabInfo I", 20, "Bloco C", 20, "informática");
        Palestra palestraTI = new Palestra("Tecnologia da informação", "12/06/2025", 2, 5000.00, auditorioPrincipal, "Alan Turing", "alanturing@gmail.com", "MIT");

        List<Instrutor> instrutoresMinicurso = new ArrayList<>();
        instrutoresMinicurso.add(instrutor1);
        instrutoresMinicurso.add(instrutor2);
        List<String> materiais = new ArrayList<>();

        materiais.add("Notebooks");
        materiais.add("Mouse e teclado");

        Minicurso minicursoRedes = new Minicurso("TIC", "13/06/2025", 8, 2500.00, labInformatica, instrutoresMinicurso, materiais);
        Seminario seminarioTCC = new Seminario("Seminário de TCCs", "14/06/2025", 4, 500.00, sala201, "Arquitetura de computadores", "Pedro Silva", "Clayton Silva");

        Participante p1 = new Participante("João", "111.111.111-11", "joao@gmail.com", "ADS");
        Participante p2 = new Participante("Vanessa", "222.222.222-22", "vanessa@gmail.com", "CDIA");
        Participante p3 = new Participante("Marcus", "333.333.333-33", "marcus@email.com", "Eng de Software");

        palestraTI.inscreverParticipante(p1);
        palestraTI.inscreverParticipante(p2);
        seminarioTCC.inscreverParticipante(p1);
        minicursoRedes.inscreverParticipante(p3);

        System.out.println("\nDetalhes e Inscritos por Evento:");

        System.out.println("\nPalestra: " + palestraTI.getTitulo());
        System.out.println("Palestrante: " + palestraTI.getNomePalestrante() + ", " + palestraTI.getInstituicaoPalestrante());
        System.out.println("Inscritos: " + palestraTI.getInscritos());

        System.out.println("\nSeminário: " + seminarioTCC.getTitulo());
        System.out.println("Tema: " + seminarioTCC.getTema());
        System.out.println("Apresentador: " + seminarioTCC.getNomeAlunoApresentador());
        System.out.println("Inscritos: " + seminarioTCC.getInscritos());

        System.out.println("\nMinicurso: " + minicursoRedes.getTitulo());
        System.out.println("Instrutores: " + minicursoRedes.getInstrutores());
        System.out.println("Materiais necessários: " + minicursoRedes.getMateriaisApoio());
        System.out.println("Inscritos: " + minicursoRedes.getInscritos());
    }
}