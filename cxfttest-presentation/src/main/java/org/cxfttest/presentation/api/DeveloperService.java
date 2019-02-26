package org.cxfttest.presentation.api;
import javax.jws.WebService;

import org.cxfttest.presentation.models.Developer;

@WebService
public interface DeveloperService {
	
	public Developer getDevelopers();

}
