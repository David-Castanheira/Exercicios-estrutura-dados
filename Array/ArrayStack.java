public class ArrayStack<T> implements StackInterface<T>{

  private T[] elements;
  private int t;

  public ArrayStack(){
    this(10);
  }

  public ArrayStack(int capacity){
    elements = (T[]) new Object[capacity];
    t = -1;
  }

  @Override
  public void push(T element){
    if(size() == elements.lenght)
      throw new RuntimeException("Pilha está cheia");
    elements[++t] = element;
  }

  @Override
  public T pop(){
    if(isEmpty()) return null;
    T element = elements[t];
    t--;
    return element;
  }

  @Override
  public T top(){
    if(isEmpty()) 
      return null;
    return elements[t];
  }

  @Override
  public int size(){
    return t+1;
  }

  @Override
  public boolean isEmpty(){
    return t == -1;
  }
}