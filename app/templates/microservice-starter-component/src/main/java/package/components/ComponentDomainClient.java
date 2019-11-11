package <%= packageName %>;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;

import java.util.List;

public class ComponentDomainClient {

    private final RestOperations restOperations;
    private final String domainServerEndPoint;

    public ComponentDomainClient(RestOperations restOperations, String domainServerEndPoint) {
        this.restOperations= restOperations;
        this.domainServerEndPoint = domainServerEndPoint;
    }
}
