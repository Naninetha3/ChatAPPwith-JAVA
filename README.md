<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Java Bidirectional Chat Application</title>
<style>
  body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: #f9fafb;
    color: #333;
    line-height: 1.6;
    padding: 20px;
    max-width: 900px;
    margin: auto;
  }
  h1, h2, h3 {
    color: #007ACC;
  }
  h1 {
    font-size: 2.5rem;
    margin-bottom: 0.3em;
  }
  h2 {
    border-bottom: 3px solid #007ACC;
    padding-bottom: 0.2em;
    margin-top: 1.5em;
  }
  code, pre {
    background: #282c34;
    color: #61dafb;
    padding: 5px 8px;
    border-radius: 5px;
    font-family: Consolas, Monaco, 'Courier New', monospace;
  }
  pre {
    padding: 15px;
    overflow-x: auto;
  }
  ul {
    list-style-type: none;
    padding-left: 0;
  }
  ul li::before {
    content: "✨ ";
    color: #ff5722;
  }
  table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 0.5em;
  }
  th, td {
    border: 1px solid #ddd;
    padding: 12px 15px;
    text-align: left;
  }
  th {
    background-color: #007ACC;
    color: white;
  }
  a {
    color: #007ACC;
    text-decoration: none;
  }
  a:hover {
    text-decoration: underline;
  }
  .emoji {
    font-size: 1.2em;
  }
  .highlight {
    background-color: #fffae6;
    border-left: 4px solid #ffb300;
    padding: 10px 15px;
    margin: 20px 0;
  }
</style>
</head>
<body>

<h1>💬 Java Bidirectional Chat Application</h1>

<p>A simple <strong>Java socket-based</strong> bidirectional chat application enabling real-time communication between two clients.</p>

<h2>📋 Table of Contents</h2>
<ul>
  <li><a href="#about">📖 About</a></li>
  <li><a href="#features">✨ Features</a></li>
  <li><a href="#technology-stack">🛠 Technology Stack</a></li>
  <li><a href="#architecture">🏗 Architecture</a></li>
  <li><a href="#installation">🚀 Installation</a></li>
  <li><a href="#usage">▶ Usage</a></li>
  <li><a href="#how-it-works">🔍 How It Works</a></li>
  <li><a href="#code-structure">🗂 Code Structure</a></li>
  <li><a href="#contributing">🤝 Contributing</a></li>
  <li><a href="#license">📜 License</a></li>
  <li><a href="#contact">📫 Contact</a></li>
</ul>

<h2 id="about">📖 About</h2>
<p>This project implements a <strong>bidirectional chat application</strong> in Java using TCP sockets. It allows two clients to connect to a server and exchange messages simultaneously, demonstrating fundamental socket programming concepts.</p>

<h2 id="features">✨ Features</h2>
<ul>
  <li>🔄 Real-time bidirectional communication</li>
  <li>🧑‍🤝‍🧑 Two-client chat support</li>
  <li>🖥️ Server-client architecture with Java sockets</li>
  <li>⚡ Low-latency message transmission</li>
  <li>💻 Console-based user interface (CLI)</li>
</ul>

<h2 id="technology-stack">🛠 Technology Stack</h2>
<table>
  <thead>
    <tr>
      <th>Component</th>
      <th>Technology</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Programming Language</td>
      <td>☕ Java SE 8+</td>
      <td>Core application language</td>
    </tr>
    <tr>
      <td>Network Protocol</td>
      <td>🔌 TCP Sockets</td>
      <td>Reliable connection-oriented communication</td>
    </tr>
    <tr>
      <td>User Interface</td>
      <td>🖥️ Console (CLI)</td>
      <td>Text-based input/output</td>
    </tr>
  </tbody>
</table>

<h2 id="architecture">🏗 Architecture</h2>
<pre><code>+----------------+           +----------------+           +----------------+
|  Client 1      | &lt;------&gt; |   Server       | &lt;------&gt; |   Client 2     |
+----------------+           +----------------+           +----------------+
</code></pre>
<p>- Server acts as the mediator for message forwarding between clients</p>
<p>- Each client maintains a persistent socket connection to the server</p>

<h2 id="installation">🚀 Installation</h2>
<div class="highlight">
  <p><strong>1. Clone the repository</strong></p>
  <pre><code>git clone https://github.com/yourusername/java-bidirectional-chat.git
cd java-bidirectional-chat
</code></pre>

  <p><strong>2. Compile all Java files</strong></p>
  <pre><code>javac *.java
</code></pre>
</div>

<h2 id="usage">▶ Usage</h2>
<div class="highlight">
  <p><strong>Start the Server</strong></p>
  <pre><code>java ChatServer
</code></pre>

  <p><strong>Start Client 1</strong></p>
  <pre><code>java ChatClient
</code></pre>

  <p><strong>Start Client 2 (in another terminal)</strong></p>
  <pre><code>java ChatClient
</code></pre>

  <p>Start chatting! 🗨️</p>
</div>

<h2 id="how-it-works">🔍 How It Works</h2>
<ul>
  <li>The <strong>server</strong> waits for clients to connect on a specified port.</li>
  <li>Upon connection, the server creates separate threads to handle each client.</li>
  <li>Messages from one client are received by the server and forwarded to the other client, enabling bidirectional communication.</li>
  <li>Clients can send and receive messages simultaneously.</li>
</ul>

<h2 id="code-structure">🗂 Code Structure</h2>
<pre><code>├── ChatServer.java       # Server-side socket handling and client management  
├── ChatClient.java       # Client-side socket communication and UI  
├── README.md             # This documentation file  

</code></pre>

<h2 id="contributing">🤝 Contributing</h2>
<p>Contributions are welcome! Please follow these steps:</p>
<ol>
  <li>Fork the repo</li>
  <li>Create your feature branch <code>git checkout -b feature/YourFeature</code></li>
  <li>Commit your changes <code>git commit -m 'Add some feature'</code></li>
  <li>Push to branch <code>git push origin feature/YourFeature</code></li>
  <li>Open a pull request</li>
</ol>



<h2 id="contact">📫 Contact</h2>
<ul>
  <li>📧 Email: <a href="mailto:your.email@example.com">your.email@example.com</a></li>
  <li>🌐 Website: <a href="https://yourwebsite.com" target="_blank" rel="noopener">yourwebsite.com</a></li>
  <li>🐦 Twitter: <a href="https://twitter.com/yourhandle" target="_blank" rel="noopener">@yourhandle</a></li>
</ul>

<p style="text-align:center; margin-top: 3em; font-size: 1.2rem;">🎉 Thank you for checking out the project! Happy chatting! 🎉</p>

</body>
</html>
