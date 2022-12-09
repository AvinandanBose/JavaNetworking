# JavaNetworking
This is all about Java Networking.

<h1>JavaNetworking </h1>
<h3> The systems connected over a network through the internet connect to each other with the help of Transmission Control Protocol(TCP) or User Datagram Protocol(UDP). In Java, programming is done on the application layer that uses the concept of the classes in the java.net package , which provide networking functions to users. </h3> 



<h1 align="center"> InetAddress[Internet Addressing] </h1>

<ul>
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetByName%5D.java">GetByName</h3></li>

```Syntax
Determines the IP address of a host, given the host's name.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetAllByName%5D.java">GetAllByName</h3></li>

```Syntax
Given the name of a host, returns an array of its IP addresses, 
based on the configured name service on the system.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetAddress%5D.java">GetAddress</h3></li>

```Syntax
Returns the raw IP address of  InetAddress object. 
As it returns byte value hence we have to do AND
Operation with 0xff(Hex)= 255 (1111 1111), to get actual value.
```

</ul>

