package com.example.accessingdatamysql;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/key") // This means URL's start with /resv (after Application path)
@CrossOrigin(origins = "*")
public class KeyController {

	private static final Logger log = LoggerFactory.getLogger(KeyController.class);

	@Autowired
	private TbApiKeyRepository tbApiKeyRepository;

	@GetMapping(path="/open-api")
        public @ResponseBody Optional<TbApiKey> getOpenApiKey() {
                // This returns a JSON or XML with the users
                return tbApiKeyRepository.findById(0);
        }
}
