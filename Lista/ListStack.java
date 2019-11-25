public class ListStack<T> implements StackInterface<T> {

  private ListaEncadeada<T> elements;

  @Override
  public void push(T element) {
    elements.adicionarInicio(element);  
  }

  @Override
  public T pop() {
    T element = elements.prmeiro();
    elements.removerInicio();
    return element;
  }

  @Override
  public T top() {
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