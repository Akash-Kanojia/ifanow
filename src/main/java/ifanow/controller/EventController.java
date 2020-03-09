package ifanow.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import ifanow.helper.EventRequest;

@RestController
@RequestMapping(value = { "api", "" })
public class EventController{
	protected static final Log logger = LogFactory.getLog(EventController.class);
	
	@Autowired
	ObjectMapper objectMapper;
	
	@PostMapping(value="event")
	ResponseEntity<EventRequest> saveEvent(@RequestBody EventRequest req) {
		logger.info(req.toString());
		return new ResponseEntity<EventRequest>(req, HttpStatus.OK);
	};
}

