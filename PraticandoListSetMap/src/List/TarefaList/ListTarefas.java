package List.TarefaList;

import java.util.ArrayList;
import java.util.List;

public class ListTarefas {
    private List<Tarefa> tarefas;

    public ListTarefas() {
        this.tarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaList = new ArrayList<>();
        if(!this.tarefas.isEmpty()){
            for(Tarefa objRef : tarefas){
                if(objRef.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaList.add(objRef);
                }
            }
            this.tarefas.removeAll(tarefaList);
            System.out.println("Tarefas removidas");
        }else {
            System.out.println("Tarefas vazia");
        }
    }
    public void obterNumeroTotalTarefas(){
        System.out.println("Numero total de tarefas: "+this.tarefas.size());
    }
    public void obterDescricoesTarefas(){
        tarefas.forEach(objRef -> System.out.println(objRef.getDescricao()));
    }
}
