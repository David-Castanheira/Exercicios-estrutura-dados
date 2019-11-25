public interface QueueInterface<T> {
  public void enqueue(T element);
  public T dequeue();
  public T first();
  public int size();
  public boolean isEmpty();
}