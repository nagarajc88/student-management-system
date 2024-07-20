package cloudauthservice.services;

import cloudauthservice.entities.User;
import cloudauthservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String saveUser(User user){
       user.setPassword(passwordEncoder.encode(user.getPassword()));
       userRepository.save(user);
       return "User added to the Database";
    }

    public String generateToken(String username){
        return jwtService.generateToken(username);
    }

    public void validateToken(String token){
       jwtService.validationToken(token);
    }
}
