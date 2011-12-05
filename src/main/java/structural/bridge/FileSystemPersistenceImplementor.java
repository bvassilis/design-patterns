package structural.bridge;

import java.io.File;

public class FileSystemPersistenceImplementor implements PersistenceImplementor {

	@Override
	public void deleteObject(long objectId) {

		File f = new File("/persistence/" + Long.toString(objectId));

		f.delete();

		return;
	}

	@Override
	public Object getObject(long objectId) {

		File f = new File("/persistence/" + Long.toString(objectId));

		return readObjectFromFile(f);

	}

	private Object readObjectFromFile(File f) {

		// open file
		// and load object
		// return the object
		return null;
	}

	@Override
	public long saveObject(Object object) {

		long fileId = System.currentTimeMillis();

		// open file
		File f = new File("/persistence/" + Long.toString(fileId));

		// write file to Streanm

		writeObjectToFile(f, object);

		return fileId;

	}

	private void writeObjectToFile(File f, Object object) {

		// serialize object and write it to file

	}

}
