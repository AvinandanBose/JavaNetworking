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

<h2 align="center"> 1. Constructors of Socket Class </h2>


<ul>
<h2> Socket() constructor {Creating UnConnected Socket}</h2>
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BCreation%20of%20Socket%5D.java">Creation of Unconnected Socket-1</h3></li>
 
 ```Syntax
 
 import java.net.Socket → Socket Package
 
 Socket s = new Socket(); → Creating an instance of Socket
 ```
 
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketNew.java">Creation of Unconnected Socket -2</h3></li>
 
 
 ```Syntax
 
 import java.net.Socket → Socket Package

new Socket(); → Anonymously Creating an instance of Socket
 ```
 
 <h2>Using Inet in Constructor </h2> 
 
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BConnecting%20Address%20Through%20a%20Port%5D-Constructor1.java">Connecting InetAddress Through a Port-Constructor1</h3></li>
 
 ```Syntax
 
 import java.net.Socket → Socket Package
 import java.net.InetAddress;
 
 InetAddress address = InetAddress.getByName(host);
 Socket s = new Socket(address.getHostAddress(), int port); 
  
  Or
  
  Socket s = new Socket(address.getHostName(), int port);  
 ```
 
  
 
  <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BConnecting%20Address%20Through%20a%20Port%5D-Constructor2.java">Connecting InetAddress Through a Port-Constructor2</h3></li>
 
 ```Syntax
 
import java.net.Socket → Socket Package
import java.net.InetAddress;

static Socket s;
InetAddress address = InetAddress.getByName(host);
InetAddress localAdress = InetAddress.getLocalHost();
s = new Socket(address.getHostAddress(), int port, localAdress, localPort);
   
Or
   
s = new Socket(address.getHostName(), int port, localAdress, localPort);   
   
 ```
 
  <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketNew2.java">Connecting InetAddress Through a Port-Constructor3</h3></li>
 
 ```Syntax
 
import java.net.Socket → Socket Package
import java.net.InetAddress;

static Socket s;
InetAddress address = InetAddress.getByName(host);
InetAddress localAdress = InetAddress.getLocalHost();
s = new Socket(address.getHostAddress(), int port, boolean);
   
Or
   
s = new Socket(address.getHostName(), int port, localAdress, boolean);   
   
 ```
 
 <h2>Using String in Constructor </h2> 
 
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketNew3.java">Connecting String Address Through a Port-Constructor4</h3></li>
 
```Syntax
 
import java.net.Socket → Socket Package


static Socket s;

String address = hostname;
socket = new Socket(address, 80);

// socket = new Socket(hostname, int port);
   
 ```
 
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketNew4.java">Connecting String Address Through a Port-Constructor5</h3></li>
 
```Syntax
 
import java.net.Socket → Socket Package
import java.net.InetAddress;

static Socket s;

 String address = hostname;
 InetAddress localAdress = InetAddress.getLocalHost();
socket = new Socket(address, int port, localAdress, int localPort); 

// socket = new Socket( hostname, int port,localAdress, int localPort);
   
 ```
 
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketNew5.java">Connecting String Address Through a Port-Constructor6</h3></li>
 
```Syntax
 
import java.net.Socket → Socket Package


static Socket s;

 String address = hostname;
 
socket = new Socket(address, int port, boolean); 

// socket = new Socket( hostname, int port, boolean);
   
 ```
 
 
 <h2>Using Proxy in Constructor </h2> 
   
 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BConnecting%20Address%20Through%20a%20Port%5D-Constructor5.java">Connecting Socket Through a Proxy and Input String Address -Constructor7</h3></li>
  
  
 
  ```Syntax
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;

SocketAddress address = new InetSocketAddress(hostname, int port);
Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
Socket s = new Socket(proxy);

Proxy socksProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(hostname, int port));
Socket s1 = new Socket(socksProxy);

 ```
 
  <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketNew6.java">Connecting Socket Through a Proxy and Input Inet Address -Constructor8</h3></li>
  
 ```Syntax
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.InetAddress;

InetAddress address = InetAddress.getByName(hostname);
SocketAddress address = new InetSocketAddress(address, int port);
Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
Socket s = new Socket(proxy);

Proxy socksProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(hostname,  intport));
Socket s1 = new Socket(socksProxy);

 ```  
 <h2 align="Center"> In Details </h2>
 
<table>
 <tr>
 <th >Constructors</th>
 <th >Does this</th>
</tr> 
<tr>
  <td  >Socket()</td>
  <td  >It creates an unconnected socket with the system-default of SocketImpl</td>
</tr>
<tr>
  <td  >Socket(InetAddress address, int port)</td>
  <td  >It is creates a stream socket and connects it to the specified port number at the specified IP address. </td>
  
</tr>
<tr>
  <td  >Socket(InetAddress address, int port, boolean stream)</td>
  <td  >It is depreciated and it uses DatagramSocket instead of UDP transport. </td>
</tr>
<tr>
  <td  >Socket(InetAddress address, int port, InetAddress localAddr, int localport) </td>
  <td  >It creates a socket and connects it to the specified remote address of specified remote port. </td>
</tr>
<tr>
  <td  >Socket(Proxy proxy) </td>
  <td  >It creates an unconnected socket, specifying the type of proxy that should be used regardless of any other settings. </td>
</tr>
<tr>
  <td  >Socket(String address, int port)</td>
  <td  >It is creates a stream socket and connects it to the specified port number on the named host. </td>
  
</tr>
<tr>
  <td  >Socket(String address, int port, boolean stream)</td>
  <td  >It is depreciated and it uses DatagramSocket instead of UDP transport. </td>
</tr>
<tr>
  <td  >Socket(InetAddress address, int port, InetAddress localAddr, int localport) </td>
  <td  >It creates a socket and connects it to the specified remote host of specified remote port. </td>
