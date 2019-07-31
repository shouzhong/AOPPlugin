# AOPPlugin
## 说明
AOP为Aspect Oriented Programming的缩写，意为：面向切面编程，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术。这个是AndroidStudio使用AOP的插件。
## 使用
### 依赖
在项目根目录的build.gradle文件中
```
dependencies {
    classpath 'com.shouzhong.aop:AOPPlugin:1.0.0'
    ...
}
```
在module的build.gradle文件中
```
apply plugin: `com.shouzhong.aop`

dependencies {
    implementation 'org.aspectj:aspectjrt:1.8.9'
}
```