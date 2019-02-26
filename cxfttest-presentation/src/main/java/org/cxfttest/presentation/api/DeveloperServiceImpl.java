package org.cxfttest.presentation.api;

import org.cxfttest.presentation.models.Developer;

public class DeveloperServiceImpl implements DeveloperService {

	public Developer getDevelopers() {
		return new Developer("Domenico","java");
	}

}
