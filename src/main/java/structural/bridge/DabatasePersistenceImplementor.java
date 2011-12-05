package structural.bridge;

public class DabatasePersistenceImplementor implements PersistenceImplementor {

	public DabatasePersistenceImplementor() {

		// load database driver

	}

	@Override
	public void deleteObject(long objectId) {

		// open database connection
		// remove record

	}

	@Override
	public Object getObject(long objectId) {

		// open database connection
		// read records
		// create object from record
		return null;
	}

	@Override
	public long saveObject(Object object) {

		// open database connection
		// create records for fields inside the object

		return 0;
	}

}
