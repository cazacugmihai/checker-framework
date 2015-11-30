package java.util;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.checker.lock.qual.*;

// Subclasses of this interface/class may opt to prohibit null elements
public abstract class AbstractSet<E extends Object> extends AbstractCollection<E> implements Set<E> {
  protected AbstractSet() {}
   public boolean equals(@GuardSatisfied AbstractSet<E> this,@GuardSatisfied Object a1) { throw new RuntimeException("skeleton method"); }
   public int hashCode(@GuardSatisfied AbstractSet<E> this) { throw new RuntimeException("skeleton method"); }
  public boolean removeAll(Collection<?> a1) { throw new RuntimeException("skeleton method"); }
}