package com.halobyte.menuservices.util;

import java.util.List;

import com.halobyte.menuservices.model.MenuItem;

public interface MenuStructureStratey {

	String buildMenu( List<MenuItem> menuItems);
	
}
