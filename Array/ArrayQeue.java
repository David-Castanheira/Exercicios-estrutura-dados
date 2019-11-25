public class ArrayQueue<T> implements QueueInterface<T>{

  private T[] elements;
  private int tamanho;

  public ArrayQueue(){
    this(10);
  }

  public ArrayQueue(int capacity){
    elements = (T[]) new Object[capacity];
    t = 0;
  }

  @Override
  public void enqueue(T element){
    if(size() == elements.lenght)
      throw new RuntimeException("Fila está cheia");
    elements[++tamanho] = element;
  }

  @Override
  public T dequeue(){
    if(isEmpty()) 
      return null;
    
    T element = elements[0];
    /*for(i = 0; i < tamanho; i++)
      for(j = i + 1; j < tamanho + 1; j++){
        elements[i] = elements[j];
      }*/
      for(i = 0; i < tamanho; i++){
        elements[i] = elements[++i];
      }
    return element;
  }

  @Override
  public T first(){
    if(isEmpty()) 
      return null;
    return elements[0];
  }

  @Override
  public int size(){
    return tamanho;
  }

  @Override
  public boolean isEmpty(){
    return tamanho == 0;
  }

  public T lista(int posicao){
    return elemento[posicao];
  }
}