启动方法一：
	1、手动执行com.swdeve.jones.srpingBoot.HelloWorldMainApplication的main方法
	然后即可在浏览器端直接访问：localhost:port/hello,浏览器端即可显示helloWorld
启动方法二：
	1、选中项目，run As->Run Configurations->Maven build->Goals中输入clean compile package->run将改项目打包成jar包
	2、刷新项目，即可看到在该项目的target目录下有jonesSpringBoot01-0.0.1-SNAPSHOT.jar 包
	3、window系统下进入命令窗口，切换到改jar包的目录下并用java -jar 执行该jar包，如下
		C:\Users\Administrator>e:
		E:\>cd java\workspace\git\demo\springBootDemo\target\
		E:\java\workspace\git\demo\springBootDemo\target>java -jar jonsSpringBoot01-0.0.1-SNAPSHOT.jar
	4、浏览器端直接访问：localhost:port/hello,浏览器端即可显示helloWorld
		
		