</tr>
</table>

<h2> Other types of Inet And Socket connections: </h2>

 <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BConnecting%20Address%20Through%20a%20Port%5D-Constructor3.java">Connecting InetAddress Through a Port-Other Types-1</h3></li>
 
 ```Syntax
 
 import java.net.Socket → Socket Package
 import java.net.InetAddress;
  
  InetAddress address = InetAddress.getByName(host); 
 Socket s = new Socket(); 
 s.connect( new java.net.InetSocketAddress(address.getHostAddress(), int port));
  
  Or
  
  s.connect( new java.net.InetSocketAddress(address.getHostName(), int port));
 ```
 
  <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/Socket%5BConnecting%20Address%20Through%20a%20Port%5D-Constructor4.java">Connecting InetAddress Through a Port-Other Types-2</h3></li>
   
  
 
 ```Syntax
 
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.InetAddress;
 
 static Socket socket = new Socket();
 InetAddress address = InetAddress.getByName(host);
SocketAddress addr = new InetSocketAddress(address.getHostAddress(), int port);
   
Or
   
SocketAddress addr = new InetSocketAddress(address.getHostName(), int port);
   
And then:
   
 socket.connect(addr);
 
```
<h3> <i> <ins>Note </ins> </i>: Same thing can be attained by String .</h3>
</ul>
 <h2 align="center"> 2. Methods of Socket Class </h2>
<ul>
  <li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/SocketMethods1.java">Void Bind(SocketAddress bindpoint)</h3></li>
  
```Syntax

  It binds socket to a local address and port number.
  
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods2.java">Void Close()</h3></li>

```Syntax

  It closes the socket.
  
```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods3.java">Void Connect(Socket endpoint)</h3></li>

```Syntax

  It connects this socket to the server.
  
```


<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods4.java">Void Connect(Socket endpoint, int timeout)</h3></li>

```Syntax

  It connects this socket to the server  with a specified timeout value.
  
```


<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods5.java">SocketChannel getChannel</h3></li>

```Syntax

It returns the unique SocketChannel object associated with the socket if any.

:Note:

The Java NIO SocketChannel is used for connecting a channel with a TCP 
(Transmission Control Protocol) network socket. 
It is equivalent to Java Networking Sockets used in network programming.

It is provided by: java.nio package .

NIO represents New Input/Output , where as,
IO represents Input/Output of java.io package. 

Java.NIO package have Channels provided by

java.nio.channels interface and one of the Channels is:

SocketChannel which is a Class.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods6.java">InetAddress getInetAddress</h3></li>

```Syntax

It returns the address to which the socket is connected.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods7.java">InputStream getInputStream</h3></li>

```Syntax

It returns an input stream for this socket.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods8.java">SetKeepAlive and GetKeepAlive</h3></li>

```Syntax

SetKeepAlive: If Set to True, then SO_KEEPALIVE is enabled

GetKeepALive: If SetKeepAlive is true , then GetKeepAlive returns True else false.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods9.java">InetAddress getLocalAddress</h3></li>

```Syntax

It gets the local address to which the socket is bound.

```
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods10.java">int getLocalPort()</h3></li>

```Syntax

It returns the local port to which the current socket is bound .

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods11.java">SocketAddress getLocalSocketAddress</h3></li>

```Syntax

It returns the address of the endpoint to which the socket is bound,
or null if it is not bound yet.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods12.java">OutputStream getOutputStream</h3></li>

```Syntax

It returns the outputstream for the connected socket.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods13.java">boolean getOOBInline</h3></li>

```Syntax

The setOOBInline() method of Java Socket class enables 
or disables the SO_OOBInline. By default, the SO_OOBInline option is disabled.

```
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods14.java">int getPort()</h3></li>

```Syntax

It returns the remote port to which the socket is connected to.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods15.java">int getRecieveBufferSize()</h3></li>

```Syntax

It gets the value of the SO_RCVBUF option for this socket, that is,
the buffer size used by the platform for the input on this Socket.

```
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods16.java">SocketAddress getRemoteSocketAddress()</h3></li>


```Syntax

Returns the address of the endpoint this socket is connected to, 
or null if it is unconnected.

If the socket was connected prior to being closed, 
then this method will continue to return the connected address,
after the socket is closed.

```
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods17.java">boolean getReuseAddress()</h3></li>


```Syntax

Tests if SO_REUSEADDR is enabled.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods18.java">int getSendBufferSize</h3></li>


```Syntax

Get value of the SO_SNDBUF option for this Socket, 
that is the buffer size used by the platform for output on this Socket.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods19.java">int getSoLinger()</h3></li>


```Syntax

Returns setting for SO_LINGER. -1 returns implies that the option is disabled. 
The setting only affects socket close.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods20.java">int getSoTimeout()</h3></li>


```Syntax

Returns setting for SO_TIMEOUT. 0 returns implies that the option is disabled 
(i.e., timeout of infinity).

```
<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods21.java">boolean getTcpNoDelay()</h3></li>

```Syntax

Tests if TCP_NODELAY is enabled.

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods22.java">int getTrafficClass()</h3></li>

```Syntax

Gets traffic class or type-of-service in the IP header for packets sent from this Socket

```

<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods23.java">boolean isBound()</h3></li>

```Syntax

Returns the binding state of the socket.
Returns true if the socket was successfuly bound to an address
```


<li><h3> <a href="https://github.com/AvinandanBose/JavaNetworking/blob/main/socketmethods24.java">boolean isClosed()</h3></li>

```Syntax

Returns the closed state of the socket.
Returns true if the socket has been closed.

```

</ul>
</ul>
