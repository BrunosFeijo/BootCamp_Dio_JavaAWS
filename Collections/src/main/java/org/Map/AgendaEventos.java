package org.Map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao)    {
        eventosMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()             ) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento +
                    ", Evento: " + evento.getNome() +
                    ", Atração: " + evento.getAtracao());
        }
    }
    public void obterProximoEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual)){
//                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento.getNome() +
                        " acontecerá na data " + dataAtual);
                return;
            } else if (dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento.getNome() +
                        " acontecerá na data " + proximaData);
                return;
            }
        }
        System.out.println("Não há eventos futuros na agenda.");
    }
}
