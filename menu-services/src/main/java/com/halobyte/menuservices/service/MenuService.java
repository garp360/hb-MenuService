package com.halobyte.menuservices.service;

import org.springframework.stereotype.Service;

import com.halobyte.menuservices.util.MenuStructureStratey;

@Service ( "menuService" )
public class MenuService
{

	public MenuService( ) { }

	public String getMenu( MenuStructureStratey strategy )
	{
		return strategy.buildMenu( null );
	}

}
