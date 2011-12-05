package creational.pool;

import java.util.ArrayList;
import java.util.List;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 3, 2011
 * 
 * @author moleksyuk
 * @param <E>
 */
public abstract class ObjectPool<E> {

	protected List<E> pool;
	protected int instanceCount;
	protected int maxInstances;

	protected abstract E createObject();

	public ObjectPool() {
		this(Integer.MAX_VALUE);
	}

	public ObjectPool(int maxInstances) {
		this.maxInstances = maxInstances;
		pool = new ArrayList<E>();
	}

	public int getSize() {
		synchronized (pool) {
			return pool.size();
		}
	}

	public int getInstancesCount() {
		return instanceCount;
	}

	public int getMaxInstances() {
		return maxInstances;
	}

	public void setMaxInstances(int newValue) {
		maxInstances = newValue;
	}

	public E getObject() {
		synchronized (pool) {
			E thisObject = removeObject();
			if (thisObject != null) {
				return thisObject;
			}
			if (getInstancesCount() < getMaxInstances()) {
				return createObject();
			} else {
				return null;
			}
		}
	}

	public E waitForObject() throws InterruptedException {
		synchronized (pool) {
			E thisObject = removeObject();
			if (thisObject != null) {
				return thisObject;
			}
			if (getInstancesCount() < getMaxInstances()) {
				return createObject();
			} else {
				do {
					pool.wait();
					thisObject = removeObject();
				} while (thisObject == null);
				return thisObject;
			}
		}
	}

	private E removeObject() {
		while (pool.size() > 0) {
			E thisObject = pool.remove(pool.size() - 1);
			if (thisObject != null) {
				return thisObject;
			}
			instanceCount--;
		}
		return null;
	}

	public void release(E obj) {
		if (obj == null) {
			throw new NullPointerException();
		}
		synchronized (pool) {
			pool.add(obj);
			pool.notify();
		}
	}
}
