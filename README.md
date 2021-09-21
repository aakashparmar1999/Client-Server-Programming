# Client-Server-Programming
Client-Server Programming in Android

What is a socket?
 

A socket is an interface between application and network. The socket type dictates the style of communication reliable vs. best effort connection-oriented vs. connectionless. Once configured the application can pass data to the socket for network transmission receive data from the socket (transmitted through the network by some other host).

A socket is a software end-point of an application.
By using a Socket a process in one system can communicate with another process in a system.

Once you run project in two different devices. You need to Start the server in the Server device first. Then Client device will send a message to connect and it gets connected. Once it is connected, that means that a socket connection is established. Now you can send messages in both directions using this Socket Connection.
