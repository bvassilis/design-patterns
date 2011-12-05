package structural.bridge;

public class PersistenceImp implements Persistence {

	private PersistenceImplementor implementor = null;

	public PersistenceImp(PersistenceImplementor imp) {

		this.implementor = imp;

	}

	@Override
	public void deleteById(String id) {

		implementor.deleteObject(Long.parseLong(id));

	}

	@Override
	public Object findById(String objectId) {

		return implementor.getObject(Long.parseLong(objectId));
	}

	@Override
	public String persist(Object object) {

		return Long.toString(implementor.saveObject(object));

	}

}
