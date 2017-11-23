package com.halobyte.menuservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.halobyte.menuservices.service.MenuService;
import com.halobyte.menuservices.util.SimpleMenuStructureStrategy;

@RestController
@RequestMapping ( "/api" )
public class MenuController
{

	public static final Logger logger = LoggerFactory.getLogger( MenuController.class );

	@Autowired
	protected MenuService menuService;

	@CrossOrigin ( origins = "http://localhost:4200" )
	@RequestMapping ( value = "/menu/", method = RequestMethod.GET )
	public ResponseEntity<String> getMenu( )
	{
		String menu = menuService.getMenu( new SimpleMenuStructureStrategy() );
		if ( menu == null || menu.isEmpty() )
		{
			return new ResponseEntity<>( HttpStatus.NO_CONTENT );
		}
		return new ResponseEntity<String>( menu, HttpStatus.OK );
	}
}
