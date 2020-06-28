---
title: Setup
---

> ## To do
> To prepare for this course, the following tasks need to be carried out:
> - Installation of Visual Studio Code (VSCode)
> - Installation of Java
> - Setup GitHub account
> - Accepting first assignment in GitHub classroom.
{: .checklist}

## Installation of Visual Studio Code

Go to [Visual Studio Code's download page][vscode] and download the correct package for your computer (Windows, Mac OS, or Linux). 
For Windows, you can download `User Installer 64-bit` version if you only want to install VSCode into your user account.  

## Installation of Java

It is most likely that you already have Java installed. To confirm this, first,
open a terminal in VSCode by select **Terminal/New Terminal** on the top Menu bar. 

Next, run `javac -version`

~~~
$ javac -version
~~~
{: .language-bash}

You see the version of Java being displayed on screen. Your version might be
different from mine.

 ~~~
javac 1.8.0_222
 ~~~
 {: .output}

Next, run `java -version`.

~~~
$ java -version
~~~
{: .language-bash}

Similarly, version information will be displayed.

~~~
openjdk version "1.8.0_222"
OpenJDK Runtime Environment (AdoptOpenJDK)(build 1.8.0_222-b10)
OpenJDK 64-Bit Server VM (AdoptOpenJDK)(build 25.222-b10, mixed mode)
~~~
{: .output}

If you do not have **both** `java` and `javac`, you will need to install Java
SDK (Software Development Kit). We will be using the Java distribution maintained
by OpenJDK.

- Go to [OpenJDK website](https://adoptopenjdk.net).
- Choose **OpenJDK 8 (LTS)** for Version and **HotSpot** for JVM.
- Click on the download link to begin download the installation package.
- Run the installer. You can keep all default settings on the installer.
- Once the installation process finishes, carry out the tests *in a ner terminal* above to confirm
that you have both `java` and `javac`.

<img src="../fig/vscode_install.png" alt="Test for java and javac in VSCode's terminal" style="height:450px">

## Installation of Gradle

Follows the installation steps described in [Gradle's documentation page](https://docs.gradle.org/current/userguide/installation.html) to install and setup gradle. 

<img src="../fig/gradle.png" alt="Test for gradle in VSCode's terminal" style="height:350px">

## Setup GitHub account
- If you don't already have a GitHub account, go to [GitHub web page][github] to sign up for an account. 
- It should be noted that you can link multiple email addresses to a GitHub account. Even if you already have a 
GitHub account, you might want to link the account to your WCUPA email. 

{% include links.md %}
