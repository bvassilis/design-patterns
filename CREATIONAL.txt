Singleton
--------- 
Ensure that only one instance of a class is created and 
Provide a global access point to the object.


Factory(Simplified version of Factory Method)
---------------------------------------------
Creates objects without exposing the instantiation logic to the client and 
Refers to the newly created object through a common interface.


Factory Method
--------------
Defines an interface for creating objects, 
but let subclasses to decide which class to instantiate and 
Refers to the newly created object through a common interface.


Abstract Factory
----------------
Offers the interface for creating a family of related objects,
without explicitly specifying their classes.


Builder
-------
Defines an instance for creating an object but 
letting subclasses decide which class to instantiate and 
Allows a finer control over the construction process.


Prototype
---------
Specify the kinds of objects to create using a prototypical instance, 
and create new objects by copying this prototype.


Object Pool
-----------
reuses and shares objects that are expensive to create..