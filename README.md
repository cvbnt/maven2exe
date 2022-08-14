# maven2exe

A maven project,can compile executable files according to GraalVM，such as exe

In Windows

1、Download Oracle GraalVM Enterprise Edition Core,https://www.oracle.com/downloads/graalvm-downloads.html ,such as 20.3.7 version

2、Unzip it to any path and configure environment variables,where gu like this

![image](https://raw.githubusercontent.com/cvbnt/maven2exe/master/src/main/resources/images/gu.png)

3、Install native image,in terminal,enter the command:gu install native-image,enter y halfway through to receive the license

4、Install Visual Studio,https://visualstudio.microsoft.com/,and then install desktop development of C++,must include MSVC

![image](https://raw.githubusercontent.com/cvbnt/maven2exe/master/src/main/resources/images/vs.png)

5、If all is well,in this path:C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvars64.bat,you can find vcvars64.bat

6、Then in terminal,enter the command:call "C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvars64.bat",you can see this

![image](https://raw.githubusercontent.com/cvbnt/maven2exe/master/src/main/resources/images/bat.png)

7、Clone this project,and configure the project sdk as the GraalVM just downloaded,in pom.xml,graal-sdk version must be the same as GraalVM version

8、maven package,like this

![image](https://raw.githubusercontent.com/cvbnt/maven2exe/master/src/main/resources/images/package.png)

9、It will fail,it doesn't matter, you just copy all the commands at the beginning

![image](https://raw.githubusercontent.com/cvbnt/maven2exe/master/src/main/resources/images/command.png)

10、Then open a terminal in the project directory,enter first command:call "C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvars64.bat",and then enter the command that just failed to execute and execute

![image](https://raw.githubusercontent.com/cvbnt/maven2exe/master/src/main/resources/images/terminal.png)

11、After a while, you will find the executable graalvmMaven.exe in the target directory
