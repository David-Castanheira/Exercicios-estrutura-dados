class Main {
  public static void main(String[] args) {
    
    QueueInterface<String> fila1 = new ArrayQueue<>(10);

    fila1.enqueue("David Castanheira");
    fila1.enqueue("victor mendes");
    fila1.enqueue("Camila Batista");
    fila1.enqueue("Gabrielle Maia");

    fila1.dequeue();

    System.out.println(fila1.lista(0)); 

  }
}