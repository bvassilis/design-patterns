package structural.bridge;

/**
 * Persistence Interface Abstraction Interface
 */
public interface Persistence {

	/**
	 * @param object
	 * @return returns objectID
	 */
	public String persist(Object object);

	/**
	 * 
	 * @param objectId
	 * @return persisted Object
	 */
	public Object findById(String objectId);

	/**
	 * 
	 * @param id
	 */
	public void deleteById(String id);

}