<dependency>
  <groupId>com.twitter</groupId>
  <artifactId>twitter-api-java-sdk</artifactId>
  <version>1.1.4</version>
</dependency>

// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

// Instantiate library client
TwitterApi apiInstance = new TwitterApi();
 
// Instantiate auth credentials (App-only example)
TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("APP-ONLY-ACCESS-TOKEN"));
 
// Pass credentials to library client
apiInstance.setTwitterCredentials(credentials);


