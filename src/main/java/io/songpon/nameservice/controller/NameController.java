package io.songpon.nameservice.controller;

import io.songpon.nameservice.repository.PersonRepository;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NameController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/names")
    public String getName() throws Exception {
        LOGGER.info("Get request for a name");
        var persons = personRepository.findAll();
        var person = persons.get(0);
        return person.getName() + " - " + person.getNickName();
    }
}
