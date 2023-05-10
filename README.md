# ChannelEngine
[![No Maintenance Intended](https://img.shields.io/badge/STATUS-DEPRECATED-%23cf0000?style=for-the-badge)](https://support.channelengine.com/hc/en-us/articles/4409503691165-Merchant-API-API-clients)

### Deprecation of the Merchant API client libraries

This library is no longer supported by ChannelEngine. To build your own library via OpenAPI Generator, using your programming language of choice, check out the [Merchant API: API clients](https://support.channelengine.com/hc/en-us/articles/4409503691165-Merchant-API-API-clients) article in our Help Center.

ChannelEngine’s APIs follow the OpenAPI/Swagger specifications, which you can find in our [API reference](https://demo.channelengine.net/api/swagger/index.html). 

### Additional information for developers
For detailed information on ChannelEngine’s APIs, go to the [REST APIs category](https://support.channelengine.com/hc/en-us/categories/4419833201937-REST-APIs) in our Help Center.

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
        ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
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
