package distributed_rate_limiter.controller;

import distributed_rate_limiter.dto.ClientRegistrationRequest;
import distributed_rate_limiter.dto.ClientRegistrationResponse;
import distributed_rate_limiter.entity.ApiKey;
import distributed_rate_limiter.entity.Client;
import distributed_rate_limiter.repository.ApiKeyRepository;
import distributed_rate_limiter.repository.ClientRepository;
import distributed_rate_limiter.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ApiKeyRepository apiKeyRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public ResponseEntity<ClientRegistrationResponse> register(@RequestBody ClientRegistrationRequest request) {
        Client client = new Client(request.getName(), request.getTier());
        client = clientRepository.save(client);

        String generatedKey = UUID.randomUUID().toString();
        ApiKey apiKey = new ApiKey(generatedKey, client);
        apiKeyRepository.save(apiKey);

        String token = jwtUtil.generateToken(client.getId().toString());

        ClientRegistrationResponse response = new ClientRegistrationResponse(
                client.getId(), generatedKey, token
        );

        return ResponseEntity.ok(response);
    }
}