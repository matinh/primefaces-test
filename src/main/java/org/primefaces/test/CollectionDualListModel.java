package org.primefaces.test;

import org.primefaces.model.DualListModel;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionDualListModel<T>
    extends DualListModel<T>
    implements Collection<T>
{
    /** Auto-generated serial version id. */
    private static final long serialVersionUID = -7738838950081922731L;


    public CollectionDualListModel()
    {
        super();
    }

    public CollectionDualListModel(List<T> source, List<T> target)
    {
        super(source, target);
    }

    @Override
    public int size()
    {
        return getTarget() == null ? 0 : getTarget().size();
    }

    @Override
    public boolean isEmpty()
    {
        return getTarget() == null || getTarget().isEmpty();
    }

    @Override
    public boolean contains(Object o)
    {
        return getTarget() != null && getTarget().contains(o);
    }

    @Override
    public Iterator<T> iterator()
    {
        return getTarget().iterator();
    }

    @Override
    public Object[] toArray()
    {
        return getTarget().toArray();
    }

    @SuppressWarnings({ "SuspiciousToArrayCall" })
    @Override
    public <T1> T1[] toArray(T1[] t1s)
    {
        return getTarget().toArray(t1s);
    }

    @Override
    public boolean add(T t)
    {
        return getTarget().add(t);
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate)
    {
        return getTarget().removeIf(predicate);
    }

    @Override
    public boolean retainAll(Collection<?> collection)
    {
        return getTarget().retainAll(collection);
    }

    @Override
    public void clear()
    {
        if (getTarget() != null)
            getTarget().clear();
    }

    @Override
    public Stream<T> stream()
    {
        return getTarget().stream();
    }

    @Override
    public Stream<T> parallelStream()
    {
        return getTarget().parallelStream();
    }

    @Override
    public boolean remove(Object o)
    {
        return getTarget().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection)
    {
        return getTarget().containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection)
    {
        return getTarget().addAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection)
    {
        return getTarget().removeAll(collection);
    }
}
