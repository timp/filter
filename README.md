Filter a properties file.

Prove that the values are available to Maven at build time.

- https://maven.apache.org/plugins/maven-resources-plugin/examples/filter.html
- https://maven.apache.org/settings.html
- https://maven.apache.org/ref/3.5.4/maven-settings/settings.html
- https://maven.apache.org/examples/injecting-properties-via-settings.html

Yet another dependency:
https://github.com/shyiko/servers-maven-extension

To get tests to pass add the following to your ```~/.m2/settings.xml```

    <profiles>
      <profile>
        <id>filter</id>
        <activation><activeByDefault>true</activeByDefault></activation>
        <properties>
          <filter.key1>firstKeyValue</filter.key1>
        </properties>
      </profile>
    </profiles>

