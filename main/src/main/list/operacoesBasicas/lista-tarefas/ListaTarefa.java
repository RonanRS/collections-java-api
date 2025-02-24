import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo do metodo a receber uma list
    private List<Tarefas> tarefasList;

    // Cpmstrutor para forçar o metodo iniciar com um Array vazio
    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefasList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterTotalTarefas(){
        return tarefasList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    // Metodo principal para testar os métodos
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.removeTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricoesTarefas();




    }
}
