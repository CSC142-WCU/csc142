---
title: Setup
---

> ## To do
> 
> This course requires access to a computing environment that:
>
> - Support Git/GitHub (version control system). 
> - Support Java 11 (or 8). 
> - Support Apache Maven 3+ (a software project management and comprehension tool). 
>
> In the remainder of this page, instructions will be provided for setting up your 
> own computing environment in Windows and Macs.
> 
{: .checklist}


> ## 1. Create a GitHub account
> 
> Regardless of your computing environment, a GitHub account is required for this 
> course. 
> 
> - If you don't have an existing GitHub account, go to 
> [GitHub's Page](https://github.com/) and register for an account with your WCUPA 
> email address. 
> - If you already have an existing GitHub account, go ahead and add your WCUPA email 
> address to your GitHub account as a secondary email. 
>
{: .slide}


> ## 2. Install VSCode
>
> - Go to [Visual Studio Code's download page][vscode] and download the correct package for your computer (Windows, Mac OS, or Linux). 
For Windows, you can download `User Installer 64-bit` version if you only want to install VSCode into your user account. 
>
> - The remainder of this slide uses Windows as a demonstration, but the Mac's installation steps 
> will be similar. 
>
> - Review and accept the License Agreement. 
> <img src="fig/setup/vscode/01.png" style="height:450px">
>
> - Review and accept the installation location. In this version, `VSCode` will be installed 
> into a user's home account (click Next). 
> <img src="fig/setup/vscode/02.png" style="height:450px">
>
> - Confirm the creation of a `Start Menu Folder`.
> <img src="fig/setup/vscode/03.png" style="height:450px">
>
> - Confirm the select components match as shown in the screenshot below:
> <img src="fig/setup/vscode/04.png" style="height:450px">
>
> - Review and confirm `Install` (click Next).
> <img src="fig/setup/vscode/05.png" style="height:450px">
>
> - The installation process is show in the screenshot below. 
> <img src="fig/setup/vscode/06.png" style="height:450px">
>
> - Click `Finish` when the installation is complete to launch `VSCode`.
> <img src="fig/setup/vscode/07.png" style="height:450px">
>
> - You can select the initial theme for your `VSCode` during the first launch. 
> <img src="fig/setup/vscode/08.png" style="height:450px">
>
{:.slide}


> ## 3. Terminal
> 
> - While Windows and Mac have their own terminal (default PowerShell or Winter Terminal for Windows, and Terminal for Mac), 
> these terminals are integrated into VSCode. 
> - On `VSCode`'s menu bar, select `Terminal`, then `New Terminal`. 
> <img src="fig/setup/terminal/01.png" style="height:250px">
>
> - A terminal will open up at the bottom of the VSCode application. 
>   - The type of terminal can be selected, and a default terminal can be defined in `VSCode`.
> <img src="fig/setup/terminal/02.png" style="height:250px">
>
{:.slide}


> ## 4. Install Git 
>
> - Go to [Git's download page](https://git-scm.com/downloads) and select the appropriate download
> for your operating system. 
> - The remainder of this slide uses Windows as a demonstration, but the Mac's installation steps 
> will be similar (and/or simpler). 
> - Double-click on the downloaded file to launch the installer. 
> - Read through the GNU Public License and click Next
> <img src="fig/setup/git/01.png" style="height:450px">
>
> - Review the default installation location and click Next
> <img src="fig/setup/git/02.png" style="height:450px">
>
> - Confirm the select components match as shown in the screenshot below:
> <img src="fig/setup/git/03.png" style="height:450px">
> 
> - Confirm the creation of a `Start Menu Folder`
> <img src="fig/setup/git/04.png" style="height:450px">
>
> - Select `Visual Code` to the Git's default editor.
>   - If you are comfortable with Git/VSCode and have another editor that you
>   would like to use, feel free to do so. 
> <img src="fig/setup/git/05.png" style="height:450px">
>
> - Confirm the selection of `main` as the default branch name for new repositories. 
> <img src="fig/setup/git/06.png" style="height:450px">
>
> - Confirm that you use the `Recommended` option for setting up PATH environment.
> <img src="fig/setup/git/07.png" style="height:450px">
>
> - Confirm `OpenSSL` as the default HTTPS transport backend. 
> <img src="fig/setup/git/08.png" style="height:450px">
>
> - For `Windows`, select the `Checkout Windows-style, commit Unix-style line endings` option. 
>   - If you are on a Mac, use one of the two remaining options.  
> <img src="fig/setup/git/09.png" style="height:450px">
>
> - For the next option, select the `MinTTY` option. 
> <img src="fig/setup/git/10.png" style="height:450px">
>
> - Confirm the selection of the default `git pull` behavior.
> <img src="fig/setup/git/11.png" style="height:450px">
>
> - Confirm the selection of the `Git Credential Manager Core`. 
> <img src="fig/setup/git/12.png" style="height:450px">
>
> - Select `Enable file system caching`
> <img src="fig/setup/git/13.png" style="height:450px">
> 
> - You can try to enable the `experimental options`, but I will leave it unchecked here. 
>   - There is a chance that new version of Git will come out and this panel will 
>   not be available. 
> <img src="fig/setup/git/14.png" style="height:450px">
> 
> - After clicking `Install` in the previous step, Git is now installing. 
> <img src="fig/setup/git/15.png" style="height:450px">
>
> - Click `Finish` to complete the installation process. 
> <img src="fig/setup/git/16.png" style="height:450px">
> 
> - We can validate this installation via the terminal in VSCode, 
>   - Open a new terminal in VSCode or relaunch VSCode. 
> - Run the following command:
> 
> ~~~
> $ git --version
> ~~~
> {: .language-bash}
>
> <img src="fig/setup/git/17.png" style="height:200px">
>
{:.slide}


> ## 5. Install Java
>
> It is most likely that you already have Java installed. To confirm this, first,
> open a terminal in VSCode by select **Terminal/New Terminal** on the top Menu bar. 
> Next, run:
> ~~~
> $ java -version
> $ javac -version
> ~~~
> {: .language-bash}
>
> - If you already have Java JDK 8 set up, you can ignore the rest of this `Install Java` step. 
> <img src="fig/setup/openjdk/00.png" style="height:300px">
>
> - If you do not have **both** `java` and `javac`, you will need to install Java
> SDK (Software Development Kit). We will be using the Java distribution maintained
> by OpenJDK.
>  - Go to [OpenJDK website](https://adoptopenjdk.net).
>  - Choose **OpenJDK 11 (LTS)** for Version and **HotSpot** for JVM.
>  - Click on the download link to begin download the installation package.
>  - Run the installer. 
> 
> <img src="fig/setup/openjdk/01.png" style="height:450px">
>
> - Begin the installation process.
> <img src="fig/setup/openjdk/02.png" style="height:450px">
>
> - Review and check the acceptance of the GNU License
> <img src="fig/setup/openjdk/03.png" style="height:450px">
>
> - Confirm the select components match as shown in the screenshot below:
> <img src="fig/setup/openjdk/04.png" style="height:450px">
>
> - Start the installation.
> <img src="fig/setup/openjdk/05.png" style="height:450px">
>
> - Check the installation progress. 
> <img src="fig/setup/openjdk/06.png" style="height:450px">
>
> - Click `Finish` to complete the installation.
> <img src="fig/setup/openjdk/07.png" style="height:450px">
>
> - We can validate this installation via the terminal in VSCode, 
>   - Open a new terminal in VSCode or relaunch VSCode. 
> - Run the following command:
> <img src="fig/setup/openjdk/08.png" style="height:300px">
>
{:.slide}


> ## 6. Install Maven (Windows)
> 
> > ## Mac and Linux:
> > - For Mac, you can use `Homebrew` to install maven: https://formulae.brew.sh/formula/maven
> > - For Linux, depending on your distros, you can use `yum`/`dnf`/`apt-get` to install `maven`. 
> {:.checklist}
>
> - Go to [Apache Maven's Project Page](https://maven.apache.org/download.cgi) and download the appropriate
> version of Maven. 
>   - If you use Windows, download [apache-maven-3.8.1-bin.zip](https://downloads.apache.org/maven/maven-3/3.8.1/binaries/apache-maven-3.8.1-bin.zip)
>   - If you use Mac/Linux, download [apache-maven-3.8.1-bin.tar.gz]https://downloads.apache.org/maven/maven-3/3.8.1/binaries/apache-maven-3.8.1-bin.tar.gz) 
> - Unzip the dowloaded files. 
> - For Windows, unzip the downloaded file into your `C:` drive. 
>
> <img src="fig/setup/maven/01.png" style="height:500px">
>
> - In the VS terminal, run the following command:
>  
> ~~~
> $ setx path "%path%;c:\apache-maven-3.8.1-bin\bin"
> ~~~
> {: .language-bash}
>

{:.slide}



{% include links.md %}
