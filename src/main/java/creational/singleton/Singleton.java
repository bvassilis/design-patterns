package creational.singleton;


/**
 *  The Abstract Factory, Builder, and Prototype patterns can use Singletons in their implementation.
 *  Facade Objects are often Singletons because only one Facade object is required.
 *  State objects are often Singletons.
 *  Singletons are often preferred to global variables because:
 *      They do not pollute the global name space (or, in languages with namespaces, their containing namespace) with unnecessary variables.[7]
 *      They permit lazy allocation and initialization, whereas global variables in many languages will always consume resources.
 *
 */
public class Singleton {

    /**
     * Lazy initialization
     */
    public static class LazySingleton {

        private static volatile Singleton instance = null;

        private LazySingleton() {
        }

        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }

    }

    /**
     * Eager initialization
     */
    public static class EagerSingleton {
        private static final EagerSingleton instance = new EagerSingleton();

        private EagerSingleton() {
        }

        public static EagerSingleton getInstance() {
            return instance;
        }
    }
    
    /**
     * Thus, this solution is thread-safe without requiring special language constructs (i.e. volatile or synchronized).
     */
    public static class BillPughSingleton {
        // Private constructor prevents instantiation from other classes
        private BillPughSingleton() { }
 
        /**
        * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
        * or the first access to SingletonHolder.INSTANCE, not before.
        */
        private static class SingletonHolder { 
                public static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }
 
        public static BillPughSingleton getInstance() {
                return SingletonHolder.INSTANCE;
        }
        
        /**
         *  Effective Java, Joshua Bloch
         *  The use of an enum is very easy to implement and has no drawbacks regarding serializable objects, which have to be circumvented in the other ways.
         *  This approach implements the singleton by taking advantage of Java's guarantee that any enum value is instantiated only once in a Java program. Since Java enum values are globally accessible, so is the singleton. 
         *  The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.
         */
        public static enum EnumSingleton {
            INSTANCE;
            public void execute(String arg) {
                // ... perform operation here ...
            }
        }
}

}
