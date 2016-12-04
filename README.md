# BusDemo

Mechanism replacing the Observer pattern. 
There is no need for interfaces cluttering the classes. 
Uses Otto Bus by Square.

There is one instance of the Bus, and then all observers are registering as listeners. When the event happens, we just get a reference to the bus object and then call post() sending the event object.

