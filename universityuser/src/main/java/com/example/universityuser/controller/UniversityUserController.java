package com.example.universityuser.controller;

import com.example.universityuser.exception.ResourceNotFoundException;

import com.example.universityuser.model.JWTRequest;
import com.example.universityuser.model.JWTResponse;
import com.example.universityuser.model.UniversityUser;
import com.example.universityuser.repository.UniversityUserRepository;
import com.example.universityuser.service.UniversityUserServiceImpl;
import com.example.universityuser.service.UserService;
import com.example.universityuser.util.JWTUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UniversityUserController {

    @Autowired
    private UniversityUserServiceImpl universityUserServiceImpl;


    @Autowired
    private UniversityUserRepository universityUserRepository;
    @Autowired
    private JWTUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

//    @Autowired
//    private JavaMailSender javaMailSender;

//    @Autowired
//    private JwtService jwtService;
//
//
//    @PostMapping()
//    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
//        return jwtService.createJwtToken(jwtRequest);
//    }

//    @PostMapping("/managementUser")
//    public void addNewUserProfile(@RequestBody UniversityUser universityUser) {
//        universityUserServiceImpl.addNewManagementUser(universityUser);
//        System.out.println(universityUser);
//    }


    @PostMapping("/auth")
    public ResponseEntity<?> authenticate(@RequestBody JWTRequest jwtRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUserName(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("INVALID CREDENTIALS");
        }

        final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUserName());
        final String token = jwtUtility.generateToken(userDetails);

        return ResponseEntity.ok(new JWTResponse(token));
    }

    @PostMapping("/managementUser")
public ResponseEntity<UniversityUser> addNewUserProfile(@RequestBody UniversityUser universityUser) {
    UniversityUser addedUser = universityUserServiceImpl.addNewManagementUser(universityUser);
    return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
}



    @GetMapping("/allUniversityUsers")
    public List<UniversityUser> getAllUniversityUsers() {
        return universityUserServiceImpl.getAllUniversityUsers();
    }

    @GetMapping("/getById/{id}")
    public Optional<UniversityUser> getById(@PathVariable String id) {
        return universityUserServiceImpl.getById(id);
    }

    @GetMapping("/getByUserName/{userName}")
    public UniversityUser getByUserName(@PathVariable String userName) {
        return universityUserServiceImpl.getByUserName(userName);
    }


    @PutMapping("/updateManagementUser/{id}")
    public void updateManagementUser( @PathVariable String id,@RequestBody UniversityUser updatedUser) {
        Optional<UniversityUser> existingUserOptional = universityUserRepository.findById(updatedUser.getId());

        if (existingUserOptional.isPresent()) {
            UniversityUser existingUser = existingUserOptional.get();
            existingUser.setFirstName(updatedUser.getFirstName());
            existingUser.setLastName(updatedUser.getLastName());
            existingUser.setFullName(updatedUser.getFullName());
            existingUser.setMotherName(updatedUser.getMotherName());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setRole(updatedUser.getRole());
            universityUserRepository.save(existingUser);
        } else {
            throw new ResourceNotFoundException("UniversityUser", "id", updatedUser.getId());
        }
    }


    @GetMapping("/getUserByEmail/{email}")
    public List<UniversityUser> getUserByEmail(@PathVariable String email) {
        return universityUserServiceImpl.getUserByEmail(email);
    }


    @PostMapping("/addNewCandidateForUniversity")
    public void addNewCandidateForUniversity(@RequestBody UniversityUser universityUser) {
    universityUserServiceImpl.addNewCandidateForUniversity(universityUser);
    }

    @GetMapping("/getByPrn/{prn}")
    public UniversityUser getByPrn(@PathVariable String prn) {
        return universityUserServiceImpl.getByPrn(prn);
    }

    @GetMapping("/getBySeatNo/{seatNo}")
    public  UniversityUser getBySeatNo(@PathVariable String seatNo) {
        return universityUserServiceImpl.getBySeatNo(seatNo);
    }

    @GetMapping("/getByMotherName/{motherName}")
    public UniversityUser getBYMotherName(@PathVariable String motherName)
    {
        return universityUserServiceImpl.getByMotherName(motherName);
    }
    @GetMapping("/api/search")
    public ResponseEntity<UniversityUser> searchUserBySeatNoAndMotherName(
            @RequestParam String seatNo,
            @RequestParam String motherName) {

        UniversityUser user = universityUserServiceImpl.getBySeatNoAndMotherName(seatNo, motherName);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

@PutMapping("/updateCandidateDetails/{seatNo}")
public void updateCandidateDetails(@PathVariable String seatNo, @RequestBody UniversityUser candidate) {
    universityUserServiceImpl.updateCandidateDetails(candidate,seatNo);
}
    @PostMapping("/managementUserr")
    public ResponseEntity<UniversityUser> addNewUserProfilee(@RequestBody UniversityUser universityUser) {
        universityUser.setSeatNo(generateSeatNumber());
        universityUser.setPrn(generatePrnNumber());
//        sendRegistrationEmail(universityUser);
        UniversityUser addedUser = universityUserServiceImpl.addNewManagementUser(universityUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
    }

    private AtomicInteger seatNumberCounter = new AtomicInteger(2001);
    private String generateSeatNumber() {
        int seatNumber = seatNumberCounter.getAndIncrement();
        return String.format("%d", seatNumber); // Format as 6-digit number
    }


    Year currentYear = Year.now();

    private AtomicInteger prnNumberCounter = new AtomicInteger(0001);
    private String generatePrnNumber() {
        int prnNumber = prnNumberCounter.getAndIncrement();
        return String.format("PRN%s%04d", currentYear, prnNumber);
    }

//    private void sendRegistrationEmail(UniversityUser user) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(user.getEmail());
//        message.setSubject("Welcome to University!");
//        message.setText("Hello " + user.getFullName() + ",\n\n"
//                + "Thank you for registering with us!\n\n"
//                + "Here are your registration details:\n\n"
//                + "User Name: " + user.getUserName() + "\n"
//                + "Your New Password "+user.getPassword()+"\n"
//                + "Collage Name: " + user.getStudentCollageName() + "\n"
//                + "Seat No: " + user.getSeatNo() + "\n"
//                + "PRN: " + user.getPrn() + "\n\n"
//                + "We look forward to having you in our University.");
//        javaMailSender.send(message);
//    }

}



