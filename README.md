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

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetHostName%5D.java">GetHostName</h3></li>

```Syntax
Gets the host name for the IP address.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetHostAddress%5D.java">GetHostAddress</h3></li>

```Syntax
Returns the IP address string in textual presentation.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetCanonicalHostName%5D.java">CanonicalHostName</h3></li>

```Syntax
Gets the fully qualified domain name for the IP address.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetLocalHost%5D.java">GetLocalHost</h3></li>

```Syntax
Returns the address of the local host. 
This is achieved by retrieving the name of the host from the system,
then resolving that name into an InetAddress.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BgetLoopbackAddress%5D.java">GetLoopbackAddress</h3></li>

```Syntax
Returns the loopback address.

The InetAddress returned will represent the IPv4 loopback address, 127.0.0.1, 
or the IPv6 loopback address, ::1. 

Note: The IP address 127.0. 0.1 is called a loopback address.
Packets sent to this address never reach the network ,
but are looped through the network interface card only. 
This can be used for diagnostic purposes to verify,
that the internal path through the TCP/IP protocols is working.
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BhashCode%5D.java">HashCode</h3></li>

```Syntax
Returns a hashcode for this IP address.
```


<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisAnyLocalAddress%5D.java">isAnyLocalAddress</h3></li>

```Syntax
Utility routine to check if the InetAddress is a wildcard address.
Wild Card Address is a special local IP address.
i.e. 
For Net Mask : 255.255.255.255 → Wild Card Mask : 0.0.0.0
For Net Mask : 255.255.255.254 → Wild Card Mask : 0.0.0.1
For Net Mask : 255.255.255.252 → Wild Card Mask : 0.0.0.3
For Net Mask : 255.255.255.248 → Wild Card Mask : 0.0.0.7
.....

For Net Mask : 0.0.0.0 → Wild Card Mask : 255.255.255.255

Note :

Formula = 
Starting Value is Always : 255.255.255.255
(Substract)
Subnet Mask =  Wild Card Mask

i.e.

255.255.255.255 - Subnet Mask = Wild Card Mask

A wildcard mask is a mask of bits that indicates ,
which parts of an IP address are available for examination.

A wildcard mask can be thought of as an inverted subnet mask.
i.e.
(Subnet Mask)255.255.255.0  → 0.0.0.255(Wild Card Mask)

A wild card mask is a matching rule in which:

0 means that the equivalent bit must match(Care)and 
1 means that the equivalent bit does not matter(Don't Care).
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisLinkLocalAddress%5D.java">isLinkLocalAddress</h3></li>

```Syntax

Utility routine to check if the InetAddress is an link local address.

Linkink Local Address: A link-local address is an automated selected,
IPv6 unicast( one-to-one transmission ) network address ,
that is valid only for communications within the subnetwork that the host is connected to.
A link-local address is required on each physical interface.

Link-local addresses are designed to be used for addressing on a single link,
for purposes such as automatic address configuration, neighbor discovery, 
or in the absence of routers.

It also may be used to communicate with other nodes on the same link. 
A link-local address is automatically assigned.

A link-local address is the IP address that is to be used for communication ,
within a logical division of the network or in the broadcast domain ,
to which the host is connected.

Range of Link Local Ip Address : 169.254.x.x
where x ranges from : 0 - 255 

i.e. The Range is between : 169.254.0.0 -
169.254.255.255

Each computer randomly select an IP address in a given Range.
And then communicate to other Computer searching for the same ,
IP address through ARP(Address Resolution Protocol (ARP)), 
if not found then the automated selected IP belongs to the 
Computer.

Note: A link-local address is an IPv6 unicast address ,
that can be automatically configured on any interface .

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisLoopbackAddress%5D.java">isLinkLocalAddress</h3></li>

```Syntax

Utility routine to check if the InetAddress is a loopback address.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisMCGlobal%5D.java">isMCGlobal</h3></li>

```Syntax

Utility routine to check if the multicast address has global scope.

 
Multicast: In a Multicast Transmission,
  All stations recieves the frame, the stations that
  are members of the group keeps and handles the frame.
  The protocol that is used  
  Internet Group Management Protocol . 
  It uses Class D of IP address , where 
  1110 - these 4 bits are fixed in Octet
  and other 28 bits can be used in maximum
  of 2^28 bits . Therefore 1st Octet will
  range from : 1110 0000 - 1110 1111
  that is 224-239. And least significant 
  bit of the of the first byte in a destination
  address is always 1 in Multicasting,
  where as in Unicast it is 0.
  
```
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisMCLinkLocal%5D.java">isMCLinkLocal</h3></li>


```Syntax

Utility routine to check if the multicast address has link scope.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisMCNodeLocal%5D.java">isMCNodeLocal</h3></li>


```Syntax

Utility routine to check if the multicast address has node scope.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisMCOrgLocal%5D.java">isMCOrgLocal</h3></li>


```Syntax

Utility routine to check if the multicast address has organization scope.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisMCSiteLocal%5D.java">isMCSiteLocal</h3></li>


```Syntax

Utility routine to check if the multicast address has site scope.

```


<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisMulticastAddress%5D.java">isMulticastAddress</h3></li>


```Syntax

Utility routine to check if the InetAddress is an IP multicast address.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisReachable%5D.java">isReachable</h3></li>


```Syntax

Test whether that address is reachable. 

Best effort is made by the implementation to try to reach the host, 
but firewalls and server configuration may block requests resulting,
in a unreachable status while some specific ports may be accessible.
A typical implementation will use ICMP ECHO REQUESTs if the privilege can be obtained,
otherwise it will try to establish a TCP connection on port 7 (Echo) of the destination host.

The timeout value, in milliseconds, indicates the maximum amount of time the try should take. 
If the operation times out before getting an answer, the host is deemed unreachable. 
A negative value will result in an IllegalArgumentException being thrown.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BisSiteLocalAddress%5D.java">isSiteLocalAddress</h3></li>


```Syntax

Utility routine to check if the InetAddress is a site local address.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddress%5BtoString%5D.java">toString</h3></li>


```Syntax

Converts this IP address to a String. The string returned is of the form: hostname / literal IP address.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/javaInetAddressTest%5BhashCode%5D.java">hashCode</h3></li>


```Syntax

Returns a hashcode for the given IP address.

```

</ul>



<h3> Q 1) Lets Look at a program which prompts the user for a hostname and then it looks up the IP address for the hostname and displays the result. Once done , it asks the user if he or she wants to look up another host: </h3>

<ul>
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Answer1.java">Answer-1</h3></li>
</ul>

<h3> Q 2)Printing address of  Host of Local Device(local host ) and Host of an website.  </h3>

<ul>
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Answer2.java">Answer-2</h3></li>
</ul>

<h1 align="center"> Socket Class </h1>

<ul>
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BCreation%20of%20Socket%5D.java">Creation of Socket</h3></li>
 
 ```Syntax
 
 import java.net.Socket → Socket Package
 
 Socket s = new Socket(); → Creating an instance of Socket
 ```
 
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BConnecting%20Address%20Through%20a%20Port%5D-Constructor1.java">Connecting InetAddress Through a Port-Constructor1</h3></li>
 
 ```Syntax
 
 import java.net.Socket → Socket Package
 
 Socket s = new Socket(InetAddress, int port); 
 ```
</ul>
