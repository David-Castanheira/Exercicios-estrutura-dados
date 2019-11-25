public class ListQueue<T> implements QueueInterface<T> {

  private ListaEncadeada<T> elements;

  @Override
  public void enqueue(T element) {
    elements.adicionarFim(element);  
  }

  @Override
  public T dequeue() {
    T element = elements.prmeiro();
    elements.removerInicio();
    return element;
  }

  @Override
  public T first() {
    return elements.primeiro();
  }

  @Override
  public int size(){
    return elements.tamanho();
  }

  @Override
  public boolean isEmpty(){
    return elements.vazia();
  }
}