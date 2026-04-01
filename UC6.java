Associate each bogie with its seating or load capacity using a key–value mapping structure.

Actor: User

Flow
User creates a bogie-capacity mapping.
System stores bogie names as keys and capacities as values.
Entries are inserted into a HashMap.
System iterates through the map.
Capacity details are displayed for each bogie.
Program continues.


Key Concepts Used in UC6
HashMap – A hash table based implementation of the Map interface that stores data in key–value pairs, allowing each bogie to be mapped directly to its seating or load capacity.
Map Interface – A collection type in Java that represents a mapping between unique keys and their corresponding values, ideal for associating bogies with operational attributes.
put() Method – Inserts a key–value pair into the map, where the bogie name becomes the key and the capacity becomes the value.
Key–Value Association – Models real-world relationships by binding a bogie to its property, such as binding "Sleeper" to 72 seats.
entrySet() Iteration – Provides a view of the entire map as a set of entries, allowing iteration over both keys and values together.
Fast Lookup Using Keys – HashMap allows constant-time retrieval of capacity using a bogie name as the key, making planning and validation efficient.


Key Requirements
Create a HashMap<String, Integer> to store bogie-capacity information.
Insert capacity values for bogies such as Sleeper, AC Chair, and First Class.
Use the put() method to map each bogie to its capacity.
Iterate over the map using entrySet().
Display each bogie along with its corresponding capacity.


        // Display final formation
        System.out.println("Train Formation: " + train);

        System.out.println("Program continues...");
    }
}
