# ChannelEngine
Please visit https://www.channelengine.com/developers/ for more information.
The API reference can be found at https://demo.channelengine.net/api/swagger/ui/index

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.channelengine.apiclient</groupId>
    <artifactId>api-client-java</artifactId>
    <version>2.2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.channelengine.apiclient:api-client-java:2.2.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/api-client-java-2.2.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.channelengine.apiclient.*;
import com.channelengine.apiclient.auth.*;
import com.channelengine.apiclient.model.*;
import com.channelengine.apiclient.api.CancellationApi;

import java.io.File;
import java.util.*;

public class CancellationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apikey
        ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apikey.setApiKeyPrefix("Token");

        CancellationApi apiInstance = new CancellationApi();
        MerchantCancellationRequest cancellation = new MerchantCancellationRequest(); // MerchantCancellationRequest | 
        try {
            ModelApiResponse result = apiInstance.cancellationCreate(cancellation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CancellationApi#cancellationCreate");
            e.printStackTrace();
        }
    }
}

```
