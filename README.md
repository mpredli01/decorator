# Avoid Excessive Subclassing with the Decorator Design Pattern

## Java Boutique

### Barry Burd and Michael Redlich

#### published January 27, 2006

This example code that accompanies the Design Pattern article was originally built with the [Ant](http://ant.apache.org/) build tool on the Windows platform, but has since been migrated to using the [Gradle](https://gradle.org/) build tool on MacOS.

After cloning this repository to your local workstation, change directory to the <code>decorator</code></strong> directory and build the application:

```
$ gradle clean build
$ ant clean build
```

Now executing the laboratory application:

```
$ gradle run
$ ant run
```

Please note that if you are using the Ant build tool on the Windows platform, you will need to add the required Java home directories in the <code>build.properties</code></strong> and <strong><code>build.xml</code></strong> files. For example:

<code>java.home=C:\\jdk-11.jdk</code></strong> in the <strong><code>build.properties</code></strong> file is referenced as <strong><code>${java.home}</code></strong> in the <strong><code>build.xml</code></strong> file.

Please don’t hesitate to contact either of us should you have any questions or issues.

*   mike [at] redlich [dot] net
*   barry [at] burd [dot] org
