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
        
    }
}
