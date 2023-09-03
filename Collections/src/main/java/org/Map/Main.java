package org.Map;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.now().plusDays(1), "Exemplo de Amanhã", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.now(), "Exemplo de hoje", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        System.out.println("Agenda completa");
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        System.out.println("Próxima Data: ");
        agendaEventos.obterProximoEvento();
    }
}
